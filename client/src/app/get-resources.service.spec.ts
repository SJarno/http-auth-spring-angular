import { TestBed } from '@angular/core/testing';

import { GetResourcesService } from './get-resources.service';

describe('GetResourcesService', () => {
  let service: GetResourcesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GetResourcesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
