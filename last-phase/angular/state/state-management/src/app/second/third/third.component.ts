import {Component, EventEmitter, inject, Input, Output} from '@angular/core';
import {ValueService} from "../../service/value.service";

@Component({
  selector: 'app-third',
  standalone: true,
  imports: [],
  templateUrl: './third.component.html',
  styleUrl: './third.component.css'
})
export class ThirdComponent {
  value: number = 1;
  valueService = inject(ValueService)
  updateValue(value : number){
    this.value = value
  }
}
