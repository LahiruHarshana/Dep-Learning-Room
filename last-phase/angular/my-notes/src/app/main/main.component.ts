import { Component } from '@angular/core';
import {AppBarComponent} from "../app-bar/app-bar.component";

@Component({
  selector: 'app-main',
  standalone: true,
  imports: [
    AppBarComponent
  ],
  templateUrl: './main.component.html',
  styleUrl: './main.component.css'
})
export class MainComponent {

}
