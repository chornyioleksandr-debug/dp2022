import { FlowerService } from './../services/flower.service';
import { RouterTestingModule } from '@angular/router/testing';
import { Component, OnInit } from '@angular/core';
import { Flower } from '../interfaces/flower';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.scss']
})
export class ListComponent implements OnInit {
  title: string = "List of Flowers";
  flowerList:Flower[] = []
  showAddForm:boolean = false
  selectedFlower?:Flower

  constructor(private service:FlowerService) { }

  ngOnInit(): void {
    this.updateFlowers()
    console.log(this.flowerList)
  }

  updateFlowers() {
    this.service.getFlowers().subscribe(
      (flowers)=>{
        this.flowerList = flowers;
        this.service.setList(flowers);
      }
    )
  }

  addFlower(flower:Flower) {
    this.service.postFlower(flower).subscribe(
      (flower)=>{
        this.updateFlowers()
      }
    )
  }

  onSelect(flower:Flower){
    if (this.selectedFlower && flower.id == this.selectedFlower.id) {
      this.selectedFlower = undefined
    } else {
      this.selectedFlower = flower
    }
  }

  deleteFlower(flower:Flower) {
    this.service.deleteFlower(flower).subscribe(
      ()=>{
        this.updateFlowers()
      }
    )
  }
}
