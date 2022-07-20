package com.craftinginterpreters.lox;

/*
 * These are the keywords that make up the languages grammar.
 * this is providing the Lexme of the language to the parser. 
 * attempt to add char, and mod into this later? 
 */
enum TokenType{
    //Single-character tokens
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
    COMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR, 

    //One or two character tokens. 
    BANG, BANG_EQUAL, EQUAL, EQUAL_EQUAL,
    GREATER, GREATER_THAN, LESS, LESS_EQUAL,
    BLOCK_START,BLOCK_END,

    // The litterals
    IDENTIFIER, STRING, NUMBER, 

    //Keywords. 
    AND, CLASS, ELSE, FALSE, FUN, FOR, IF, NIL, OR,
    PRINT, RETURN, SUPER, THIS, TRUE, VAR, WHILE, 

    EOF

}
