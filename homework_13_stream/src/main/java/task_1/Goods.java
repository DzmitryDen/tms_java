package task_1;

import java.util.List;

public class Goods {

    private String productName;
    private Double price;
    private Category category;
    private Boolean delivery;
    private List<Store> stores;
    private Producer producer;

    public Goods(String productName, Double price, Category category, Boolean delivery, List<Store> stores, Producer producer) {
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.delivery = delivery;
        this.stores = stores;
        this.producer = producer;
    }

    public String getProductName() {
        return productName;
    }

    public Double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public Boolean getDelivery() {
        return delivery;
    }

    public List<Store> getStores() {
        return stores;
    }

    public Producer getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", delivery=" + delivery +
                ", stores=" + stores +
                ", producer=" + producer +
                '}';
    }
}
