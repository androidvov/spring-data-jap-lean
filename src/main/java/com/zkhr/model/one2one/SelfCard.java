package com.zkhr.model.one2one;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by zhaoshuai on 2017/2/8.
 */

@Entity
@Table(name = "T_MA_SELF_CARD")
public class SelfCard implements Serializable {
    private static final long serialVersionUID = 3323914552027606168L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "CARD_NUM")
    private String cardNum;

    @OneToOne
    @JoinColumn(name = "PEOPLE_ID")
    private People people;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }
}
