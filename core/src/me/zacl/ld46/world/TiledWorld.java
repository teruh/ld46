package me.zacl.ld46.world;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

public class TiledWorld {

   private TiledMap tiledMap;
   private OrthogonalTiledMapRenderer mapRenderer;

   public TiledWorld(String mapPath) {
      tiledMap = new TmxMapLoader().load(mapPath);
      mapRenderer = new OrthogonalTiledMapRenderer(tiledMap);
   }

   public void render(OrthographicCamera camera, SpriteBatch batch) {
      mapRenderer.setView(camera);
      mapRenderer.render();

      batch.setProjectionMatrix(camera.combined);
   }

   public void dispose() {
      tiledMap.dispose();
   }

}
