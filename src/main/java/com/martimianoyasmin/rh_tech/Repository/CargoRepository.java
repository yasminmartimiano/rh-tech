package com.martimianoyasmin.rh_tech.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.martimianoyasmin.rh_tech.Model.CargoModel;

public interface CargoRepository extends JpaRepository<CargoModel, Long>{
}
