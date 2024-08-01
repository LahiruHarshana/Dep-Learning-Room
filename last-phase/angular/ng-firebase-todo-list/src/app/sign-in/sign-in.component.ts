import { Component } from '@angular/core';
import {MatButtonModule} from "@angular/material/button";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatCardModule} from "@angular/material/card";
import {MatInputModule} from "@angular/material/input";
import {Auth, getAuth, GoogleAuthProvider, signInWithPopup} from "@angular/fire/auth"
import {Router} from "@angular/router";
import {Title} from "@angular/platform-browser";
import {AuthService} from "../service/auth.service";
import {MatIcon, MatIconModule} from "@angular/material/icon";

@Component({
  selector: 'app-sign-in',
  standalone: true,
  imports: [
    MatButtonModule,
    MatFormFieldModule,
    MatCardModule,
    MatInputModule,
    MatIconModule
  ],
  templateUrl: './sign-in.component.html',
  styleUrl: './sign-in.component.css'
})
export class SignInComponent {

  constructor( protected authService : AuthService,protected auth:Auth,titleService:Title) {
    titleService.setTitle("Sign In - To-do List App");
  }
}
