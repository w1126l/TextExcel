package textExcel;

public class FormulaCell extends RealCell{
	
	private String[] formulaParts;
	private Spreadsheet spreadsheet;
	
	public FormulaCell (String input, Spreadsheet spreadsheet) {
		
		super(input);
		this.spreadsheet = spreadsheet;
		this.formulaParts = input.toUpperCase().split(" ");
		
	}

	public double getDoubleValue() {

		double answer = 
		
	}
	
	/* public double getDoubleValue() {
		
		String[] splitEquation = input.split(" ");
		int length = splitEquation.length;
		int numOfOperators = (length + 1) / 2;
		
		
		
	}
	
	public double doMath(double firstNum, double secondNum, String operator) {
		
		double answer = 0;
		
		if (operator.equals("+")) {
			
			answer = firstNum + secondNum;
			
		} else if (operator.equals("-")) {
			
			answer = firstNum - secondNum;
			
		} else if (operator.equals("*")) {
			
			answer = firstNum * secondNum;
			
		} else if (operator.equals("/")) {
			
			answer = firstNum / secondNum;
			
		} else {
			
			System.out.println("Not a valid equation.");
			
		}
		
		return answer;
		
	} */
	
	public String abbreviatedCellText() {
		
		return null;
		
	}

}