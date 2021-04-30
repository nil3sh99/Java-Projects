package StrategyPatternSolution;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Justificator {

	private JustifyType justification;
	private int width;
	private JustificationStrategy justificationStrategy;

	public enum JustifyType {
		None, Left, Right, Center
	};

	Justificator() {
		justification = JustifyType.None;
	}

	public void doIt() {
		format();
	}

	private void format() {
		String line, word;
		Scanner inFile;
		boolean isFirstWord = true; 
		try {
			inFile = new Scanner(new File("quote.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File cannot be opened. Aborting.");
			return;
		}
		line = "";
		while (inFile.hasNextLine()) {
			Scanner linescanner = new Scanner(inFile.nextLine());
			while (linescanner.hasNext()) {
				word = linescanner.next();
				if (line.length() + word.length() + 1 > width) {
					this.justify(line);
					line = ""; 
				} else {
					if(!isFirstWord)
						line = line + " ";
					isFirstWord = false; 
				}
				line = line + word;
			}
			linescanner.close();
		}
		this.justify(line);
		inFile.close();
	}

	private void justify(String line) {
		switch (justification) {
		case Left:
			setJStrategy(new LeftJustification());
			executeJStrategy(line, width);
			break;
		case Right:
			setJStrategy(new RightJustification());
			executeJStrategy(line, width);
			break;
		case Center:
			setJStrategy(new CenterJustification());
			executeJStrategy(line, width);
			break;
		case None:
			break;
		default:
			break;
		}
	}

	public void setJustify(int type, int width) {
		this.width = width;
		switch (type) {
		case 1:
			justification = JustifyType.Left;
			break;
		case 2:
			justification = JustifyType.Right;
			break;
		case 3:
			justification = JustifyType.Center;
			break;
		}
	}

	public void setJStrategy(JustificationStrategy strategy) {

		this.justificationStrategy = strategy;
	}

	public void executeJStrategy(String line, int width) {

		this.justificationStrategy.justify(line, width);
	}
};
