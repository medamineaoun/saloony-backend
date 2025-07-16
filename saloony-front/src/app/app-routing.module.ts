import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {LoginComponent} from "./components/Auth/login/login.component";
import {SignUpComponent} from "./components/Auth/sign-up/sign-up.component";
import {DashboardComponent} from "./components/dashboard/dashboard.component";
import {UserListComponent} from "./components/user-list/user-list.component";

export const routes: Routes = [
  {
    path: '',
    redirectTo: 'login',
    pathMatch: 'full'
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'signup',
    component: SignUpComponent
  },
  {
    path: 'dash',
    component: DashboardComponent,
    children:[
      {path:'salons',component:UserListComponent}
    ]
  },
  //{ path: 'users', component: UserListComponent },
  // Add other routes here
  {
    path: '**',
    redirectTo: 'login' // Redirect unknown paths to login
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
