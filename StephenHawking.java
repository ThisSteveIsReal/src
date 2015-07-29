import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) { String Meow = JOptionPane.showInputDialog("Can You Give Me A Sentence?");
		speak(Meow);
		}
	}

	// 3. repeat the sentence using the speak method below
	// 4. make this repeat a lot of times

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

// Copyright Wintriss Technical Schools 2014
