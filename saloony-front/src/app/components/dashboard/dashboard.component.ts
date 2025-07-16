import { Component } from '@angular/core';
import {UserListComponent} from "../user-list/user-list.component";

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {
  isCollapsed = false;
  activeItem = 1;

  menuItems = [
    { id: 1, title: 'Dashboard', icon: 'fas fa-home' },
    { id: 2, title: 'SALONS', icon: 'fas fa-home' },
    { id: 3, title: 'Rendez Vous', icon: 'fas fa-box-open' },
    { id: 4, title: 'Disponibilités', icon: 'fas fa-shopping-cart' },
    { id: 5, title: 'Avis', icon: 'fas fa-cog' }
  ];

  selectItem(itemId: number) {
    this.activeItem = itemId;
    // Ajoutez votre logique de navigation ici
  }

  toggleSidebar() {
    this.isCollapsed = !this.isCollapsed;
  }

}
