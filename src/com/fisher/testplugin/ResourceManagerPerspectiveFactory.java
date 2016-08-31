package com.fisher.testplugin;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IFolderLayout;

public class ResourceManagerPerspectiveFactory implements IPerspectiveFactory {

	private static final String VIEW_ID = "com.fisher.testplugin.views.SampleView";

	private static final String BOTTOM = "bottom";

	public void createInitialLayout(IPageLayout myLayout) {

		myLayout.addView(IPageLayout.ID_OUTLINE, IPageLayout.RIGHT, 0.30f, myLayout.getEditorArea());

		IFolderLayout bot = myLayout.createFolder(BOTTOM, IPageLayout.BOTTOM, 0.76f, myLayout.getEditorArea());
		bot.addView(VIEW_ID);
	}
}