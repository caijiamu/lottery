package com.example.demo.responsitory;

import cn.cloudtop.common.api.basic.RestRequest;
import cn.cloudtop.common.api.basic.RestResponse;
import com.example.demo.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by caijiamu on 2017/9/7.
 */
public interface UserResponsitory extends CrudRepository<User,Long>{

}
