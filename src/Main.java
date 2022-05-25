public class Main {

    public static void main(String[] args) {
        //переменная стоимости билета
        int price = 5031;

        //переменная количества рублей за одну милю
        int rubPerMile = 20;

        //формула бонусных миль
        int bonus = price / rubPerMile;

        //вывод на экран количества бонусных миль
        System.out.println(bonus + " бонусных миль");
    }
}
