package me.zacl.ld46.world;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.tiled.tiles.StaticTiledMapTile;

public class Tile extends StaticTiledMapTile {

   private boolean isSolid;

   public Tile(TextureRegion textureRegion, boolean isSolid) {
      super(textureRegion);
      this.isSolid = isSolid;
   }
}
