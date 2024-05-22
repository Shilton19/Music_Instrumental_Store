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

import com.example.Music.Instrumental.Store.Model.Payment;
import com.example.Music.Instrumental.Store.Model.PaymentNotFoundException;
import com.example.Music.Instrumental.Store.Service.PaymentService;

@RestController
@RequestMapping("/musicguide")
public class PaymentController {
	@Autowired
	PaymentService songservice;

	@GetMapping
	public ResponseEntity<List<Payment>> getPayment() {
		List<Payment> Payment = songservice.getMusic();
		return new ResponseEntity<List<Payment>>(Payment, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Payment> getPaymentId(@PathVariable("id") int id)
			throws ClassNotFoundException, PaymentNotFoundException {
		Payment Payment = songservice.getMusicId(id);
		return new ResponseEntity<Payment>(Payment, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Payment> createorUpdate(@RequestBody Payment Payment) {
		Payment update = songservice.createmusic(Payment);
		return new ResponseEntity<Payment>(update, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Payment> UpdatePayment(@RequestBody Payment Payment, @PathVariable("id") int id)
			throws PaymentNotFoundException {
		Payment std = songservice.UpdateMusic(Payment, id);
		return new ResponseEntity<Payment>(std, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public HttpStatus deletePayment(@PathVariable("id") int id)
			throws ClassNotFoundException, PaymentNotFoundException {
		songservice.deletemusic(id);
		return HttpStatus.OK;
	}
}