package nl.finalist.sample;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FailOnThisEntity {

   @Id
   private Timestamp id;

   public Timestamp getId() {
      return id;
   }

   public void setId(Timestamp id) {
      this.id = id;
   }

}
