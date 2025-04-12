package kstudy.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import kstudy.InventoryApplication;
import kstudy.domain.InventoryDecreased;
import kstudy.domain.InventoryIncreased;
import lombok.Data;

@Entity
@Table(name = "Inverntory_table")
@Data
//<<< DDD / Aggregate Root
public class Inverntory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String stockid;

    @PostPersist
    public void onPostPersist() {
        InventoryDecreased inventoryDecreased = new InventoryDecreased(this);
        inventoryDecreased.publishAfterCommit();

        InventoryIncreased inventoryIncreased = new InventoryIncreased(this);
        inventoryIncreased.publishAfterCommit();
    }

    public static InverntoryRepository repository() {
        InverntoryRepository inverntoryRepository = InventoryApplication.applicationContext.getBean(
            InverntoryRepository.class
        );
        return inverntoryRepository;
    }

    //<<< Clean Arch / Port Method
    public static void decreaseInventory(DeliveryStarted deliveryStarted) {
        //implement business logic here:

        /** Example 1:  new item 
        Inverntory inverntory = new Inverntory();
        repository().save(inverntory);

        */

        /** Example 2:  finding and process
        

        repository().findById(deliveryStarted.get???()).ifPresent(inverntory->{
            
            inverntory // do something
            repository().save(inverntory);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void decreaseInventory(DeliveryStarted deliveryStarted) {
        //implement business logic here:

        /** Example 1:  new item 
        Inverntory inverntory = new Inverntory();
        repository().save(inverntory);

        */

        /** Example 2:  finding and process
        

        repository().findById(deliveryStarted.get???()).ifPresent(inverntory->{
            
            inverntory // do something
            repository().save(inverntory);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void decreaseInventory(OrderPlaced orderPlaced) {
        //implement business logic here:

        /** Example 1:  new item 
        Inverntory inverntory = new Inverntory();
        repository().save(inverntory);

        */

        /** Example 2:  finding and process
        

        repository().findById(orderPlaced.get???()).ifPresent(inverntory->{
            
            inverntory // do something
            repository().save(inverntory);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void increaseInventory(DeliveryCancelled deliveryCancelled) {
        //implement business logic here:

        /** Example 1:  new item 
        Inverntory inverntory = new Inverntory();
        repository().save(inverntory);

        */

        /** Example 2:  finding and process
        

        repository().findById(deliveryCancelled.get???()).ifPresent(inverntory->{
            
            inverntory // do something
            repository().save(inverntory);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
