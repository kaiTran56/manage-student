package com.tranquyet.util;

import java.util.Random;

public class AutoCodeGeneration {

    /**
     * @overview
     *      this function will automatically generate code_id for student with format example: 3F3F4P
     * @return
     *      return a String include number + word;
     */
    public static String generateCode() {
        Random rand = new Random();
        int lengthOfCode = 3;
        StringBuilder code = new StringBuilder(lengthOfCode);
        for(int i = 0 ; i < lengthOfCode; i++){
            char word = (char) ('A' +rand.nextInt('Z'-'A')); // create word randomly
            code.append(rand.nextInt(9)+""+word); // integrate number and word
        }
        return code.toString();
    }
}
