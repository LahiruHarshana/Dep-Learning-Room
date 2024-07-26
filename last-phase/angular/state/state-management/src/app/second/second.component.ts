import {Component, EventEmitter, inject, Input, Output} from '@angular/core';
import {ThirdComponent} from "./third/third.component";
import {ValueService} from "../service/value.service";

@Component({
  selector: 'app-second',
  standalone: true,
  imports: [
    ThirdComponent
  ],
  templateUrl: './second.component.html',
  styleUrl: './second.component.css'
})
export class SecondComponent {
  value = 50;
  valueService:ValueService = inject(ValueService)
}
