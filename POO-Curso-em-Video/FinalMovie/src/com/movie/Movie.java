package com.movie;

/**
 * @author Mauricio
 */
public class Movie implements ActionsMovie {
  private String title;
  private float available;
  private float views;
  private float likes;
  private boolean reproducing;

  public Movie(String title) {
    this.setTitle(title);
    this.setAvailable(1);
    this.setViews(0);
    this.setLikes(0);
    this.setReproducing(false);
  }

  @Override
  public void play() {
    if(!this.isReproducing()){
      this.setReproducing(true);
    } else {
      System.out.println("Já está reproduzindo!");
    }
  }

  @Override
  public void pause() {
    if(this.isReproducing()){
      this.setReproducing(false);
    } else {
      System.out.println("Já está pausado!");
    }
  }

  @Override
  public void stop() {
    this.setReproducing(false);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public float getAvailable() {
    return available;
  }

  public void setAvailable(float available) {
    int nova;
    nova = (int) ((this.available + available) / this.views);
    this.available = nova;
  }

  public float getViews() {
    return views;
  }

  public void setViews(long views) {
    this.views = views;
  }

  public float getLikes() {
    return likes;
  }

  public void setLikes(long likes) {
    this.likes = likes;
  }

  public boolean isReproducing() {
    return reproducing;
  }

  public void setReproducing(boolean reproducing) {
    this.reproducing = reproducing;
  }

  @Override
  public String toString() {
    return "Movies = { \n"
        + "  title: '" + this.getTitle() +
        '\'' + ",\n  available: " + this.getAvailable() +
        ",\n  views: " + this.getViews() +
        ",\n  likes: " + this.getLikes() +
        ",\n  reproducing: " + this.isReproducing() +
        "\n }";
  }
}
