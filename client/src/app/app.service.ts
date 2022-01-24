import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable()
export class AppService {

  authenticated = false;
  

  constructor(private http: HttpClient) {
  }
  /* Should authenticate user */
  authenticate(credentials: any, callback: any) {
        const headers = new HttpHeaders(credentials ? {
            authorization : 'Basic ' + btoa(credentials.username + ':' + credentials.password)
        } : {});
        /* Place headers to request */
        this.http.get('user', {headers: headers}).subscribe(response => {
            let result: any = response;
            /* Refactor this? */
            if (result['name']) {
                this.authenticated = true;
            } else {
                this.authenticated = false;
            }
            return callback && callback();
        });

    }

}