package lab2;

public class fibbonaci {
    public static void main(String[] args) {
        for(int i = 0; i <= 6; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int number) {
        if(number == 0){
            return 0;
        }

        if(number == 1){
            return 1;
        }

        return fibonacci(number-2) + fibonacci(number-1);
    }

}
