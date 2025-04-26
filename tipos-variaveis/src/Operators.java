public class Operators {
    public static void main(String[] args) {
        /*String concatenation = "?";

        concatenation = 1+1+1+"1";

        System.out.println(concatenation);

        concatenation = 1+"1"+1+1;

        System.out.println(concatenation);

        concatenation = 1 + "1" + 1 + "1";

        System.out.println(concatenation);

        concatenation = "1"+1+"1"+1;

        System.out.println(concatenation);

        concatenation = "1" + (1+1+1);

        System.out.println(concatenation);*/

        //Unaries
        /*int number = 5;

        number = - number;

        System.out.println(number);

        number = - number; //or number = number * -1

        System.out.println(number);*/

        /*int number = 5;

        number--; //or "number++" increment or decrement by 1 the int variable for a future print without the symbols on the print message

        System.out.println(number--); //print the int variable first, then realizes the aritmetic operation without printing

        System.out.println(number); //print the int variable after the operation of the other "sysout"*/

        //Ternary (?:)
        /*Example of a condition using an "IF/ELSE" structure
        int n1 = 5;
        int n2 = 6;

        boolean result = (n1 == n2) ? true : false;

        System.out.println(result);*/

        //Relational
        /*String name1 = "JOHN";
        String name2 = new String("JOHN");

        System.out.println(name1.equals(name2));
        System.out.println(name1 == name2); //for int we can use the relational operators but fow OBJECTS we use ".equals()"
    
        int number1 = 1;
        int number2 = 2;

        boolean yesNo = number1 == number2;

        if (number1 == number2) {
            System.out.println("our condition is true");
        }
        else
            System.out.println("our condition is false");

        System.out.println(yesNo);*/

        //Logical "&&" for "AND" and "||" for "OR"
        boolean cond1 = true;
        boolean cond2 = false;

        if (cond1 && cond2) {
            System.out.println("The conditions are True");
        }
        if ((1 <= 2) || cond2) {
            System.out.println("One of the conditions is True");
        }
        System.out.println("The end");
    }
}
