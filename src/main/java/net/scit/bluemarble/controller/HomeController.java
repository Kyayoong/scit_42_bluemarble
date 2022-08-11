package net.scit.bluemarble.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;
import net.scit.bluemarble.service.bluemarbleService;
import net.scit.bluemarble.vo.Player;

@Controller
@Slf4j
public class HomeController {
	@Autowired
	private bluemarbleService service;
	
	@GetMapping({"/", ""})
	public String home() {
		return "home";
	}

	@GetMapping("/board")
	public String map(Model model) {
		//처음 시작시, 첫번째 턴의 유저 정보를 가져온다
		Player player = service.selectOnePlayer(1);
		log.debug("가져온 값 : {}", player);
		
		model.addAttribute("player", player);
		return "board";
	}
}
