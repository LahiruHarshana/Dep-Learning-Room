import { Component } from '@angular/core';
import { NgSwitch, NgSwitchCase } from "@angular/common";

@Component({
  selector: 'app-ng-switch',
  standalone: true,
  imports: [
    NgSwitch,
    NgSwitchCase
  ],
  template: `
      <div class="container">
          <h1 class="title">NgSwitch Demo</h1>
          <hr>
          <h2 class="subtitle">Old Way (Angular 17 and below)</h2>
          <ng-container [ngSwitch]="day">
              <div *ngSwitchCase="'Monday'">Monday is awesome</div>
              <div *ngSwitchCase="'Tuesday'">Tuesday is kinda okay</div>
              <div *ngSwitchCase="'Wednesday'">Wednesday is not bad</div>
              <div *ngSwitchCase="'Thursday'">Thursday is tikak amaruyi</div>
              <div *ngSwitchCase="'Friday'">Friday Gedr yann ona </div>
          </ng-container>

          <hr>
          <h2 class="subtitle">New Way (Angular 18+)</h2>
          <div [ngSwitch]="day">
              <ng-template [ngSwitchCase]="'Monday'">
                  <div class="day-box">Monday is awesome</div>
              </ng-template>
              <ng-template [ngSwitchCase]="'Tuesday'">
                  <div class="day-box">Tuesday is kinda okay</div>
              </ng-template>
              <ng-template [ngSwitchCase]="'Friday'">
                  <div class="day-box">Friday is gedr yanna ona</div>
              </ng-template>
              <ng-template ngSwitchDefault>
                  <div class="day-box">Weekend is full of fun</div>
              </ng-template>
          </div>
      </div>
  `,
  styles: [`
    .container {
      max-width: 800px;
      margin: 40px auto;
      padding: 20px;
      background-color: #f9f9f9;
      border: 1px solid #ddd;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    .title {
      font-size: 24px;
      font-weight: bold;
      margin-bottom: 10px;
    }

    .subtitle {
      font-size: 18px;
      font-weight: bold;
      margin-bottom: 20px;
    }

    .day-box {
      padding: 20px;
      border: 1px solid #ccc;
      border-radius: 10px;
      margin-bottom: 20px;
    }
  `]
})
export class NgSwitchComponent {
  day = 'Tuesday';
}
