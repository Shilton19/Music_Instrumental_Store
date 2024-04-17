package com.example.Music.Instrumental.Store.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Music.Instrumental.Store.Model.Category;
import com.example.Music.Instrumental.Store.Model.CategoryNOtFoundException;
import com.example.Music.Instrumental.Store.Repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	CategoryRepository categoryrepository;

	public List<Category> getMusic() {
		List<Category> cat = categoryrepository.findAll();

		return cat;
	}

	public Category getMusicId(int id) throws CategoryNOtFoundException {
		Optional<Category> cate = categoryrepository.findById(id);
		if (cate.isPresent()) {
			Category cat = cate.get();
			return cat;
		} else {
			throw new CategoryNOtFoundException("Given data is not found");
		}
	}
	public Category createmusic(Category category) {
		Category cate = categoryrepository.save(category);
		return cate;
	}

	public Category UpdateMusic(Category category, int id) throws CategoryNOtFoundException {
		Optional<Category> cate = categoryrepository.findById(category.getInstrumentid());
		if (cate.isPresent()) {
			Category categ = cate.get();
			if (category.getInstrumentmodel() != null) {
				categ.setInstrumentmodel(category.getInstrumentmodel());
			}
			if (category.getInstrumentname() != null) {
				categ.setInstrumentname(category.getInstrumentname());
			}
			return categoryrepository.save(categ);
		} else {
			throw new CategoryNOtFoundException("Given data is not found");
		}

	}

	public void deletemusic(int id) throws CategoryNOtFoundException {
		Optional<Category> cat = categoryrepository.findById(id);
		if (cat.isPresent()) {
			categoryrepository.deleteById(id);
		} else {
			throw new CategoryNOtFoundException("Given data is not found");
		}
	}
}
