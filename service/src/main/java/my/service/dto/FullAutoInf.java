package my.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FullAutoInf {

    private Integer id;

    private byte[] picture;

    private String brand;

    private String model;

    private String colourAuto;

    private String trancemissionAuto;

    private Integer yearAuto;

    private Double priceAuto;
}
