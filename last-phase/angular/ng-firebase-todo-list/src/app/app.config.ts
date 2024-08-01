import { ApplicationConfig, provideZoneChangeDetection } from '@angular/core';
import { provideRouter } from '@angular/router';

import { routes } from './app.routes';
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';
import { initializeApp, provideFirebaseApp } from '@angular/fire/app';
import { getAuth, provideAuth } from '@angular/fire/auth';

export const appConfig: ApplicationConfig = {
  providers: [provideZoneChangeDetection({ eventCoalescing: true }), provideRouter(routes), provideAnimationsAsync(), provideFirebaseApp(() => initializeApp(
    {"projectId":"ng-firebase-todo-list-8c9a1",
      "appId":"1:322297135233:web:395bf829ce4ea34e4b8d80",
      "storageBucket":"ng-firebase-todo-list-8c9a1.appspot.com",
      "apiKey":"AIzaSyDOmf-5Rn_v2rS8cipAMViTuPO6eGqEUTI",
      "authDomain":"ng-firebase-todo-list-8c9a1.firebaseapp.com",
      "messagingSenderId":"322297135233"
    })), provideAuth(() => getAuth())]
};
