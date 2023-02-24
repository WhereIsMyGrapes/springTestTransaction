package com.wwk.spring.service.impl;

import com.wwk.spring.service.BookService;
import com.wwk.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    // 这是一个一键买所有书的方法, 要用到BookService中的BuyBook方法, 所以要自动装配BookService注解

    @Autowired
    private BookService bookService;

    @Transactional
    public void checkout(Integer userId, Integer[] bookIds) {
        for(Integer bookId:bookIds){
            bookService.buyBook(userId,bookId);
        }
    }
}
