package Package;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Nodes nodes = new Nodes();
		while(true){
			System.out.println("1. Union values");
			System.out.println("2. Check union");
			System.out.println("3. Enter a new value");
			System.out.println("Enter a number: ");
			Scanner in = new Scanner(System.in);
			int read = in.nextInt();
			switch (read) {
			case 1:
				System.out.println("Union values");
				System.out.println("1. Enter a value 1: ");
				int firstValue = in.nextInt();
				System.out.println("2. Enter a value 2: ");
				int secondValue = in.nextInt();
				nodes.UnionValues(firstValue, secondValue);
				break;
			case 2:
				System.out.println("Check union");
				System.out.println("1. Enter a value 1: ");
				int firstValue1 = in.nextInt();
				System.out.println("2. Enter a value 2: ");
				int secondValue1 = in.nextInt();
				if (nodes.Find(firstValue1, secondValue1) == true) {
					System.out.println("Union, all OK");
				} else System.out.println("Not union(((");
				break;
			case 3:
				System.out.println("Enter a new value: ");
				int value = in.nextInt();
				nodes.setValueFriends(value);
				break;
			default:
				break;
			}
		}
	}
}
