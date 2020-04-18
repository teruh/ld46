package me.zacl.ld46.entity;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 * Represents an entity that has an X, Y position in the game world
 * 2020-04-18
 *
 * @author Zach Clark
 */
public abstract class Entity extends Sprite {

   protected Vector2 deltaMovement;
   private int moveSpeed;

   /**
    * Set default class values
    * @param x x-position of the entity in the world
    * @param y y-position of the entity in the world
    */
   public Entity(float x, float y) {
      deltaMovement = new Vector2(0, 0);

      this.setX(x);
      this.setY(y);
   }

   /**
    * Handle entity game logic
    * @param deltaTime engine delta time
    */
   public abstract void update(float deltaTime);

   /**
    * Render entity in the world
    */
   public abstract void render(SpriteBatch batch);

   public int getMoveSpeed() {
      return moveSpeed;
   }

   public void setMoveSpeed(int moveSpeed) {
      this.moveSpeed = moveSpeed;
   }
}