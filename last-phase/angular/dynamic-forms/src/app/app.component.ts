import {Component, inject} from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {FormBuilder, ReactiveFormsModule} from "@angular/forms";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,ReactiveFormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  private fb = inject(FormBuilder);
  form = this.fb.group({
    nic:['324323'],
    name:[],
    gender:[],
    subjects:this.fb.array([
      this.fb.group({
        name :[''],
        marks:['']
      }),
      this.fb.group({
        name :[''],
        marks:['']
      }),
      this.fb.group({
        name :[''],
        marks:['']
      }),
      this.fb.group({
        name :[''],
        marks:['']
      })
    ])
    // subjects:this.fb.array([[]]),
    // marks:this.fb.array([[]])
  });

  addNewSubject() {
    this.form.controls.subjects.push(this.fb.group({
      name : [''],
      marks: ['']
    }))
  }
}
