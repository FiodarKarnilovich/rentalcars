package my.service.auto;


import entity.auto.AutoBrand;
import my.repository.AutoBrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AutoBrandService {

    @Autowired
    private AutoBrandRepository autoBrandRepository;

    public AutoBrand addAutoBrand(AutoBrand autoBrand) {

        return autoBrandRepository.save(autoBrand);
    }

    public void deleteAutoBrand(Integer id) {

        autoBrandRepository.deleteById(id);
    }
}
