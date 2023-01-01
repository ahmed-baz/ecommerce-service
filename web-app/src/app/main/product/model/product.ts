import {Category} from "./category";

export class Product {
  public id: number;
  public category: Category;
  public sku: string;
  public name: string;
  public description: string;
  public unitPrice: number;
  public imageUrl: string;
  public active: boolean;
  public unitsInStock: number;
  public dateCreated: Date;
  public lastUpdated: Date;

  constructor() {
  }
}
