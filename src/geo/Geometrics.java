package geo;

public class Geometrics {
    private static double x = 10.0;
    private static double y = 5.0;
    private static double z = 3.0;
    private static int x1 = 8;
    private static int y1 = 7;
    private static int z1 = 10;
    private static int x2 = 100;
    private static int y2 = 57;
    private static int z2 = 129;
    private static int x3 = 45;
    private static int y3 = 89;
    private static int z3 = 69;

    public static double squareArea (double x) {
    	return x * x;
    	    }
    
    public static int squareArea2 (int x) {
    	return x * x;
    	    }
    
    public static double squarePerimeter (double x) {
    	return 4 * x;
    }
    
    public static int squarePerimeter2 (int x) {
    	return 4 * x;
    }
    
    public static double rectangleArea (double x, double y) {
    	return x * y;
    }
    
    public static int rectangleArea2 (int x, int y) {
    	return x * y;
    }
    
    public static double rectanglePerimeter (double x, double y) {
    	return 2*(x + y);
    }
    
    public static int rectanglePerimeter2 (int x, int y) {
    	return 2*(x + y);
    }
    
    public static double zoneSphere (double x, double y, double z) {
    	return (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
    }
    
    public static double cylinderSphere (double z) {
    	return (Math.PI * Math.pow(z, 3) / 6);
    }
    
    public static double ungula (double x, double z) {
    	return (2 * x3 * z3) / 3;
    }
    
    public static void print (String message) {
    	System.out.print(message);
    }
    
    public static void print2 (String message) {
    	System.out.println(message);
    }
    
    public static void main(String[] args) {
        // area ... Fläche
        /*System.out.println("Square area");
        System.out.println("x * x = " + x * x);
        System.out.println("x1 * x1 = " + x1 * x1);
        System.out.println("x2 * x2 = " + x2 * x2);
        System.out.println("y * y = " + y * y);*/
    	
    	print2("Square area");
    	print("x * x = "); System.out.println(squareArea(x));
    	print("x1 * x1 = "); System.out.println(squareArea2(x1));
    	print("x2 * x2 = "); System.out.println(squareArea2(x2));
    	print("y * y = "); System.out.println(squareArea(y));
    	
    	/*perimeter ... Umfang
        System.out.println("Square perimeter");
        System.out.println("4 * x = " + 4 * x);
        System.out.println("4 * x1 = " + 4 * x1);
        System.out.println("4 * x2 = " + 4 * x2);
        System.out.println("4 * y = " + 4 * y);*/
    	
    	print2("Square perimeter");
    	print("4 * x = "); System.out.println(squarePerimeter(x));
    	print("4 * x1 = "); System.out.println(squarePerimeter2(x1));
    	print("4 * x2 = "); System.out.println(squarePerimeter2(x2));
    	print("4 * y = "); System.out.println(squarePerimeter(y));
    	
       /*
        System.out.println("Rectangle area");
        System.out.println("x * y = " + x * y);
        System.out.println("x1 * y1 = " + x1 * y1);
        System.out.println("x2 * y2 = " + x2 * y2);
        System.out.println("x3 * y3 = " + x3 * y3);*/
    	
    	print2("Rectangle area");
    	print("x * y = "); System.out.println(rectangleArea(x,y));
    	print("x1 * y1 = "); System.out.println(rectangleArea2(x1,y1));
    	print("x2 * y2 = "); System.out.println(rectangleArea2(x2,y2));
    	print("x3 * y3 = "); System.out.println(rectangleArea2(x3,y3));

        /*System.out.println("Rectangle perimeter");
        System.out.println("x + y = " + x + y);
        System.out.println("x1 + y1 = " + x1 + y1);
        System.out.println("x2 + y2 = " + x2 + y2);
        System.out.println("x3 + y3 = " + x3 + y3);*/

    	print2("Rectangle perimeter");
    	print("x + y = "); System.out.println(rectanglePerimeter(x,y));
    	print("x1 + y1 = "); System.out.println(rectanglePerimeter2(x1,y1));
    	print("x2 + y2 = "); System.out.println(rectanglePerimeter2(x2,y2));
    	print("x3 + y3 = "); System.out.println(rectanglePerimeter2(x3,y3));
    	
        print2("We can also calculate some volumes");
        /*
            z is our height
            y is our radius
         */
        print2("Zone of a sphere");
        /*double v = (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
        System.out.println(v);*/
        System.out.println(zoneSphere(x,y,z));
           
        print2("Sphere with cylinder");
        /*System.out.println(Math.PI * Math.pow(z, 3) / 6);*/
        System.out.println(cylinderSphere(z));
        

        print2("Ungula");
        /*System.out.println((double) (2 * x3 * z3) / 3);*/
        System.out.println(ungula(x,z));
    }
}
