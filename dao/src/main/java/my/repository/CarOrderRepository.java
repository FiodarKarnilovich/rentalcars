package my.repository;

import entity.car_orders.CarOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarOrderRepository extends JpaRepository<CarOrder, Integer> {

}
