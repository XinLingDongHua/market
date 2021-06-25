package com.inger.market.repository;

import com.inger.market.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CartRepository extends JpaRepository<Cart,Integer> {

    List<Cart> findByUserId(Integer userId);

    void deleteByUserIdAndGoodsId(Integer userId , Integer goodsId);

}
