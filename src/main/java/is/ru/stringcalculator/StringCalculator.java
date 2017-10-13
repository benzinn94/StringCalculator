package is.ru.stringcalculator;

public class StringCalculator{
	
	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		if(text.contains(",")){
			String numbers [] = text.split(",");
			
			return sum(numbers);
		}
		else{
			return toInt(text);
		}
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static int sum(String[] numbers){
		int total = 0;
			for(String number : numbers){
				total += toInt(number);
			}
		return total;
	}
	public static void main(String[] args){

	}
}