package com.fisher.testplugin;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;

public class MyTreeContentProvider
extends ArrayContentProvider
implements ITreeContentProvider {

public Object[] getChildren(Object parent) {
   Example1 ex1 = (Example1) parent;
   return ex1.children;
}

public Object getParent(Object element) {
   Example1 ex1 = (Example1) element;
   return ex1.parent;
}

 public boolean hasChildren(Object element) {
   Example1 ex1 = (Example1) element;
   return ex1.children.length > 0;
}
}

