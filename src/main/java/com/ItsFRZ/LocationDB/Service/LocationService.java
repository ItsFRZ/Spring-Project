package com.ItsFRZ.LocationDB.Service;

import java.util.List;
import java.util.Optional;


import com.ItsFRZ.LocationDB.Entity.LocationEntity;


public interface LocationService {

	LocationEntity saveLocation(LocationEntity location);
	LocationEntity updateLocation(LocationEntity location);
	void deleteLocation(LocationEntity location);
	Optional<LocationEntity> getLocationById(int id);
	List<LocationEntity> getAllLocation();
	
}
