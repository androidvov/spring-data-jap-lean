package com.zkhr.dao.one2many;

import com.zkhr.model.one2many.OrderItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zhaoshuai on 2017/2/9.
 */

@Service
@Transactional
public interface OrderItemDao extends CrudRepository<OrderItem,Long> {

}
