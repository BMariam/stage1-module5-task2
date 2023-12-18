package com.epam.mjc;

import java.util.ArrayList;

public class InterfaceCreator {

	public Operation<Integer> divideBy(Integer divider) {
		return inputList -> {
			ArrayList<Integer> outputList = new ArrayList<>();
			for (int i = 0; i < inputList.size(); ++i) {
				outputList.add(inputList.get(i) / divider);
			}
			return outputList;
		};
	}
}
