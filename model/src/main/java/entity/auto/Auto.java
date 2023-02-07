package entity.auto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "auto")
public class Auto implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "increment")
    @GenericGenerator(
            name = "increment",
            strategy = "org.hibernate.id.IncrementGenerator"
    )
    private Integer id;


    @Column(name = "colour_auto")
    private String colourAuto;

    @Column(name = "trancemission_auto")
    private String trancemissionAuto;

    @Column(name = "year_auto")
    private Integer yearAuto;

    @Column(name = "price_auto")
    private Double priceAuto;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private AutoModel autoModel;

    @OneToOne(mappedBy = "auto", cascade = CascadeType.ALL)
    private AutoPicture autoPicture;

    public Auto(Integer id, String colourAuto, String trancemissionAuto, Integer yearAuto, Double priceAuto, AutoModel autoModel) {
        this.id = id;
        this.colourAuto = colourAuto;
        this.trancemissionAuto = trancemissionAuto;
        this.yearAuto = yearAuto;
        this.priceAuto = priceAuto;
        this.autoModel = autoModel;
    }
}
