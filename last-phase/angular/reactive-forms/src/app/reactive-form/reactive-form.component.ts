import { Component } from '@angular/core';
import {FormControl, FormGroup, ReactiveFormsModule, Validators} from "@angular/forms";

@Component({
  selector: 'app-reactive-form',
  standalone: true,
  imports: [
    ReactiveFormsModule
  ],
  templateUrl: './reactive-form.component.html',
  styleUrl: './reactive-form.component.css'
})
export class ReactiveFormComponent {
  frm = new FormGroup({
    id: new FormControl('', [
      Validators.required,
      Validators.pattern(/^C\d{3}$/),
    ]),
    name: new FormControl('', [
      Validators.required,
      Validators.pattern(/^[A-Za-z ]+$/),
      Validators.minLength(3)
    ]),
    contact: new FormControl('', [
      Validators.required,
      Validators.pattern(/^\d{3}-\d{7}$/)
    ])
  });

  getCSSClasses(formcontrolName: string) {
    const control = this.frm.get(formcontrolName)!;
    return {
      'is-valid': control.touched && control.valid,
      'is-invalid': control.touched && control.invalid
    };
  }
  save() {
    if (this.frm.valid) {
      alert("Valid");
    } else {
      alert("Invalid")
    }
  }

}
