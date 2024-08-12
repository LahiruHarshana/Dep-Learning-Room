import { Injectable } from '@angular/core';
import {
  addDoc,
  collection,
  collectionData,
  deleteDoc,
  doc,
  Firestore,
  getDocs,
  query,
  updateDoc,
  where,
  Timestamp
} from "@angular/fire/firestore";
import { Observable } from "rxjs";

export type Task = {
  _id: string,
  description: string,
  completed: boolean | null,
  user: string,
  timestamp : Timestamp
}

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  private readonly taskCollectionRef;

  constructor(private fireStore: Firestore) {
    this.taskCollectionRef = collection(fireStore, "task");
  }

  getTasks(userEmail: string): Observable<Task[]> {
    // SELECT * FROM task WHERE user = 'suranga@ijse.lk'
    const queryGetTasks = query(this.taskCollectionRef, where("user", "==", userEmail));
    return collectionData(queryGetTasks, { idField: "_id" }) as Observable<Task[]>;
  }

  async removeTask(task: Task): Promise<void> {
    const docRef = doc(this.taskCollectionRef, task._id);
    await deleteDoc(docRef);
  }

  async updateTaskStatus(task: Task): Promise<void> {
    const docRef = doc(this.taskCollectionRef, task._id);
    await updateDoc(docRef, {
      completed: !task.completed
    });
  }

  async createNewTask(description: string, user: string): Promise<void> {
    const newTask = {
      description,
      user,
      completed: false,
      timeStamp: Timestamp.now()
    };
    await addDoc(this.taskCollectionRef, newTask);
  }
}
