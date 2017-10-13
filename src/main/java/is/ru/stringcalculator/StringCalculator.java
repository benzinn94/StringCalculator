package is.ru.stringcalculator;

public class StringCalculator{
	
	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		if(text.contains(",")){
			String numbers [] = text.split(",");
			return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
		}
		else{
			return Integer.parseInt(text);
		}
	}


	public static void main(String[] args){

	}
}