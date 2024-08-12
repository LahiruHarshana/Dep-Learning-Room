import { Component } from '@angular/core';
import {Title} from "@angular/platform-browser";
import {AppBarComponent} from "../app-bar/app-bar.component";
import {Task, TaskService} from "../service/task.service";
import {AuthService} from "../service/auth.service";
import {MatCheckbox} from "@angular/material/checkbox";
import {MatIcon} from "@angular/material/icon";
import {MatFormField, MatLabel} from "@angular/material/form-field";
import {MatInput} from "@angular/material/input";
import {MatButton} from "@angular/material/button";
import {FormsModule} from "@angular/forms";
import {CommonModule, NgIf} from "@angular/common";
@Component({
  selector: 'app-main',
  standalone: true,
  imports: [
    AppBarComponent,
    MatCheckbox,
    MatIcon,
    MatFormField,
    MatLabel,
    MatInput,
    MatButton,
    FormsModule,
    NgIf,
    CommonModule
  ],
  templateUrl: './main.component.html',
  styleUrl: './main.component.css'
})
export class MainComponent {

  taskList: Array<Task> = [];
  description = "";

  isLoading = true;

  constructor(titleService: Title,
              private authService: AuthService,
              protected taskService: TaskService) {
    titleService.setTitle("To-do List App");
    taskService.getTasks(authService.getPrincipalEmail()!)
      .subscribe(taskList =>{
        console.log(taskList);
        this.taskList = taskList;
        this.isLoading = false;
        this.taskList.sort(
          // (task1:Task , task2:Task) => {
          //   if (task1.timestamp.toMillis() <
          //   task2.timestamp.toMillis()) return 1;
          //   else if (task1.timestamp.toMillis() ===
          //   task2.timestamp.toMillis()) return 0;
          //   else {
          //     return -1;
          //   })
          // }
        )
      });
  }


  async addTask(txt: HTMLInputElement) {
    if (!this.description.trim().length){
      txt.select();
      txt.focus();
      return;
    }else{
      try {
        await this.taskService.createNewTask(this.description,
          this.authService.getPrincipalEmail()!);
        this.description = "";
        txt.focus();
      }catch(e){
        console.log(e);
        alert("Failed to save the task, try again");
      }
    }
  }
}
