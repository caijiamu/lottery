package com.example.demo.responsitory;

import com.example.demo.domain.Orders;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by caijiamu on 2017/9/8.
 */

public interface OrdersResponsitory extends CrudRepository<Orders,Long> {

}
