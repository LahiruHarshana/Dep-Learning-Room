import { Injectable } from '@angular/core';
import {collection, doc, Firestore, getDocs} from "@angular/fire/firestore";

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  constructor(private fireStore:Firestore) {
    const taskCollectionRef = collection(fireStore,"task");
    getDocs(taskCollectionRef).then(querySnapshot =>{
      querySnapshot.forEach(doc =>{
        console.log(doc.data());
      })
    })
  }
}
