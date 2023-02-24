package com.wwk.spring.dao;

public interface BookDao {

    Integer getPriceByBookId(Integer bookId);

    // 更新图书库存
    void updateStock(Integer bookId);

    // 更新用户余额
    void updateBalance(Integer userId, Integer price);
}
