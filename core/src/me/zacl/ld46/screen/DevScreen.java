package me.zacl.ld46.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import me.zacl.ld46.entity.Player;
import me.zacl.ld46.util.Constants;
import me.zacl.ld46.world.TiledWorldHandler;
import me.zacl.ld46.world.TiledWorldGenerator;

public class DevScreen implements Screen {

   private Viewport viewport;

   private TiledWorldHandler  world;
   private OrthographicCamera camera;
   private SpriteBatch        spriteBatch;

   private Player player;

   private TiledWorldGenerator worldGen;
   private TiledMap            tiledMap;

   @Override
   public void show() {
      spriteBatch = new SpriteBatch();

      camera = new OrthographicCamera();

      worldGen = new TiledWorldGenerator(20, 12, 32, 32);
      tiledMap = worldGen.generateWorld();
      world = new TiledWorldHandler(tiledMap, Constants.UNIT_SCALE);

      viewport = new ExtendViewport(worldGen.getWidth() / Constants.TILE_SIZE,
                                    worldGen.getHeight() / Constants.TILE_SIZE, camera);

      player = new Player(10, 6);

      camera.position.set(new Vector2((worldGen.getWidth() / Constants.TILE_SIZE) / 2,
                                      (worldGen.getHeight() / Constants.TILE_SIZE) / 2), 0);
   }

   @Override
   public void render(float deltaTime) {
      Gdx.gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
      Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

      player.update(deltaTime);

      viewport.apply();
      world.render(camera);

      spriteBatch.setProjectionMatrix(camera.combined);
      spriteBatch.begin();
      player.render(spriteBatch);
      spriteBatch.end();
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
