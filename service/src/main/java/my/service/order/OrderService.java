package my.service.order;

import entity.car_orders.CarOrder;
import my.repository.CarOrderRepository;
import my.service.auto.AutoService;
import my.service.dto.OrderDTO;
import my.service.user.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderService {

    @Autowired
    private CarOrderRepository carOrderRepository;
    @Autowired
    private AppUserService appUserService;
    @Autowired
    private AutoService autoService;

    public CarOrder addNewOrder(CarOrder carOrder){

        return carOrderRepository.save(carOrder);
    }

    public void addNewOrder(OrderDTO orderDTO, String userName, Integer autoId){
        CarOrder carOrder = new CarOrder();
        carOrder.setAmountOfDays(orderDTO.getAmountOfDays());
        carOrder.setDateStart(orderDTO.getDateStart());
        carOrder.setDateFinish(orderDTO.getDateFinish());
        carOrder.setUserOrderId(appUserService.findByEmail(userName));
        carOrder.setAutoOrderId(autoService.findById(autoId));

    }
}
