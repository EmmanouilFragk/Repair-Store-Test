package com.example.demo.forms;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class RegisterFormOwner {

    public class RegisterForm {

        private static final String TAX_REGISTRATION_NUMBER_PATTERN = "[0-9]{9}";

        private static final String USERFIRSTNAME_PATTERN = "^[a-zA-Z0-9]*$";

        private static final String USERLASTSTNAME_PATTERN = "^[a-zA-Z0-9]*$";

        private static final String ADDRESS_PATTERN = "^[a-zA-Z]{1-63} [0-9]{1-4}*$";

        private static final String MAIL_PATTERN = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{1,63}$";

        private static final String PASSWORD_PATTERN = "^[a-zA-Z0-9@#$%^&]*$";

        private static final String CAR_BRAND_PATTERN = "^[a-zA-Z]*$";

        private static final String CAR_PLATE_PATTERN = "^[A-Z]{3}-[0-9]{4}*$";

        private static final int PASSWORD_MINSIZE = 8;

        @Pattern(regexp = TAX_REGISTRATION_NUMBER_PATTERN, message = "username.empty")
        private String tax_reg_num;

        @Pattern(regexp = USERFIRSTNAME_PATTERN, message = "userfirstname.empty")
        private String userfirstname;

        @Pattern(regexp = USERLASTSTNAME_PATTERN, message = "userlastname.empty")
        private String userlastname;

        @Pattern(regexp = CAR_PLATE_PATTERN, message = "Invalid Plate Number")
        private String car_plate;

        @Pattern(regexp = PASSWORD_PATTERN, message = "Invalid Password")
        @Size(min = PASSWORD_MINSIZE, message = "Invalid Password Size")
        private String password;

        @Pattern(regexp = MAIL_PATTERN, message = "Invalid Mail")
        private String email;

        public String getTax_reg_num() {
            return tax_reg_num;
        }

        public void setTax_reg_num(String tax_reg_num) {
            this.tax_reg_num = tax_reg_num;
        }

        public String getUserfirstname() {
            return userfirstname;
        }

        public void setUserfirstname(String userfirstname) {
            this.userfirstname = userfirstname;
        }

        public String getUserlastname() {
            return userlastname;
        }

        public void setUserlastname(String userlastname) {
            this.userlastname = userlastname;
        }

        public String getCar_plate() {
            return car_plate;
        }

        public void setCar_plate(String car_plate) {
            this.car_plate = car_plate;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
