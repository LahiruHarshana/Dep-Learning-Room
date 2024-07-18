import { Component } from '@angular/core';
import {CommonModule} from "@angular/common";

@Component({
  selector: 'app-ng-for',
  standalone: true,
  imports: [CommonModule],
  template: `
      <ul>
          <li *ngFor="let item of [1,2,3,4,5]; let i = index">
              List Item {{i}}</li>
      </ul>
  `,
  styles: ``
})
export class NgForComponent {

}
