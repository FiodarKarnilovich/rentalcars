package entity.car_orders;

import entity.app_users.AppUsers;
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
public class CarOrders implements Serializable {

    @Id
    @Column(name = "order_id")
    @GeneratedValue(generator = "increment")
    @GenericGenerator(
            name = "increment",
            strategy = "org.hibernate.id.IncrementGenerator"
    )
    private Integer order_id;

    @ManyToOne
    @JoinColumn(name = "user_order_id")
    private AppUsers user_order_id;

    @ManyToOne
    @JoinColumn(name = "auto_order_id")
    private Auto auto_order_id;

    @Column
    private LocalDate dateStart;

    @Column
    private LocalDate dateFinish;

    @Column
    private Integer amountOfDays;

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", userOrder=" + user_order_id +
                ", autoOrder=" + auto_order_id +
                ", dateStart=" + dateStart +
                ", dateFinish=" + dateFinish +
                ", amountOfDays=" + amountOfDays +
                '}';
    }
}
