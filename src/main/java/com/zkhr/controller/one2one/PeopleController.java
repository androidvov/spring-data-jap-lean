package com.zkhr.controller.one2one;

import com.alibaba.fastjson.JSON;
import com.zkhr.model.one2one.People;
import com.zkhr.model.one2one.SelfCard;
import com.zkhr.service.one2one.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaoshuai on 2017/2/8.
 */
@RestController
public class PeopleController {


    @Autowired
    private PeopleService peopleService;

    @RequestMapping("/savePeople")

    public String savePeople(){




        People people = new People();
        people.setName("张三");

        People result = peopleService.savePeople(people);

        SelfCard selfCard = new SelfCard();
        selfCard.setCardNum("23323");
        selfCard.setPeople(result);
         peopleService.saveSelfCard(selfCard);

        return JSON.toJSONString(result);


    }


    @RequestMapping("/findPeople")
    public String findPeople(){
        People people = peopleService.findPeopleById();
        System.out.println(people.getSelfCard().getPeople().getSelfCard().getCardNum());
        return JSON.toJSONString(people);
    }


    @RequestMapping("/findSelfCard")
    public String findSelfCard(){
        return JSON.toJSONString(peopleService.findSelfCardByCardNum());
    }
}
