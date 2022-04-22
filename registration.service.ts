import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Register } from './registration/Register';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {

  baseURL = 'http://192.168.0.128:8080/applicants/';

  constructor(private myHttp: HttpClient) { }

  addApplicantService(newApplicant: Register) : Observable<any>{
    console.log('addApplicantService() invoking spring controller..');
    return this.myHttp.post<any>(this.baseURL + 'addApplicants', newApplicant, {responseType: 'text' as 'json'});
  }

}
