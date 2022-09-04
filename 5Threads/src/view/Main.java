package view;

import Controller.CincothreadsController;

public class Main {

	public static void main(String[] args) {
		for (int n = 0; n < 5; n++) {
			Thread t = new CincothreadsController();
			t.start();
		}
	}
}