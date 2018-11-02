package com.example.alfiani.movieapps;

import java.util.List;

/**
 * Created by Alfiani-PC on 10/29/2018.
 */

public interface OnGetMoviesCallback {
    void onSuccess(List<Movie> movies);

    void onError();
}
