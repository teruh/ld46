package me.zacl.ld46.entity;

import com.badlogic.gdx.math.Vector2;

public abstract class MovingEntity extends Entity {

   protected Vector2 deltaMovement;
   private   int     moveSpeed;

   /**
    * Set default class values
    *
    * @param x x-position of the entity in the world
    * @param y y-position of the entity in the world
    */
   public MovingEntity(float x, float y) {
      super(x, y);
      deltaMovement = new Vector2(0, 0);
   }

   public int getMoveSpeed() {
      return moveSpeed;
   }

   public void setMoveSpeed(int moveSpeed) {
      this.moveSpeed = moveSpeed;
   }
}
