package pl.marczyk.rapideoscrappertv;

import android.os.AsyncTask;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import pl.marczyk.rapideoscrappertv.model.File;

public final class FileList {

    public static List<File> list;

    public static List<File> setupMovies() {
        List<File> files = new ArrayList<>();
        AsyncTask<String, Void, List<File>> execute = new FileListFetcher().execute("http://192.168.26.106:8080/api/userFiles");
        try {
            files = execute.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        list = files;
        return files;
    }
}
