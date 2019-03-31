package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid {
	
	private int rows;
	private int columns;
	private Cell[][] sheet;
	
	public Spreadsheet() {
		
		rows = 20;
		columns = 12;
		
		sheet = new Cell[rows][columns];
		for (int rowCount = 0; rowCount < rows; rowCount++) {
			for (int colCount = 0; colCount < columns; colCount++) {
				sheet[rowCount][colCount] = new EmptyCell();
			}
		}
		
	} //Constructor: initializes rows, columns, and 2D array
	
	@Override
	public String processCommand(String command) {
		
		String [] splitCommand = command.split(" ", 3);
		
		if (command.length() < 4) { //Cell Inspection: returns what's in the cell
			
			Location cellLocation = new SpreadsheetLocation(command);
			return getCell(cellLocation).fullCellText();
			
		} else if (command.toLowerCase().equals("clear")) { //Clear: returns a new spreadsheet
			
			for (int i = 0; i < getRows(); i++) {
				for (int j = 0; j < getCols(); j++) {
					sheet[i][j] = new EmptyCell();
				}
			}
			
		} else if (command.toLowerCase().startsWith("clear ")) { //Clear Cell: clears a cell 
			
			String cellLocation = splitCommand[1];
			Location clearCell = new SpreadsheetLocation(cellLocation);
			
			sheet[clearCell.getRow()][clearCell.getCol()] = new EmptyCell();
			
		} else if (command.contains(" = ")) { //Cell assignment: assigns and tests what type of cell input goes to and puts it in
			
			String cellInput = splitCommand[2];
		
			String cellLocation = splitCommand[0];
			Location loc = new SpreadsheetLocation(cellLocation);
			
			if (cellInput.startsWith("\"")) { //TextCell
				 
				sheet[loc.getRow()][loc.getCol()] = new TextCell(cellInput);
			
			} else if (cellInput.startsWith("(") && cellInput.endsWith(")")) { //FormulaCell
				
				sheet[loc.getRow()][loc.getCol()] = new FormulaCell(cellInput, this);		
				
			} else if (cellInput.endsWith("%")) { //PercentCell	
				
				sheet[loc.getRow()][loc.getCol()] = new PercentCell(cellInput);		
				
			} else { //ValueCell													
				
				sheet[loc.getRow()][loc.getCol()] = new ValueCell(cellInput);		
				
			}
			
		} else { 
			
			System.out.println ("Error. No command given.");
			
		}
		
		return getGridText();
		
	}

	@Override
	public int getRows() {
		
		return 20;
		
	} //Get Rows: returns number of rows

	@Override
	public int getCols() {
		
		return 12;
		
	} //Get Columns: returns number of columns

	@Override
	public Cell getCell(Location loc) {
		
		return sheet[loc.getRow()][loc.getCol()];
		
	} //Get Cell: returns the cell at a specific location

	@Override
	public String getGridText() {
		
		String gridText = "   |";
		
		for (char i = 'A'; i <= 'L'; i++) {
			gridText += i + "         |";
		}
		
		for (int i = 1; i <= rows; i++) {
		
			gridText += "\n" + i;
			
			if (i < 10) {
				gridText += "  |";
			} else {
				gridText += " |";
			}
			
			for (int j = 0; j < columns; j++) {
				gridText += sheet[i - 1][j].abbreviatedCellText() + "|";
			}
			
		}
		
		gridText += "\n";
		
		return gridText; 
		
	} //Get Grid Text: returns grid

}
