package com.fisher.testplugin;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.*;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.*;

public class TableViewerExample {
	public static void main(String[] args) {
		Display exampleDisplay = new Display();
		Shell exampleShell = new Shell(exampleDisplay);

		exampleShell.setBounds(120, 120, 345, 220);
		exampleShell.setLayout(new FillLayout());

		final TableViewer myTableViewer = new TableViewer(exampleShell, SWT.SINGLE);

		myTableViewer.setLabelProvider(new PersonTableLabelProvider());

		myTableViewer.setContentProvider(new ArrayContentProvider());

		myTableViewer.setInput(Example.getInput());

		exampleShell.open();

		while (!exampleShell.isDisposed()) {
			if (!exampleDisplay.readAndDispatch())
				exampleDisplay.sleep();
		}

		exampleDisplay.dispose();
	}
}