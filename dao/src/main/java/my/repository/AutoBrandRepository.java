package my.repository;

import entity.auto.AutoBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoBrandRepository extends JpaRepository<AutoBrand, Integer> {

    public AutoBrand findAutoBrandByBrand(String brandName);
}
