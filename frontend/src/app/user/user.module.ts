import { AppRoutingModule } from './../app-routing.module';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './login/login.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RegisterComponent } from './register/register.component';

import { UserDashboardNewComponent } from './user-dashboard-new/user-dashboard-new.component';
import { UserDashboardHomeComponent } from './user-dashboard-new/user-dashboard-home/user-dashboard-home.component';
import { CustDetailsComponent } from './user-dashboard-new/cust-details/cust-details.component';
import { ApplicationDetailsComponent } from './user-dashboard-new/application-details/application-details.component';
import { ViewApplicationDetailsComponent } from './user-dashboard-new/view-application-details/view-application-details.component';
import { ViewCustomerDetailsComponent } from './user-dashboard-new/view-customer-details/view-customer-details.component';

@NgModule({
  declarations: [
    LoginComponent,
    RegisterComponent,
    UserDashboardNewComponent,
    UserDashboardHomeComponent,
    CustDetailsComponent,
    ApplicationDetailsComponent,
    ViewApplicationDetailsComponent,
    ViewCustomerDetailsComponent,
  ],
  imports: [CommonModule, ReactiveFormsModule, AppRoutingModule, FormsModule],

  exports: [ UserDashboardNewComponent],
})
export class UserModule {}
