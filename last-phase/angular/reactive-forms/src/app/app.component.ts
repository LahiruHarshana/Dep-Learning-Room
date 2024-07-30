import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {FormControl, ReactiveFormsModule, Validators} from "@angular/forms";
import {ReactiveFormComponent} from "./reactive-form/reactive-form.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, ReactiveFormsModule, ReactiveFormComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  myInputController =new FormControl('Direct Entry Program 12',
    [Validators.required,
    Validators.pattern(/^[A-Za-z0-9 ]+$/)]);

  validate() {
    if (this.myInputController.valid){
      alert("Valid");
    }else{
      alert("Invalid");
    }
  }
}
