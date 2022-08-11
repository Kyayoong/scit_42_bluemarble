package net.scit.bluemarble.service;

import net.scit.bluemarble.vo.Player;

public interface bluemarbleService {
	/**
	 * 플레이어 한명의 정보를 가져온다
	 * @param playerid: 가져올 플레이어의 id
	 * @return Player객체
	 */
	public Player selectOnePlayer(int playerid);
}
