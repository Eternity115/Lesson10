
package Searching;


public class StringReview {

    
    public static void main(String[] args) {
        String x = "The quick brown fox";
        //          0123456789012345678
        //indexOf -> returns an int, start location of something
        int loc = x.indexOf("q");
        System.out.println("q is at location " + loc);
        loc = x.indexOf("o", 13);//start looking at 13
        System.out.println("Starting at 13, the next o is at " + loc);
        loc = x.indexOf("q", 5); //will return -1 = not found
        System.out.println("Starting at 13, the next q is at " + loc);
        
        //charAt -> returns a char
        char c = x.charAt(13); //w
        System.out.println("The letter at pos 13 is " + c); 
        
        //length -> returns an int
        int len=x.length(); //19
        System.out.println(x + " is " + len + " letters long." );
        
        //substring -> retutns String, requires 1 or more ints
        String y = x.substring(10, 13); //13 not included = bro
        System.out.println("Hey " + y);
        y = x.substring(16); //16 to the end
        System.out.println("Crazy like a " + y);
        
        //toLower and Uppercase
        //orin=ginal String does not change
        System.out.println(x.toUpperCase());
        x=x.toLowerCase(); //re-assigning x to all lowercase
        
        //compareTo
        y = "jumped over the lazy dog.";
        int z = x.compareTo(y);
        System.out.println("x vs y = " + z);
        
        //compareTo does letter math
        //calculates the aplphabetical distance between 1st letter of each string
        //"t" vs. "j" -> 10 letters apart in alphabet
        //positive means first thing is further down the list
        //more examples
        System.out.print("Andy vs. Bob\t");
        System.out.println("Andy".compareTo("Bob")); //-1
        System.out.print("Bob vs. Bob\t");
        System.out.println("Bob".compareTo("Bob")); //0
        System.out.print("Dave vs. Bob\t");
        System.out.println("Dave".compareTo("Bob")); //2
        System.out.print("Bib vs. Bob\t");
        System.out.println("Bib".compareTo("Bob")); //-6
        
        //compareTo = 0 = exact match
        
        System.out.println("That's all folks");
        
    }
    
}
