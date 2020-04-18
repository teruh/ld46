package me.zacl.ld46.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import me.zacl.ld46.util.Constants;
import me.zacl.ld46.util.FrameCounter;
import me.zacl.ld46.world.TiledWorld;

public class DevScreen implements Screen {

   private ExtendViewport viewport;

   private TiledWorld world;
   private OrthographicCamera camera;
   private SpriteBatch spriteBatch;

   private FrameCounter frameCounter;
   private BitmapFont   font;

   @Override
   public void show() {
      spriteBatch = new SpriteBatch();

      camera = new OrthographicCamera();

      // Scale the world to 32x32px = 1 tile
      world = new TiledWorld("dev_map.tmx", 1 / Constants.TILE_SIZE);

      viewport = new ExtendViewport(5, 5, camera);
      viewport.apply();

      frameCounter = new FrameCounter();
      font = new BitmapFont();
      font.setColor(Color.WHITE);
   }

   @Override
   public void render(float delta) {
      frameCounter.update();

      spriteBatch.begin();
      font.draw(spriteBatch, frameCounter.getFrameRate() + " FPS", 5, Gdx.graphics.getHeight() - 2);
      spriteBatch.end();

      world.render(camera);
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
      font.dispose();
   }
}
