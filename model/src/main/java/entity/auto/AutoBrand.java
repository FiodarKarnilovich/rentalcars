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
@Table(name = "auto_brand")
public class AutoBrand {

    public AutoBrand(Integer id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    @Id
    @Column(name = "brand_id")
    @GeneratedValue(generator = "increment")
    @GenericGenerator(
            name = "increment",
            strategy = "org.hibernate.id.IncrementGenerator"
    )
    private Integer id;

    @Column(name = "brand")
    private String brand;

    @OneToMany(mappedBy = "autoBrand")
    private List<AutoModel> autoModels;
}
