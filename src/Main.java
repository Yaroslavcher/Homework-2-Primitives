public class Main {

    public static void main(String[] args) {
        //переменная стоимости билета
        int s = 5031;

        //переменная количества рублей за одну милю
        int k = 20;

        //формула бонусных миль
        int m = s / k;

        //вывод на экран количества бонусных миль
        System.out.println(m + " бонусных миль");
    }
}
