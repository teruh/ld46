package me.zacl.ld46.screen;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import me.zacl.ld46.world.TiledWorld;

public class DevScreen implements Screen {

   private ExtendViewport viewport;

   private TiledWorld world;
   private OrthographicCamera camera;
   private SpriteBatch spriteBatch;

   @Override
   public void show() {
      spriteBatch = new SpriteBatch();

      camera = new OrthographicCamera();

      world = new TiledWorld("dev_map.tmx");

      viewport = new ExtendViewport(480, 480, camera);
      viewport.apply();
   }

   @Override
   public void render(float delta) {
      world.render(camera, spriteBatch);
   }

   @Override
   public void resize(int width, int height) {
      viewport.update(width, height);
   }

   @Override
   public void pause() {

   }

   @Override
   public void resume() {

   }

   @Override
   public void hide() {

   }

   @Override
   public void dispose() {
      world.dispose();
   }
}
