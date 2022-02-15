
import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from 'rxjs';
import { Flowers } from '../interfaces/flowers';

@Injectable({
  providedIn: 'root'
})
export class FlowersService {
  url:string = "/lab2/Servlet"

  constructor(private http:HttpClient) {}

  getFlowers():Observable<Flowers[]>{
    return this.http.get<Flowers[]>(this.url);
  }

  setFlowers(params: any) {
    //this.http.put(this.url, {}, {params: {}});
    console.log('params', params);
  }

}