import { Component } from '@angular/core';
import {NgIf} from "@angular/common";

@Component({
  selector: 'app-ng-if',
  standalone: true,
  imports: [
    NgIf
  ],
  template: `
      <div class="container text-center">
          <button (click)="flag = !flag" class="btn btn-danger btn-sm">Click Me</button>
          <p class="mt-2" *ngIf="flag">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aperiam aut beatae delectus deserunt dicta dignissimos dolorum eius, facere incidunt iure non nostrum officiis quae quisquam, reiciendis, rem repellat tenetur vero.</p>
      </div>
      <div class="container text-center">
          <button (click)="flag2 =!flag2" class="btn btn-primary btn-sm">Show</button>

          <div  class="mt-2" *ngIf="flag2;else abc">Flag is true</div>
          <ng-template #abc>
              <div class="mt-2 bg-gradient-primary" *ngIf="!flag2">Flag is False</div>
          </ng-template>
      </div>
      <hr>
      <h1>Angular 18+</h1>
      <div class="container text-center">
          <button (click)="flag3 =!flag3" class="btn btn-primary btn-sm">Show</button>

          @if (flag3){
              <div>Flag is true</div>
              <div>Flag is true</div>
              <div>Flag is true</div>
          } @else{
              <div>Flag is False</div>
              <div>Flag is False</div>
              <div>Flag is False</div>
              <div>Flag is False</div>

          }
      </div>
  `,
  styles: ``
})
export class NgIfComponent {
  flag = true;
  flag2 = true;
  flag3 = true;
}
