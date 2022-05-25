import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { UserReg } from './user-reg';
import {HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class RegistrationServiceService {

  constructor(private httpclient : HttpClient) { }
  public loginfromremote(user :UserReg):Observable<any>{
  return this.httpclient.post<any>('http://localhost:8081/users/login',user)
  }
  public registerfromremote(user :UserReg):Observable<any>{
    return this.httpclient.post<any>('http://localhost:8081/users/register',user)
    }
}
