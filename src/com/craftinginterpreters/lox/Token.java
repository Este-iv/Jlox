package com.craftinginterpreters.lox;

public class Token {
    final TokenType type; 
    final String lexeme; 
    final Object literal; 
    final int line; 

    // This is to help with locating error in the code. 
    Token (TokenType type, String lexeme, Object literal, int line){
        this.type = type; 
        this.lexeme = lexeme; 
        this.literal = literal; 
        this.line = line; 
    }

    public String toString(){
        return type + " " + lexeme + " " + literal; 
    }
    
}
