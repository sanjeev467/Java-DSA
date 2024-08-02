public class swapNums {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a + " " + b);
    }

    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2=temp;
    }
}

// this will not swap the a and b, because
//In Java, when you pass primitive data types like int to a method,
// they are passed by value. This means that the method receives a copy of the variables,
// not the variables themselves. As a result, any changes made to the parameters within the swap method
// do not affect the original variables a and b in the main method.

//To swap the numbers in a way that affects the original variables, you can use an array or a custom object.