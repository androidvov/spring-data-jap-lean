package com.zkhr.model.one2one;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by zhaoshuai on 2017/2/8.
 */

@Entity
@Table(name = "T_MA_PEOPLE")
public class People implements Serializable {
    private static final long serialVersionUID = -4419309422716232732L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME",nullable = false)
    private String name;


    @OneToOne(mappedBy = "people",fetch = FetchType.LAZY,cascade = CascadeType.ALL,orphanRemoval = true)
    private SelfCard selfCard;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SelfCard getSelfCard() {
        return selfCard;
    }

    public void setSelfCard(SelfCard selfCard) {
        this.selfCard = selfCard;
    }
}
