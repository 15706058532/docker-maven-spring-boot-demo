package com.lzf.code.babasport.repository;

import com.lzf.code.babasport.entity.Type;

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
public interface TypeRepository extends JpaRepository<Type,Long>, JpaSpecificationExecutor<Type> {
}
