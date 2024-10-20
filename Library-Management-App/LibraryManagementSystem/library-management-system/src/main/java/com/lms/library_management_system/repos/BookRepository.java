package com.lms.library_management_system.repos;


import com.lms.library_management_system.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,  Long> {
}
