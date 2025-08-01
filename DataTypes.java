package WrapperClasses;

public class DataTypes {

    public static void main(String[] args) {
    	byte b = 10;               
    			        short s = 20;              
    			        int i = 100;               
    			        long l = 1000L;            
    			        float f = 5.5f;            
    			        double d = 10.55;          
    			        char c = 'A';              
    			        boolean bool = true;       
    			        String str = "Hello Java"; 
    			        System.out.println("--- Displaying All Data Types ---");
    			        System.out.println("byte: " + b);
    			        System.out.println("short: " + s);
    			        System.out.println("int: " + i);
    			        System.out.println("long: " + l);
    			        System.out.println("float: " + f);
    			        System.out.println("double: " + d);
    			        System.out.println("char: " + c);
    			        System.out.println("boolean: " + bool);
    			        System.out.println("String: " + str);

    			        // Example operations
    			        System.out.println("\n--- Some Operations ---");
    			        System.out.println("Sum of byte + short = " + (b + s));
    			        System.out.println("int multiplied by 2 = " + (i * 2));
    			        System.out.println("float + double = " + (f + d));
    			        System.out.println("Character ASCII value = " + (int)c);
    			        System.out.println("Boolean negation = " + (!bool));
    			        System.out.println("String in uppercase = " + str.toUpperCase());
}
}
