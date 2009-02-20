%options package=org.eclipse.imp.test.nul.parser
%options template=dtParserTemplateF.gi
%options import_terminals=NullLexer.gi
%options parent_saved,automatic_ast=toplevel,visitor=preorder,ast_directory=./Ast,ast_type=ASTNode

%Globals
    /.import org.eclipse.imp.parser.IParser;
    ./
%End

%Define
    $ast_class /.Object./
    $additional_interfaces /., IParser./
%End

%Terminals
    null

    LEFTBRACE ::= '{'
    RIGHTBRACE ::= '}'
%End

%Start
    compilationUnit
%End

%Rules
    compilationUnit ::= statementList

    statementList$$statement ::= %empty
                             | statementList statement

    statement ::= nullStmt
                | block

    nullStmt ::= null

    block ::= '{'$ statementList '}'$
%End
