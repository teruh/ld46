package me.zacl.ld46.entity;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Entity that has collides with collidable entities
 */
public abstract class AABBEntity extends Entity {
   private Rectangle rectangle;

   protected Vector2 deltaMovement;
   private   int     moveSpeed;

   /**
    * Set default class values
    *
    * @param x x-position of the entity in the world
    * @param y y-position of the entity in the world
    */
   public AABBEntity(float x, float y) {
      super(x, y);
      deltaMovement = new Vector2(0, 0);
      rectangle = new Rectangle(x, y, getScaleX(), getScaleY());
   }

   public int getMoveSpeed() {
      return moveSpeed;
   }

   public void setMoveSpeed(int moveSpeed) {
      this.moveSpeed = moveSpeed;
   }
}
