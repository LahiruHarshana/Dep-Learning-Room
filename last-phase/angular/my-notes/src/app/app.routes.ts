import { Routes } from '@angular/router';
import {SignInComponent} from "./sign-in/sign-in.component";
import {canActivate} from "@angular/fire/auth-guard";
import {authGuard} from "./auth.guard";
import {MainComponent} from "./main/main.component";

export const routes: Routes = [
  {
    path:'sign-in',
    component:SignInComponent
  },
  {
    path:'',
    canActivate:[authGuard],
    component:MainComponent
  }
];
