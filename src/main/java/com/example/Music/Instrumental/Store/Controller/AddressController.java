package com.example.Music.Instrumental.Store.Controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Music.Instrumental.Store.Model.Address;
import com.example.Music.Instrumental.Store.Model.AddressNotFoundException;
import com.example.Music.Instrumental.Store.Service.AddressService;

@RestController
@RequestMapping("/musical")
public class AddressController {
	@Autowired
	AddressService folkservice;

	@GetMapping
//	@RequestMapping(method=RequestMethod.GET)//not used now a days
	public ResponseEntity<List<Address>> getAddress() {
		List<Address> Address = folkservice.getMusic();
		return new ResponseEntity<List<Address>>(Address, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Address> getAddressId(@PathVariable("id") int id)
			throws ClassNotFoundException, AddressNotFoundException {
		Address Address = folkservice.getMusicId(id);
		return new ResponseEntity<Address>(Address, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Address> createorUpdate(@RequestBody Address Address) {
		Address update = folkservice.createmusic(Address);
		return new ResponseEntity<Address>(update, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Address> UpdateCategory(@RequestBody Address Address, @PathVariable("id") int id)
			throws AddressNotFoundException { // request from DB
		Address std = folkservice.updatemusic(Address, id);
		return new ResponseEntity<Address>(std, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public HttpStatus deleteAddress(@PathVariable("id") int id)
			throws ClassNotFoundException, AddressNotFoundException {
		folkservice.deletemusic(id);
		return HttpStatus.OK;
	}
}