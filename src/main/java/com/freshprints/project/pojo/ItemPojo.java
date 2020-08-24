package com.freshprints.project.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class ItemPojo {
    public String itemName;
    public String itemDescription;
}
