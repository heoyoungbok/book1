package com.example.book1.service;

import com.example.book1.dto.BookDTO;
import com.example.book1.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    public void save(BookDTO bookDTO) {
        bookRepository.save()


    }


//    public boolean save(BookDTO bookDTO) {
//        int insertResult =
//    }
}
