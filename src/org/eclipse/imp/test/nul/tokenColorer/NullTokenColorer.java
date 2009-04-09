package org.eclipse.imp.test.nul.tokenColorer;

import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.services.ITokenColorer;
import org.eclipse.imp.services.base.TokenColorerBase;
import org.eclipse.imp.test.nul.parser.NullParsersym;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.TextAttribute;

public class NullTokenColorer extends TokenColorerBase implements NullParsersym, ITokenColorer {
    public TextAttribute getColoring(IParseController controller, Object o) {
        return null;
    }

    public NullTokenColorer() {
        super();
    }

    public IRegion calculateDamageExtent(IRegion seed, IParseController ctlr) {
        return null;
    }
}
