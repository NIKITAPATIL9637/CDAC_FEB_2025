public class TypeCasting{
   public static void main(String args[]){
                // Initialize a double value
        double doubleValue = 99.99;
        
        // Convert double to int using typecasting
        int intValue = (int) doubleValue;
        
        // Display both values
        System.out.println("Original Double Value: " + doubleValue);
        System.out.println("Converted Integer Value: " + intValue);
        
        // Explanation of data loss
        System.out.println("Explanation: When a double is converted to an int, the decimal part is truncated, 
                            leading to potential data loss.");   
   }
}