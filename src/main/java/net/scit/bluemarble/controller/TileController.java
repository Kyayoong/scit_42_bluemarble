package net.scit.bluemarble.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.scit.bluemarble.dao.TileDAO;


@Controller
@RequestMapping("tile")
public class TileController {
	
	private TileDAO dao;
	
	public TileController(TileDAO dao) {
		this.dao = dao;
	}
	
	@GetMapping("/start")
	public String insert() {
		dao.insertTile();
		return "map";
	}
}
