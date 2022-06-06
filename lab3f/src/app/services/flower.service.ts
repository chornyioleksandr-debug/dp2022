import { Rest } from './../interfaces/rest';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Flower } from '../interfaces/flower';

@Injectable({
  providedIn: 'root'
})
export class FlowerService {
  url:string="http://localhost:8083/flowers"

  constructor(private http:HttpClient) { }

  getFlowers():Observable<Rest>{
    return this.http.get<Rest>(this.url);
  }
  postFlower(flower:Flower):Observable<Flower>{
    return this.http.post<Flower>(this.url, flower)
  }
  putFlower(flower:Flower):Observable<Flower>{
    return this.http.put<Flower>(flower._links.self.href, flower);
  }
  deleteFlower(flower:Flower):Observable<any>{
    return this.http.delete(flower._links.self.href);
  }

}
