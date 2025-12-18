package Section9_Methods;

public class Exercise25 {

    static int area( int length, int width ) {
        // Finish writing the method code here
        return length * width;
    }

    static int area( int length ) {
        // Finish writing the method code here
        return length * 10;
    }

    static int perimeter( int length, int width ) {
        // Finish writing the method code here
        return (length + width) *2;
    }

    static int perimeter( int length ) {
        // Finish writing the method code here
        return (length + 10) * 2;
    }


    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("Area with length 20 and width 10:" );
        System.out.println( area(20, 10) );

        System.out.println( "Area with length 20:" );
        System.out.println( area(20) );

        System.out.println( "Perimeter with length 20 and width 10:" );
        System.out.println( perimeter(20, 10) );

        System.out.println( "Perimeter with length 20:" );
        System.out.println( perimeter(20) );

    }

}
