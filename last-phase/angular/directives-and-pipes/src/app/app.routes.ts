import { Routes } from '@angular/router';
import {NgClassComponent} from "./ng-class/ng-class.component";
import {NgStyleComponent} from "./ng-style/ng-style.component";
import {PipesComponent} from "./pipes/pipes.component";

export const routes: Routes = [
  {
    path:'ng-class',
    component:NgClassComponent
  },
  {
    path:'ng-style',
    component:NgStyleComponent
  },
  {
    path:'pipe',
    component:PipesComponent
  }
];
