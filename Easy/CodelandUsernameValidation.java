/*
Input: "aa_"
Output: false

Input: "u__hello_world123"
Output: true
*/

public static boolean CodelandUsernameValidation(String str) {

        if (str.length() < 4 || str.length() > 25) 
          return false;

        if (!Character.isLetter(str.charAt(0))) 
          return false;

        if (str.charAt(str.length() - 1) == '_') 
          return false;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i)) && !Character.isDigit(str.charAt(i)) && str.charAt(i) != '_')
                return false;
        }
        return true;
    }
