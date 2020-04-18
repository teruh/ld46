package me.zacl.ld46.screen;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class DevScreen implements Screen {
   SpriteBatch batch;
   Texture img;

   public DevScreen() {
      batch = new SpriteBatch();
      img = new Texture("badlogic.jpg");
   }

   @Override
   public void show() {

   }

   @Override
   public void render(float delta) {
      batch.begin();
      batch.draw(img, 0, 0);
      batch.end();
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
      batch.dispose();
      img.dispose();
   }
}
