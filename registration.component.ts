import { Component, OnInit } from '@angular/core';
import { RegistrationService } from '../registration.service';
import { Register } from './Register';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  RegisterObj: Register = new Register();
  errMsg1: string="";
  errMsg2: string="";
  regexEmail = new RegExp(/[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$/);
  regexPan = new RegExp(/^([A-Z]){3}(P){1}([A-Z]){1}([0-9]){4}([A-Z]){1}?$/);
  errEmail: string="";
  errPan: string="";
  msg: any = "";

  registerArray: Register[] = [];
  constructor(private regServ: RegistrationService) { }

  ngOnInit(): void {
  }

  MinMobile()
  {
    if(this.RegisterObj.ApplicantMobileNumber.length!=10)
    this.errMsg1="Please enter 10 digit Mobile Number";
    else
    this.errMsg1="";
  }

  MinAadhar()
  {
    if(this.RegisterObj.ApplicantAadhar.length!=12)
    this.errMsg2="Please enter valid Aadhar Number";
    else
    this.errMsg2="";
  }

  validateEmail(){
    if(this.regexEmail.test(this.RegisterObj.ApplicantEmail))
      this.errEmail="";
    else
      this.errEmail="Please enter valid email address";

  }

  validatePan(){
    if(this.regexPan.test(this.RegisterObj.ApplicantPan))
      this.errPan="";
    else
      this.errPan="Please enter valid email address";

  }

  applyForBankAccount() {
    console.log('applyForBankAccount() invoking addApplicantService()..');
    this.RegisterObj.ApplicantApplicationStatus = "Applied";
    
    this.regServ.addApplicantService(this.RegisterObj).subscribe(
      (data:any)=>
      {
        this.msg = data;
        console.log(this.msg);
      },
      (err)=>
      {
        console.log(err);
      }
    )
  }
 
}
