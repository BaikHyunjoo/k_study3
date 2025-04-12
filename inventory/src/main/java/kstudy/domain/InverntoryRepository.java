package kstudy.domain;

import kstudy.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "inverntories",
    path = "inverntories"
)
public interface InverntoryRepository
    extends PagingAndSortingRepository<Inverntory, Long> {}
