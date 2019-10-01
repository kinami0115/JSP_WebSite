package svc;

import java.sql.Connection;

import dao.BoardDAO;
import static db.JDBCUtil.*;
import vo.BoardBean;

public class BoardDetailService {
	public BoardBean getArticle(int board_num) {
		//1. 조회수1 업데이트
		Connection con=getConnection(); //DB연결정보 생성
		BoardDAO boardDAO = BoardDAO.getInstance(); //BoardDAO 객체 생성
		boardDAO.setConnetion(con);	//DB연결정보 넘겨주기
		int updateCount=boardDAO.updateReadCount(board_num); //조회수 업데이트
		if(updateCount > 0) {
			commit(con);		//이상없으면 db갱신
		}else {
			roolback(con);		//문제 있으면 원복
		}
		//2. 번호글 상세내용 가져오기
		BoardBean atricle = boardDAO.selectArticle(board_num);
		close(con);
		return atricle;
	}
	
}
