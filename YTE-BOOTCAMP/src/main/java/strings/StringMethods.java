package strings;

public class StringMethods {

    public static void main(String args[]) {
        {
            String s = "Strings are immutable";
            char result = s.charAt(8);
            System.out.println(result); //a
            System.out.println("\n");

        }
        {
            String str1 = "Strings are immutable";
            String str2 = "Strings are immutable";
            String str3 = "Integers are not immutable";

            int intResult = str1.compareTo(str2);
            System.out.println(intResult); //0

            intResult = str2.compareTo(str3);
            System.out.println(intResult); //10

            intResult = str3.compareTo(str1);
            System.out.println(intResult); //100
            System.out.println("\n");

        }
        {
            String Str1 = new String("This is really not immutable!!");
            String Str2 = Str1;
            String Str3 = new String("This is really not immutable!!");
            boolean retVal;

            retVal = Str1.equals(Str2);
            System.out.println("Returned Value = " + retVal); //Returned Value = true

            retVal = Str1.equals(Str3);
            System.out.println("Returned Value = " + retVal);//Returned Value = true
            System.out.println("\n");
        }
        {
            String Str = new String("Welcome to Tutorialspoint.com");
            String SubStr1 = new String("Tutorials");
            System.out.println("Found Index :" + Str.indexOf(SubStr1)); //Found Index :11
            System.out.println("\n");
        }
        {
            String Str = new String("Welcome to Tutorialspoint.com");

            System.out.print("Return Value :");
            System.out.println(Str.replace('o', 'T')); //WelcTme tT TutTrialspTint.cTm

            System.out.print("Return Value :");
            System.out.println(Str.replace('l', 'D')); //WeDcome to TutoriaDspoint.com
            System.out.println("\n");
        }
        {
            String Str = new String("Welcome-to-Tutorialspoint.com");
            System.out.println("Return Value :");

            for (String retval : Str.split("-")) {
                System.out.println(retval); //Welcome
            }                               //to
                                            //Tutorialspoint.com
            System.out.println("\n");
        }
        {
            String Str = new String("Welcome to Tutorialspoint.com");
            System.out.print("Return Value :");
            System.out.println(Str.substring(10)); // Tutorialspoint.com
            System.out.println("\n");
        }
        {
            String Str = new String("Welcome to Tutorialspoint.com");

            System.out.print("Return Value :");
            System.out.println(Str.toString()); //Welcome to Tutorialspoint.com
            System.out.println("\n");
        }
        {
            String Str = new String("Welcome to Tutorialspoint.com");
            System.out.print("Return Value :");
            System.out.println(Str.toLowerCase()); //welcome to tutorialspoint.com
            System.out.println("\n");
        }
        {
            String Str = new String("Welcome to Tutorialspoint.com");
            System.out.print("Return Value :");
            System.out.println(Str.toUpperCase()); //WELCOME TO TUTORIALSPOINT.COM
            System.out.println("\n");
        }
    }

}