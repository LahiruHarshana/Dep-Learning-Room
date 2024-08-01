import {Component, ElementRef, HostListener, ViewChild} from '@angular/core';
import {MatIconModule} from "@angular/material/icon";
import {AuthService} from "../service/auth.service";
import {MatButtonModule} from "@angular/material/button";
import {CommonModule} from "@angular/common";
@Component({
  selector: 'app-app-bar',
  standalone: true,
  imports: [
    MatIconModule,
    MatButtonModule,
    CommonModule
  ],
  templateUrl: './app-bar.component.html',
  styleUrl: './app-bar.component.css'
})
export class AppBarComponent {

  isMenuVisible = false;

  @ViewChild("profilePic")
  private profilePicRef!: ElementRef<HTMLDivElement>;

  constructor(protected authService: AuthService) {
  }
  ngAfterViewInit(): void {
    this.profilePicRef.nativeElement.style.backgroundImage = `url('${this.authService.getPrinciple()?.photoURL}')`;
  }
  @HostListener("window:click")
  onDocumentClick(){
    this.isMenuVisible = false;
  }
}
