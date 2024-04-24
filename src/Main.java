public class Main {
    public static void main(String[] args) {

        // Объявляем переменные для входных данных.

        double ticket = 32674; // для хранения стоимости билета.
        int rub = 20; // для хранения количества рублей для одной бонусной мили.

        // Рассчитываем количество бонусных миль.

        int mile = (int) (ticket / rub);

        // Выводим на экран.

        System.out.println(mile);
    }
}