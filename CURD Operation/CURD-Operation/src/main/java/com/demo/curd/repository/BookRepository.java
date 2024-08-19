package com.demo.curd.repository;

import com.demo.curd.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer> {
    @Query("SELECT b FROM BookEntity b WHERE b.bookName = :bookName")
    Optional<BookEntity> findByBookName(@Param("bookName") String bookName);
}
