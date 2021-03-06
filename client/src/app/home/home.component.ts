import { Component, OnInit } from '@angular/core';
import { AppService } from '../app.service';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Component({
  templateUrl: './home.component.html'
})
export class HomeComponent {

  title = 'Demo';
  greeting: any = {};

  constructor(private app: AppService, private http: HttpClient) {
    http.get(environment.baseUrl+'resource').subscribe(data => this.greeting = data);
  }

  authenticated() { return this.app.authenticated; }

}