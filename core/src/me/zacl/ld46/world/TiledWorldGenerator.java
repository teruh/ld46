package me.zacl.ld46.world;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.maps.tiled.tiles.StaticTiledMapTile;

public class TiledWorldGenerator {

   private TiledMap world;               // The reference to the generated TiledMap
   private TiledMapTileLayer worldLayer; // The layer the tile data will exist on

   private int worldWidth;
   private int worldHeight;

   private int tileWidth;
   private int tileHeight;

   public TiledWorldGenerator(int worldWidth, int worldHeight, int tileWidth, int tileHeight) {
      this.worldWidth = worldWidth;
      this.worldHeight = worldHeight;

      this.tileWidth = tileWidth;
      this.tileHeight = tileHeight;

      world = new TiledMap();
      worldLayer = new TiledMapTileLayer(worldWidth, worldHeight, tileWidth, tileHeight);
   }

   public TiledMap generateWorld() {
      Texture tiles = new Texture(Gdx.files.internal("sprites.png"));
      TextureRegion[][] splitTiles = TextureRegion.split(tiles, tileWidth, tileHeight);

      for (int row = 0; row < worldHeight; row++) {
         for (int col = 0; col < worldWidth; col++) {
            TiledMapTileLayer.Cell cell = new TiledMapTileLayer.Cell();
            // Walls are generated surrounding the map
            if (row == 0 || col == 0 || row == worldHeight - 1 || col == worldWidth - 1) {
               cell.setTile(new StaticTiledMapTile(splitTiles[0][1]));
            } else {
               cell.setTile(new StaticTiledMapTile(splitTiles[0][0]));
            }
            worldLayer.setCell(col, row, cell);
         }
      }

      world.getLayers().add(worldLayer);

      return world;
   }

   public int getWorldHeight() {
      return worldHeight;
   }

   public int getWorldWidth() {
      return worldWidth;
   }

   public int getTileHeight() {
      return tileHeight;
   }

   public int getTileWidth() {
      return tileWidth;
   }

   public int getWidth() {
      return getTileWidth() * getWorldWidth();
   }

   public int getHeight() {
      return getTileHeight() * getWorldHeight();
   }
}
