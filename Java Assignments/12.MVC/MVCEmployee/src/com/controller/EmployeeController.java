package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Employee;
import com.service.EmployeeService;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		EmployeeService es = new EmployeeService();
		List<Employee> lisfOfRec = es.getAllEmployee();
		HttpSession hs = request.getSession();
		hs.setAttribute("empInfo", lisfOfRec);
		response.sendRedirect("retrieveEmployee.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		Employee emp = new Employee();
		String op = request.getParameter("emp");
		EmployeeService es = new EmployeeService();
		if (op.equals("insert")) {
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			float salary = Float.parseFloat(request.getParameter("salary"));
			String designation = request.getParameter("designation");

			emp.setId(id);
			emp.setName(name);
			emp.setSalary(salary);
			emp.setDesignation(designation);

			String result = es.storeEmployee(emp);

			RequestDispatcher rd = request.getRequestDispatcher("insertEmployee.jsp");

			pw.print(result);
			rd.include(request, response);

		} else if (op.equals("delete")) {
			int id = Integer.parseInt(request.getParameter("id"));
			String res = es.deleteEmployee(id);
			pw.println(res);
			RequestDispatcher rd = request.getRequestDispatcher("deleteEmployee.jsp");
			rd.include(request, response);
		} else if (op.equals("update")) {
			int id = Integer.parseInt(request.getParameter("id"));
			float salary = Float.parseFloat(request.getParameter("salary"));

			emp.setId(id);
			emp.setSalary(salary);
			String res = es.updateEmployeeSalary(emp);
			pw.println(res);
			RequestDispatcher rd = request.getRequestDispatcher("updateEmployee.jsp");
			rd.include(request, response);
		}

	}

}
