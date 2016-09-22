package com.mms.variables;

public class Foo {
	private String attribute;
	
	public Foo(String argName)
	{
		attribute = argName;
	}
	
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	@Override
	public String toString() {
		return "Foo [attribute=" + attribute + "]";
	}

}
