package my.repository;

import entity.car_orders.CarOrders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarOrdersRepository extends JpaRepository<CarOrders, Integer> {

}
