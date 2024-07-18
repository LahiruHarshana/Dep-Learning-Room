import { Component } from '@angular/core';
import {NgSwitch, NgSwitchCase} from "@angular/common";

@Component({
  selector: 'app-ng-switch',
  standalone: true,
  imports: [
    NgSwitch,
    NgSwitchCase
  ],
  template: `
    <div [ngSwitch]="day">
        <div *ngSwitchCase="'Monday'">Monday is awesome</div>
        <div *ngSwitchCase="'Tuesday'">Tuesday is kinda okay</div>
        <div *ngSwitchCase="'Wednesday'">Wednes is not bad</div>
        <div *ngSwitchCase="'Thursday'">Thursday is tikak amaruyi</div>
        <div *ngSwitchCase="'Friday'">Friday Gedr yann ona </div>
    </div>
  `,
  styles: ``
})
export class NgSwitchComponent {
day = 'Friday'
}
