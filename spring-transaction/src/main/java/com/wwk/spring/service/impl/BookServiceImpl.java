package com.wwk.spring.service.impl;

import com.wwk.spring.dao.BookDao;
import com.wwk.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Transactional(
//            readOnly =
            timeout = 3
    )
    public void buyBook(Integer userId, Integer bookId) {

        // 查询图书价格
        Integer price = bookDao.getPriceByBookId(bookId);
        // 更新图书库存
        bookDao.updateStock(bookId);
        // 更新用户余额
        bookDao.updateBalance(userId,price);
    }
}
