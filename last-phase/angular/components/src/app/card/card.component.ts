import {Component, EventEmitter, Input, Output} from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrl: './card.component.css'
})
export class CardComponent {

  constructor() {
    console.log("card component")
  }
  @Input()
  title = "Default card Title";
  @Input()
  image = "2";

  @Output()
  onRemove = new EventEmitter();

  remove(){

    this.onRemove.emit();
  }
}
