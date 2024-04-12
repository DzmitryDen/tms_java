package creditcard;

/**
 * Task_1
 * Создать класс CreditCard c полями номер счета, текущая сумма на счету.
 * Добавьте метод, который позволяет начислять сумму на кредитную
 * карточку.
 * Добавьте метод, который позволяет снимать с карточки некоторую
 * сумму.
 * Добавьте метод, который выводит текущую информацию о карточке.
 * Напишите программу, которая создает три объекта класса CreditCard у
 * которых заданы номер счета и начальная сумма
 * Тестовый сценарий для проверки:
 * Положите деньги на первые две карточки и снимите с третьей.
 * Выведите на экран текущее состояние всех трех карточек
 */

public class Main {

    public static void main(String[] args) {

//        create three objects
        CreditCard card1 = new CreditCard("by1111account", 1000000);
        CreditCard card2 = new CreditCard("by5555account", 5000000);
        CreditCard card3 = new CreditCard("by9090account", 8000000);

        System.out.println("Initial information about the cards: ");
        System.out.println(card1.getInformation());
        System.out.println(card2.getInformation());
        System.out.println(card3.getInformation());

//        cards operations
        card1.depositAmount(800000.54);
        card2.depositAmount(400000.56);
        card3.withdrawAmount(500000.98);

        System.out.println("\nCurrent information about the cards:");
        System.out.println(card1.getInformation());
        System.out.println(card2.getInformation());
        System.out.println(card3.getInformation());
    }
}