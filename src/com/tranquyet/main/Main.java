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

    /**
     * run application
     */
    public static void main(String... args) {
        ManagementController manage = new ManagementController();
        int option;
        while (true) {
            try {
                Screen.showScreen();
                option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 1: // option 1: add student
                        Student student = new Main().enterInformation(scanner, manage);
                        manage.addStudent(student);
                        break;
                    case 2: // option 2: show student
                        manage.show();
                        break;
                    case 3: // option 3: exit
                        manage.exit();
                        break;
                    default:
                        Screen.showError(ErrorMessageConstant.OPTION_NUMBER_ERROR); // show error if option not in 1,2,3
                }
            } catch (Exception e) {
                Screen.showError(ErrorMessageConstant.OPTION_NUMBER_ERROR); // show error if form input of option is not right
            }
        }
    }

    /**
     * receive the input value of student and checking the valid condition
     *
     * @param input  receive the information from client
     * @param manage call the checkValue method to retrieve the right form information
     * @return the valid student object after checking
     */
    public Student enterInformation(Scanner input, ManagementController manage) {
        Student student = new Student();

        student.setCode(AutoCodeGeneration.generateCode()); // code field <automatically create>
        System.out.println("Code: " + student.getCode());

        String name = manage.checkValue(input, ConstantValue.FIELD_NAME, student); // name field
        student.setName(name);

        String dob = manage.checkValue(input, ConstantValue.FIELD_DOB, student); // dob field
        student.setDob(dob);

        String phone = manage.checkValue(input, ConstantValue.FIELD_PHONE, student); // phone field
        student.setPhone(phone);

        String email = manage.checkValue(input, ConstantValue.FIELD_EMAIL, student); // email field
        student.setEmail(email);

        String gender = manage.checkValue(input, ConstantValue.FIELD_GENDER, student); // gender field
        student.setGender(gender);

        String location = manage.checkValue(input, ConstantValue.FIELD_LOCATION, student); // location field
        student.setLocation(location);

        String codeOfClass = manage.checkValue(input, ConstantValue.FIELD_CODE_OF_CLASS, student); // codeOfClass field
        student.setCodeOfClass(codeOfClass);

        return student;
    }

}
