package com.example.Music.Instrumental.Store.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Music.Instrumental.Store.Model.PlaceOrder;
import com.example.Music.Instrumental.Store.Model.PlaceOrderNotFoundException;
import com.example.Music.Instrumental.Store.Repository.PlaceOrderRepository;

@Service
public class PlaceOrderService {
	@Autowired
	PlaceOrderRepository Placeorderrepository;

	public List<PlaceOrder> getMusic() {
		List<PlaceOrder> pla = Placeorderrepository.findAll();
		return pla;
	}

	public PlaceOrder getMusicId(int id) throws PlaceOrderNotFoundException {
		Optional<PlaceOrder> plac = Placeorderrepository.findById(id);
		if (plac.isPresent()) {
			PlaceOrder pla = plac.get();
			return pla;
		} else {
			throw new PlaceOrderNotFoundException("Given data is not found");
		}
	}

	public PlaceOrder createmusic(PlaceOrder placeorder) {
		PlaceOrder plac = Placeorderrepository.save(placeorder);
		return plac;
	}

	public PlaceOrder UpdateMusic(PlaceOrder placeorder, int id) throws PlaceOrderNotFoundException {
		Optional<PlaceOrder> plac = Placeorderrepository.findById(id);
		if (plac.isPresent()) {
			PlaceOrder place = plac.get();
			if (placeorder.getProductmodel() != null) { // -----
				place.setProductmodel(placeorder.getProductmodel());
			}
			if (placeorder.getProductname() != null) {
				place.setProductname(placeorder.getProductname());
			}
			if (placeorder.getPrice() != 0) {
				place.setPrice(placeorder.getPrice());
			}
			return Placeorderrepository.save(place);
		} else {
			throw new PlaceOrderNotFoundException("Given data is not found");
		}
	}

	public void deletemusic(int id) throws PlaceOrderNotFoundException {
		Optional<PlaceOrder> pla = Placeorderrepository.findById(id);
		if (pla.isPresent()) {
			Placeorderrepository.deleteById(id);
		} else {
			throw new PlaceOrderNotFoundException("Given data is not found");
		}
	}
}
