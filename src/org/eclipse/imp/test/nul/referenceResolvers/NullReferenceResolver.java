package org.eclipse.imp.test.nul.referenceResolvers;

import org.eclipse.imp.language.ILanguageService;
import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.services.IReferenceResolver;

public class NullReferenceResolver implements IReferenceResolver, ILanguageService {
    public NullReferenceResolver() {
    }

    public String getLinkText(Object node) {
        return null;
    }

    public Object getLinkTarget(Object node, IParseController controller) {
        return null;
    }
}
