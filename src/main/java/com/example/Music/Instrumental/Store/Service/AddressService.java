package com.example.Music.Instrumental.Store.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Music.Instrumental.Store.Model.Address;
import com.example.Music.Instrumental.Store.Model.AddressNotFoundException;
import com.example.Music.Instrumental.Store.Repository.AddressRepository;

@Service
public class AddressService {
	@Autowired
	AddressRepository addressrepository;

	public List<Address> getMusic() {
		List<Address> cat = addressrepository.findAll();

		return cat;
	}

	public Address getMusicId(int id) throws AddressNotFoundException {
		Optional<Address> addr = addressrepository.findById(id);
		if (addr.isPresent()) {
			Address add = addr.get();
			return add;
		} else {
			throw new AddressNotFoundException("Given data is not found");
		}
	}

	public Address getAddressbyid(int id) throws AddressNotFoundException {
		Optional<Address> addr = addressrepository.findById(id);
		if (addr.isPresent()) {
			Address add = addr.get();
			return add;
		} else {
			throw new AddressNotFoundException("Given data is not found");
		}
	}

	public Address createmusic(Address address) {
		Address addr = addressrepository.save(address);
		return addr;
	}

	public Address updatemusic(Address address, int id) throws AddressNotFoundException {
		Optional<Address> addr = addressrepository.findById(address.getId());
		if (addr.isPresent()) {
			Address addre = addr.get();
			if (address.getCity() != null) {
				addre.setCity(address.getCity());
			}
			if (address.getStreetName() != null) {
				addre.setStreetName(address.getStreetName());
			}
			if (address.getPincode() != null) {
				addre.setPincode(address.getPincode());
			}
//			if (address.getDeliverystatus() != null) {
//				addre.setDeliverystatus(address.getDeliverystatus());
//			}
			return addressrepository.save(addre);
		} else {
			throw new AddressNotFoundException("Given data is not found");

		}
	}

	public void deletemusic(int id) throws AddressNotFoundException {
		Optional<Address> add = addressrepository.findById(id);
		if (add.isPresent()) {
			addressrepository.deleteById(id);
		} else {
			throw new AddressNotFoundException("Given data is not found");

		}
	}

	public List<Address> getaddress() throws AddressNotFoundException {
		List<Address> add = addressrepository.findAll();
		if (add.size() > 0) {
			return add;
		} else {
			throw new AddressNotFoundException("Given data is not found");
		}
	}
}
