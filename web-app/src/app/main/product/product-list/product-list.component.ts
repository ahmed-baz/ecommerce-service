import {Component, OnInit} from '@angular/core';
import {ProductService} from "../../service/product/product.service";
import {Product} from "../model/product";

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list-grid.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  productList: Product[] = []

  constructor(
    private productService: ProductService) {
  }

  ngOnInit(): void {
    this.listProduct()
  }


  listProduct(): void {
    this.productService.findAllProduct().subscribe(
      data => {
        this.productList = data
      }
    )
  }
}
