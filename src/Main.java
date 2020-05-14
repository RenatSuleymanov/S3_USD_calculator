import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текущий курс: ");
        float x = in.nextFloat();
        System.out.print("Введите количество рублей: ");
        float rub = in.nextFloat();
        float usd = rub/x;
        usd=usd*100;
        int result = (int)Math.round(usd);
        float result2 = (float) result / 100;
        System.out.printf("Итого: %.2f%9s",result2,"долларов");

    }
}
