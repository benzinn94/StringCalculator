package is.ru.stringcalculator;

public class StringCalculator{
	
	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		if(text.contains(",")){
			String numbers [] = text.split(",");
			return toInt(numbers[0]) + toInt(numbers[0]);
		}
		else{
			return toInt(text);
		}
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}
	public static void main(String[] args){

	}
}