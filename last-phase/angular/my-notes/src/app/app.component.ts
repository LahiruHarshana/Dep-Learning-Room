import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {SignInComponent} from "./sign-in/sign-in.component";
import {authGuard} from "./auth.guard";
import {AuthService} from "./service/auth.service";
import {Title} from "@angular/platform-browser";
import {LoaderComponent} from "./loader/loader.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, SignInComponent, LoaderComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  constructor(protected authService:AuthService,
              titleService:Title) {
    titleService.setTitle("To-do List App");
  }
}
