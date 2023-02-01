package entity.auto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "auto_model")
public class AutoModel {

    @Id
    @Column(name = "model_id")
    @GeneratedValue(generator = "increment")
    @GenericGenerator(
            name = "increment",
            strategy = "org.hibernate.id.IncrementGenerator"
    )
    private Integer id;

    @Column(name = "model")
    private String model;

    @OneToMany(mappedBy = "autoModel")
    private List<Auto> autos;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private AutoBrand autoBrand;

    public AutoModel(Integer id, String model, AutoBrand autoBrand) {
        this.id = id;
        this.model = model;
        this.autoBrand = autoBrand;
    }
}
