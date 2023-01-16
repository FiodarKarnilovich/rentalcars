package entity.auto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "auto")
public class Auto implements Serializable {

    public Auto(Integer id, String model_auto, String colour_auto, Integer year_auto, Double price_auto) {
        this.id = id;
        this.model_auto = model_auto;
        this.colour_auto = colour_auto;
        this.year_auto = year_auto;
        this.price_auto = price_auto;
    }

    @Id
    @Column(name = "auto_id")
    @GeneratedValue(generator = "increment")
    @GenericGenerator(
            name = "increment",
            strategy = "org.hibernate.id.IncrementGenerator"
    )
    private Integer id;

    @Column(name = "model_auto")
    private String model_auto;

    @Column(name = "auto_picture")
    @Lob
    private byte[] picture;

    @Column(name = "colour_auto")
    private String colour_auto;

    @Column(name = "trancemission_auto")
    private String trancemission_auto;

    @Column(name = "year_auto")
    private Integer year_auto;

    @Column(name = "price_auto")
    private Double price_auto;


}
