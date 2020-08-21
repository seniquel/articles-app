package dev.articles.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.articles.entite.Article;
import dev.articles.repository.ArticleRepository;

@Service
public class ArticleService {

	private ArticleRepository repo;
	
	public ArticleService(ArticleRepository repo) {
		this.repo = repo;
	}
	
	public List<Article> lister() {
		return repo.findAll();
	}
	
	public Article creer(String libelle, float prix) {
		Article article = new Article(libelle, prix);
		Article articleSauvegarde = this.repo.save(article);
		return articleSauvegarde;
		
	}
}
