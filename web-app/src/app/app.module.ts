import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {ProductListComponent} from './main/product/product-list/product-list.component';
import {HttpClientModule} from "@angular/common/http";
import {ProductService} from "./main/service/product/product.service";
import {CommonService} from "./main/service/common.service";

@NgModule({
  declarations: [
    AppComponent,
    ProductListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [CommonService, ProductService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
