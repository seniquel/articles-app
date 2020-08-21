package dev.articles.exception;

import dev.articles.dto.MessageErreurDto;

public class ArticleException extends RuntimeException {
	
	private MessageErreurDto messageErreur;

	public ArticleException(MessageErreurDto messageErreur) {
		super(messageErreur.getMessage());
		this.messageErreur = messageErreur;
	}

	public MessageErreurDto getMessageErreur() {
		return messageErreur;
	}

}
