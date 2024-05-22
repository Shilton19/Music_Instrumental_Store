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

import com.example.Music.Instrumental.Store.Model.PlaceOrder;
import com.example.Music.Instrumental.Store.Model.PlaceOrderNotFoundException;
import com.example.Music.Instrumental.Store.Service.PlaceOrderService;

@RestController
@RequestMapping("/styles")
public class PlaceOrderController {
	@Autowired
	PlaceOrderService karnaticservice;

	@GetMapping
	public ResponseEntity<List<PlaceOrder>> getPlaceOrder() {
		List<PlaceOrder> PlaceOrder = karnaticservice.getMusic();
		return new ResponseEntity<List<PlaceOrder>>(PlaceOrder, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<PlaceOrder> getPlaceOrderId(@PathVariable("id") int id)
			throws ClassNotFoundException, PlaceOrderNotFoundException {
		PlaceOrder PlaceOrder = karnaticservice.getMusicId(id);
		return new ResponseEntity<PlaceOrder>(PlaceOrder, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<PlaceOrder> createorUpdate(@RequestBody PlaceOrder PlaceOrder) {
		PlaceOrder update = karnaticservice.createmusic(PlaceOrder);
		return new ResponseEntity<PlaceOrder>(update, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<PlaceOrder> UpdatePlaceOrder(@RequestBody PlaceOrder PlaceOrder, @PathVariable("id") int id)
			throws PlaceOrderNotFoundException { // request from DB
		PlaceOrder std = karnaticservice.UpdateMusic(PlaceOrder, id);
		return new ResponseEntity<PlaceOrder>(std, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public HttpStatus deletePlaceOrder(@PathVariable("id") int id)
			throws ClassNotFoundException, PlaceOrderNotFoundException {
		karnaticservice.deletemusic(id);
		return HttpStatus.OK;
	}

}
