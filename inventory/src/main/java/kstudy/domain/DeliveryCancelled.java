package kstudy.domain;

import java.util.*;
import kstudy.domain.*;
import kstudy.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class DeliveryCancelled extends AbstractEvent {

    private Long id;
}
