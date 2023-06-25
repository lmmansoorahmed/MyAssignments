package week1.day1;

public class LearnSwitchCase {
	public static void main(String[] args) {
		
		String browserType = "Chrome";

		switch(browserType) {
		case "Chrome":
			System.out.println("Open Chrome Browser");
			break;
		case "Edge":
			System.out.println("Open Edge Browser");
			break;
		case "Firefox":
			System.out.println("Open Firefox Browser");
			break;
		default:
			System.out.println("Open Safari Browser");
		}
	}
}
