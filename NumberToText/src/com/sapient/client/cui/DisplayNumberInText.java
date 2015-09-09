package com.sapient.client.cui;

import java.util.ArrayList;
import java.util.List;

public class DisplayNumberInText {
	private int inputNumber;
	public List<String> resultInText = new ArrayList<String>();
	private Number numberHundreds;
	private Number numberThousands;
	private NumberToText objectNumberToText;

	public NumberToText getObjectNumberToText() {
		return objectNumberToText;
	}

	public Number getNumberHundreds() {
		return numberHundreds;
	}

	public Number getNumberThousands() {
		return numberThousands;
	}

	public DisplayNumberInText(int input) {
		// TODO Auto-generated constructor stub
		this.inputNumber = input;
	}

	public boolean checkIntegrity() {
		if (inputNumber > 1000000 || inputNumber < 0) {
			return false;
		} else {
			return true;
		}
	}

	public void setNumberClasses() {
		if (inputNumber >= 1000) {
			int tempValue = inputNumber / 1000;
			numberThousands = new Number(tempValue);
		}
		numberHundreds = new Number(inputNumber % 1000);
	}

	private String convertNumberToText(Number input) {
		String result = null;
		objectNumberToText = new NumberToText(input);

		result = (objectNumberToText.parseHundreds() + " "
				+ objectNumberToText.parseTens() + " " + objectNumberToText
				.parseOnes());

		return result;
	}

}
