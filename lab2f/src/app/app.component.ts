
import { Component } from '@angular/core';
import { Flowers } from './interfaces/flowers';
import { FlowersService } from './services/flowers.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'lab2f';

  flowersList:Flowers[] = []
  constructor(private service:FlowersService) { }

  ngOnInit(): void {
    this.service.getFlowers().subscribe(
      (flowers) => {
        this.flowersList = flowers;
      }
    )
  }
}
