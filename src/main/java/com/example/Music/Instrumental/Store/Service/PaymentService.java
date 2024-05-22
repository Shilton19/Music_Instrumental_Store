package com.example.Music.Instrumental.Store.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Music.Instrumental.Store.Model.Payment;
import com.example.Music.Instrumental.Store.Model.PaymentNotFoundException;
import com.example.Music.Instrumental.Store.Repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	PaymentRepository paymentrepository;

	public List<Payment> getMusic() {
		List<Payment> pay = paymentrepository.findAll();

		return pay;
	}

	public Payment getMusicId(int id) throws PaymentNotFoundException {
		Optional<Payment> paym = paymentrepository.findById(id);
		if (paym.isPresent()) {
			Payment pay = paym.get();
			return pay;
		} else {
			throw new PaymentNotFoundException("Given data is not found");
		}
	}

	public Payment createmusic(Payment payment) {
		Payment paym = paymentrepository.save(payment);
		return paym;
	}

	public Payment UpdateMusic(Payment payment, int id) throws PaymentNotFoundException {
		Optional<Payment> paym = paymentrepository.findById(id);
		if (paym.isPresent()) {
			Payment paymen = paym.get();
			if (payment.getBankAccount() != null) {
				paymen.setBankAccount(payment.getBankAccount());
			}
			if (payment.getUPI() != null) {
				paymen.setUPI(payment.getUPI());
			}
			if (payment.getCOD() != null) {
				paymen.setCOD(payment.getCOD());
			}
			if (payment.getDeliveryfee() != null) {
				paymen.setDeliveryfee(payment.getDeliveryfee());
			}
			if (payment.isAmountcredited() != false) {
				paymen.setAmountcredited(payment.isAmountcredited());
			}
			return paymentrepository.save(paymen);
		} else {
			throw new PaymentNotFoundException("Given data is not found");
		}
	}

	public void deletemusic(int id) throws PaymentNotFoundException {
		Optional<Payment> pay = paymentrepository.findById(id);
		if (pay.isPresent()) {
			paymentrepository.deleteById(id);
		} else {
			throw new PaymentNotFoundException("Given data is not found");
		}
	}
}
