package com.ItsFRZ.LocationDB.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ItsFRZ.LocationDB.EmailUtility.EmailUtility;
import com.ItsFRZ.LocationDB.Entity.LocationEntity;
import com.ItsFRZ.LocationDB.Service.LocationService;

@Controller
public class LocationController {

	@Autowired
	LocationService service;
	
	@Autowired
	private EmailUtility utility;
	
	@RequestMapping("/home")
	public String showLocation() 
	{
		
		return "LocationHome";
	}
	
	@RequestMapping("saveLocations")
	public String saveLocation(@ModelAttribute("location") LocationEntity locate) 
	{
		
		LocationEntity locations =   service.saveLocation(locate);
		utility.sendEmail("youremail@gmail.com","Your Subject Here","Congrats ! Your Java Email Utility Works !!!"); 
		
		return "LocationHome";
	}
	
	@RequestMapping("viewLocations")
	public String viewData(ModelMap model) 
	{
		
		List<LocationEntity> location = service.getAllLocation();
		model.addAttribute("locations",location);
		
		return "viewLocations";
	}

	@RequestMapping("deleteLocation")
	public String deleteLocation(@RequestParam("lid") int lid,ModelMap map) 
	{
		LocationEntity location = new LocationEntity();
		location.setLid(lid);
		service.deleteLocation(location);
		
		//For Refreshing rest of data after Deletion
		List<LocationEntity> locationData = service.getAllLocation();
		map.addAttribute("locations",locationData);
		
		
		return "viewLocations";
	}
	
	@RequestMapping("updateLocation")
	public String updateLocation(@RequestParam("lid") int id,ModelMap map) 
	{
	
		Optional<LocationEntity> location = service.getLocationById(id);
		LocationEntity locate = location.get();
		
		map.addAttribute("location",locate);
		
		
		return "updateLocations";
	}
	
	
}

