import { Component } from '@angular/core';
import {Title} from "@angular/platform-browser";
import {AppBarComponent} from "../app-bar/app-bar.component";
import {TaskService} from "../service/task.service";

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
  constructor(titleService:Title,private taskService:TaskService) {
    titleService.setTitle("To-do List App")
  }
}
