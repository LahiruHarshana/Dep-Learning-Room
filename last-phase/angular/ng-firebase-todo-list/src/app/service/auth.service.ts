import { Injectable } from '@angular/core';
import {Auth, authState, GoogleAuthProvider, signInWithPopup,GithubAuthProvider, signOut, User} from "@angular/fire/auth";
import {Router} from "@angular/router";

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private initialized=false;
  private user: User | null = null;


  constructor(private auth:Auth , routerService:Router) {
    authState(auth).subscribe(
      (user:User|null)=>{
        this.user=user;
        this.initialized = true;
        if(user){
          routerService.navigateByUrl("/");
        }else{
          routerService.navigateByUrl("/sign-in")
        }
      });
  }

  isInitialized(){
    return this.initialized;
  }
  getPrinciple() {
    return this.user;
  }
  signIn(){
    signInWithPopup(this.auth,new GoogleAuthProvider());
  }
  signOut(){
    signOut(this.auth);
  }

  signInWithGithub(){
    signInWithPopup(this.auth,new GithubAuthProvider());
  }

  signInWithGoogle(){
    signInWithPopup(this.auth,new GoogleAuthProvider());
  }

}
