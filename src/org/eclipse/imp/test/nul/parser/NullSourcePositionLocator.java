package org.eclipse.imp.test.nul.parser;

import org.eclipse.core.runtime.IPath;
import org.eclipse.imp.parser.ISourcePositionLocator;

public class NullSourcePositionLocator implements ISourcePositionLocator {
    public NullSourcePositionLocator() {
    }

    public Object findNode(Object ast, int offset) {
        return null;
    }

    public Object findNode(Object ast, int startOffset, int endOffset) {
        return null;
    }

    public int getStartOffset(Object entity) {
        return -1;
    }

    public int getEndOffset(Object entity) {
        return -1;
    }

    public int getLength(Object entity) {
        return -1;
    }

    public IPath getPath(Object node) {
        return null;
    }
}
