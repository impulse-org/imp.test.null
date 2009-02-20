package org.eclipse.imp.test.nul.parser;

import org.eclipse.imp.services.ILanguageSyntaxProperties;

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
}
