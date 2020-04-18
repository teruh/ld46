package me.zacl.ld46.world;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import me.zacl.ld46.entity.Entity;

public class Tile extends Entity {

   private boolean isSolid;

   /**
    * Set default class values
    *
    * @param x x-position of the entity in the world
    * @param y y-position of the entity in the world
    */
   public Tile(float x, float y, boolean isSolid) {
      super(x, y);
      this.isSolid = isSolid;
   }

   @Override
   public void update(float deltaTime) {

   }

   @Override
   public void render(SpriteBatch spriteBatch) {
      spriteBatch
          .draw(getTexture(), getX(), getY(), getWidth(), getHeight(), getRegionX(), getRegionY(),
                getRegionWidth(), getRegionHeight(), false, false);
   }
}
