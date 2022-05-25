import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserReg } from '../user-reg';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {

  user:UserReg=new UserReg();
  msg = "";

  constructor(private router :Router) { }

  ngOnInit(): void {
  }
  gotohome1(){this.router.navigate(['/createplayer'])}
  gotohome2(){this.router.navigate(['/createteam'])}
  gotohome3(){this.router.navigate(['/showteam'])}
  gotohome4(){this.router.navigate(['/showplayer'])}
  gotohome5(){this.router.navigate(['/login'])}
}
