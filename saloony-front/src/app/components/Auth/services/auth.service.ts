import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private readonly GATEWAY_URL = 'http://127.0.0.1:8080';
//hello
  constructor(private http: HttpClient) { }

  login(userEmail: string, userPassword: string) {
    return this.http.post(
      `${this.GATEWAY_URL}/api/auth/login`,
      { userEmail, userPassword }
    );
  }
}
