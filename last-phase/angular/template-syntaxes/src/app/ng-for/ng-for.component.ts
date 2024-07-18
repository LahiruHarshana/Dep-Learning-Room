import { Component } from '@angular/core';
import {CommonModule} from "@angular/common";

@Component({
  selector: 'app-ng-for',
  standalone: true,
  imports: [CommonModule],
  template: `
      <ul>
          <li *ngFor="let item of array1; let i = index">
               {{i}}</li>
      </ul>
      <hr>
      <ul>
          <li *ngFor="let item of array1;let isOdd = odd;
          let isFirst = first;let isLast=last;">
              {{item}} <span *ngIf="isFirst" class="text-danger"> FIRST</span>
                       <span *ngIf="isLast" class="text-danger"> LAST</span>
                       <span *ngIf="isOdd">- ODD</span>
                       <span *ngIf="!isOdd">- EVEN</span>
          </li>
      </ul>

      <table class="table table-bordered table-hover">
          <thead>
          <tr>
              <th class="text-center">ID</th>
              <th>NAME</th>
              <th>ADDRESS</th>
              <th></th>
          </tr>
          </thead>
          <tbody>
          <tr *ngFor="let customer of customers">
              <td class="text-center">{{customer.id}}</td>
              <td>{{customer.name}}</td>
              <td>{{customer.address}}</td>
              <td class="text-center"><i class="bi bi-trash"></i></td>
          </tr>
          </tbody>
          <tfoot *ngIf="!customers.length">
          <tr>
              <td colspan="3" class="text-center">
                  No Customer Record Found
              </td>
          </tr>
          </tfoot>
      </table>
  `,
  styles: ``
})
export class NgForComponent {
array1 = ['Kasun','Nuwan','Supun','Lahiru','Chamaru','Thisaru']
  customers:{id:string, name:string, address:string}[] = [
    {id:"C001",name:"Lahiru Samopath",address:"Galle"},
    {id:"C002",name:"Lahiru harshana",address:"Matara"},
    {id:"C003",name:"Saman harshana",address:"Gampaha"},
    {id:"C004",name:"Menaka Kasun",address:"panadura"},
    {id:"C005",name:"Kakshan harshana",address:"Matara"}
  ];
}
