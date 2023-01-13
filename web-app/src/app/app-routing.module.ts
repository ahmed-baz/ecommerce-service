import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {ProductListComponent} from "./main/product/product-list/product-list.component";

const routes: Routes = [
  {path: 'products', component: ProductListComponent},
  {path: 'searchInProducts/:keyword', component: ProductListComponent},
  {path: '', component: ProductListComponent},
  {path: '**', component: ProductListComponent},
  //{path: '', redirectTo: '/products', pathMatch: 'full'},
  //{path: '**', redirectTo: '/products', pathMatch: 'full'},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
