
import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from 'rxjs';
import { Flowers } from '../interfaces/flowers';

@Injectable({
  providedIn: 'root'
})
export class FlowersService {
  url:string = "/lab1/Servlet"

  constructor(private http:HttpClient) {}

  getFlowers():Observable<Flowers[]>{
    return this.http.get<Flowers[]>(this.url);
  }
}