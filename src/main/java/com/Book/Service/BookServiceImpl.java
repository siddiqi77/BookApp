package com.Book.Service;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Book.Entity.AddBookEntity;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository repo;

	@Override
	public Long createBook(AddBookEntity abe) {

		abe = repo.save(abe);
		return abe.getBookId();
	}

	@Override
	public List<AddBookEntity> findByBookNameContaining(String bookName) {
		
		List<AddBookEntity> bookEntityList=repo.findByBookNameContaining(bookName);
		
		return bookEntityList;
	}

	@Override
	public List<AddBookEntity> findByBookType(String bookType) {

		List<AddBookEntity> bookEntityList=repo.findByBookType(bookType);
		return bookEntityList;
	}

	@Override
	public List<AddBookEntity> findByBookId(Long bookId) {
		
		List<AddBookEntity> book=repo.findByBookId(bookId);
		return book;
	}

	@Override
	public int deleteByBookId(Long bookId) {
		int count=repo.deleteByBookId(bookId);
		return count;
	}

	@Override
	public int updateByBookId(String bookName, String bookType, String bookAuthor, Date pDate, Long bookId) {
		int count=repo.updateByBookId(bookName, bookType, bookAuthor, pDate, bookId);
		return count;
	}

}
