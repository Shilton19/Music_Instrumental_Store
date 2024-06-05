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

import com.example.Music.Instrumental.Store.Model.Products;
import com.example.Music.Instrumental.Store.Model.ProductsNotFoundException;
import com.example.Music.Instrumental.Store.Service.ProductsService;

@RestController
@RequestMapping("/musicmind")
public class ProductsController {
	@Autowired
	ProductsService productservice;

	@GetMapping
	public ResponseEntity<List<Products>> getProducts() {
		List<Products> Products = productservice.getMusic();
		return new ResponseEntity<List<Products>>(Products, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Products> getCategoryId(@PathVariable("id") int id)
			throws ClassNotFoundException, ProductsNotFoundException {
		Products Products = productservice.getMusicId(id);
		return new ResponseEntity<Products>(Products, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Products> createorUpdate(@RequestBody Products Products) {
		Products update = productservice.createmusic(Products);
		return new ResponseEntity<Products>(update, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Products> UpdateProducts(@RequestBody Products Products, @PathVariable("id") int id)
			throws ProductsNotFoundException { // request from DB
		Products std = productservice.UpdateMusic(Products, id);
		return new ResponseEntity<Products>(std, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public HttpStatus deleteProducts(@PathVariable("id") int id)
			throws ClassNotFoundException, ProductsNotFoundException {
		productservice.deletemusic(id);
		return HttpStatus.OK;
	}
}
