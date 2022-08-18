package net.scit.bluemarble.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;
import net.scit.bluemarble.service.LocationService;
import net.scit.bluemarble.vo.Player;

@Slf4j
@Controller
public class LocationController {
	@Autowired
	LocationService locationService;
	
	// DB에서 LOCATION 컬럼의 값을 가져옴
	@ResponseBody
	@PostMapping("presentLocation")
	public int presentLocation(Player player) {
		log.debug("[LocationController] presentLocation - parameter : {}", player.getPlayerid());
		int presentLocation = locationService.selectPresentLocation(player.getPlayerid());
		log.debug("[LocationController] presentLocation - presentLocation : {}", presentLocation);
		
		return presentLocation;
	}
}