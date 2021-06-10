package ch.groupchat.NoelCédricVincent.Backend;

public class Validator {
    public static String validateRegister(String username, String email, String pwd) {
        String msg = "";
        msg = validatePwd(pwd);
        if(!msg.equals("")){return msg;}
        msg = validateEmail(email);
        if(!msg.equals("")){return msg;}
        msg = validateUsername(username);
        return msg;
    }

    private static String validatePwd(String pwd) {
        if(pwd.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$")){

        }else{
            return "Password does not comply with the password rules";
        }
        return "";
    }

    private static String validateEmail(String email) {
        if (email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$") || email.equals("")) {
            if (/*Bereits ein Account mit dieser Email existiert*/true) {

            } else {
                return "There's already an Account with this email";
            }
        } else {
            return "Invalid Email";
        }
        return "";
    }

    private static String validateUsername(String username) {
        if (username.matches("^[0-9a-zA-Z_]*$")) {
            if (username.length() >= 8) {
                if (/*Username bereits vergeben ist*/true) {

                } else {
                    return "Username is already taken";
                }
            } else {
                return "Username must be longer than 7 characters";
            }
        } else {
            return "Username can only contain a-Z, 0-9 and _";
        }
        return "";
    }
}
