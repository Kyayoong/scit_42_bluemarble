package net.scit.bluemarble.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import net.scit.bluemarble.dao.TileDAO;

@Controller
public class TileController {
	
	private TileDAO dao;
	
	public TileController(TileDAO dao) {
		this.dao = dao;
	}
	
	@GetMapping("/tile/insert")
	public String insert() {
		dao.insertTile();
		return "home";
	}
}
