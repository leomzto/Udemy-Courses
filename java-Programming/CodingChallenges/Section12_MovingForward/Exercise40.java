package CodingChallenges.Section12_MovingForward;

public class Exercise40 {

    public static Double convertTemperature(double temp, String unit) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Convert a temperature from Celsius to
        // Fahrenheit, or from Fahrenheit to Celsius.
        //
        // If the unit is "C", convert to Fahrenheit.
        // If the unit is "F", convert to Celsius.
        // If unit is invalid, return null.
        // ----------------------------------------

        return
                switch (unit.charAt(0)) {
                    case 'F' -> (temp - 32) * 5 / 9;
                    case 'C' -> (temp * 9 / 5) + 32;
                    default -> null;
                };
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        Double result1 = convertTemperature(25, "C");
        if (result1 != null)
            System.out.println("25°C is " + result1 + "°F");

        Double result2 = convertTemperature(98.6, "F");
        if (result2 != null)
            System.out.println("98.6°F is " + result2 + "°C");

        Double result3 = convertTemperature(0, "C");
        if (result3 != null)
            System.out.println("0°C is " + result3 + "°F");

        Double result4 = convertTemperature(212, "F");
        if (result4 != null)
            System.out.println("212°F is " + result4 + "°C");

        Double result5 = convertTemperature(100, "K");
        if (result5 == null)
            System.out.println("Invalid unit provided.");

        Double result6 = convertTemperature(-40, "C");
        if (result6 != null)
            System.out.println("-40°C is " + result6 + "°F");

        Double result7 = convertTemperature(-40, "F");
        if (result7 != null)
            System.out.println("-40°F is " + result7 + "°C");

    }

}

