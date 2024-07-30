import { Component } from '@angular/core';
import {FormsModule, NgModel} from "@angular/forms";
@Component({
  selector: 'app-template-form',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './template-form.component.html',
  styleUrl: './template-form.component.css'
})
export class TemplateFormComponent {
  myInput = '';

  validate(inputNgModel: NgModel) {
    inputNgModel.control.markAsDirty();
    if(inputNgModel.invalid){
      alert("Invalid");
    }else{
      alert("Valid");
    }
  }
}
