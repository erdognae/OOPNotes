public class mathHelper
{

    public static int add(int a, int b) {
        return a + b;
    }

    public static int substract(int a, int b) {
        return a - b;
    }

    public static int mutiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b){
    if(b==0){
        throw new ArithmeticException("Division by zero not allowed");
    }else{
    return a/b;
    }
    
    }
}


