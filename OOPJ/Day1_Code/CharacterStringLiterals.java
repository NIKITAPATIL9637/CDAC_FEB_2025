import java.util.*;
public class CharacterStringLiterals{
  public static void main(String args[]){
  char char1 = 'A';
  char char2 = 'a';
  char char3 = '5';
  char char4 = '@';
  
  String str1 = "Hello Programmer's";
  
  System.out.println("Character literals and ascii values: ");
  
  System.out.println(char1 + ": ASCII: " + (int)char1);
  System.out.println(char2 + ": ASCII: " + (int)char2);
  System.out.println(char3 + ": ASCII: " + (int)char3);
  System.out.println(char4 + ": ASCII: " + (int)char4);
  
  System.out.println("String Literals: ");
  System.out.println("String 1: " + str1);
  }
}