package textExcel;

public class SpreadsheetLocation implements Location {
    
	private String cellName;
	
	public SpreadsheetLocation(String cellName) {
       
		this.cellName = cellName.toUpperCase();
		
    } //Constructor: initializes the name of a cell
	
	@Override
    public int getRow() {
		
		int row = Integer.parseInt(cellName.substring(1)) - 1;
		return row;
		
    } //Get Row: returns which row cell is at

    @Override
    public int getCol() {
       
    	int column = cellName.charAt(0) - 'A';
        return column;
        
    } //Get Column: returns which column cell is at

}
