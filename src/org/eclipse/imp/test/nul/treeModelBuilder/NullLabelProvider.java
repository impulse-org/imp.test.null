package org.eclipse.imp.test.nul.treeModelBuilder;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.imp.services.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

public class NullLabelProvider implements ILabelProvider {
    private final List<ILabelProviderListener> fListeners= new ArrayList<ILabelProviderListener>();

    public Image getImage(Object element) {
        return null;
    }

    public String getText(Object element) {
        return null;
    }

    public void addListener(ILabelProviderListener listener) {
        fListeners.add(listener);
    }

    public boolean isLabelProperty(Object element, String property) {
        return false;
    }

    public void removeListener(ILabelProviderListener listener) {
        fListeners.remove(listener);
    }

    public void dispose() { }
}
