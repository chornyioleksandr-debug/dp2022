import { Flowers } from './../interfaces/flowers';
import { FlowersService } from './../services/flowers.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-info-flower',
  templateUrl: './info-flower.component.html',
  styleUrls: ['./info-flower.component.scss']
})
export class InfoFlowerComponent implements OnInit {

  flowersList:Flowers[] = []
  constructor(private service:FlowersService) { }

  isClicked1:boolean = true;
  isClicked2:boolean = true;

  clickButton1() {
    this.isClicked1 = !this.isClicked1;
  }

  clickButton2() {
    this.isClicked2 = !this.isClicked2;
  }

  ngOnInit(): void {
    this.service.getFlowers().subscribe(
      (flowers) => {
        this.flowersList = flowers;
      }
    )
  }

}
