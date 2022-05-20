package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CardTest1
 */
@WebServlet("/CardTest1")
public class CardTest1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CardTest1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html; charset=UTF-8"); // 文字コードがUTF-8のHTML
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<img src=\"cards/1.png\">");
            out.println("スペードA");
            out.println("<hr>");
            int card = (int) (Math.random() * 52) + 1;
            out.println("<img src=\"cards/" + card + ".png\">");
            out.println("ランダムなカード");
            out.println("<hr>");
            out.println("<img src=\"cards/14.png\" width=50>");
            out.println("<img src=\"cards/15.png\" width=50>");
            out.println("<img src=\"cards/16.png\" width=50>");
            out.println("<img src=\"cards/17.png\" width=50>");
            out.println("<img src=\"cards/18.png\" width=50>");
            out.println("<img src=\"cards/19.png\" width=50>");
            out.println("<img src=\"cards/20.png\" width=50>");
            out.println("<img src=\"cards/21.png\" width=50>");
            out.println("<img src=\"cards/22.png\" width=50>");
            out.println("<img src=\"cards/23.png\" width=50>");
            out.println("<img src=\"cards/24.png\" width=50>");
            out.println("<img src=\"cards/25.png\" width=50>");
            out.println("<img src=\"cards/26.png\" width=50>");
            
            out.println("</html>");
            
            System.out.println("doGet()"); // コンソールに表示される(動作確認のため)
            }
            protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            System.out.println("doPost()"); // この例ではdoPost()は実行されないので表示もされない
            }


}
