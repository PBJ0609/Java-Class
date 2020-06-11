public class HelloString
{
    public static void main(String[] args){
        System.out.println("Hello String".getClass());
        String greeting = null;
        System.out.println("Greeting: " + greeting);
        greeting = new String("Hello");
        System.out.println("Greeting:" + greeting);

        greeting = "Hello using literal";
        System.out.println("Greeting is: " + greeting);

        boolean flag = true;
        int radius = 20;
        double PI = 3.142;
        String subject = "World";

        String strConcat =  greeting + subject;
        String boolConcat = "State of Flag: " + flag;
        String intConcat = "Radius of circle: " + radius;
        String doubleConcat = "PI is: " + PI;
        String area = "Area of Circle is: " + (PI * radius * radius);
        String concatCatch = "The catch is: " + (12 + 3 + 5);

        System.out.println(strConcat);
        System.out.println(boolConcat);
        System.out.println(intConcat);
        System.out.println(doubleConcat);
        System.out.println(area);
        System.out.println(concatCatch);
        System.out.println("\\\\");

    }

}
