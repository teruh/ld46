package me.zacl.ld46.world;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

/**
 * Load a .tmx file
 */
public class TiledWorldHandler {

   private TiledMap tiledMap;
   private OrthogonalTiledMapRenderer mapRenderer;

   public TiledWorldHandler(String mapPath) {
      tiledMap = new TmxMapLoader().load(mapPath);
      mapRenderer = new OrthogonalTiledMapRenderer(tiledMap);
   }

   public TiledWorldHandler(String mapPath, float unitScale) {
      tiledMap = new TmxMapLoader().load(mapPath);
      mapRenderer = new OrthogonalTiledMapRenderer(tiledMap, unitScale);
   }

   public TiledWorldHandler(TiledMap tiledMap) {
      mapRenderer = new OrthogonalTiledMapRenderer(tiledMap);
   }

   public TiledWorldHandler(TiledMap tiledMap, float unitScale) {
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