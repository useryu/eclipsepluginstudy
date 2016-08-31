package com.fisher.testplugin;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class TreeViewerExample {
	public static void main(String[] args) {
		Display exampleDisplay = new Display();
		Shell exampleShell = new Shell(exampleDisplay);

		exampleShell.setBounds(120, 120, 220, 220);
		exampleShell.setLayout(new FillLayout());

		final TreeViewer myTreeViewer = new TreeViewer(exampleShell, SWT.SINGLE);

		myTreeViewer.setLabelProvider(new MyTreeLabelProvider());

		myTreeViewer.setContentProvider(new MyTreeContentProvider());

		myTreeViewer.setInput(Example1.getInput());

		exampleShell.open();

		while (!exampleShell.isDisposed()) {
			if (!exampleDisplay.readAndDispatch())
				exampleDisplay.sleep();
		}
		exampleDisplay.dispose();
	}
}
