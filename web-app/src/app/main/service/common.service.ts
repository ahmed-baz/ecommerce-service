import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class CommonService<VO> {

  private baseURL = 'http://127.0.0.1:9999';

  constructor(private httpClient: HttpClient) {
  }


  findById(id: number): Observable<VO> {
    let vo: any
    return vo;
  }

  findAll(endpoint: string): Observable<VO[]> {
    return this.httpClient.get<VO[]>(`${this.baseURL}/${endpoint}`);
  }

  add(vo: VO): Observable<VO> {
    // @ts-ignore
    return vo;
  }

  update(vo: VO): Observable<VO> {
    // @ts-ignore
    return vo;
  }

  remove(id: number): void {
  }

}
