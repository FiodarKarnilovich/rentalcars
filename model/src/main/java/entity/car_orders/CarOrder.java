package entity.car_orders;

import entity.app_users.AppUser;
import entity.auto.Auto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "carorders")
public class CarOrder implements Serializable {

    @Id
    @Column(name = "order_id")
    @GeneratedValue(generator = "increment")
    @GenericGenerator(
            name = "increment",
            strategy = "org.hibernate.id.IncrementGenerator"
    )
    private Integer orderId;

    @ManyToOne
    @JoinColumn(name = "user_order_id")
    private AppUser userOrderId;

    @ManyToOne
    @JoinColumn(name = "auto_order_id")
    private Auto autoOrderId;

    @Column
    private LocalDate dateStart;

    @Column
    private LocalDate dateFinish;

    @Column(name = "amount_of_days")
    private Integer amountOfDays;

    @Override
    public String toString() {
        return "CarOrder{" +
                "orderId=" + orderId +
                ", userOrderId=" + userOrderId +
                ", autoOrderId=" + autoOrderId +
                ", dateStart=" + dateStart +
                ", dateFinish=" + dateFinish +
                ", amountOfDays=" + amountOfDays +
                '}';
    }
}
