package com.lzf.code.alliance.repository;

import com.lzf.code.alliance.entity.Promotion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 写点注释
 * <br/>
 * Created in 2018-12-25 00:12:16
 * <br/>
 *
 * @author Li zhenfeng
 */
public interface PromotionRepository extends JpaRepository<Promotion,Integer>, JpaSpecificationExecutor<Promotion> {
}
