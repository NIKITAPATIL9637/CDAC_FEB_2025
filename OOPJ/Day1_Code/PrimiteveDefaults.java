import java.util.*;

class PrimitiveDefaults{
	byte defaultByte;
	short defaultShort;
	int defaultInt;
	long defaultLong;
	float defaultFloat;
	double defaultDouble;
	char defaultChar;
	boolean defaultBoolean;
	
	void displayDefaults(){
	    System.out.println("Default values of primitive data types: ");
            System.out.println("byte: " + defaultByte);
	    System.out.println("short: " + defaultShort);
	    System.out.println("int: " + defaultInt);
	    System.out.println("long: " + defaultLong);
	    System.out.println("double: " + defaultDouble);
	    System.out.println("char: " + defaultChar);
	    System.out.println("boolean: " + defaultBoolean);
	}
}

public class Primitives {
     public static void main(String args[]){
		PrimitiveDefaults defaults = new PrimitiveDefaults();
		defaults.displayDefaults();
		
		 
//Local Variable With printing SOP statement
	  byte aByte = 10;
	  short aShort = 100;
	  int aInt = 1000;
	  long aLong = 100000L;
	  float aFloat = 10.5f;
	  double aDouble = 20.05;
	  char aChar = 'A';
	  boolean aBoolean = true;
	  
	  System.out.println("Assingned values of primitive data types: ");
	  System.out.println("byte: " + aByte);
	  System.out.println("short: " + aShort);
	  System.out.println("int: " + aInt);
	  System.out.println("long: " + aLong);
	  System.out.println("double: " + aDouble);
	  System.out.println("char: " + aChar);
	  System.out.println("boolean: " + aBoolean);
	 }
}