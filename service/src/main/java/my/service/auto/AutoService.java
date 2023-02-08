package my.service.auto;

import entity.auto.Auto;
import entity.auto.AutoBrand;
import entity.auto.AutoModel;
import entity.auto.AutoPicture;
import my.repository.AutoRepository;
import my.service.dto.AddAutoDTO;
import my.service.dto.AutoForListDTO;
import my.service.dto.FullAutoInf;
import my.service.dto.PriceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AutoService {

    @Autowired
    private AutoRepository autoRepository;

    @Autowired
    private AutoBrandService autoBrandService;

    @Autowired
    private AutoModelService autoModelService;

    @Autowired
    private AutoPictureService autoPictureService;


    public Auto addAuto(Auto auto) {

        return autoRepository.save(auto);
    }

    public void deleteAuto(Integer id) {

       autoRepository.deleteById(id);
    }

    public List<Auto> listAuto() {

        return autoRepository.findAll();
    }

    public long countAuto(){
        return autoRepository.count();
    }

    public List<Auto> listAutoForPage(int pageNumber, int pageSize){
        return autoRepository.findAll(PageRequest.of(pageNumber, pageSize)).getContent();
    }

    public List<AutoForListDTO> autoList(int pageNumber, int pageSize){

        List<Auto> autoList = listAutoForPage(pageNumber, pageSize);

        List<AutoForListDTO> finalList = new ArrayList<>();

        for (Auto auto : autoList) {
            AutoForListDTO autoForListDTO = new AutoForListDTO();
            autoForListDTO.setId(auto.getId());
            autoForListDTO.setBrand(auto.getAutoModel().getAutoBrand().getBrand());
            autoForListDTO.setModel(auto.getAutoModel().getModel());
            autoForListDTO.setPrice(auto.getPriceAuto());

            finalList.add(autoForListDTO);
        }

        return finalList;

    }
    public Auto findById(Integer id) {

        return autoRepository.findById(id).get();
    }

    public FullAutoInf fullAutoInf(Integer id) {

        Auto byId = findById(id);

        FullAutoInf fullAutoInf = new FullAutoInf();

        fullAutoInf.setId(byId.getId());
        //fullAutoInf.setPicture(byId.getAutoPicture().getPicture());
        fullAutoInf.setBrand(byId.getAutoModel().getAutoBrand().getBrand());
        fullAutoInf.setModel(byId.getAutoModel().getModel());
        fullAutoInf.setColourAuto(byId.getColourAuto());
        fullAutoInf.setTrancemissionAuto(byId.getTrancemissionAuto());
        fullAutoInf.setYearAuto(byId.getYearAuto());
        fullAutoInf.setPriceAuto(byId.getPriceAuto());

        return fullAutoInf;
    }

    public void addNewCar(AddAutoDTO addAutoDTO, byte[] autoPicture) {

        String autoBrand = addAutoDTO.getAutoBrand();

        AutoBrand brand = autoBrandService.findByNameBrand(autoBrand);

        if (brand == null) {
            AutoBrand autoBrand1 = new AutoBrand(null, autoBrand);
            brand = autoBrandService.addAutoBrand(autoBrand1);
        }

        String autoModel = addAutoDTO.getAutoModel();

        AutoModel model = autoModelService.findByNameModel(autoModel);

        if (model == null) {
            AutoModel autoModel1 = new AutoModel(null, autoModel, brand);
            model = autoModelService.addAutoModel(autoModel1);
        }

        Auto auto = new Auto();

        auto.setAutoModel(model);
        auto.setColourAuto(addAutoDTO.getColourAuto());
        auto.setTrancemissionAuto(addAutoDTO.getTrancemissionAuto());
        auto.setYearAuto(addAutoDTO.getYearAuto());
        auto.setPriceAuto(addAutoDTO.getPriceAuto());

        Auto auto1 = addAuto(auto);

        AutoPicture autoPhoto = new AutoPicture(null, autoPicture, auto1);
        autoPictureService.addAutoPicture(autoPhoto);

    }

    public void changePriceAuto(Integer id, PriceDTO price){
        Auto auto = findById(id);
        auto.setPriceAuto(price.getPrice());
        addAuto(auto);
    }

}
