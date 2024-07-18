import { Component } from '@angular/core';
import {CommonModule} from "@angular/common";

@Component({
  selector: 'app-ng-for',
  standalone: true,
  imports: [CommonModule],
  template: `
      <ul>
          <li *ngFor="let item of array1; let i = index">
               {{i}}</li>
      </ul>
      <hr>
      <ul>
          <li *ngFor="let item of array1;let isOdd = odd;
          let isFirst = first;let isLast=last;">
              {{item}}              <span *ngIf="isFirst" class="text-danger"> FIRST</span>
              <span *ngIf="isLast" class="text-danger"> LAST</span> <span *ngIf="isOdd">- ODD</span><span *ngIf="!isOdd">- EVEN</span>

          </li>
      </ul>
  `,
  styles: ``
})
export class NgForComponent {
array1 = ['Kasun','Nuwan','Supun','Lahiru','Chamaru','Thisaru']
}
