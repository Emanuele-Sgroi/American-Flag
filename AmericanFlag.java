/*
Tittle: American Flag
Author: Nunzio Emanuele Sgroi
Student ID: 21508918
Module: Programming
Assesment: Task 1
Description: To print an American Flag using Java Codes.
 The output can be defined as ASCII art which it stand for 
 American Standard Code For Information Interchange
 */
package americanflag; //Package of the program

public class AmericanFlag { //Public means it is avaiable to all users, class because you open a class, AmericanFlag name of the main class

    
    public static void main(String[] args) { //to be discovered
        
  String Stars = "* * * * * * ==================================\n * * * * *  ==================================";//n push to the next line wathever you write next, string opens a varyable that contain a string, stars is just an intuitable name for my var
  String Stripes = "=============================================="; //same than before
  for (int i = 0; i < 4; i++) { //Loop formula
   System.out.println(Stars); //Symple the var with loop
  }
  System.out.println("* * * * * * =================================="); //Print extra line to match the picture
  for (int i = 0; i < 6; i++) { //Loop formula
   System.out.println(Stripes);// print var with loop
  }
    }
    
}
