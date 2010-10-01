package org.eclipse.imp.test.nul.parser;

import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.services.ILanguageSyntaxProperties;
import org.eclipse.jface.text.IRegion;

public class NullSyntaxProperties implements ILanguageSyntaxProperties {
    public String getBlockCommentContinuation() {
        return null;
    }

    public String getBlockCommentEnd() {
        return null;
    }

    public String getBlockCommentStart() {
        return null;
    }

    public String[][] getFences() {
        return null;
    }

    public int[] getIdentifierComponents(String ident) {
        return null;
    }

    public String getIdentifierConstituentChars() {
        return null;
    }

    public String getSingleLineCommentPrefix() {
        return null;
    }

    public IRegion getDoubleClickRegion(int offset, IParseController pc) {
        return null;
    }

    public boolean isIdentifierPart(char ch) {
        return false;
    }

    public boolean isIdentifierStart(char ch) {
        return false;
    }

    public boolean isWhitespace(char ch) {
        return false;
    }
}
