package my.repository;

import entity.auto.AutoPicture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoPictureRepository extends JpaRepository<AutoPicture, Integer>{
}
