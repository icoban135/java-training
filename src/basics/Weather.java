package basics;

public class Weather {
	public static void main(String[] args) {
		// This program will give suggestions of what to wear based on the weather(temprature and sun condition)
		
		int temperature = 65;
		String sunCondition = "OverCast";
		
		if (temperature > 80) {
			System.out.println("It's pleasent. Wear shorts and t-shirt");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's a little cooler. Perhaps wear a long-sleeve and jeans.");
			System.out.println("Wear sunglasses");
		}
		else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("This is a cool day make sure to wear warmer clothes.");
		}
		else {
			System.out.println("Looks like a cold day. Bring a jacket.");
		}
		System.out.println("The program is ending.");
	}
}
