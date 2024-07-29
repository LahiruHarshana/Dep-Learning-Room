import {CanActivateFn, Router} from '@angular/router';
import {log} from "@angular-devkit/build-angular/src/builders/ssr-dev-server";
import {inject} from "@angular/core";

export const authGuard: CanActivateFn = (route, state) => {
  const routerService = inject(Router);
  const logged = localStorage.getItem("logged");
  if (logged){
    return true;
  }else{
    return routerService.parseUrl('/login');
  }
};
