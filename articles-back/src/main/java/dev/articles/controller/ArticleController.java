package dev.articles.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.articles.dto.ArticleDto;
import dev.articles.dto.CodeErreur;
import dev.articles.dto.CreerArticleDto;
import dev.articles.dto.MessageErreurDto;
import dev.articles.entite.Article;
import dev.articles.exception.ArticleException;
import dev.articles.service.ArticleService;

@RestController
@RequestMapping("articles")
public class ArticleController {

	private ArticleService service;
	
	public ArticleController(ArticleService service) {
		this.service = service;
	}
	
	@GetMapping
	public ResponseEntity<List<Article>> getArticles(){
		return ResponseEntity.status(HttpStatus.OK)
				.body(service.lister());
	}
	
	@PostMapping
	public ResponseEntity<?> postArticle(@RequestBody @Valid CreerArticleDto article, BindingResult result) {
		if (result.hasErrors()) {
			throw new ArticleException(new MessageErreurDto(CodeErreur.VALIDATION, "Données invalides pour la création d'un article"));
		}
		
		Article articleCree = service.creer(article.getLibelle(), article.getPrix());
		
		ArticleDto articleDto = new ArticleDto();
		articleDto.setId(articleCree.getId());
		articleDto.setLibelle(articleCree.getLibelle());
		articleDto.setPrix(articleCree.getPrix());
		
		return ResponseEntity.ok(articleDto);
	}
}
