import java.util.Scanner;

public class RecursiveUsHesaplamaProgrami {

    static int exp(){
        int base , exponent;
        int result = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayısını giriniz :");
        base = input.nextInt();
        System.out.print("Üs sayısınız giriniz :");
        exponent = input.nextInt();
        for (int i= 1; i <= exponent; i++){
             result *= base;
        }


        return result;
    }

    public static void main(String[] args) {
        System.out.println(exp());



    }
}
