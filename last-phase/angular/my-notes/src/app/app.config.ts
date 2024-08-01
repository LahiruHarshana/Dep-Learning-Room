import { ApplicationConfig, provideZoneChangeDetection } from '@angular/core';
import { provideRouter } from '@angular/router';

import { routes } from './app.routes';
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';
import { initializeApp, provideFirebaseApp } from '@angular/fire/app';
import { getAuth, provideAuth } from '@angular/fire/auth';

export const appConfig: ApplicationConfig = {
  providers: [provideZoneChangeDetection({ eventCoalescing: true }), provideRouter(routes), provideAnimationsAsync(), provideFirebaseApp(() => initializeApp({"projectId":"my-notes-1ff49","appId":"1:69928303388:web:0746719e440342a6a7d8d9","storageBucket":"my-notes-1ff49.appspot.com","apiKey":"AIzaSyBxOUmDUAYdAWw_wJ-LqL2oBeKFXM3jln4","authDomain":"my-notes-1ff49.firebaseapp.com","messagingSenderId":"69928303388"})), provideAuth(() => getAuth())]
};
