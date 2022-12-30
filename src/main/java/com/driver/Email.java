package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
       if(oldPassword!=getPassword()){
           System.out.println("Password does not match");
       }
       else{
           boolean up=false,lo=false,dig=false,sp=false;
           for(int i=0;i<newPassword.length();i++){
               char c=newPassword.charAt(i);
               if(c>='A'&&c<='Z') up=true;
               else if(c>='0'&&c<='9') dig=true;
               else if(c>='a'&&c<='z') lo=true;
               else sp=true;
           }
           if(newPassword.length()>=8&&sp&&up&&lo&&dig){
               setPassword(newPassword);
               System.out.println("password updated sucessfully");
           }
           else{
               System.out.println("invalid password");
           }
       }
    }
}
