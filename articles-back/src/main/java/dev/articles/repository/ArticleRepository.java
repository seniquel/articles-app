package dev.articles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.articles.entite.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
