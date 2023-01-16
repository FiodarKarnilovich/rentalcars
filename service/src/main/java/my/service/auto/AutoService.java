package my.service.auto;

import entity.auto.Auto;
import my.dao.AutoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AutoService {

    @Autowired
    private AutoDao autoDao;


    public Auto addAuto(Auto auto) {

        return autoDao.createAuto(auto);
    }

    public void deleteAuto(Integer id) {

       autoDao.deleteAuto(id);
    }

}
