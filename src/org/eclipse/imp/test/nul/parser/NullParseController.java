package org.eclipse.imp.test.nul.parser;

import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.parser.ISourcePositionLocator;
import org.eclipse.imp.parser.SimpleLPGParseController;
import org.eclipse.imp.services.ILanguageSyntaxProperties;
import org.eclipse.imp.test.nul.Activator;

/**
 * @author rfuhrer@watson.ibm.com
 */
public class NullParseController extends SimpleLPGParseController implements IParseController {
    public NullParseController() {
        super(Activator.kLanguageID);
        fLexer= new NullLexer();
        fParser= new NullParser();
    }

    public ISourcePositionLocator getSourcePositionLocator() {
        return new NullSourcePositionLocator();
    }

    public ILanguageSyntaxProperties getSyntaxProperties() {
        return new NullSyntaxProperties();
    }
}
