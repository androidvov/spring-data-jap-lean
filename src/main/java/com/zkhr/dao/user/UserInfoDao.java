package com.zkhr.dao.user;

import com.zkhr.model.user.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import sun.rmi.runtime.Log;

/**
 * Created by zhaoshuai on 2017/2/8.
 */
@Repository
@Transactional
public interface UserInfoDao  extends CrudRepository<UserInfo,Long>{



}
