package textExcel;

public class EmptyCell implements Cell {

	public EmptyCell() {
		
	} //Constructor: initializes an empty cell
	
	public String fullCellText() {
		
		return "";
		
	} //Full Cell Text: returns empty cell text
	
	public String abbreviatedCellText() {
				
		return "          ";
		
	} //Abbreviated Cell Text: returns empty cell text abbreviated into 10 spaces
	
}
