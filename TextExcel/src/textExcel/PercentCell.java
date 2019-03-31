package textExcel;

public class PercentCell extends RealCell{

	public PercentCell (String input) {
		
		super (input.substring(0, input.length() - 1));
		
	} //Constructor

	public String fullCellText() {
		
		return (getDoubleValue() / 100) + "";
		
	} //Full Cell Text: returns empty cell text
	
	public String abbreviatedCellText() {
		
		String temp = super.fullCellText();
		
		if (temp.contains(".")) {
			
			temp = temp.substring(0, temp.indexOf("."));
			
		}
		
		return (temp + "%          ").substring(0,10);
		
	} //Abbreviated Cell Text: returns percentage rounded above the decimal

}
