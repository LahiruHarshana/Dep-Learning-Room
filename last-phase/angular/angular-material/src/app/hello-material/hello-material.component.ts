import { Component } from '@angular/core';
import {MatFormField, MatHint, MatLabel} from "@angular/material/form-field";
import {MatIcon} from "@angular/material/icon";
import {MatInput} from "@angular/material/input";
import {MatFabAnchor, MatFabButton} from "@angular/material/button";
import {RouterLink} from "@angular/router";
@Component({
  selector: 'app-hello-material',
  standalone: true,
  imports: [
    MatFormField,
    MatIcon,
    MatInput,
    MatLabel,
    MatHint,
    MatFabButton,
    MatFabAnchor,
    RouterLink,


  ],
  templateUrl: './hello-material.component.html',
  styleUrl: './hello-material.component.css'
})
export class HelloMaterialComponent {

}
