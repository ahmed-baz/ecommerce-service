import {Injectable} from '@angular/core';
import {CommonService} from "../common.service";
import {Product} from "../../product/model/product";
import {HttpClient} from "@angular/common/http";
import {map, Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ProductService extends CommonService<Product> {

  constructor(private _httpClient: HttpClient) {
    super(_httpClient);
  }

  findAllProduct(): Observable<Product[]> {
    return super.findAll('products/findAll/').pipe(
      map(response => response)
    );
  }
}
