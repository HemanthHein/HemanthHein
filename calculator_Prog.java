package Training;

import java.util.Scanner;

public class calculator_Prog {
	public static void main(String[] args) {
		char operator;
	double number1,  number2 , result ;
		Scanner s = new Scanner(System.in);
		System.out.println("Choose Operator: +,-,*,/");
		operator = s.next().charAt(0);
		System.out.println("1st Number:");
		number1= s.nextDouble();
		System.out.println("2nd Number:");
		number2= s.nextDouble();
		switch(operator){
		case '+':
		result = number1 + number2;
		System.out.println(number1+ "+" +number2+ "="+result);
		break;
		case '-':
		result = number1 - number2;
		System.out.println(number1+ "-" +number2+ "="+result);
		break;
		case '*':
		result = number1 * number2;
		System.out.println(number1+ "*" +number2+ "="+result);
		break;
		case '/':
		result = number1 / number2;
		System.out.println(number1+ "/" +number2+ "="+result);
		break;
		default:
		System.out.println("Operstor is wrong check it ");

		}
		}
	}


