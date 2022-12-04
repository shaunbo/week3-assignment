import javax.sound.sampled.SourceDataLine;
import javax.swing.plaf.TreeUI;

public class project {
    
    public static void main(String[] args) {
        //1
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        //1a
        System.out.println("Question 1:");
        int firstNum = ages[0];
        int secondNum = ages[ages.length - 1];

        System.out.println(secondNum - firstNum);

        //1b
        ages = new int[]{3, 9, 23, 64, 2, 8, 28, 93, 69};
        firstNum = ages[0];
        secondNum = ages[ages.length - 1];

        System.out.println(secondNum - firstNum);

        //1c
        double sum = 0;

        for (int i = 0; i < ages.length; i ++) {
            sum = sum + ages[i]; 
        }
        double average = sum / ages.length;
        System.out.println(average);

        //2
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        //2a
        System.out.println("Question 2:");
        sum = 0;

        for (int i = 0; i < names.length; i ++) {
            sum = sum + names[i].length();
        }
        average = sum / names.length; 
        System.out.println(average);

        //2b

        String result = "";

        for (int i = 0; i < names.length; i ++) {
            result = result + " " + names[i];
        }
        System.out.println(result);

        System.out.println("Question 3:");
        System.out.println("To access the last element of an array use (name of array)[(name of array).length - 1]");

        System.out.println("Question 4:");
        System.out.println("To access the first element of an array use (name of array)[0] ");

        //5

        int [] nameLengths = new int[names.length];

        System.out.println("Question 5:");

        //{"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}
        for (int i = 0; i < nameLengths.length; i ++) {
            String name = names[i];
            int length = name.length();
            nameLengths[i] = length;
        }

        //6
        //int[] nameLength = {3, 5, 3, 5, 4, 3;
        System.out.println("Question 6:");
            sum = 0;
        for (int i = 0; i < nameLengths.length; i++) {
            sum = sum + nameLengths[i];
        }
        System.out.println(sum);

        //7
        System.out.println(repeater("Hello", 3));
    
        System.out.println(fullName("John", "Doe"));
    
        int[] test1 = {23, 24, 56, 69};
        System.out.println(deezNuts(test1));

        double[] question10 = {3, 9, 45, 12};
        System.out.println(average(question10));

        double[] array = {3, 2, 45, 65};
        double[] array2 = {3, 78, 43, 12};
        System.out.println(greaterThan(array, array2));

        System.out.println(willBuyDrink(true, 11.00));

        System.out.println(weight(350));
    }

    public static String repeater(String word, int n){
        
        String result = "";
        
        for (int i = 0; i < n; i++) {
            result = result + word;
        }

        return result;
    }

    //8
    public static String fullName(String firstName, String lastName){
        String fullName = firstName + " " + lastName;
        
        return fullName;

    }

    //9
    public static Boolean deezNuts(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i ++) {
            sum = sum + array[i];
        }

        if (sum > 100) {
            return true;
        }
        
        return false;
    }
//10
    public static Double average(double[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i ++) {
            sum = sum + array[i];
        }
        
        double average = sum / array.length;

        return average;
    }
//11
    public static Boolean greaterThan(double[] array, double[] array2) {
        double average1 = average(array);
        double average2 = average(array2);
        
        if (average1 > average2) {
            return true;
        }
        
        return false; 
    }

//12
    public static Boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        if (isHotOutside && moneyInPocket > 10.50) {
            return true;
        }
        
            return false;
    }
 //13   
    public static String weight(int howMuchWeigh) {
        if (howMuchWeigh > 300) {
            return "Go to the gym fatass";
        }
        else{
            return "You lookin healthy boi";
        }
    }
}
