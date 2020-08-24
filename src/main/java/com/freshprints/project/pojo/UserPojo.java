package com.freshprints.project.pojo;

import jdk.jfr.DataAmount;
import lombok.*;

@Getter
@Setter
@Data
@Builder
public class UserPojo {

        public String userName;
        public String password;
        public String contactNo;
        public String fullName;
        public String emailId;


}
