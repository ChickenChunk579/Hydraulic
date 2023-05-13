package org.geysermc.hydraulic.pack.bedrock.resource.particles.particleeffect.components;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Emitter Shape Box Component For 1.10.0
 */
public class EmitterShapeBox {
  public String direction;

  public String radius;

  public String[] offset;

  @JsonProperty("half_dimensions")
  public String[] halfDimensions;

  @JsonProperty("surface_only")
  public boolean surfaceOnly;

  public String getDirection() {
    return this.direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public String getRadius() {
    return this.radius;
  }

  public void setRadius(String radius) {
    this.radius = radius;
  }

  /**
   * @return Offset
   */
  public String[] getOffset() {
    return this.offset;
  }

  /**
   * @param offset Offset
   */
  public void setOffset(String[] offset) {
    this.offset = offset;
  }

  /**
   * @return Half Dimensions
   */
  public String[] getHalfDimensions() {
    return this.halfDimensions;
  }

  /**
   * @param halfDimensions Half Dimensions
   */
  public void setHalfDimensions(String[] halfDimensions) {
    this.halfDimensions = halfDimensions;
  }

  /**
   * @return Surface Only
   */
  public boolean getSurfaceOnly() {
    return this.surfaceOnly;
  }

  /**
   * @param surfaceOnly Surface Only
   */
  public void setSurfaceOnly(boolean surfaceOnly) {
    this.surfaceOnly = surfaceOnly;
  }
}
