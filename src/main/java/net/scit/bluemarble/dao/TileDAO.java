package net.scit.bluemarble.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TileDAO {
	public int insertTile();
}
