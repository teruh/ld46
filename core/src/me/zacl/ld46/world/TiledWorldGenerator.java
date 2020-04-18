package me.zacl.ld46.world;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;

public class TiledWorldGenerator {

   private TiledMap world;               // The reference to the generated TiledMap
   private TiledMapTileLayer worldLayer; // The layer the tile data will exist on

   private int worldHeight;
   private int worldWidth;

   private int tileHeight;
   private int tileWidth;

   public TiledWorldGenerator(int worldHeight, int worldWidth) {
      this.worldHeight = worldHeight;
      this.worldWidth = worldWidth;

      world = new TiledMap();
      worldLayer = new TiledMapTileLayer(worldWidth, worldHeight, tileWidth, tileHeight);
      world.getLayers().add(worldLayer);
   }

   private void generateWorld() {
      for (int row = 0; row < worldHeight; row++) {
         for (int col = 0; col < worldWidth; col++) {
         }
      }
   }

   public int getTileHeight() {
      return tileHeight;
   }

   public void setTileHeight(int tileHeight) {
      this.tileHeight = tileHeight;
   }

   public int getTileWidth() {
      return tileWidth;
   }

   public void setTileWidth(int tileWidth) {
      this.tileWidth = tileWidth;
   }
}
