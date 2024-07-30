import {Component, isStandalone} from '@angular/core';
import {FormsModule} from "@angular/forms";


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
    id:'C001',
    name:'Tharindu',
    contact:'234-3421341'
  }
  protected readonly isStandalone = isStandalone;
}
