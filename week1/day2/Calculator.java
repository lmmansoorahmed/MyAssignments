package week1.day2;

public class Calculator {
	public int addThreeNumbers(int a,int b, int c) {
		return a+b+c;
	}
	
public float subTwoNumbers(int d, float e) {
		return d-e;
	}

public int divideTwoNumbers(int f, int g) {
	return f/g;

}

public static void main(String[] args) {
	Calculator Cal = new Calculator();
	int addThreeNumbers = Cal.addThreeNumbers(5, 3, 2);
	System.out.println(addThreeNumbers);
	
	System.out.println(Cal.subTwoNumbers(7,4));
	
	int divideTwoNumbers = Cal.divideTwoNumbers(15, 5);
	System.out.println(divideTwoNumbers);
}
}
