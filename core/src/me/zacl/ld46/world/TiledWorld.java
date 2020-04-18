package me.zacl.ld46.world;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

public class TiledWorld {

   private TiledMap tiledMap;
   private OrthogonalTiledMapRenderer mapRenderer;

   public TiledWorld(String mapPath) {
      tiledMap = new TmxMapLoader().load(mapPath);
      mapRenderer = new OrthogonalTiledMapRenderer(tiledMap);
   }

   public TiledWorld(String mapPath, float unitScale) {
      tiledMap = new TmxMapLoader().load(mapPath);
      mapRenderer = new OrthogonalTiledMapRenderer(tiledMap, unitScale);
   }

   public void render(OrthographicCamera camera) {
      mapRenderer.setView(camera);
      mapRenderer.render();
   }

   public void dispose() {
      tiledMap.dispose();
   }
}
