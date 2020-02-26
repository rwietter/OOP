package com.movie;

import javafx.scene.shape.MoveTo;

/**
 * @author Mauricio
 */
public class Views {
  private Grasshopper viewer;
  private Movie film;

  public Views(Grasshopper viewer, Movie film) {
    this.viewer = viewer;
    this.film = film;
    this.viewer.setTotViewsLive(this.viewer.getTotViewsLive() + 1);
    this.film.setViews((long) this.film.getViews() + 1);
  }

  public void avaliar(){
    this.film.setAvailable(5);
  }
  public void avaliar(int note){
    this.film.setAvailable(note);
  }
  public void avaliar(float percentage){
    int tot = 0;
    if(percentage <= 20){
      tot = 3;
    } else if(percentage <= 50){
      tot = 5;
    } else if(percentage <= 90){
      tot = 8;
    } else {
      tot = 10;
    }
    this.film.setAvailable(tot);
  }

  public Grasshopper getViewer() {
    return viewer;
  }

  public void setViewer(Grasshopper viewer) {
    this.viewer = viewer;
  }

  public Movie getFilm() {
    return film;
  }

  public void setFilm(Movie film) {
    this.film = film;
  }

  @Override
  public String toString() {
    return "Views = {\n" + "viewer: " + viewer.toString() +
        ", film: " + film.toString() +
        "\n}";
  }
}
