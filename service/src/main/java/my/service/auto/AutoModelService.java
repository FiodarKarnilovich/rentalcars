package my.service.auto;

import entity.auto.AutoBrand;
import entity.auto.AutoModel;
import my.repository.AutoBrandRepository;
import my.repository.AutoModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AutoModelService {

    @Autowired
    private AutoModelRepository autoModelRepository;


    public AutoModel addAutoModel(AutoModel autoModel) {

        return autoModelRepository.save(autoModel);
    }

    public void deleteAutoModel(Integer id) {

        autoModelRepository.deleteById(id);
    }

    public AutoModel findByNameModel(String nameModel){

        return autoModelRepository.findAutoModelByModel(nameModel);
    }
}
