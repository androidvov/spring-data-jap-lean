package com.zkhr.service.one2one;

import com.zkhr.dao.one2one.PeopleDao;
import com.zkhr.dao.one2one.SelfCardDao;
import com.zkhr.model.one2one.People;
import com.zkhr.model.one2one.SelfCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhaoshuai on 2017/2/8.
 */
@Service
public class PeopleService {

    @Autowired
    private PeopleDao peopleDao;

    @Autowired
    private SelfCardDao selfCardDao;




    public People savePeople(People people){

        return peopleDao.save(people);

    }

    public SelfCard saveSelfCard(SelfCard selfCard){

        return selfCardDao.save(selfCard);

    }


    public People findPeopleById(){

        return peopleDao.findPeopleById();
    }


    public SelfCard findSelfCardByCardNum(){
        return selfCardDao.findSelfCardByCardNum();
    }

}
