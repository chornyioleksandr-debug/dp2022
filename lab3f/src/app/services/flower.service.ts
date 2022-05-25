import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { Flower } from '../interfaces/flower';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class FlowerService {
  list = new BehaviorSubject<Flower[]>([])
  url:string="http://localhost:8058/lab4/Servlet"

  constructor(private http:HttpClient) { }

  getFlowers():Observable<Flower[]>{
    return this.http.get<Flower[]>(this.url, {responseType: 'json'});
  }
  postFlower(flower:Flower):Observable<Flower[]>{
    return this.http.post<Flower[]>(this.url, flower)
  }
  putFlower(flower:Flower):Observable<Flower[]>{
    return this.http.put<Flower[]>(this.url+"/"+flower.id, flower);
  }
  deleteFlower(flower:Flower):Observable<Flower[]>{
    return this.http.delete<Flower[]>(this.url+"/"+flower.id);
  }

  setList(list:Flower[]) {
    this.list.next(list);
  }
}
