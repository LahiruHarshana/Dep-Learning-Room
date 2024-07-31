import {
  AfterContentChecked,
  AfterContentInit, AfterViewChecked,
  AfterViewInit,
  Component, DoCheck,
  ElementRef,
  Input,
  OnChanges,
  OnInit,
  SimpleChanges, ViewChild
} from '@angular/core';
import * as console from "console";
import * as console from "console";
import * as console from "console";
import * as console from "console";
import * as console from "console";
import * as console from "console";
@Component({
  selector: 'app-child',
  standalone: true,
  imports: [],
  templateUrl: './child.component.html',
  styleUrl: './child.component.css'
})
export class ChildComponent implements OnChanges,OnInit,AfterContentInit,AfterViewInit,DoCheck,AfterContentChecked,AfterViewChecked{
  static {
    console.log("0 . Static Initializer ");
  }
  @Input()
  myInputProperty:null|string = null;
  @ViewChild("h1")
  contentH1ElmRef:ElementRef;
  @ViewChild("h1")
  viewH1ElmRef! : ElementRef;
  constructor() {
    console.log("1 . Constructor")
  }

  ngOnChanges(changes: SimpleChanges): void {
    console.log("2. OnChange",this.myInputProperty)
  }

  ngOnInit(): void {
    console.log("3. OnInit")
  }

  ngAfterContentInit(): void {
    console.log("5.AfterContentInit")
  }

  ngAfterViewInit(): void {
    console.log("6.AfterViewInit")
  }
  ngDoCheck(): void {
    console.log("4.DoCheck",
      this.contentH1ElmRef,this.viewH1ElmRef);
    console.log("Content:",
      this.contentH1ElmRef?.nativeElement.innerText);
  }

  ngAfterContentChecked(): void {
  }
  ngAfterViewChecked(): void {
  }

  childText = Math.random().toFixed(2)+"";
  updateChildText() {
    this.childText = Math.random().toFixed(2)+"";
  }
}
