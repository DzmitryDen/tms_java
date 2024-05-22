package task_1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Task
 * Необходимо создать следующие объекты:
 * 1) Товар (поля - название, стоимость, категория (enum), возможность доставки (boolean), список магазинов где он есть в наличии, производитель)
 * 2) Производитель (название, страна)
 * 3) Магазин (номер, город, адрес, номер телефона)
 * <p>
 * На вход мы получаем коллекцию всех товаров, у каждого из который указан производитель и список магазинов, где данный товар можно купить. Должны быть некоторые товары, относящиеся к одному производителю. Некоторые товары должны относится к одному магазину.
 * <p>
 * Необходимо выполнить:
 * 1) определить самый дорогой и дешевый товар
 * 2) найти все товары которые возможно доставить до покупателя
 * 3) посчитать среднюю стоимость товара указанной категории
 * 4) найти все товары определенного производителя
 * 5) найти всех названия производителей указанной страны
 * 6) найти все магазины конкретного города
 * 7) найти адрес магазина по указанному номеру телефона
 * 8) все товары указанного номера магазина
 * 9) составить map где ключ это номер магазина, а значение - это номер телефона данного магазина
 * 10) узнать все ли товары указанной категории можно доставить до покупателя
 * 11) посчитать количество магазинов
 * 12) вывести товары отсортированные по стоимости (от большего к меньшему)
 */

public class Main {

    public static void main(String[] args) {

        Store store_1 = new Store(17, "A_city", "345_street", "+12-123-127");
        Store store_2 = new Store(12, "A_city", "45_street", "+12-211-124");
        Store store_3 = new Store(24, "B_city", "434_street", "+16-341-111");
        Store store_4 = new Store(21, "B_city", "4_street", "+16-342-123");
        Store store_5 = new Store(45, "C_city", "114_street", "+11-543-723");
        Store store_6 = new Store(51, "C_city", "156_street", "+11-848-522");

        Producer producer_1 = new Producer("ASTRA", "Russia");
        Producer producer_2 = new Producer("STYLE", "Russia");
        Producer producer_3 = new Producer("DINO", "Belgium");
        Producer producer_4 = new Producer("DECOR", "Belgium");
        Producer producer_5 = new Producer("STT", "Germany");
        Producer producer_6 = new Producer("DEN", "Germany");

        List<Store> stores_1 = List.of(store_1, store_3, store_4);
        Goods goods_1 = new Goods("product_1", 125.0, Category.CATEGORY_2, true, stores_1, producer_1);

        List<Store> stores_2 = List.of(store_2, store_5, store_6);
        Goods goods_2 = new Goods("product_2", 225.45, Category.CATEGORY_1, true, stores_2, producer_1);

        List<Store> stores_3 = List.of(store_1, store_3, store_6);
        Goods goods_3 = new Goods("product_3", 345.55, Category.CATEGORY_1, true, stores_3, producer_2);

        List<Store> stores_4 = List.of(store_2, store_3, store_5);
        Goods goods_4 = new Goods("product_4", 75.5, Category.CATEGORY_3, false, stores_4, producer_3);

        List<Store> stores_5 = List.of(store_3, store_4, store_5, store_6);
        Goods goods_5 = new Goods("product_5", 35.52, Category.CATEGORY_3, false, stores_5, producer_4);

        List<Store> stores_6 = List.of(store_1, store_2);
        Goods goods_6 = new Goods("product_6", 1135.0, Category.CATEGORY_1, true, stores_6, producer_5);

        List<Store> stores_7 = List.of(store_2);
        Goods goods_7 = new Goods("product_7", 235.0, Category.CATEGORY_2, true, stores_7, producer_6);

        List<Store> stores_8 = List.of(store_2, store_3, store_4, store_5, store_6);
        Goods goods_8 = new Goods("product_8", 205.34, Category.CATEGORY_2, false, stores_8, producer_6);

        // Коллекция всех товаров:
        List<Goods> goodsList = List.of(goods_1, goods_2, goods_3, goods_4, goods_5, goods_6, goods_7, goods_8);

        // 1. Определить самый дорогой и дешевый товар:
        List<Goods> collect = goodsList.stream()
                .sorted((g1, g2) -> (int) (g1.getPrice() - g2.getPrice()))
                .collect(Collectors.toList());
        System.out.println("Самый дорогой: " + collect.get(collect.size() - 1));
        System.out.println("Самый дешевый: " + collect.get(0));

        // 2. Найти все товары которые возможно доставить до покупателя:
        List<Goods> collect1 = goodsList.stream()
                .filter(goods -> goods.getDelivery() == true)
                .collect(Collectors.toList());
        System.out.println("Товары возможные к доставке" + collect1);

        // 3.Посчитать среднюю стоимость товара указанной категории (для примера CATEGORY_1):
        double asDouble = goodsList.stream()
                .filter(goods -> goods.getCategory() == Category.CATEGORY_1)
                .map(Goods::getPrice)
                .mapToDouble(price -> price)
                .average()
                .getAsDouble();
        System.out.println("Средняя стоимость товара для указанной категории: " + String.format("%.2f", asDouble));

        // 4.Найти все товары определенного производителя (для примера DEN):
        List<Goods> collect2 = goodsList.stream()
                .filter(goods -> goods.getProducer().getName().equals("DEN"))
                .collect(Collectors.toList());
        System.out.println("Все товары указанного производителя: " + collect2);

        // 5.Найти все названия производителей указанной страны (для примера Belgium):
        List<String> belgium = goodsList.stream()
                .map(Goods::getProducer)
                .filter(producer -> producer.getCountry().equals("Belgium"))
                .collect(Collectors.toList()).stream()
                .map(Producer::getName)
                .collect(Collectors.toList());
        System.out.println("Все названия производителей указанной страны: " + belgium);

        // 6.Найти все магазины конкретного города (для примера A_city):
        Set<Store> aCity = goodsList.stream()
                .flatMap(goods -> goods.getStores().stream())
                .filter(store -> store.getCity().equals("A_city"))
                .collect(Collectors.toSet());
        System.out.println("Все магазины указанного города: " + aCity);

        // 7.Найти адрес магазина по указанному номеру телефона (для примера +11-543-723):
        String address = goodsList.stream()
                .flatMap(goods -> goods.getStores().stream())
                .filter(store -> store.getPhoneNumber().equals("+11-543-723"))
                .findFirst()
                .orElseThrow().getAddress();
        System.out.println("Адрес магазина по указанному номеру телефона: " + address);

        // 8.Все товары указанного номера магазина (для примера 21):
        List<Goods> collect3 = goodsList.stream()
                .filter(goods -> goods.getStores().stream().anyMatch(store -> store.getNumber() == 21))
                .collect(Collectors.toList());
        System.out.println("Все товары указанного номера магазина: " + collect3);

        // 9.Cоставить map где ключ это номер магазина, а значение - это номер телефона данного магазина:
        Map<Integer, String> map = new LinkedHashMap<>();

        // получаем коллекцию ключей (номера магазинов)
        List<Integer> keys = goodsList.stream()
                .flatMap(goods -> goods.getStores().stream())
                .map(store -> store.getNumber())
                .collect(Collectors.toList());

        // получаем коллекцию значений (телефоны)
        List<String> values = goodsList.stream()
                .flatMap(goods -> goods.getStores().stream())
                .map(store -> store.getPhoneNumber())
                .collect(Collectors.toList());

        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values.get(i));
        }
        map.forEach((k, v) -> System.out.print(k + ": " + v + "; \n"));

        // Решение через Collectors.toMap
        Map<Integer, String> collect5 = goodsList.stream()
                .flatMap(goods -> goods.getStores().stream())
                .collect(Collectors.toSet()).stream()
                .collect(Collectors.toMap(Store::getNumber, Store::getPhoneNumber));
        System.out.println(collect5);


        // 10.Узнать все ли товары указанной категории можно доставить до покупателя (для примера CATEGORY_2)
        boolean b = goodsList.stream()
                .filter(goods -> goods.getCategory().equals(Category.CATEGORY_2))
                .allMatch(goods -> goods.getDelivery());
        if (b) {
            System.out.println("Все товары данной категории возможно доставить");
        } else {
            System.out.println("Не все товары данной категории возможно доставить");
        }

        // 11.Посчитать количество магазинов
        int size = goodsList.stream()
                .flatMap(goods -> goods.getStores().stream())
                .collect(Collectors.toSet()).size();
        System.out.println("Количество магазинов: " + size);

        // 12.Вывести товары отсортированные по стоимости (от большего к меньшему)
        List<Goods> collect4 = goodsList.stream()
                .sorted((g1, g2) -> (int) (g2.getPrice() - g1.getPrice()))
                .collect(Collectors.toList());
        System.out.println("Сортировка: " + collect4);

    }
}
