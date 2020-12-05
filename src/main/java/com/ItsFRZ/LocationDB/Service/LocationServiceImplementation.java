package com.ItsFRZ.LocationDB.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ItsFRZ.LocationDB.Entity.LocationEntity;
import com.ItsFRZ.LocationDB.Repository.LocationRepository;

@Service
public class LocationServiceImplementation implements LocationService {

	@Autowired
	LocationRepository repository;
	
	
	
	public LocationRepository getRepository() {
		return repository;
	}

	public void setRepository(LocationRepository repository) {
		this.repository = repository;
	}

	@Override
	public LocationEntity saveLocation(LocationEntity location) {
		// TODO Auto-generated method stub
		return repository.save(location);
	}

	@Override
	public LocationEntity updateLocation(LocationEntity location) {
		// TODO Auto-generated method stub
		return repository.save(location);
	}

	@Override
	public void deleteLocation(LocationEntity location) {
		// TODO Auto-generated method stub
		
		repository.delete(location);
		
	}

	@Override
	public Optional<LocationEntity> getLocationById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<LocationEntity> getAllLocation() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
