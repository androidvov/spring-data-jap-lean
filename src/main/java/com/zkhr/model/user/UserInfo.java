package com.zkhr.model.user;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by zhaoshuai on 2017/2/8.
 */

@Entity
@Table(name = "T_MA_USER_INFO")
public class UserInfo implements Serializable {
    private static final long serialVersionUID = -2761777601942688565L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "ADDRESS")
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
