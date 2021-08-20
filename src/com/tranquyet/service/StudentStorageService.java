package com.tranquyet.service;

import com.tranquyet.constant.ErrorMessageConstant;
import com.tranquyet.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @overview Student Storage use to save the information of student
 * @properties:
 */
public class StudentStorageService {

    public static List<Student> listStudent = new ArrayList<Student>();

    /**
     * @param student
     * @throws Exception
     * @overview add the information of student
     * @effect <pre>
     *      if student != null
     *          add to List
     *      else
     *          throw error message
     *          </pre>
     */
    public static void addStudent(Student student) throws Exception {
        if (student != null) {
            listStudent.add(student);
        } else {
            throw new Exception(ErrorMessageConstant.STUDENT_MODEL_ERROR);
        }
    }

    /**
     * @overview show the all the information of student
     * @effect
     */
    public static void showStudents() {
        System.out.println("Total: " + listStudent.size());
        listStudent.forEach(p -> {
            int i = 0;
            i++;
            System.out.println(i+". "+p.toString());
        });
    }

}
