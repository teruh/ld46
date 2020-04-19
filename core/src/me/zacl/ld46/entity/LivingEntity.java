package me.zacl.ld46.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * A living entity is an entity that moves (changes directions/facing)
 */
public class LivingEntity extends AABBEntity {

   private Texture spriteSheet;

   /**
    * Set default class values
    *
    * @param x x-position of the entity in the world
    * @param y y-position of the entity in the world
    */
   public LivingEntity(float x, float y) {
      super(x, y);
      spriteSheet = new Texture(Gdx.files.internal("char_sprites.png"));
      setTexture(spriteSheet);
   }

   @Override
   public void update(float deltaTime) {

   }

   @Override
   public void render(SpriteBatch spriteBatch) {

   }

   public Texture getSpriteSheet() {
      return spriteSheet;
   }
}
