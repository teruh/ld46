package me.zacl.ld46.world;

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

   public void render() {
   }

   public void dispose() {
      tiledMap.dispose();
   }

}
