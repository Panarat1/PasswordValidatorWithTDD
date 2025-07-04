package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * * @return ค่าความแข็งแรงของ password
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { 
        
        int minLength = 8 ; 
        if(password==null || password.length()   > minLength) {
           return PasswordStrength.INVALID ;
        }
        boolean hasDigit = false;
        boolean hasUppercase = false;
        boolean hasLowercase = false;

        for(int i = 0 ; i< password.length() ; i++) {
            char c = password.charAt(i);
            if(Character.isDigit(c)){
                hasDigit = true;
            } 
            else if(Character.isUpperCase(c)){
                hasUppercase = true;
            }
            else if(Character.isLowerCase(c)){
                hasLowercase = true;
            }
            
        }
        if(hasDigit&&hasUppercase&&hasLowercase){
            return PasswordStrength.STRONG;
        }else if( hasLowercase&&hasUppercase){
            return PasswordStrength.MEDIUM;
        }else if ( hasLowercase) {
            return PasswordStrength.WEAK;
        }else{
            return PasswordStrength.INVALID;
        }
        

    }
}