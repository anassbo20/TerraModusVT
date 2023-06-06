package com.example.terramodusvt.repositories;
import com.example.terramodusvt.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {
}
