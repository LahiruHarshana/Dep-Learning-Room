import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {CommonModule} from "@angular/common";

//Type Alias
type TodoItem = {
  id: number,
  title: String,
  completed: boolean,
  userId: number
}

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})

export class AppComponent {
  findUser(userId:number){
    return this.users.find(user => user.userID === userId);
  }
  users=[
    {userID:1, name:'Kasun'},
    {userID:2, name:'Piyumal'},
    {userID:3, name:'Nuwan'},
    {userID:4, name:'Supun'},
    {userID:5, name:'Dasun'},
  ]

  todoItems: TodoItem[] = [];
  loading = true;
  constructor() {
    fetch('https://jsonplaceholder.typicode.com/todos')
      .then(response => response.json())
      .then(todoItems => this.todoItems = todoItems)
      .finally(() => setTimeout(() =>{
        this.loading = false;
      }, 2000));
  }
  trackItemFn(index:number, item:TodoItem): number{
    return item.id;
  }
}
