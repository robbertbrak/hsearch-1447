package nl.finalist.sample;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class FailOnComplexEntity implements Serializable {

   private static final long serialVersionUID = -3789369196486119782L;

   @Id
   private Long id;
   
   @Id
   @ManyToOne
   private SimpleEntity simpleEntity;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public SimpleEntity getSimpleEntity() {
      return simpleEntity;
   }

   public void setSimpleEntity(SimpleEntity simpleEntity) {
      this.simpleEntity = simpleEntity;
   }
}
