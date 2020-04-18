package me.zacl.ld46;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import me.zacl.ld46.screen.DevScreen;

public class Game extends com.badlogic.gdx.Game {
   @Override
   public void create () {
      setScreen(new DevScreen());
   }

   @Override
   public void render () {
      Gdx.gl.glClearColor(0.5f, 0.1f, 1.f, 1.f);
      Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
      super.render();
   }

   @Override
   public void dispose () {
   }
}
