import {Component, EventEmitter, Inject, Injectable, Input, output} from '@angular/core';
import {ValueService} from "../service/value.service";

@Component({
  selector: 'app-first',
  standalone: true,
  imports: [],
  templateUrl: './first.component.html',
  styleUrl: './first.component.css'
})
export class FirstComponent {
  value:number = 100;

constructor(@Inject(ValueService)private valueService : ValueService) {
  this.valueService.getValue().subscribe(value=> this.value)
}
  updateValue(value:number){
    this.value = value;
    this.valueService.updateValue(value);
  }
}
