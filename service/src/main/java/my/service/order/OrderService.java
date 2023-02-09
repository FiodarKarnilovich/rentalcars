package my.service.order;

import entity.car_orders.CarOrder;
import my.repository.CarOrderRepository;
import my.service.auto.AutoService;
import my.service.dto.OrderDTO;
import my.service.user.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class OrderService {

    @Autowired
    private CarOrderRepository carOrderRepository;
    @Autowired
    private AppUserService appUserService;
    @Autowired
    private AutoService autoService;

    public CarOrder addOrder(CarOrder carOrder){

        return carOrderRepository.save(carOrder);
    }

    public List<CarOrder> listOrders(){
        return carOrderRepository.findAll();
    }

    public CarOrder getOrder(Integer id){
        return carOrderRepository.findById(id).get();
    }

    public void addNewOrder(OrderDTO orderDTO, String userName, Integer autoId, LocalDate s, LocalDate f){
        CarOrder carOrder = new CarOrder();
        carOrder.setAmountOfDays(orderDTO.getAmountOfDays());
        carOrder.setDateStart(s);
        carOrder.setDateFinish(f);
        carOrder.setUserOrderId(appUserService.findByEmail(userName));
        carOrder.setAutoOrderId(autoService.findById(autoId));
        addOrder(carOrder);

    }
}
