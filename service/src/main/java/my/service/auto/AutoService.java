package my.service.auto;

import entity.auto.Auto;
import my.repository.AutoRepository;
import my.service.dto.AutoForListDTO;
import my.service.dto.FullAutoInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AutoService {

    @Autowired
    private AutoRepository autoRepository;


    public Auto addAuto(Auto auto) {

        return autoRepository.save(auto);
    }

    public void deleteAuto(Integer id) {

       autoRepository.deleteById(id);
    }

    public List<Auto> listAuto() {

        return autoRepository.findAll();
    }

    public List<AutoForListDTO> autoList(){

        List<Auto> autoList = listAuto();

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
        fullAutoInf.setPicture(byId.getAutoPicture().getPicture());
        fullAutoInf.setBrand(byId.getAutoModel().getAutoBrand().getBrand());
        fullAutoInf.setModel(byId.getAutoModel().getModel());
        fullAutoInf.setColourAuto(byId.getColourAuto());
        fullAutoInf.setTrancemissionAuto(byId.getTrancemissionAuto());
        fullAutoInf.setYearAuto(byId.getYearAuto());
        fullAutoInf.setPriceAuto(byId.getPriceAuto());

        return fullAutoInf;
    }

}
