package myDbApp.order;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		OrderMenu menu = new OrderMenu();
		menu.run(sc);
	}

}
