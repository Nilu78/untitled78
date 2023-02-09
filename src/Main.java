import org.w3c.dom.css.Counter;

public class Main {
    public static void main(String[] args) {
        //Write a program that will count how many times “java” is found in any given String:
        //Approach One:
        String str = "java is fun, java is cool, java is java";
        String givenStr = str.toLowerCase();
        int counter = 0 ;
        for (int i = 0 ; i<givenStr.length()-3 ; i++){
            if (givenStr.substring(i, i+ 4 ).equalsIgnoreCase("java"))
                counter++; }
        System.out.println(counter);
    }

}

