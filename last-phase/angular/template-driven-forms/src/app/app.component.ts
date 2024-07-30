import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  myInput = '';

  isInputValid():boolean {
    return /^[A-Za-z0-9 ]+$/.test(this.myInput)
  }

  validate() {
    if (this.isInputValid()){
      alert("Validated");
    }else {
      alert("Invalidated")
    }
  }
}
