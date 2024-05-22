package com.example.Music.Instrumental.Store.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Music.Instrumental.Store.Model.Registrations;
import com.example.Music.Instrumental.Store.Model.RegistrationNOtFoundException;
import com.example.Music.Instrumental.Store.Repository.RegistrationRepository;

@Service
public class RegistrationService {
	@Autowired
	RegistrationRepository Registrationsrepository;

	public List<Registrations> getMusics() {
		List<Registrations> reg = Registrationsrepository.findAll();

		return reg;
	}

	public Registrations getMusicsId(int id) throws RegistrationNOtFoundException {
		Optional<Registrations> rege = Registrationsrepository.findById(id);
		if (rege.isPresent()) {
			Registrations reg = rege.get();
			return reg;
		} else {
			throw new RegistrationNOtFoundException("Given data is not found");
		}
	}

	public Registrations createmusics(Registrations Registrations) {
		Registrations rege = Registrationsrepository.save(Registrations);
		return rege;
	}

	public Registrations UpdateMusic(Registrations Registrations, int id) throws RegistrationNOtFoundException {
			Optional<Registrations> rege = Registrationsrepository.findById(id);
			if (rege.isPresent()) {
				Registrations regi = rege.get();
				if (Registrations.getUsername() != null) {
					regi.setUsername(Registrations.getUsername());
				}
				if (Registrations.getPassword() != null) {
					regi.setPassword(Registrations.getPassword());
				}
				if (Registrations.getMobileNumber() != null) {
					regi.setMobileNumber(Registrations.getMobileNumber());
				}
				if (Registrations.getMailId() != null) {
					regi.setMailId(Registrations.getMailId());
				}
				if (Registrations.getAddress() != null) {
					regi.setAddress(Registrations.getAddress());
				}
				return Registrationsrepository.save(regi);
			} else {
				throw new RegistrationNOtFoundException("Given data is not found");
			}
	
	}
	public void deletemusic(int id) throws RegistrationNOtFoundException {
		Optional<Registrations> reg = Registrationsrepository.findById(id);
		if (reg.isPresent()) {
			Registrationsrepository.deleteById(id);
		} else {
			throw new RegistrationNOtFoundException("Given data is not found");
		}
	}
}
