%options package=org.eclipse.imp.test.nul.parser
%options template=KeywordTemplateF.gi

%Include
    KWLexerLowerCaseMapF.gi
%End

%Export
    -- List all the keywords the kwlexer will export to the lexer and parser
    null
%End

%Terminals
    a    b    c    d    e    f    g    h    i    j    k    l    m
    n    o    p    q    r    s    t    u    v    w    x    y    z
%End

%Start
    Keyword
%End

%Rules
    -- The Goal for the parser is a single Keyword

    Keyword ::= n u l l /.$setResult($_null);./
%End
