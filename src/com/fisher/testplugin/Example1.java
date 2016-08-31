package com.fisher.testplugin;

public class Example1 {
	String name;

	Example1[] children = new Example1[0];

	Example1 parent = null;

	Example1(String name) {
		this.name = name;
	}

	Example1(String name, Example1[] children) {
		this.name = name;
		this.children = children;
		for (int i = 0; i < children.length; i++) {
			children[i].parent = this;
		}
	}

	public static Example1[] getInput() {
		return new Example1[] {
				new Example1("First", new Example1[] { new Example1("Child1"), new Example1("Child2") }),
				new Example1("Second", new Example1[] { new Example1("Child3"), new Example1("Child4") }) };
	}
}