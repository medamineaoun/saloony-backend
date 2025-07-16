import {Component, OnInit} from '@angular/core';
import {AuthService} from "../Auth/services/auth.service";

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit{
  salonsList:any
  constructor(private authService:AuthService) {
  }

  ngOnInit(){
    this.getAllSalons();

  }
getAllSalons(){
    this.authService.getAllSalons().subscribe((data)=>{
      this.salonsList = data;
    })
}



}
