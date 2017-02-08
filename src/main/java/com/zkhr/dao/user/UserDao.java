package com.zkhr.dao.user;

import com.zkhr.model.user.User;
import com.zkhr.utils.Constants;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhaoshuai on 2017/2/8.
 */
@Repository
@Transactional
public interface UserDao extends CrudRepository<User,Long>{

        @Query(value = Constants.FIND_ALL_USERS,nativeQuery = true)
        List<User> findAllUsers();

}
