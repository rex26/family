package com.rex.bean.b_scope;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Chrome {
    private Broswer broswer;

    public void setToy(Broswer broswer) {
        this.broswer = broswer;
    }
}
