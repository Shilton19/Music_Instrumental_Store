package com.example.Music.Instrumental.Store.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties.Registration;
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

import com.example.Music.Instrumental.Store.Model.RegistrationNOtFoundException;
import com.example.Music.Instrumental.Store.Model.Registrations;
import com.example.Music.Instrumental.Store.Service.RegistrationService;

@RestController
@RequestMapping("/musicflow")
public class RegistrationController {
	@Autowired
	RegistrationService melts;

	@GetMapping
//		@RequestMapping(method=RequestMethod.GET)//not used now a days
	public ResponseEntity<List<Registrations>> getRegistration() {
		List<Registrations> Registration = melts.getMusics();
		return new ResponseEntity<List<Registrations>>(Registration, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Registrations> getRegistrationId(@PathVariable("id") int id)
			throws ClassNotFoundException, RegistrationNOtFoundException {
		Registrations Registration = melts.getMusicsId(id);
		return new ResponseEntity<Registrations>(Registration, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Registrations> createorUpdate(@RequestBody Registrations Registration) {
		Registrations update = melts.createmusics(Registration);
		return new ResponseEntity<Registrations>(update, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Registrations> UpdateCategory(@RequestBody Registrations Registration,
			@PathVariable("id") int id) throws ClassNotFoundException, RegistrationNOtFoundException { // request from
																										// DB
		Registrations stds = melts.UpdateMusic(Registration, id);
		return new ResponseEntity<Registrations>(stds, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public HttpStatus deleteCategory(@PathVariable("id") int id)
			throws ClassNotFoundException, RegistrationNOtFoundException {
		melts.deletemusic(id);
		return HttpStatus.OK;
	}
}
