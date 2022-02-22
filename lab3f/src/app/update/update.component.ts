import { FlowerService } from './../services/flower.service';
import { Component,EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Flower } from '../interfaces/flower';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.scss']
})
export class UpdateComponent implements OnInit {

  @Input() flower?:Flower;
  @Output() updated:EventEmitter<null> = new EventEmitter()
 

  constructor(private service:FlowerService) { }

  ngOnInit(): void {
  }

  updateFlower(){
    if (this.flower) {
      this.service.putFlower(this.flower).subscribe(
        ()=>{
          this.updated.emit()
        }
      )
    }
  }

}
