package svc;

import java.sql.Connection;

import dao.BoardDAO;
import db.JDBCUtil;
import vo.BoardBean;

public class BoardDeleteService {
	public boolean deleteArticle(int board_num) {
		BoardDAO boarddao = BoardDAO.getInstance(); //boarddao 객체 생성
		Connection con=JDBCUtil.getConnection(); //db연결 
		boarddao.setConnetion(con);
		int count=boarddao.deleteArticle(board_num);
		boolean isWriteSuccess=false;
		if(count>0) {
			JDBCUtil.commit(con);
			isWriteSuccess=true;
		}else {
			JDBCUtil.roolback(con);
		}
		JDBCUtil.close(con);
		return isWriteSuccess;
		
	}
	
	
}
