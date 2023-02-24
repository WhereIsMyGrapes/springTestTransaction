package com.wwk.spring.test;

import com.wwk.spring.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ts-annotation.xml")
public class txTest {

    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook(){
        //bookController.buyBook(1,1);
        bookController.checkout(1,new Integer[]{1,2});
    }
}
