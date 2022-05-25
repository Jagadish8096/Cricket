import { Component, OnInit } from '@angular/core';
import {FormsModule} from '@angular/forms'
import { Router } from '@angular/router';
import { RegistrationServiceService } from '../registration.service';
import { UserReg } from '../user-reg';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit 
{
  user:UserReg=new UserReg();
  msg = "";
  constructor(private service:RegistrationServiceService,private router :Router) { }

  ngOnInit(): void 
  {
  }
  login(){
   this.service.loginfromremote(this.user).subscribe
  (
  data=>{console.warn("Successfully Logined"),this.router.navigate(['/homepage'])}
  ,error=>{console.warn("Invalid account"),this.msg="Enter valid details"}
  )

  
  
}
gotoregister()
{
    this.router.navigate(['/registration']);
}
}
