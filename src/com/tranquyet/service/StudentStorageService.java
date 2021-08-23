package com.tranquyet.service;

import com.tranquyet.constant.ErrorMessageConstant;
import com.tranquyet.model.Student;
import com.tranquyet.util.Screen;

import java.util.ArrayList;
import java.util.List;

/**
 * Student Storage use to save the information of student
 */
public class StudentStorageService {

    public static List<Student> listStudent = new ArrayList<Student>(); // use to store all the student information

    /**
     * add the information of student
     *
     * @param student student object use to add to storage
     *
     *                <pre>
     *                                    if student != null
     *                                        add to List
     *                                    else
     *                                        show error message
     *                                        </pre>
     */
    public static void addStudent(Student student) {
        if (student != null) {
            listStudent.add(student);
        } else {
            Screen.showError(ErrorMessageConstant.STUDENT_MODEL_ERROR);
        }
    }

    /**
     * show the all the information of student
     */
    public static void showStudents() {
        System.out.println("Total: " + listStudent.size());
        listStudent.forEach(p -> {
            int i = 0; // print the order number of student
            i++; // increase 1 per time
            System.out.println(i + ". " + p.toString());
        });
    }

}
