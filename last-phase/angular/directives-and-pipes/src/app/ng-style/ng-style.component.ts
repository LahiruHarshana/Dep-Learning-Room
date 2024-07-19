import { Component } from '@angular/core';
import {CommonModule} from "@angular/common";

@Component({
  selector: 'app-ng-style',
  standalone: true,
  imports: [CommonModule],
  template: `
    <p class="text-center"
       style="border: 10px solid black"
       [style]="strStyles">
        Let's see how ngStyle<br>
        <button (click)="updateStyle()">Update Style</button>
        <button (click)="resetStyles()">Reset Style</button>
    </p>

    <hr>

    <p class="text-center" [style]="styleObject">
        Let's see how ngStyle works with an object <br>
        <button (click)="colorFlag = !colorFlag; updateStyleObg()">Color</button>
        <button (click)="bgColorFlag = !bgColorFlag; updateStyleObg()">Background Color</button>
    </p>

    <hr>

    <p [style.fontSize]="(100+20) + 'px'"
        [style.background-color]="bgColorFlag ? 'yellow':'green'">
        Let's see how to deal with a single style <br>
        <button (click)="bgColorFlag = !bgColorFlag">Background Color</button>
    </p>

    <hr>

    <p style="{{strStyles}}">Don't do this</p>
    <h1 [attr.title]="strTooltip">Hover me</h1>
    <button (click)="changeTooltipText()">Change Tooltip Text</button>
    <h1 [attr.class] = "'first'">Do not do this</h1>

    <hr>
<!--    <p ngNonBindable>-->
<!--        {{str}}-->
<!--        <button>{{str}}</button>-->
<!--    </p>-->
  `,
  styles: `

  .first{
  color:red;
  }
  .second{
  border:10px solid black;
  }
  `
})
export class NgStyleComponent {
  str = "hello";
strStyles = 'color:white; background-color:blue;';
strTooltip = 'Hello Tooltip Text';

colorFlag = true;
bgColorFlag = false;

styleObject={
  color:this.colorFlag ? 'red':'initial',
  backgroundColor:this.bgColorFlag ?'yellow':'initial'
}
updateStyleObg(){
  this.styleObject={
    color:this.colorFlag ? 'red':'initial',
    backgroundColor:this.bgColorFlag ?'yellow':'initial'
  }
}

  updateStyle() {
    this.strStyles = 'border:2px solid black';
  }

  resetStyles() {
    this.strStyles = 'color :white; background-color:blue'
  }

  changeTooltipText() {
  this.strTooltip = 'I changed the text';
  }
}
