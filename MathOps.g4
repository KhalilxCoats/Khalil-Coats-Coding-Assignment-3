/*Khalil Coats
March 10, 2024,
CS 320 Coding Assignment 3
Collaborated with Aman Khera */

grammar MathOps;
file_
    : epr=expression*  #finalExpr
    ;

expression
    :  atom # num
    | op=(SIN| COS| TAN| ASIN| ACOS| ATAN| SINH| COSH| TANH| BASE10|BASEe) LPAREN right=expression RPAREN # Func
    | expression op=FACTORIAL # Fact
    | left=expression op=POW right=expression # Pow
    | MINUS right=expression #Negation
    | expression op=(TIMES | DIV) expression # MulDiv
    | expression op=(PLUS | MINUS) expression # AddSub
    | LPAREN expression RPAREN #paren
    ;

atom
    : scientific
    ;

scientific
    : SCIENTIFIC_NUMBER
    ;


//The NUMBER part gets its potential sign from "(PLUS | MINUS)* atom" in the expression rule
SCIENTIFIC_NUMBER
    : NUMBER (E SIGN? UNSIGNED_INTEGER)?
    ;

fragment NUMBER
    : ('0' .. '9')+ ('.' ('0' .. '9')+)?
    | '\u03C0'
    | 'e'
    ;

fragment UNSIGNED_INTEGER
    : ('0' .. '9')+
    ;

fragment E
    : 'E'
    | 'e'
    ;

fragment SIGN
    : '+'
    | '-'
    ;

BASE10
: 'log'
;

BASEe
:'ln'
;

SIN
    : 'sin'
    ;

COS
    : 'cos'
    ;

TAN
    : 'tan'
    ;

ASIN
    : 'asin'
    ;

ACOS
    : 'acos'
    ;

ATAN
    : 'atan'
    ;

SINH
    : 'sinh'
    ;

COSH
    : 'cosh'
    ;

TANH
    : 'tanh'
    ;




FACTORIAL
    : '!'
    ;

LPAREN
    : '('
    ;

RPAREN
    : ')'
    ;

PLUS
    : '+'
    ;

MINUS
    : '-'
    ;

TIMES
    : 'x'
    ;

DIV
    : '\u00F7'
    ;

POW
    : '**'
    ;

WS
    : [ \r\n\t]+ -> skip
    ;

//INVALID_CHAR : . -> skip ;
