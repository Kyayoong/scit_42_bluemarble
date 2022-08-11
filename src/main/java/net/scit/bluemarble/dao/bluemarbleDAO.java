package net.scit.bluemarble.dao;

import org.apache.ibatis.annotations.Mapper;

import net.scit.bluemarble.vo.Player;

@Mapper
public interface bluemarbleDAO {
	public Player selectOnePlayer(int playerid);
}
