package com.fisher.testplugin;


import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class MyTreeLabelProvider extends LabelProvider {
	public Image getImage(Object element) {
		return null;
	}

	public String getText(Object element) {
		Example1 ex1 = (Example1) element;
		return ex1.name;
	}
}