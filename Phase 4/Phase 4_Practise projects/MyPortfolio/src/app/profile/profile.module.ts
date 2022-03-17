import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ProfileComponent } from './profile.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { IntroComponent } from './intro/intro.component';
import { AboutComponent } from './about/about.component';
import { SkillsComponent } from './skills/skills.component';

import { ContactComponent } from './contact/contact.component';
import { EducationComponent } from './education/education.component';


import { SplitPipe } from './split.pipe';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
   
  ],
  declarations: [
    ProfileComponent,
    HeaderComponent,
    FooterComponent,
    IntroComponent,
    AboutComponent,
    SkillsComponent,
    ContactComponent,
    EducationComponent,
 
    SplitPipe
  ],
 
})
export class ProfileModule { }
