package my.service.auto;

import entity.auto.Auto;
import my.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

}
