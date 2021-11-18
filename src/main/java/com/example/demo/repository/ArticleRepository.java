package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ArticleLibrary;


@Repository
public interface ArticleRepository extends JpaRepository<ArticleLibrary,Long> {

}
