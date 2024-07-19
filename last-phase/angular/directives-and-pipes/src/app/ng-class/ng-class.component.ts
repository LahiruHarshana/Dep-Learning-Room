import { Component } from '@angular/core';
import { CommonModule } from "@angular/common";

@Component({
  selector: 'app-ng-class',
  standalone: true,
  imports: [CommonModule],
  template: `
      <p [class]="strClasses" class="text-center">
          Let's see how ngClass works<br>
          <button (click)="strClasses = strClasses + 'second third'">Change the Strings</button>
          <button (click)="strClasses =''">Clear</button>
      </p>

      <hr>

      <p class="text-center" [class]="classesArray">
          Let's see how ngClass work <br>
      </p>

      <hr>

      <p class="text-center" [ngClass]="classesObj">
          Let's see how ngClass work with an object<br>
          <button (click)="flagFirst = !flagFirst;updateClassesObj()">First</button>
          <button (click)="flagSecond = !flagSecond;updateClassesObj()">Second</button>
          <button (click)="flagThird = !flagThird;updateClassesObj()">Third</button>
      </p>

      <hr>
      <p [class.text-center]="true" [class.first] = "flagFirst"
      [class.second]="flagSecond" [class.third]="flagThird">
          Let's see how ngClass work with single class <br>
          <button (click)="flagFirst = !flagFirst">First</button>
          <button (click)="flagSecond = !flagSecond">First</button>
          <button (click)="flagThird = !flagThird">First</button>
      </p>

  `,
  styles: `
    .first { color: red; }
    .second { background-color: yellow; }
    .third { border: 1px solid red; }
  `
})
export class NgClassComponent {
  strClasses = 'first second third'; // Define the classes to be applied here
  classesArray:string[] = ['first','second','third'];
  flagFirst  =true; flagSecond = false;flagThird = true;
  classesObj ={
    first:this.flagFirst,
    second : this.flagSecond,
    third : this.flagThird
  };

  updateClassesObj() {
    this.classesObj = {
      first: this.flagFirst,
      second: this.flagSecond,
      third: this.flagThird
    }
  }
}
