package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/view/homepage.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String zr = request.getParameter("zairyou");
//System.out.println(zr);
		String[] pm = { "たっぷりピーマンと豚バラ肉の炒め物",
				"パン粉いらずで簡単&ジュワっと!ピーマンの肉詰め" };
		String[] tmt = { "卵とトマトの中華風炒め" };
		String[] nk = { "箸が進む!アスパラの肉巻き", "牛肉とピーマンのオイスターソース炒め" };
		String[] jgim = { "鶏手羽元とじゃがいもの甘辛煮", "もちっとじゃがいものチヂミ" };
		String[] ns = { "茄子とトマトのミートグラタン", "とろうま エビとナスのとろたまチリソース" };
		String[] tmg = { "ニラ玉", "だし巻き卵" };
		String[] tmng = { "新玉ねぎたっぷり 鶏むね肉の南蛮漬け", "玉ねぎと豚こま切れ肉の生姜焼き" };

		String[] list = null;
		if (zr.equals("1")) {
			list = pm;
		} else if (zr.equals("2")) {
			list = tmt;
		} else if (zr.equals("3")) {
			list = nk;
		} else if (zr.equals("4")) {
			list = jgim;
		} else if (zr.equals("5")) {
			list = ns;
		} else if (zr.equals("6")) {
			list = tmg;
		} else if (zr.equals("7")) {
			list = tmng;
		}

		request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/view/chosen.jsp");
		dispatcher.forward(request, response);
		
		
	}

}
