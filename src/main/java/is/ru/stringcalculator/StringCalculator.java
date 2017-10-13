package is.ru.stringcalculator;

public class StringCalculator{
	
	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		if(text.contains(",") || text.contains("\n")){
			text = replaceNewLines(text);
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

	private static String replaceNewLines(String number){
		number = number.replaceAll("\n", ",");
		return number;
	}
	public static void main(String[] args){

	}
}