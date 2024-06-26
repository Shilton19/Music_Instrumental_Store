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

import com.example.Music.Instrumental.Store.Model.Category;
import com.example.Music.Instrumental.Store.Model.CategoryNOtFoundException;
import com.example.Music.Instrumental.Store.Service.CategoryService;

@RestController
@RequestMapping("/musics")
public class CategoryController {
	@Autowired
	CategoryService categoryservice;

	@GetMapping
	public ResponseEntity<List<Category>> getCategory() {
		List<Category> Category = categoryservice.getMusic();
		return new ResponseEntity<List<Category>>(Category, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Category> getCategoryId(@PathVariable("id") int id)
			throws ClassNotFoundException, CategoryNOtFoundException {
		Category Category = categoryservice.getMusicId(id);
		return new ResponseEntity<Category>(Category, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Category> createorUpdate(@RequestBody Category Category) {
		Category update = categoryservice.createmusic(Category);
		return new ResponseEntity<Category>(update, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Category> UpdateCategory(@RequestBody Category Category, @PathVariable("id") int id)
			throws CategoryNOtFoundException { // request from DB
		Category std = categoryservice.UpdateMusic(Category, id);
		return new ResponseEntity<Category>(std, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public HttpStatus deleteCategory(@PathVariable("id") int id)
			throws ClassNotFoundException, CategoryNOtFoundException {
		categoryservice.deletemusic(id);
		return HttpStatus.OK;
	}

}