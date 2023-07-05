package week1.day2;

public class LearnBreakStatement {
	public static void main(String[] args) {
		for (int i=10;i>0;i--) {
			if (i==7)
			{
				System.out.println("Seven");
				break;
			}
			System.out.println(i);
		}
		System.out.println("Out of for loop");
	}

}
