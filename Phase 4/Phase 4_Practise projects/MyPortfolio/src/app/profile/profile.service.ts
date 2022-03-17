import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ProfileService {
  about: any;
  //baseUrl = environment.baseUrl;

  constructor(
    private http: HttpClient
  ) { }

  
  skillsData: any = [
    {
      'id': '1',
      'skill': 'ANGULAR 2+',
      'progress': '85%'
    },
    {
      'id': '2',
      'skill': 'NODE JS',
      'progress': '80%'
    },
    {
      'id': '3',
      'skill': 'JAVASCRIPT JQUERY',
      'progress': '80%'
    },
    {
      'id': '4',
      'skill': 'SQL , MYSQL,MONOGO',
      'progress': '75%'
    },
    {
      'id': '5',
      'skill': 'HTML5,CSS3',
      'progress': '75%'
    },
    {
      'id': '6',
      'skill': 'PYTHON,JAVA',
      'progress': '70%'
    }
  ];


  educationData: any = [
    {
      'id': '1',
      'from_to_year': '2018 - 2021',
      'education': 'B-Tech',
      'stream': 'ECE',
      'info': `Aditya College of engineering is JNTUK Affiliated and in AP
Completed B-Tech in ECE with 9.54 CGPA.  
Won the Best Student Award 3 times for excellent Academic records at College. 
Maintained above 9.1 spi in every semester of college academic .`,
      'institution': 'Aditya college of Engineering, Surampalem'
    },
    {
      'id': '2',
      'from_to_year': '2015 - 2018',
      'education': 'Diploma',
      'stream': 'ECE',
      'institution': 'Aditya Poytechnic college',
      'info': `
Completed my Diploma with 70%.`
    },
    {
      'id': '3',
      'from_to_year': '2014 - 2015',
      'education': 'Secondary  School',
      'stream': 'Science and Mathematics',
      'institution': 'SRKP public school',
      'info': `The Secondary aims at Maths , English , Science, Social Science, Litrature and Languages.
Completed my Secondary school with 92%.`
    }
  ];
  


  
  // contactus(data: any): Observable<any> {
  //   return this.http.post(this.baseUrl + 'contact', data);
  // }

  skills(): Observable<any> {
    // return this.http.get(this.baseUrl + 'skills');
    return this.skillsData;
  }

 
  education(): Observable<any> {
    // return this.http.get(this.baseUrl + 'education');
    return this.educationData;
  }

  
}
