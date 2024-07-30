import {Component, isStandalone} from '@angular/core';
import {FormsModule, NgForm} from "@angular/forms";


type Customer = {
  id : string,
  name : string,
  contact : string
}

@Component({
  selector: 'app-customer-form',
  standalone: true,
  imports: [
    FormsModule
  ],
  templateUrl: './customer-form.component.html',
  styleUrl: './customer-form.component.css'
})
export class CustomerFormComponent {
  customer : Customer = {
    id:'',
    name:'',
    contact:''
  }
  protected readonly isStandalone = isStandalone;
  protected readonly name = name;

  saveCustomer(frmModel: NgForm) {
    frmModel.control.markAllAsTouched();
    if (frmModel.invalid){
      alert('Invalid');

    }else{
      alert('Valid');
      console.log(frmModel.value)
      frmModel.resetForm();
    }
  }
}
