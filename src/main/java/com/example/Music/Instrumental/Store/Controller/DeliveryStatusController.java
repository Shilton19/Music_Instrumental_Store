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

import com.example.Music.Instrumental.Store.Model.DeliveryStatus;
import com.example.Music.Instrumental.Store.Model.DeliveryStatusNotFoundException;
import com.example.Music.Instrumental.Store.Service.DeliveryStatusService;

@RestController
@RequestMapping("/deliverys")
public class DeliveryStatusController {
	@Autowired
	DeliveryStatusService deliverystatusservice;

	@GetMapping
	public ResponseEntity<List<DeliveryStatus>> getDeliveryStatus() {
		List<DeliveryStatus> DeliveryStatus = deliverystatusservice.getMusic();
		return new ResponseEntity<List<DeliveryStatus>>(DeliveryStatus, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<DeliveryStatus> getCategoryId(@PathVariable("id") int id)
			throws ClassNotFoundException, DeliveryStatusNotFoundException {
		DeliveryStatus deliverystatus = deliverystatusservice.getMusicId(id);
		return new ResponseEntity<DeliveryStatus>(deliverystatus, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<DeliveryStatus> createorUpdate(@RequestBody DeliveryStatus DeliveryStatus) {
		DeliveryStatus update = deliverystatusservice.createmusic(DeliveryStatus);
		return new ResponseEntity<DeliveryStatus>(update, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<DeliveryStatus> UpdateCategory(@RequestBody DeliveryStatus DeliveryStatus,
			@PathVariable("id") int id) throws DeliveryStatusNotFoundException { // request from DB
		DeliveryStatus std = deliverystatusservice.UpdateMusic(DeliveryStatus, id);
		return new ResponseEntity<DeliveryStatus>(std, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public HttpStatus deleteDeliveryStatus(@PathVariable("id") int id)
			throws ClassNotFoundException, DeliveryStatusNotFoundException {
		deliverystatusservice.deletemusic(id);
		return HttpStatus.OK;
	}
}
