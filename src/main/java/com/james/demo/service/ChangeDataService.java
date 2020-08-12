package com.james.demo.service;

import com.james.demo.dao.model.Book;



import java.util.*;


public interface ChangeDataService {
    int deleteByUserId(Integer userId);
    int insert(Book record);
    int insertSelective(Book record);
    Optional<Book> selectUserById(Integer id_);
    int updateUserNameById(Book record);
    int updateByPrimaryKeySelective(Book record);
    List<Book> selectWithPage(Integer page, Integer size);
    Optional<Book> selectByPrimaryKey(Integer id);
}
