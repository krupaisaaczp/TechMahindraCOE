package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import models.Student;

@WebServlet("/StudentServlet")
public class Studentservlet extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
    private static List<Student> students = new ArrayList<>();

    // Handle GET requests to display the student list
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Set the list of students as an attribute for JSP to use
        request.setAttribute("students", students);
        request.getRequestDispatcher("viewStudent.jsp").forward(request, response);
    }

    // Handle POST requests to add a new student
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Getting data from the request
        String name = request.getParameter("name");
        String reg = request.getParameter("reg");
        int age = Integer.parseInt(request.getParameter("age"));
        float per = Float.parseFloat(request.getParameter("per"));
        
        // Create new student and add it to the list
        students.add(new Student(name, reg, age, per));

        System.out.println("Added Student: " + name);

        // Optionally, you can forward to a different page or return a success message
        request.setAttribute("students", students);
        request.getRequestDispatcher("viewStudent.jsp").forward(request, response);
    }
}