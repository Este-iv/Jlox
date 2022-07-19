package com.craftinginterpreters.lox;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.craftinginterpreters.lox.TokenType.*; 


public class Scanner {
    private final String source; 
    private List<Token> tokens = new ArrayList<>(); 
    private int start = 0; 
    private int current = 0; 
    private int line = 1;

    Scanner(String source){
        this.source = source; 
    }
    // stores the raw tokens in a string. 
    // strings are temp holders, Lists are needing to be filled with the tokens. 
    List<Token> scanTokens (){
        while (!isAtEnd()){
            start = current; 
            scanToken(); 
        }
        tokens.add(new Token(EOF,"",null, line));
        return tokens; 
    }

    private void scanToken(){
        char c = advance(); 

        switch(c){
            case '(': addToken(LEFT_PAREN); break; 
            case ')': addToken(RIGHT_PAREN); break; 
            case '{': addToken(RIGHT_BRACE); break;  
            case '}': addToken(LEFT_BRACE); break;  
            case ',': addToken(COMA); break; 
            case '.': addToken(DOT); break; 
            case '-': addToken(MINUS); break; 
            case '+': addToken(PLUS); break; 
            case ';': addToken(SEMICOLON); break; 
            case '*' : addToken(STAR); break; 

            default: 
            Lox.error(line, "Unexpected Character."); break; 
        }

    }


    private boolean isAtEnd(){
        return current >= source.length(); 
    }

    private char advance(){
        return source.charAt(current++);
    }

    private void addToken(TokenType type){
        addToken(type, null);
    }

    private void addToken(TokenType type, Object literal){
        String text = source.substring(start,current);
        tokens.add(new Token(type,text,literal,line)); 
    }
}

