import { Component } from '@angular/core';
import {MatButton, MatButtonModule} from "@angular/material/button";
import {AuthService} from "../service/auth.service";
import {Auth} from "@angular/fire/auth";
import {Title} from "@angular/platform-browser";

@Component({
  selector: 'app-sign-in',
  standalone: true,
  imports: [
    MatButtonModule
  ],
  templateUrl: './sign-in.component.html',
  styleUrl: './sign-in.component.css'
})
export class SignInComponent {
  constructor( protected authService : AuthService,protected auth:Auth,titleService:Title) {
    titleService.setTitle("Sign In - To-do List App");
  }
}
