package me.zacl.ld46.screen;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import me.zacl.ld46.world.TiledWorld;

public class DevScreen implements Screen {

   private TiledWorld world;
   private OrthographicCamera camera;
   private SpriteBatch spriteBatch;

   public DevScreen() {
      spriteBatch = new SpriteBatch();

      camera = new OrthographicCamera();
      camera.setToOrtho(false, 250, 250);
      camera.update();

      world = new TiledWorld("dev_map.tmx");
   }

   @Override
   public void show() {

   }

   @Override
   public void render(float delta) {
      world.render(camera, spriteBatch);
   }

   @Override
   public void resize(int width, int height) {

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
