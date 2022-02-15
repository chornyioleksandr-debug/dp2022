import { FlowersService } from './../services/flowers.service';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.scss']
})
export class FormComponent implements OnInit {

  flowerForm = new FormGroup({
    title: new FormControl(''),
    img: new FormControl(''),
    description: new FormControl(''),
  });
  constructor(private service: FlowersService) { }

  ngOnInit(): void {
  }

  onSubmit() {
    this.service.setFlowers(this.flowerForm.value);
  }

}
