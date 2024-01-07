package com.Book.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.Book.Entity.AddBookEntity;

public interface BookRepository extends JpaRepository<AddBookEntity, Long> {
	
	public List<AddBookEntity> findByBookNameContaining(String bookName);
	
	public Optional findByBookId(Long bookId);
	
	public List<AddBookEntity> findByBookType(String bookType);
	
	@Transactional 
	@Modifying
	@Query("DELETE AddBookEntity WHERE bookId=:bookId")
	public int deleteByBookId(Long bookId);

	@Transactional 
	@Modifying
	@Query("UPDATE AddBookEntity set bookName=:bookName, bookType=:bookType, bookAuthor=:bookAuthor, pDate=:pDate  WHERE bookId=:bookId")
	public int updateByBookId(String bookName, String bookType, String bookAuthor, Date pDate, Long bookId);
	
}
