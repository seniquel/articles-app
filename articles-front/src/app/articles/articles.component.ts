import { Component, OnInit } from '@angular/core';
import { DataService } from '../services/data.service';
import { Article } from '../models/Article';

@Component({
  selector: 'app-articles',
  templateUrl: './articles.component.html',
  styleUrls: ['./articles.component.css']
})
export class ArticlesComponent implements OnInit {

  listeArticles: Article[];

  constructor(private service: DataService) { }

  ngOnInit(): void {
    this.service.getArticles().subscribe(
      valeur => this.listeArticles = valeur,
      err => console.log(err),
      () => {}
    );
  }

}
