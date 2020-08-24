import { Component, OnInit } from '@angular/core';
import { Article } from '../models/article';
import { DataService } from '../services/data.service';

@Component({
  selector: 'app-creer-article',
  templateUrl: './creer-article.component.html',
  styleUrls: ['./creer-article.component.css']
})
export class CreerArticleComponent implements OnInit {

  art: Article = {
    libelle: '',
    prix: 0,
  };

  constructor(private service: DataService) { }

  ngOnInit(): void {
  }

  validerArticle(): void {
    this.service
      .addArticle(this.art)
      .subscribe(
        err => console.log(err));
  }

}
