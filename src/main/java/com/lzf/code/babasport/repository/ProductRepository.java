package com.lzf.code.babasport.repository;

import com.lzf.code.babasport.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 写点注释
 * <br/>
 * Created in 2018-12-22 20:08:15
 * <br/>
 *
 * @author Li zhenfeng
 */
public interface ProductRepository extends JpaRepository<Product,Long>, JpaSpecificationExecutor<Product> {
}
