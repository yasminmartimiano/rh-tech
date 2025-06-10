package com.martimianoyasmin.rh_tech.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.martimianoyasmin.rh_tech.Model.CargoModel;

@Repository
public interface CargoRepository extends JpaRepository<CargoModel, Long>{
}
