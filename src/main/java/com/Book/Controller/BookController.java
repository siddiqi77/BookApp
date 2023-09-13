package com.Book.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Book.Entity.AddBookEntity;
//import com.Book.Entity.UserEntity;
import com.Book.Model.UserDto;
//import com.Book.Repository.UserRepository;
import com.Book.Service.BookService;
//import com.Book.Service.UserService;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookService service;
	
	//@Autowired
	//UserService userService;

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/hi")
	public String welcome() {
		return "Book";
	}

	@GetMapping("/add")
	public String addBook() {
		return "addBook";
	}

	@GetMapping("/edit")
	public String editBook() {
		return "editBook";
	}

	@GetMapping("/email")
	public String emailBook() {
		return "emailBook";
	}

	@GetMapping("/remove")
	public String removeBook() {
		return "removeBook";
	}

	@GetMapping("/showAll")
	public String showAllBook() {
		return "showAll";
	}

	@GetMapping("/search")
	public String showBook() {
		return "searchBook";
	}

	@PostMapping("/create")
	public String createBook(@ModelAttribute AddBookEntity addBokEntity, Model model) {

		Long id = service.createBook(addBokEntity);
		model.addAttribute("id", id);
		if (id != null) {

			return "success";
		} else {
			return "failed";
		}

	}

	@GetMapping("/searchBook")
	public String searchBook(@ModelAttribute AddBookEntity addBookEntity, Model model) {
		System.out.println("****************************************************");
		List<AddBookEntity> bookList = service.findByBookNameContaining(addBookEntity.getBookName());
		System.out.println(bookList.toString());
		model.addAttribute("bookList", bookList);
		return "listBook";
	}

	@GetMapping("/showAllBookType")
	public String searchBookType(@ModelAttribute AddBookEntity addBookEntity, Model model) {
		System.out.println("****************************************************");
		List<AddBookEntity> bookList = service.findByBookType(addBookEntity.getBookType());
		System.out.println(bookList.toString());
		model.addAttribute("bookList", bookList);
		return "listBookType";
	}

	@GetMapping("/removeBook")
	public String searchBookById(@ModelAttribute AddBookEntity addBookEntity, Model model) {

		Long id = addBookEntity.getBookId();
		System.out.println(id);
		List<AddBookEntity> bookList = service.findByBookId(id);

		System.out.println(bookList.toString());
		model.addAttribute("bookList", bookList);
		return "deleteBook";

	}

	@GetMapping("/deleteBook")
	public String deleteBook(@ModelAttribute AddBookEntity addBookEntity, Model model) {

		int count = service.deleteByBookId(addBookEntity.getBookId());
		model.addAttribute("count", count);
		return "deleted";
	}

	@GetMapping("/modifyBook")
	public String modifyBook(@ModelAttribute AddBookEntity addBookEntity, Model model) {
		Long id = addBookEntity.getBookId();
		System.out.println(id);
		List<AddBookEntity> bookList = service.findByBookId(id);

		System.out.println(bookList.toString());
		model.addAttribute("bookList", bookList);
		return "modifyBook";
	}

	@PostMapping("/updateBook")
	public String updateBook(@ModelAttribute AddBookEntity addBookEntity, Model model) {
		int count = service.updateByBookId(addBookEntity.getBookName(), addBookEntity.getBookType(),
				addBookEntity.getBookAuthor(), addBookEntity.getpDate(), addBookEntity.getBookId());
		model.addAttribute("count", count);
		return "updated";
	}
	
	@GetMapping("/uploadBook")
	public String uploadBook() {

		return "upload";
	}
	
	
	
	/*
	 * @PostMapping("/saveUser") public String saveUserDetails(@ModelAttribute
	 * UserEntity userEntity, Model model, UserDto userDto, BindingResult result) {
	 * 
	 * UserEntity existingUser = userService.findUserByEmail(userDto.getEmail());
	 * 
	 * if(existingUser != null && existingUser.getEmail() != null &&
	 * !existingUser.getEmail().isEmpty()){ result.rejectValue("email", null,
	 * "There is already an account registered with the same email"); }
	 * if(result.hasErrors()){ model.addAttribute("user", userDto); return "/login";
	 * } Integer id =userService.saveUser(userEntity); if(id != null) {
	 * model.addAttribute("message", "User " +id+ "registered successfully"); return
	 * "login"; } else { model.addAttribute("message",
	 * "User not able to register...Please add correct details"); return "login"; }
	 * }
	 * 
	 * @GetMapping("/users") public String users(Model model){ List<UserDto> users =
	 * userService.findAllUsers(); model.addAttribute("users", users); return
	 * "users"; }
	 */
}
