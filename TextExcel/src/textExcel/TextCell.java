package textExcel;

public class TextCell implements Cell {
	
	private String text;
	
	public TextCell (String text) {
		
		this.text = text.substring(1, text.length() - 1);
		
	} //Constructor: initializes a cell
	
	public String fullCellText() {
		
		return "\"" + text + "\"";
		
	} //Full Cell Text: returns empty cell text
	
	public String abbreviatedCellText() {
		
		String addTenSpaces = text + "          ";
		return addTenSpaces.substring(0,10);
		
	} //Abbreviated Cell Text: returns cell text abbreviated into 10 spaces
	
}
