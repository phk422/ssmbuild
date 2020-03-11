package com.phk.service;

import com.phk.dao.BookMapper;
import com.phk.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {
    // 业务层掉dao
    private BookMapper bookMapper;

    // 为了spring注入
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return 0;
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return queryAllBook()  ;
    }
}
