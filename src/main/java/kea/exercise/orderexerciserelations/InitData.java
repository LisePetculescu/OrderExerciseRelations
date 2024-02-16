package kea.exercise.orderexerciserelations;

import kea.exercise.orderexerciserelations.models.OrderLine;
import kea.exercise.orderexerciserelations.models.Product;
import kea.exercise.orderexerciserelations.repositories.OrderLineRepository;
import kea.exercise.orderexerciserelations.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {


    private ProductRepository productRepository;
    private OrderLineRepository orderLineRepository;


    public InitData(ProductRepository productRepository, OrderLineRepository orderLineRepository) {
        this.productRepository = productRepository;
        this.orderLineRepository = orderLineRepository;
    }



    public void run(String... args) {
        System.out.println("InitData is running");

        Product product1 = new Product("Kage", "Det er en chokoladekage", 119.95, "45954845635");
//        product.setName("Kage");
//        product.setDescription("Det er en chokoladekage");
//        product.setPrice(119.95);
//        product.setEAN13("45954845635");
        Product product2 = new Product("Tærte", "Det er en Jordbærtærte", 75, "459555555443");
        Product product3 = new Product("Ost", "Det er mellemlageret ost", 24.95, "45954554774");
        Product product4 = new Product("Ballon", "Det er balloner i flere farver", 20, "45954877643");
        Product product5 = new Product("Boller", "Det er nybagte boller", 89.95, "459588876685");

        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);
        productRepository.save(product4);
        productRepository.save(product5);

        OrderLine line1 = new OrderLine();
        line1.setProduct(product3);
        line1.setQuantity(6);
        orderLineRepository.save(line1);

        OrderLine line2 = new OrderLine();
        line2.setProduct(product3);
        line2.setQuantity(3);
        orderLineRepository.save(line2);
    }
}
