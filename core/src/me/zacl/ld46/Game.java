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
      super.render();
   }

   @Override
   public void dispose () {
   }
}
