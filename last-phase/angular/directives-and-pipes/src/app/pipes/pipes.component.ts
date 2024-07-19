import { Component } from '@angular/core';
import {DatePipe, LowerCasePipe, TitleCasePipe, UpperCasePipe} from "@angular/common";

@Component({
  selector: 'app-pipes',
  standalone: true,
  imports: [
    UpperCasePipe,
    LowerCasePipe,
    TitleCasePipe,
    DatePipe
  ],
  template: `
    <p>
      {{'pipes works!' | uppercase | lowercase  | titlecase}}
    </p>
    <h1>Toady : {{today | date}}</h1>
  `,
  styles: ``
})
export class PipesComponent {
  today = new Date();
}
