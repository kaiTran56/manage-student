package com.tranquyet.controller;

import com.tranquyet.constant.ConstantValue;
import com.tranquyet.model.Student;
import com.tranquyet.service.StudentStorageService;
import com.tranquyet.util.AutoCodeGeneration;

import java.util.Scanner;

/**
 * ManagementController will get the request and feedback the result
 */
public class ManagementController {
    /**
     * add student to Service
     *
     * @param student contain student information to add to storage
     */
    public void addStudent(Student student) {
        StudentStorageService.listStudent.add(student);
    }

    /**
     * get data from Service and show to client
     */
    public void show() {
        StudentStorageService.showStudents();
    }

    /**
     * exit the application and stop application
     */
    public void exit() {
        System.out.println("Good Bye, have a good day!");
        System.exit(1);
    }

    /**
     * check condition for value input for fields: name, dob, gender, dob, email and phone
     *
     * @param input   capture information from client
     * @param field   check the field of information to properly active with the right field of object
     * @param student call the validate method to check condition per input value
     * @return <pre>
     *     if value valid
     *          return value after the checking condition
     *     else
     *          re-input the information from client to check until right form or not have any errors
     * </pre>
     */
    public String checkValue(Scanner input, String field, Student student) {
        String value = null;
        switch (field) {
            case ConstantValue.FIELD_NAME: // name field
                do {
                    System.out.println("Enter the " + field + " (*): ");
                    value = input.nextLine();
                } while (!student.validateName(value));
                break;
            case ConstantValue.FIELD_PHONE: // phone field
                do {
                    System.out.println("Enter the " + field + " (*): ");
                    value = input.nextLine();
                } while (!student.validatePhone(value));
                break;
            case ConstantValue.FIELD_EMAIL: // email field
                do {
                    System.out.println("Enter the " + field + ": ");
                    value = input.nextLine();
                } while (!student.validateEmail(value));
                break;
            case ConstantValue.FIELD_GENDER: // gender field
                do {
                    System.out.println("Enter the " + field + " (*): ");
                    value = input.nextLine();
                } while (!student.validateGender(value));
                break;
            case ConstantValue.FIELD_DOB: // dob field
                do {
                    System.out.println("Enter the " + field + " <dd/mm/yyyy>(*): ");
                    value = input.nextLine();
                } while (!student.validateDob(value));
                break;

            case ConstantValue.FIELD_LOCATION: // location field
                do {
                    System.out.println("Enter the " + field + ": ");
                    value = input.nextLine();
                } while (!student.validateLocation(value));
                break;

            case ConstantValue.FIELD_CODE_OF_CLASS: // codeOfClass field
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
