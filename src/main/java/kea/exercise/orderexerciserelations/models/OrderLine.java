package kea.exercise.orderexerciserelations.models;

import jakarta.persistence.*;

@Entity
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Product product;
    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
