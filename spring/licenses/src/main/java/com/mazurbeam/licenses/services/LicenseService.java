package com.mazurbeam.licenses.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mazurbeam.licenses.models.License;
import com.mazurbeam.licenses.repositories.LicenseRepository;

@Service
public class LicenseService {
	private LicenseRepository licenseRepository;
	
	public LicenseService(LicenseRepository licenseRepository) {
		this.licenseRepository = licenseRepository;
	}
	public List<License> allLicenses(){
		return (List<License>) licenseRepository.findAll();
	}
	
	public void addLicense(License license) {
		this.licenseRepository.save(license);
	}
}
