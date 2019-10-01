package test;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import db.JDBCUtil;
import svc.BoardDeleteService;
import svc.BoardDetailService;
import vo.BoardBean;

/**
 * Servlet implementation class TestDB
 */
@WebServlet("/TestDB")
public class TestDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestDB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	BoardDAO boarddao = BoardDAO.getInstance();
	//	boarddao.setConnetion(JDBCUtil.getConnection());
	//	System.out.println(boarddao.selectListCount());
	
	//서비스 테스트
	//	BoardDetailService bdstest = new BoardDetailService();
	//	BoardBean article =bdstest.getArticle(1);
	//	System.out.println(article.getBoard_content());
	
	/* 삭제테스트 DAO
	BoardDAO boarddao = BoardDAO.getInstance(); //boarddao 객체 생성
	Connection con=JDBCUtil.getConnection(); //db연결 
	boarddao.setConnetion(con);
	boarddao.deleteArticle(1);
	JDBCUtil.commit(con);
	JDBCUtil.close(con);
	*/
		//수정 테스트 DAO
//		BoardDAO boarddao = BoardDAO.getInstance(); //boarddao 객체 생성
//		Connection con=JDBCUtil.getConnection(); //db연결 
//		boarddao.setConnetion(con);
//		BoardBean article = new BoardBean();
//		article.setBoard_content("수정내용");
//		article.setBoard_num(3);
//		article.setBoard_subject("수정제목");
//		boarddao.modifyArticle(article);
//		JDBCUtil.commit(con);
//		JDBCUtil.close(con);
		//삭제테스트 Service
		BoardDeleteService bds = new BoardDeleteService();
		bds.deleteArticle(12);
		
	}
	
	

}












