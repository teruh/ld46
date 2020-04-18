package me.zacl.ld46.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.TimeUtils;

public class FrameCounter {
   long lastTimeCounted;
   private float timeSinceChanged;
   private float frameRate;

   public FrameCounter() {
      lastTimeCounted = TimeUtils.millis();
      timeSinceChanged = 0;
      frameRate = Gdx.graphics.getFramesPerSecond();
   }

   public void update() {
      long deltaTime = TimeUtils.timeSinceMillis(lastTimeCounted);
      lastTimeCounted = TimeUtils.millis();

      timeSinceChanged += deltaTime;
      if (timeSinceChanged >= 1000) {
         timeSinceChanged = 0;
         frameRate = Gdx.graphics.getFramesPerSecond();
      }
   }

   public float getFrameRate() {
      return frameRate;
   }
}
