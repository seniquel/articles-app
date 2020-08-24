import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { HttpClientModule } from '@angular/common/http';
import { Route, RouterModule, Routes } from '@angular/router';
import { ArticlesComponent } from './articles/articles.component';
import { CreerArticleComponent } from './creer-article/creer-article.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';

const ROUTES: Routes = [
  { path: 'articles', component: ArticlesComponent},
  { path: 'ajouter', component: CreerArticleComponent},
  { path: '', pathMatch: 'full', redirectTo: '/articles' }
];

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    ArticlesComponent,
    CreerArticleComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(ROUTES),
    NgbModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
