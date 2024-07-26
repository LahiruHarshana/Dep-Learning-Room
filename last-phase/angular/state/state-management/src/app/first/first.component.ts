import {Component, EventEmitter, Input, output} from '@angular/core';
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

constructor(private valueService : ValueService) {
}
  updateValue(value:number){
    this.value = value;
  }
}
