package day1._1_Variables_and_Datatypes;

import java.io.*;

//  Note: Identifiers should not be duplicated in two different scrapes
 class IdentifiersScopes {
     // Scope 1
    int a = 33;
//    int a = 55; --> Throws Error
     public static void main(String[] args) {
         // Scope 2
         int a = 33; // This is  OK as it is in different scope
     }
}
