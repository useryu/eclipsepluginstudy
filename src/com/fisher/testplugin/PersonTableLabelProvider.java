package com.fisher.testplugin;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class PersonTableLabelProvider extends LabelProvider implements ITableLabelProvider {

	@Override
	public String getColumnText(Object element, int index) {
		Example ex = (Example) element;
		switch (index) {
		case 0:
			return ex.hello;
		case 1:
			return ex.bye;
		}
		return "";
	}

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}
