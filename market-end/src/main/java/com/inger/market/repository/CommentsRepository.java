package com.inger.market.repository;

import com.inger.market.domain.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CommentsRepository extends JpaRepository<Comments,Integer>{

    List<Comments> findByGoodsId(Integer goodsId);

}

