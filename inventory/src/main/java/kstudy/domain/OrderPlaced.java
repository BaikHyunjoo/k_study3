package kstudy.domain;

import java.util.*;
import kstudy.domain.*;
import kstudy.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String customerid;
    private String productid;
    private Integer qty;
    private String status;
}
