package entity.auto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "auto_picture")
public class AutoPicture {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "increment")
    @GenericGenerator(
            name = "increment",
            strategy = "org.hibernate.id.IncrementGenerator"
    )
    private Integer id;


    @Column(name = "auto_picture")
    @Lob
    private byte[] picture;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Auto auto;

    public AutoPicture(Integer id, byte[] picture, Auto auto) {
        this.id = id;
        this.picture = picture;
        this.auto = auto;
    }
}
