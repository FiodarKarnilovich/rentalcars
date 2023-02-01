package my.service.auto;

import entity.auto.AutoModel;
import entity.auto.AutoPicture;
import my.repository.AutoModelRepository;
import my.repository.AutoPictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AutoPictureService {

    @Autowired
    private AutoPictureRepository autoPictureRepository;


    public AutoPicture addAutoPicture(AutoPicture autoPicture) {

        return autoPictureRepository.save(autoPicture);
    }

    public void deleteAutoPicture(Integer id) {

        autoPictureRepository.deleteById(id);
    }
}
