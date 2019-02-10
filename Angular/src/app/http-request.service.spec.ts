import { TestBed } from '@angular/core/testing';

import { HttpRequestService } from './http-request.service';

describe('HttpRequestService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: HttpRequestService = TestBed.get(HttpRequestService);
    expect(service).toBeTruthy();
  });
});
