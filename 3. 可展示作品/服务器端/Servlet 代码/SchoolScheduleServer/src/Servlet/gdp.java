package Servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LocalData;

/**
 * Servlet implementation class gdp
 */
// Get Download Path Servlet
@WebServlet("/gdp")
public class gdp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public gdp() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("un");
		LocalData localData = new LocalData(request, username);

		ArrayList<File> filesList = new ArrayList<File>();
		filesList = localData.getFilesList();
		if (filesList.isEmpty()) {
			out.write("{}");
		} else {
			String rtn = "";
			for (File f : filesList) {
				rtn = rtn + f.getName() + "@";
			}
			System.out.println(rtn);
			out.write(rtn);
		}

	}

}
