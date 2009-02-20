package org.eclipse.imp.test.nul.occurrenceMarker;

import java.util.List;

import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.services.IOccurrenceMarker;

public class NullOccurrenceMarker implements IOccurrenceMarker {
    public NullOccurrenceMarker() {
    }

    public String getKindName() {
        return null;
    }

    public List<Object> getOccurrencesOf(IParseController parseController, Object entity) {
        return null;
    }
}
