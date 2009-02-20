package org.eclipse.imp.test.nul.documentationProvider;

import org.eclipse.imp.language.ILanguageService;
import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.services.IDocumentationProvider;
import org.eclipse.imp.test.nul.parser.Ast.ASTNode;

public class NullDocumentationProvider implements IDocumentationProvider, ILanguageService {

    public String getDocumentation(Object target, IParseController parseController) {
        return null;
    }

    public int getTokenKindForNode(ASTNode node) {
        return -1;
    }

    public static String getSubstring(IParseController parseController, int start, int end) {
        return null;
    }
}
