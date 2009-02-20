package org.eclipse.imp.test.nul.foldingUpdater;

import java.util.HashMap;
import java.util.List;

import org.eclipse.imp.services.base.FolderBase;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;

/**
 * This file provides a skeletal implementation of the language-dependent aspects
 * of a source-text folder.  This implementation is generated from a template that
 * is parameterized with respect to the name of the language, the package containing
 * the language-specific types for AST nodes and AbstractVisitors, and the name of
 * the folder package and class.
 * 
 * @author rfuhrer@watson.ibm.com
 *
 */
public class NullFoldingUpdater extends FolderBase {
    public void sendVisitorToAST(HashMap<Annotation,Position> newAnnotations, List<Annotation> annotations, Object ast) {
    }
}
