package me.zacl.ld46.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Player extends LivingEntity {
   /**
    * Set default class values
    *
    * @param x x-position of the entity in the world
    * @param y y-position of the entity in the world
    */
   public Player(float x, float y) {
      super(x, y);

      setRegion(new TextureRegion(getSpriteSheet(), 0, 0, 32, 32));

      setSize(1, 1);
      setMoveSpeed(2);
   }

   @Override
   public void update(float deltaTime) {
      this.deltaMovement.x = 0;
      this.deltaMovement.y = 0;

      // Move up
      if (Gdx.input.isKeyPressed(Input.Keys.W) || Gdx.input.isKeyPressed(Input.Keys.UP)) {
         this.deltaMovement.y = getMoveSpeed() * deltaTime;
      }

      // Move down
      if (Gdx.input.isKeyPressed(Input.Keys.S) || Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
         this.deltaMovement.y = -getMoveSpeed() * deltaTime;
      }

      // Move right
      if (Gdx.input.isKeyPressed(Input.Keys.D) || Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
         this.deltaMovement.x = getMoveSpeed() * deltaTime;
      }

      // Move left
      if (Gdx.input.isKeyPressed(Input.Keys.A) || Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
         this.deltaMovement.x = -getMoveSpeed() * deltaTime;
      }

      setX(getX() + deltaMovement.x);
      setY(getY() + deltaMovement.y);
   }

   @Override
   public void render(SpriteBatch spriteBatch) {
      spriteBatch.draw(this, getX(), getY(), getWidth(), getHeight());
   }
}
