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
          <tr *ngFor="let customer of customers;
            trackBy: trackCustomerFn">
              <td class="text-center">{{ customer.id }}</td>
              <td>{{ customer.name }}</td>
              <td>{{ customer.address }}</td>
              <td class="text-center">
                  <i (click)="deleteCustomer(customer.id)"
                     class="bi bi-trash3-fill"></i>
              </td>
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

      <button (click)="updateItems()" class="btn btn-sm btn-danger">Updated</button>
      <ul>
          <li class="p-2" *ngFor="let item of items;trackBy:trackItemFn">{{item}}</li>
      </ul>

      <hr>

      <button (click)="updateItems2()" class="btn btn-sm btn-danger">Update</button>
      <ul >
          <li class="p-2" *ngFor="let item of items2;trackBy:trackItemFn">{{item.value}}</li>
      </ul>

      <hr>
      <h2 class="text-center">Angular 18+</h2>

      @for (customer of customers; track customer.id){
          <li class="p-2 border-top ">{{customer.id}} - {{customer.name}} - {{customer.address}}</li>
      } @empty {
          No Customer Found
      }
  `,
  styles: [`

  `]
})
export class NgForComponent {

  items = ['First','Second','Third','Fourth','Fifth']
  items2 = [
    {value:'First',name:'Kasun'},
    {value:'Second',name:'Saman'},
    {value:'Third',name:'Lahiru'},
    {value:'Fourth',name:'Sahan'},
    {value:'Fifth',name:'Akasa'}
  ]
  array1 = ['Kasun','Nuwan','Supun','Lahiru','Chamaru','Thisaru']
  customers:{id:string, name:string, address:string}[] = [];
  trackCustomerFn(index: number, customer: { id: String, name: String, address: String }) {
    return customer.id;
  }

  deleteCustomer(customerId: String) {
    this.customers = this.customers.filter(c => c.id!= customerId);
  }

  updateItems(){
    this.items.unshift('New Item')
  }

  trackItemFn(index:number,item:any){
    return ;
  }

  updateItems2() {
    this.items2 = [
      {value:'First',name:'Kasun'},
      {value:'Second',name:'Saman'},
      {value:'Third',name:'Akasa'},
      {value:'Fourth',name:'Sahan'},
      {value:'Fifth',name:'Lahiru'}
    ]
  }
}
