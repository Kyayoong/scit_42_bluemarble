package net.scit.bluemarble.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {
	int playerid;		//플레이어 번호
	String playername;	//플레이어 이름
	int cash;			//현금
	int asset;			//자산
	int round;			//턴수
	int location;		//위치
	int life;			//생사여부
}
