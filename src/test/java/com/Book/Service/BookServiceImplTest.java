package com.Book.Service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.Book.Entity.AddBookEntity;

class BookServiceImplTest {

	@InjectMocks
	BookServiceImpl bookServiceImpl;
	
	@Mock
	BookRepository repo;
	
	AddBookEntity book;
	AddBookEntity book2;
	
	@SuppressWarnings("deprecation")
	@BeforeEach
	void setup() {
		book = new AddBookEntity();
		book2 = new AddBookEntity();
		MockitoAnnotations.initMocks(this);
	}
	@Test
	void testFindByBookId() {
		Optional<AddBookEntity> addBook = dummyBook();
		when(repo.findByBookId(anyLong())).thenReturn(addBook);
		
		Optional<AddBookEntity> gotbook = bookServiceImpl.findByBookId((long) 101);
		
		assertNotNull(gotbook);
		//assertNull(gotbook);
		assertEquals("sid", gotbook.get().getBookAuthor());
		assertEquals("java", gotbook.get().getBookName());
		assertEquals("education", gotbook.get().getBookType());
	}
	
	@Test
	void testFindByBookNameContaining() {
		List<AddBookEntity> bookList = dummyBookList();
		
		when(repo.findByBookNameContaining(anyString())).thenReturn(bookList);
		List<AddBookEntity> bookNameContaining = bookServiceImpl.findByBookNameContaining("ja");
		assertNotNull(bookNameContaining);
	}
	

	public List<AddBookEntity> dummyBookList(){
		book.setBookId(101L);
		book.setBookAuthor("sid");
		book.setBookName("java");
		book.setBookType("education");
		book.setpDate(null);
		
		book2.setBookId(102L);
		book2.setBookAuthor("jav");
		book2.setBookName("c++");
		book2.setBookType("education");
		book2.setpDate(null);
		
		List<AddBookEntity> bookList = Arrays.asList(book, book2);
		return bookList;
	}
	
	public Optional<AddBookEntity> dummyBook(){
		book.setBookAuthor("sid");
		book.setBookName("java");
		book.setBookType("education");
		book.setpDate(null);
		
		return Optional.of(book);
		//return null;
	}
}
