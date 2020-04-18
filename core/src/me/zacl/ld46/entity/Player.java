package me.zacl.ld46.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Player extends Entity {
   /**
    * Set default class values
    *
    * @param x x-position of the entity in the world
    * @param y y-position of the entity in the world
    */
   public Player(float x, float y) {
      super(x, y);
      setTexture(new Texture("badlogic.jpg"));
      setSize(32, 32);
      setMoveSpeed(150);
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
   public void render(SpriteBatch batch) {
      batch.begin();
      batch.draw(getTexture(), getX(), getY(), getWidth(), getHeight());
      batch.end();
   }
}
