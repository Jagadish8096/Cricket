
import { Component, OnInit } from '@angular/core';
import {FormsModule} from '@angular/forms'
import { Router } from '@angular/router';
import { RegistrationServiceService } from '../registration.service';
import { UserReg } from '../user-reg';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  user:UserReg=new UserReg();
  msg = "";

  constructor(private service:RegistrationServiceService,private router :Router) { }

  ngOnInit(): void {
  }
  register(){
    this.service.registerfromremote(this.user).subscribe
    (
    data=>{console.warn("Successfully Registered"),this.router.navigate(['/login'])}
    ,error=>{console.warn("Invalid account"),this.msg="Enter valid details"}
    )

  }
  gotologin()
  {
    this.router.navigate(['/login']);
  }
}
