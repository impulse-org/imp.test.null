package org.eclipse.imp.test.nul.contentProposer;

import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.services.IContentProposer;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;

public class NullContentProposer implements IContentProposer {
    public ICompletionProposal[] getContentProposals(IParseController controller, int offset, ITextViewer viewer) {
        return null;
    }
}
