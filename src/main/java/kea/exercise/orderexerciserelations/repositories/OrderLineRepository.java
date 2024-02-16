package kea.exercise.orderexerciserelations.repositories;

import kea.exercise.orderexerciserelations.models.OrderLine;
import kea.exercise.orderexerciserelations.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineRepository extends JpaRepository<OrderLine, Integer>{
}

