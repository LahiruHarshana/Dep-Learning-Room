import {CanActivateFn, Router, UrlTree} from '@angular/router';
import {inject} from "@angular/core";
import {AuthService} from "./service/auth.service";

export const authGuard: CanActivateFn = (route) => {
  const authService = inject(AuthService);
  const routerService = inject(Router);

  if (authService.getPrinciple()){
    return true;
  }else{
    return routerService.parseUrl("/sign-in");
  }

};
