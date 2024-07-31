import {Component, inject} from '@angular/core';
import {MatFormField, MatLabel} from "@angular/material/form-field";
import {MatInput} from "@angular/material/input";
import {MatButton} from "@angular/material/button";
import {Router, RouterLink} from "@angular/router";

@Component({
  selector: 'app-sign-in',
  standalone: true,
  imports: [
    MatFormField,
    MatLabel,
    MatInput,
    MatButton,
    RouterLink
  ],
  templateUrl: './sign-in.component.html',
  styleUrl: './sign-in.component.css'
})
export class SignInComponent {


  private routerService : Router = inject(Router);
  signIn(username: string, password: string) {
    if (username === 'admin' && password==='admin'){
      this.routerService.parseUrl('/dashboard')
    }
  }
}
