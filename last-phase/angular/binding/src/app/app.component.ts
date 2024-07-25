import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {FirstComponent} from "./first/first.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, FirstComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  flag:boolean = true;
  str1:string = "Hello";
  str2:string = "world";
  protected readonly alert = alert;
}
