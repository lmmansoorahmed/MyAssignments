package week1.day1;

import java.util.Iterator;

public class Fibbinocci {
	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum = 1;
		int sum=0;

		System.out.println(firstNum);
		System.out.println(secondNum);

		for (int i=1; i<=11;i++)
		{
			sum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
			System.out.println(sum);
		}		
	}

}
