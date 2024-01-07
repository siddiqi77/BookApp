package com.Book.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.Book.Entity.AddBookEntity;

public interface BookService {
	
	public Long createBook(AddBookEntity abe);
	//void updateBook();
	//void deleteBook();
	
	public List<AddBookEntity> findByBookNameContaining(String bookName);
	
	public Optional findByBookId(Long bookId);
	
	public List<AddBookEntity> findByBookType(String bookType);
	
	public int deleteByBookId(Long bookId);
	
	public int updateByBookId(String bookName, String bookType, String bookAuthor, Date pDate, Long bookId);

}
