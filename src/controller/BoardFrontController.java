package controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.*;
import svc.BoardDetailService;
import vo.*;

/**
 * Servlet implementation class BoardFrontController
 */
@WebServlet("*.bo")
public class BoardFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public BoardFrontController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String requestURI=request.getRequestURI();
		System.out.println(requestURI);
		String contextPath=request.getContextPath();
		System.out.println(contextPath);
		String command=requestURI.substring(contextPath.length());
		System.out.println(command);
		
		ActionForward forward = new ActionForward();
		Action action=null;
		
		if(command.equals("/board/boardList.bo")) {	//글목록보기
			action = new BoardListAction();
			forward=action.execute(request, response);
		}else if(command.equals("/board/boardDetail.bo")) {
			action = new BoardDetailAction();
			forward=action.execute(request, response);
		}else if(command.equals("/board/boardWritePro.bo")) {
			action = new BoardWriteProAction();
			forward=action.execute(request, response);
		}else if(command.equals("/board/boardWriteForm.bo")) {
			forward.setPath("qna_board_write.jsp");
			forward.setRedirect(true);
		}else{
			forward.setPath("/board/error.jsp");
			forward.setRedirect(true);
		}
		
		System.out.println(forward.isRedirect());
		System.out.println(forward.getPath());
		
		
		//마지막 공통포워딩 하는 부분
		if(forward.isRedirect()) {
			response.sendRedirect(forward.getPath());
		}else {
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
			dispatcher.forward(request, response);
		}
		
	}
	
}









