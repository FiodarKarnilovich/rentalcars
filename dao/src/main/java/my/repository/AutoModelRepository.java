package my.repository;

import entity.auto.AutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoModelRepository extends JpaRepository<AutoModel, Integer> {
}
