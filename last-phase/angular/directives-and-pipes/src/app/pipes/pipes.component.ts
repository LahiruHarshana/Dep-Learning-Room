import {Component, ElementRef, ViewChild} from '@angular/core';
import {
  CurrencyPipe,
  DatePipe,
  DecimalPipe,
  LowerCasePipe,
  PercentPipe,
  TitleCasePipe,
  UpperCasePipe
} from "@angular/common";

@Component({
  selector: 'app-pipes',
  standalone: true,
  imports: [
    UpperCasePipe,
    LowerCasePipe,
    TitleCasePipe,
    DatePipe,
    CurrencyPipe,
    DecimalPipe,
    PercentPipe
  ],
  template: `
      @let myVariable = 10;
    <p #pId>
      {{'pipes works!' | uppercase | lowercase  | titlecase}}
    </p>
    <h1>Toady : {{today | date:'yyyy-MMMM-dd' | uppercase }}</h1>
    <h1>Total: {{1257.2 | currency:' USD' :'symbol'}}</h1>
    <h1>Number:{{myNumber | number:'1.2-2'}}</h1>
    <h1>Customer ID : C{{customerId | number:'3.0'}}</h1>
    <h1>Percentage: {{value | percent:'1.2-2'}}</h1>
    Enter a number between 0 - 10 <br>
    <input #txt type="text">
    <button (click)="txt.focus()">Focus</button>
    <button (click)="validate()">Validate</button>
      <h1>Value: {{myVariable + 20}}</h1>
  `,
  styles: ``
})
export class PipesComponent {
  today = new Date();
  myNumber = 12222222222233.12312312312123;
  customerId = 10;
  value = 0.8;

  @ViewChild("txt")
  txtElmRef!:ElementRef<HTMLInputElement>

  validate() {
    const value = +this.txtElmRef.nativeElement.value;
    if (value >= 0 && value <= 10){
      alert("validated");
    }else{
      alert("Invalidated");
      this.txtElmRef.nativeElement.focus();
      this.txtElmRef.nativeElement.select();
    }
  }
}
