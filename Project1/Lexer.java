/*
 * Student Name: Griffin Shay
 * Date: 11/11/2025
 * Project: Project 1
 * 
 * This class implements the lexical analyzer.
 * It reads a source file and breaks the input text into a sequence of tokens that
 * can be processed by a parser. The lexer uses Java’s StreamTokenizer to identify
 * different token types such as numbers, identifiers, strings, punctuation, and
 * reserved keywords. I edited the getNextToken method so it would handle string tokens as well.
 */

package cmsc330_project1;

//CMSC 330 Advanced Programming Languages
//Project 1 Skeleton
//UMGC CITE
//August 2021

import java.io.*;

//This class provides the lexical analyzer for project 1

class Lexer {
	
	 private StreamTokenizer tokenizer;
	 private String punctuation = ",;.()";
	 private Token[] punctuationTokens = {Token.COMMA, Token.SEMICOLON, Token.PERIOD, Token.LEFT_PAREN, Token.RIGHT_PAREN };
	
	 // Constructor that creates a lexical analyzer object given the source file
	
	 public Lexer(File file) throws FileNotFoundException {
	     tokenizer = new StreamTokenizer(new FileReader(file));
	     tokenizer.ordinaryChar('.');
	     tokenizer.quoteChar('"');
	 }
	
	 // Returns the next token in the input stream
	
	 public Token getNextToken() throws LexicalError, IOException {
	     int token = tokenizer.nextToken();
	     switch (token) {
	         case StreamTokenizer.TT_NUMBER:
	             return Token.NUMBER;
	         case StreamTokenizer.TT_WORD:
	             for (Token aToken : Token.values())
	                 if (aToken.name().replace("_","").equals(tokenizer.sval.toUpperCase()))
	                     return aToken;
	             return Token.IDENTIFIER;
	         case StreamTokenizer.TT_EOF:
	             return Token.EOF;
	         case '"':
	        	 return Token.STRING; // Added a case for STRING tokens.
	         default:
	             for (int i = 0; i < punctuation.length(); i++)
	                 if (token == punctuation.charAt(i))
	                     return punctuationTokens[i];
	     }
	     return Token.EOF;
	 }
	
	 // Returns the lexeme associated with the current token
	
	 public String getLexeme() {
	     return tokenizer.sval;
	 }
	
	 // Returns the numeric value of the current token for numeric tokens
	
	 public int getNumber() {
	     return (int) tokenizer.nval;
	 }
	
	 // Returns the current line of the input file
	
	 public int getLineNo() {
	     return tokenizer.lineno();
	 }
}
