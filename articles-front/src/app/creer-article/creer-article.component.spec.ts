import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreerArticleComponent } from './creer-article.component';

describe('CreerArticleComponent', () => {
  let component: CreerArticleComponent;
  let fixture: ComponentFixture<CreerArticleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreerArticleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreerArticleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
