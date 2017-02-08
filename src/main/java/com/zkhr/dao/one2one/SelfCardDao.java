package com.zkhr.dao.one2one;

import com.zkhr.model.one2one.SelfCard;
import com.zkhr.utils.Constants;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zhaoshuai on 2017/2/8.
 */
@Repository
@Transactional
public interface SelfCardDao extends CrudRepository<SelfCard,Long> {

    @Query(value = Constants.FIND_SELFCARD_BY_CARDNUM,nativeQuery =true)
    SelfCard findSelfCardByCardNum();
}
