import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class GetResourcesService {

  baseUrl = environment.baseUrl;
  constructor(private http: HttpClient) { }

  getResource(pathToResource: string) {
    let result;
    console.log(result);
    this.http.get(this.baseUrl+pathToResource).subscribe(data => result = data);
    return result;
  }
}
