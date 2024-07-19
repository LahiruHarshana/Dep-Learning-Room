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
  `,
  styles: ``
})
export class NgStyleComponent {
strStyles = 'color:white; background-color:blue;';


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
}
