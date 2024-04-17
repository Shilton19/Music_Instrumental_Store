package com.example.Music.Instrumental.Store.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Music.Instrumental.Store.Model.History;
import com.example.Music.Instrumental.Store.Model.HistoryNotFoundException;
import com.example.Music.Instrumental.Store.Repository.HistoryRepository;

@Service
public class HistoryService {
	@Autowired
	HistoryRepository historyrepository;

	public List<History> getMusic() {
		List<History> his = historyrepository.findAll();

		return his;
	}

	public History getMusicId(int id) throws HistoryNotFoundException {
		Optional<History> hist = historyrepository.findById(id);
		if (hist.isPresent()) {
			History his = hist.get();
			return his;
		} else {
			throw new HistoryNotFoundException("Given data is not found");
		}
	}

	public History createmusic(History history) {
		History hist = historyrepository.save(history);
		return hist;
	}

	public History UpdateMusic(History history, int id) throws HistoryNotFoundException {
		Optional<History> hist = historyrepository.findById(history.getId());
		if (hist.isPresent()) {
			History histo = hist.get();
			return historyrepository.save(histo);
		} else {
			throw new HistoryNotFoundException("Given data is not found");
		}

	}

	public void deletemusic(int id) throws HistoryNotFoundException {
		Optional<History> his = historyrepository.findById(id);
		if (his.isPresent()) {
			historyrepository.deleteById(id);
		} else {
			throw new HistoryNotFoundException("Given data is not found");
		}
	}
}
