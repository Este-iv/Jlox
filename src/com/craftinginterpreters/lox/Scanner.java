package com.craftinginterpreters.lox;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.craftinginterpreters.lox.TokenType.*; 


public class Scanner {
    private final String source; 
    private List<Token> tokens = new ArrayList<>(); 

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
}

