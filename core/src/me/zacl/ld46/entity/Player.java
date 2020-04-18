package me.zacl.ld46.entity;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Player extends Entity {
   /**
    * Set default class values
    *
    * @param x x-position of the entity in the world
    * @param y y-position of the entity in the world
    */
   public Player(float x, float y) {
      super(x, y, "badlogic.jpg");

   }

   @Override
   public void update(float deltaTime) {

   }

   @Override
   public void render(SpriteBatch batch) {
      batch.begin();
      batch.draw(getTexture(), getPositionX(), getPositionY(), 50, 50);
      batch.end();
   }
}
