package practice_2;

public class NumbersWithWrappers {

    public static void main(String args[]) {

        Integer min = 50;
        Integer max = 60;

        Double doubleFirstValue = Math.random() * (max - min) + min;
        Double doubleSecondValue = Math.random() * (max - min) + min;

        System.out.println("doubleFirstValue: " + doubleFirstValue);
        System.out.println("doubleSecondValue: " + doubleSecondValue);


        Long longFirstValue = doubleFirstValue.longValue();
        Long longSecondValue = doubleSecondValue.longValue();

        System.out.println("longFirstValue: " + longFirstValue);
        System.out.println("longSecondValue: " + longSecondValue);

        Integer intFirstValue = longFirstValue.intValue();
        Integer intSecondValue = longSecondValue.intValue();

        System.out.println("intFirstValue: " + intFirstValue);
        System.out.println("intSecondValue: " + intSecondValue);

        Short shortFirstValue = intFirstValue.shortValue();
        Short shortSecondValue = intSecondValue.shortValue();

        System.out.println("shortFirstValue: " + shortFirstValue);
        System.out.println("shortSecondValue: " + shortSecondValue);

        Float floatFirstvalue = shortFirstValue.floatValue();
        Float floatSecondValue = shortSecondValue.floatValue();

        System.out.println("floatFirstvalue: " + floatFirstvalue);
        System.out.println("floatSecondValue: " + floatSecondValue);

        Character charFirstvalue = (char) floatFirstvalue.floatValue();
        Character charSecondValue = (char) floatSecondValue.floatValue();

        System.out.println("charFirstvalue: " + charFirstvalue);
        System.out.println("charSecondValue: " + charSecondValue);
    }
}
