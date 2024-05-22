package com.example.Music.Instrumental.Store.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Music.Instrumental.Store.Model.Products;
import com.example.Music.Instrumental.Store.Model.ProductsNotFoundException;
import com.example.Music.Instrumental.Store.Repository.ProductsRepository;

@Service
public class ProductsService {
	@Autowired
	ProductsRepository productsrepository;

	public List<Products> getMusic() {
		List<Products> pro = productsrepository.findAll();

		return pro;
	}

	public Products getMusicId(int id) throws ProductsNotFoundException {
		Optional<Products> prod = productsrepository.findById(id);
		if (prod.isPresent()) {
			Products pro = prod.get();
			return pro;
		} else {
			throw new ProductsNotFoundException("Given data is not found");
		}
	}

	public Products createmusic(Products products) {
		Products prod = productsrepository.save(products);
		return prod;
	}

	public Products UpdateMusic(Products products, int id) throws ProductsNotFoundException {
		Optional<Products> prod = productsrepository.findById(id);
		if (prod.isPresent()) {
			Products produc = prod.get();
			if (products.getName() != null) {
				produc.setName(products.getName());
			}
			return productsrepository.save(produc);
		} else {
			throw new ProductsNotFoundException("Given data is not found");
		}

	}

	public void deletemusic(int id) throws ProductsNotFoundException {
		Optional<Products> pro = productsrepository.findById(id);
		if (pro.isPresent()) {
			productsrepository.deleteById(id);
		} else {
			throw new ProductsNotFoundException("Given data is not found");
		}
	}
}
