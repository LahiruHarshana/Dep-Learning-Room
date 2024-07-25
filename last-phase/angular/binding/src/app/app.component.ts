import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {FirstComponent} from "./first/first.component";
import {getXHRResponse} from "rxjs/internal/ajax/getXHRResponse";
import {SecondComponent} from "./second/second.component";
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, FirstComponent, SecondComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  flag:boolean = true;
  str1:string = "Hello";
  str2:string = "world";
  inputStr:string = " Enter something"

  protected readonly getXHRResponse = getXHRResponse;
  updateInputText(e:Event){
    this.inputStr = (e.target as HTMLInputElement).value
    this.inputStr = (<HTMLInputElement>(e.target!)).value
  }
}
