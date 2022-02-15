import { Flowers } from './../interfaces/flowers';
import { FlowersService } from './../services/flowers.service';
import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-info-flower',
  templateUrl: './info-flower.component.html',
  styleUrls: ['./info-flower.component.scss']
})
export class InfoFlowerComponent implements OnInit {
  
  @Input() title: string = "";
  @Input() description: string = "";
  @Input() img: string = "";

  ngOnInit(): void {
  }

  isClicked1:boolean = true;

  clickButton1() {
    this.isClicked1 = !this.isClicked1;
  }
  

}
