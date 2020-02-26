package com.movie;

/**
 * @author Mauricio
 */
public class Main {

    public static void main(String[] args) {
        Movie[] movie = new Movie[3];
        movie[0] = new Movie("Projeto final em Java");
        movie[1] = new Movie("React");

        Grasshopper[] grasshopper = new Grasshopper[2];
        grasshopper[0] = new Grasshopper("LeriA", 22, "M", "leri_a");
        grasshopper[1] = new Grasshopper("LeriB", 22, "F", "leri_b");

        Views[] views = new Views[3];
        views[0] = new Views(grasshopper[0], movie[0]);
        views[0].avaliar(70.0f);
        views[1] = new Views(grasshopper[0], movie[1]);

        System.out.println(views[0].toString());
        System.out.println(views[1].toString());
    }
}
