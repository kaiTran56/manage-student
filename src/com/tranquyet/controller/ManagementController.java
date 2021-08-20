package com.tranquyet.controller;

import com.tranquyet.constant.ConstantValue;
import com.tranquyet.model.Student;
import com.tranquyet.service.StudentStorageService;
import com.tranquyet.util.AutoCodeGeneration;

import java.util.Scanner;

public class ManagementController {
    /**
     * @param student
     * @overview add student to Service
     */
    public void addStudent(Student student) {
        StudentStorageService.listStudent.add(student);
    }

    /**
     * @overview get data from Service and show to client
     */
    public void show() {
        StudentStorageService.showStudents();
    }

    /**
     * @overview exit the application and stop application
     */
    public void exit() {
        System.out.println("Good Bye, have a good day!");
        System.exit(1);
    }

    /**
     * @overview check condition for value input for fields: name, dob, gender, dob, email and phone
     * @param input
     * @param field
     * @param student
     * @return
     * <pre>
     *     if value valid
     *          return value
     *     else
     *          re-enter the value
     * </pre>
     */
    public String checkValue(Scanner input, String field, Student student) {
        String value=null;

        switch (field){
            case ConstantValue.FIELD_NAME:
                do {
                    System.out.println("Enter the " + field + " (*): ");
                    value = input.nextLine();
                } while (!student.validateName(value));
                break;
            case ConstantValue.FIELD_PHONE:
                do {
                    System.out.println("Enter the " + field + " (*): ");
                    value = input.nextLine();
                } while (!student.validatePhone(value));
                break;
            case ConstantValue.FIELD_EMAIL:
                do {
                    System.out.println("Enter the " + field + ": ");
                    value = input.nextLine();
                } while (!student.validateEmail(value));
                break;
            case ConstantValue.FIELD_GENDER:
                do {
                    System.out.println("Enter the " + field + " (*): ");
                    value = input.nextLine();
                } while (!student.validateGender(value));
                break;
            case ConstantValue.FIELD_DOB:
                do {
                    System.out.println("Enter the " + field + " <dd/mm/yyyy>(*): ");
                    value = input.nextLine();
                } while (!student.validateDob(value));
                break;

            case ConstantValue.FIELD_LOCATION:
                do {
                    System.out.println("Enter the " + field + ": ");
                    value = input.nextLine();
                } while (!student.validateLocation(value));
                break;

            case ConstantValue.FIELD_CODE_OF_CLASS:
                do {
                    System.out.println("Enter the " + field + ": ");
                    value = input.nextLine();
                } while (!student.validateCodeOfClass(value));
                break;
            default:
                break;

        }
        return value;
    }

}
