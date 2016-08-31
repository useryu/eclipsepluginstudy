package com.fisher.testplugin;

public class Example {

	String hello;

	String bye;

	Example(String hello, String bye) {
		this.hello = hello;
		this.bye = bye;
	}

	public static Example[] getInput() {
		return new Example[] { new Example("FirstHello", "FirstBye"), new Example("SecondHello", "SecondBye") };
	}
}