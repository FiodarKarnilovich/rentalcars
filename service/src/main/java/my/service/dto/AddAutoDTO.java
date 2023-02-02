package my.service.dto;

import entity.auto.AutoModel;
import entity.auto.AutoPicture;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddAutoDTO {

    private String autoBrand;

    private String autoModel;

    private String colourAuto;

    private String trancemissionAuto;

    private Integer yearAuto;

    private Double priceAuto;

    private byte[] autoPicture;



}
