package com.Centum1.Sharathcars.repository;

import com.Centum1.Sharathcars.entity.Sharathcar;
import org.springframework.data.jpa.repository.JpaRepository;
public interface SharathcarsRepo  extends JpaRepository<Sharathcar,Integer>  {
    Sharathcar findById(int id);

}
