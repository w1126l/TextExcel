package textExcel;

public abstract class RealCell implements Cell {
	
	private String input;
	
	public RealCell (String input) {
		
		this.input = input;
		
	}
	
	public double getDoubleValue() {	
		
		return Double.parseDouble(input);
		
	}
	
	public String fullCellText() {
		
		return input;
		
	} 
	
	public String abbreviatedCellText() {
				
		return (getDoubleValue()+"          ").substring(0,10);
		
	}
	
}