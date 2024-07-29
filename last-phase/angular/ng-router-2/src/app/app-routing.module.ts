import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {LoginComponent} from "./login/login.component";
import {MainComponent} from "./main/main.component";
import {HomeComponent} from "./home/home.component";
import {FirstComponent} from "./first/first.component";
import {SecondComponent} from "./second/second.component";
import {ThirdComponent} from "./third/third.component";
import {authGuard} from "./auth.guard";

const routes:Routes = [
  {
    path:'',
    pathMatch:'full',
    redirectTo:'/main'
  },
  {
    path:'login',
    component:LoginComponent
  },
  {
    path:'main',
    canActivate:[authGuard],
    component:MainComponent,
    children:[
      {
        path:'home',
        component : HomeComponent
      },
      {
        path:'first',
        component:FirstComponent
      },
      {
        path:'second',
        component:SecondComponent
      },
      {
        path:'third',
        component:ThirdComponent
      }
    ]
  },
  {
    path:'**',
    pathMatch:'full',
    redirectTo:'/main'
  }
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
