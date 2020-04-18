package me.zacl.ld46.entity;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Represents an entity that has an X, Y position in the game world
 * 2020-04-17
 *
 * @author Zach Clark
 */
public abstract class Entity extends Sprite {
   /**
    * Set default class values
    * @param x x-position of the entity in the world
    * @param y y-position of the entity in the world
    */
   public Entity(float x, float y) {
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
}