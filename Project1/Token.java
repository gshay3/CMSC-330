/*
 * Student Name: Griffin Shay
 * Date: 11/11/2025
 * Project: Project 1
 * 
 * This enumerated type defines all possible tokens recognized by the lexer and parser. 
 * Each token represents a distinct syntactic element or keyword in the scene description
 * language. I edited it to include ISOSCELES, PARALLELOGRAM, REGULAR_POLYGON, OFFSET, SIDES,
 * RADIUS, TEXT, and STRING.
 */

package cmsc330_project1;

//CMSC 330 Advanced Programming Languages
//Project 1 Skeleton
//UMGC CITE
//August 2021

//Enumerated type that defines the list of tokens

// Added ISOCELES, PARALLELOGRAM, REGULAR_POLYGON, OFFSET, SIDES, RADIUS, TEXT, and STRING.
enum Token {AT, COLOR, END,	HEIGHT, RECTANGLE, RIGHT_TRIANGLE, ISOSCELES, PARALLELOGRAM,
	REGULAR_POLYGON, SCENE, WIDTH, OFFSET, SIDES, RADIUS, COMMA, TEXT, STRING, SEMICOLON, 
	PERIOD, LEFT_PAREN, RIGHT_PAREN, IDENTIFIER, NUMBER, EOF}