import {Component, ContentChild, ElementRef, ViewChild} from '@angular/core';

@Component({
  selector: 'app-first',
  standalone: true,
  imports: [],
  templateUrl: './first.component.html',
  styleUrl: './first.component.css'
})
export class FirstComponent {
  @ViewChild("h2")
  viewH2ElmRef! : ElementRef;
  @ContentChild("h2")
  contentH2ElmRef! : ElementRef;
}
