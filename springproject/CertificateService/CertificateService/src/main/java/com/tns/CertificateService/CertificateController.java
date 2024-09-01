package com.tns.CertificateService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

@RestController

public class CertificateController
{
	@Autowired
	private CertificateService cert;
	@GetMapping("/certificateservice")
	public List<Certificate> list()
	{
		return cert.listAll();
	}
	@PostMapping("/certificateservice")
	public void add(@RequestBody Certificate cert1) 
	{
		cert.save(cert1);
	}
	@GetMapping("/certificateservice/{id}")
	public ResponseEntity<Certificate> get(@PathVariable Integer id)
	{
		try
		{
		Certificate c=cert.get(id);
		return new ResponseEntity<Certificate>(c,HttpStatus.OK);
	    }
		catch(NoResultException e)
		{
			return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/certificateservice/{id}")
	public void delete(@PathVariable Integer id)
	{
		cert.delete(id);
	}
	@PutMapping("/certificateservice/{id}")
	public ResponseEntity<Certificate> update(@PathVariable Integer id,@RequestBody Certificate update_c)
	{
		try
		{
		Certificate exist_c=cert.get(id);
		exist_c.setName(update_c.getName());
		exist_c.setIssuedBy(update_c.getIssuedBy());
		exist_c.setIssuedDate(update_c.getIssuedDate());
		cert.update(exist_c);
		return new ResponseEntity<Certificate>(exist_c,HttpStatus.OK);
	    }
		catch(NoResultException e)
		{
			return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
		}
	}
}
