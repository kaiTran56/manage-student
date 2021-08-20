package com.tranquyet.main;

import com.tranquyet.constant.ConstantValue;
import com.tranquyet.constant.ErrorMessageConstant;
import com.tranquyet.controller.ManagementController;
import com.tranquyet.model.Student;
import com.tranquyet.util.AutoCodeGeneration;
import com.tranquyet.util.Screen;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String... args) throws Exception {
        ManagementController manage = new ManagementController();
        int option;
        while (true) {
            try {
                Screen.showScreen();
                option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 1:
                        Student student = new Main().enterInformation(scanner, manage);
                        manage.addStudent(student);
                        break;
                    case 2:
                        manage.show();
                        break;
                    case 3:
                        manage.exit();
                        break;
                    default:
                        Screen.showError(ErrorMessageConstant.OPTION_NUMBER_ERROR);
                }
            } catch (Exception e) {
                Screen.showError(ErrorMessageConstant.OPTION_NUMBER_ERROR);
            }
        }
    }

    /**
     * @param input
     * @return return the valid student object after checking
     * @overview receive the input value of student and checking the valid condition
     */
    public Student enterInformation(Scanner input, ManagementController manage) {
        Student student = new Student();

        student.setCode(AutoCodeGeneration.generateCode());
        System.out.println("Code: " + student.getCode());

        String name = manage.checkValue(input, ConstantValue.FIELD_NAME, student);
        student.setName(name);

        String dob = manage.checkValue(input, ConstantValue.FIELD_DOB, student);
        student.setDob(dob);

        String phone = manage.checkValue(input, ConstantValue.FIELD_PHONE, student);
        student.setPhone(phone);

        String email = manage.checkValue(input, ConstantValue.FIELD_EMAIL, student);
        student.setEmail(email);

        String gender = manage.checkValue(input, ConstantValue.FIELD_GENDER, student);
        student.setGender(gender);

        String location = manage.checkValue(input, ConstantValue.FIELD_LOCATION, student);
        student.setLocation(location);

        String codeOfClass = manage.checkValue(input, ConstantValue.FIELD_CODE_OF_CLASS, student);
        student.setCodeOfClass(codeOfClass);

        return student;
    }

}
