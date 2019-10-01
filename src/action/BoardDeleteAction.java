package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import svc.BoardDeleteService;
import vo.ActionForward;

public class BoardDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int board_num=Integer.parseInt(request.getParameter("BOARD_NUM"));
		BoardDeleteService bds = new BoardDeleteService();
		bds.deleteArticle(board_num);
		
		ActionForward forward = new ActionForward();
		forward.setPath("boardList.jsp");
		forward.setRedirect(true);
		return forward;
	}

}
