import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InfoFlowerComponent } from './info-flower.component';

describe('InfoFlowerComponent', () => {
  let component: InfoFlowerComponent;
  let fixture: ComponentFixture<InfoFlowerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InfoFlowerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InfoFlowerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
