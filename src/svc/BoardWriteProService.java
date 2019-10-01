package svc;

import static db.JDBCUtil.getConnection;

import java.sql.Connection;

import dao.BoardDAO;
import db.JDBCUtil;
import vo.BoardBean;

public class BoardWriteProService {
	
	public boolean registArticle(BoardBean boardbean){
	//1.마지막 글번호 알아오기
		Connection con=getConnection(); //DB연결정보 생성
		BoardDAO boardDAO = BoardDAO.getInstance(); //BoardDAO 객체 생성
		boardDAO.setConnetion(con);	//DB연결정보 넘겨주기
		int numMax=boardDAO.boardNumMax();	//마지막 글번호 알아오기
		boolean isWriteSuccess=false;
			
	//2.마지막 글번호+1 글번호에 글쓰기
		boardbean.setBoard_num(numMax+1); //작성된 글번호는 마지막 글번호+1
		int insertCount=boardDAO.insertArticle(boardbean);
		if(insertCount>0) {
			JDBCUtil.commit(con);
			isWriteSuccess=true;
		}else {
			JDBCUtil.roolback(con);
		}
		JDBCUtil.close(con);
		return isWriteSuccess;
		
	}
}








