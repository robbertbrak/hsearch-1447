package nl.finalist.sample;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SimpleEntity implements Serializable {

   private static final long serialVersionUID = -6662787188310632600L;
   
   @Id
   private Long id;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
}
