package StrategyPatternSolution;

import java.util.Scanner;
public class JustificationDriver {
	public static void main(String[] argv) {
		Scanner keyboard = new Scanner(System.in);
		Justificator justificator = new Justificator();
		int answer, width;
		System.out.print("Exit(0) Left(1) Right(2) Center(3): ");
		answer = keyboard.nextInt();
		while (answer != 0) {
			System.out.print("Width: ");
			width = keyboard.nextInt();
			justificator.setJustify(answer, width);
			justificator.doIt();
			System.out.println("Exit(0) Left(1) Right(2) Center(3): ");
			answer = keyboard.nextInt();
		}
		keyboard.close();
		return;
	}
}
