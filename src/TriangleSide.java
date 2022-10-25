import java.util.Scanner;

public class TriangleSide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side: ");
        int a = scanner.nextInt();
        System.out.println("Enter second side: ");
        int b = scanner.nextInt();
        System.out.println("Enter third side: ");
        int c = scanner.nextInt();

        try {
           Triangle triangle = new Triangle(a, b, c);
            validateTriangle(triangle);

        }catch (IllegalTriangleException e){
            System.err.println(e.getMessage());
        }

    }

    private static void validateTriangle(Triangle triangle) throws IllegalTriangleException {
        if (triangle.getSide1()*triangle.getSide2()* triangle.getSide3() <= 0) {
            // throw triangleException
            throw new IllegalTriangleException("There are sides is zero or smaller !!!");
        }

        if (!isValidTriangleSide(triangle)) {
            // throw triangleException
            throw new IllegalTriangleException("Invalid triangle !!!");
        }

    }


    private static boolean isValidTriangleSide (Triangle triangle) {
        if (triangle.getSide1() + triangle.getSide2() < triangle.getSide3()) {
            return false;
        }

        if (triangle.getSide2() + triangle.getSide3() < triangle.getSide1()) {
            return false;
        }

        if (triangle.getSide3() + triangle.getSide1() < triangle.getSide2()) {
            return false;
        }

        return true;
    }

    //    public void IllegalTriangleException(int a, int b, int c) {
//        if (a > 0 && b > 0 && c > 0) {
//            if (a + b > c && a + c > b && b + c > a) {
//                System.out.println("Triangle sides is = " + a + ", " + b + ", " + c);
//            } else {
//                System.out.println("Error");
//            }
//        } else {
//            System.out.println("Error : Triangle sides should be '> 0'");
//        }
//
//        try {
//            System.out.println("Triangle sides is = " + a + ", " + b + ", " + c);
//        } catch (IllegalArgumentException e) {
//            System.err.println();
//        }
//
//    }
}
