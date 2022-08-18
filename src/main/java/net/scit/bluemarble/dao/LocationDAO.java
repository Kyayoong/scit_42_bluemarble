package net.scit.bluemarble.dao;

import org.apache.ibatis.annotations.Mapper;

import net.scit.bluemarble.vo.Player;

@Mapper
public interface LocationDAO {
	// 플레이어의 ID에 따른 기존 위치를 반환 
	int selectPresentLocation(int playerid);

}
