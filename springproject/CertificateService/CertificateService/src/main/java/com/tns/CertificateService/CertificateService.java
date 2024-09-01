package com.tns.CertificateService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CertificateService 
{
	@Autowired
	private CertificateRepository repo;
	
	public List<Certificate> listAll()
	{
		return repo.findAll();
	}
	public void save(Certificate cert)
	{
		repo.save(cert);
	}
	public Certificate get(Integer id)
	{
		return repo.findById(id).get();
	}
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
	public void update(Certificate cert)
	{
		repo.save(cert);
	}
	
	
}
