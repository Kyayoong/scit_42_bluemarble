package net.scit.bluemarble.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.extern.slf4j.Slf4j;
import net.scit.bluemarble.dao.LocationDAO;
import net.scit.bluemarble.vo.Player;

@Slf4j
@Transactional
@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	LocationDAO dao;
	
	@Override
	public int selectPresentLocation(int playerid) {
		log.debug("[LocationServiceImpl] selectPresentLocation - parameter : {}", playerid);
		int result = dao.selectPresentLocation(playerid);
		log.debug("[LocationServiceImpl] selectPresentLocation - result : {}", result);
				
		return result;
	}

}
