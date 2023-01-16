package my.dao;

import entity.auto.Auto;
import my.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AutoDaoImpl implements AutoDao{

    @Autowired
    private AutoRepository autoRepository;

    @Override
    public Auto createAuto(Auto auto) {
        return autoRepository.save(auto);
    }

    @Override
    public Auto getAuto(Integer id) {

        return autoRepository.getOne(id);
    }

    @Override
    public Boolean isExistsById(Integer id) {

        return autoRepository.existsById(id);
    }

    @Override
    public void deleteAuto(Auto auto) {
        autoRepository.delete(auto);
    }

    @Override
    public void deleteAuto(Integer id) {

        autoRepository.deleteById(id);
    }

    @Override
    public List<Auto> getAllAutoPage(int pageNumber, int pageSize) {

        return null;
    }

    @Override
    public List<Auto> getAllAuto() {

        return autoRepository.findAll();
    }

    @Override
    public long countAuto() {

        return autoRepository.count();
    }
}
