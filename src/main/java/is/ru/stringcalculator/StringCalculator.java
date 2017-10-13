package is.ru.stringcalculator;

public class StringCalculator{
	
	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		if(text.contains(",") || text.contains("\n")){
			text = replaceNewLines(text);
			String numbers [] = text.split(",");
			checkNegativeNumbers(numbers);
			numbers = checkNumbersAboveThousand(numbers);
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

	private static void checkNegativeNumbers(String [] numbers){
		String listOfNegatives = "";
		for(String number: numbers){
			if(toInt(number) < 0){
				listOfNegatives += number + " ";
			}
		}

		if(!listOfNegatives.equals("")){
			throw new IllegalArgumentException("Negatives not allowed: " + listOfNegatives);
		}
	}

	public static String[] checkNumbersAboveThousand(String [] numbers){
		for(int i = 0; i < numbers.length; i++){
			if(toInt(numbers[i]) > 1000){
				numbers[i] = "0";
			}
		}
		return numbers;
	}

	public static void main(String[] args){
	}
}