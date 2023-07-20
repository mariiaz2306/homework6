import java.util.Scanner;

public class Shops {
    public static void main(String[] args) {
        //Проверка открытия магазинов
        boolean isEdekaOpen = true;
        boolean isReweOpen = false;

        boolean canBuy = canBuyFood(isReweOpen, isEdekaOpen);
        System.out.println("I can buy food, means " + canBuy);

        //Проверка на високосный год
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year for the checking");
        int year = scanner.nextInt();
        boolean isLeap = isLeapYear(year);
        System.out.println(year + " Year " + (isLeap ? "Leap": "Not Leap"));

        // Находим максимальное из трех

        System.out.println("Enter 3 integer numbers with a space");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int maxNumber = findMaxNumber (num1, num2, num3);
        System.out.println("Max number " + maxNumber);

        scanner.close();

    }
    //Метод проверки "могу ли я купить еду"

    public static boolean canBuyFood(boolean isEdekaOpen, boolean isReweOpen){
        return isReweOpen || isEdekaOpen;
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 !=0) || year % 400 ==0;// метод на проверку високосного года

    }
    // метод на проверку максимальности числа из трех
    public static int findMaxNumber(int num1, int num2, int num3) {
        return Math.max(Math.max(num1,num2), num3);
    }
}
