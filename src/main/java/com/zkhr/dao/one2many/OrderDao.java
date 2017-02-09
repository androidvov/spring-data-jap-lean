package com.zkhr.dao.one2many;

import com.zkhr.model.one2many.Order;
import com.zkhr.utils.Constants;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zhaoshuai on 2017/2/9.
 */
@Repository
@Transactional
public interface OrderDao extends CrudRepository<Order,Long> {

    @Query(nativeQuery = true,value = Constants.FIND_ORDER_BY_ID)
    Order findOrderById();

}
