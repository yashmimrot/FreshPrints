package com.freshprints.project.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@Builder
public class OrderPojo {
    public String order_Number;
    public Date order_Date;
    public String order_Description;

}
