package com.ItsFRZ.LocationDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ItsFRZ.LocationDB.Entity.LocationEntity;

public interface LocationRepository extends JpaRepository<LocationEntity, Integer> {

}
