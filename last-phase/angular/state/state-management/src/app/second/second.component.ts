import {Component, Input} from '@angular/core';
import {ThirdComponent} from "./third/third.component";

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
  @Input()
  value = 50;
}
