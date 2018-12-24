package com.lzf.code.common;

import org.dozer.DozerBeanMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象转换工具
 * <br/>
 * Created in 2018-11-29 23:31
 *
 * @author Li Zhenfeng
 */
public class BeanMapper extends DozerBeanMapper {

    /**
     * 封装dozer处理集合的方法：List<S> --> List<T>
     */
    public <T, S> List<T> mapList(List<S> sourceList, Class<T> targetObjectClass) {
        List<T> targetList = new ArrayList<T>();
        for (S s : sourceList) {
            targetList.add(map(s, targetObjectClass));
        }
        return targetList;
    }
}