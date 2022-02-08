import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from "@angular/common/http";
import { FooterComponent } from './footer/footer.component';
import { InfoFlowerComponent } from './info-flower/info-flower.component';

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    InfoFlowerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
