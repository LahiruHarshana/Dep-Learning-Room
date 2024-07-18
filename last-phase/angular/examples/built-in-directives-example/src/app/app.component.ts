import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {CommonModule, NgIf} from "@angular/common";

//Type Alias
type TodoItem={
  id:number,
  title:string,
  completed:boolean
}
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, NgIf,CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  // todoItems:{id:number,title:string,completed:boolean}[]=[];
  todoItems:TodoItem[] = [];
  loading = true;
  constructor() {
    fetch('https://jsonplaceholder.typicode.com/todos')
      .then(response=>response.json())
      .then(todoItems=> this.todoItems = todoItems)
      .finally(()=>setTimeout(()=>{
        this.loading = false;
      },2000))
  }
  title = 'built-in-directives-example';
}
