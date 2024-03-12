package lab2;

public class factorial
{
    public static void main (String[] args) {
        int result = factorial(3);
        System.out.println(result);
    }

    public static int factorial(int number) {

        if (number == 1)
        {
            return number;
        }

        return number * factorial (number - 1);
    }

}
