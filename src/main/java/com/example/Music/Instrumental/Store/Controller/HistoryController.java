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

import com.example.Music.Instrumental.Store.Model.History;
import com.example.Music.Instrumental.Store.Model.HistoryNotFoundException;
import com.example.Music.Instrumental.Store.Service.HistoryService;

@RestController
@RequestMapping("/drum")
public class HistoryController {
	@Autowired
	HistoryService temposervice;

	@GetMapping
//	@RequestMapping(method=RequestMethod.GET)//not used now a days
	public ResponseEntity<List<History>> getHistory() {
		List<History> History = temposervice.getMusic();
		return new ResponseEntity<List<History>>(History, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<History> getHistoryId(@PathVariable("id") int id)
			throws ClassNotFoundException, HistoryNotFoundException {
		History History = temposervice.getMusicId(id);
		return new ResponseEntity<History>(History, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<History> createorUpdate(@RequestBody History History) {
		History update = temposervice.createmusic(History);
		return new ResponseEntity<History>(update, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<History> UpdateHistory(@RequestBody History History, @PathVariable("id") int id)
			throws HistoryNotFoundException { // request from DB
		History std = temposervice.UpdateMusic(History, id);
		return new ResponseEntity<History>(std, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public HttpStatus deleteHistory(@PathVariable("id") int id)
			throws ClassNotFoundException, HistoryNotFoundException {
		temposervice.deletemusic(id);
		return HttpStatus.OK;
	}
}
