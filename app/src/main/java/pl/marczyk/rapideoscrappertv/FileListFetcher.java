package pl.marczyk.rapideoscrappertv;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pl.marczyk.rapideoscrappertv.model.File;

/**
 * Created by marcin on 09.11.16.
 */

public class FileListFetcher extends AsyncTask<String, Void, List<File>>{
    @Override
    protected List<File> doInBackground(String... urls) {
        String response;
        List<File> list = new ArrayList<>();
        try {
            response = downloadUrl(urls[0]);
            Gson gson = new Gson();
            Type listType = new TypeToken<ArrayList<File>>(){}.getType();
            list = gson.fromJson(response, listType);
        } catch (Exception e) {
            Log.e("ERROR", "Unable to download files list, ");
            e.printStackTrace();
        }

        return list;
    }

    private String downloadUrl(String url) throws Exception{
        InputStream io = null;

        try{
            URL url1 = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) url1.openConnection();
            connection.setReadTimeout(10000);
            connection.setConnectTimeout(15000);
            connection.setRequestMethod("GET");
            connection.setDoInput(true);
            connection.connect();
            int responseCode = connection.getResponseCode();
            Log.i("DEBUG", "The response is: " + responseCode);
            io = connection.getInputStream();
            Scanner scanner = new Scanner(io).useDelimiter("\\A");
            return scanner.hasNext() ? scanner.next() : "";
        } finally {
            if (io != null){
                io.close();
            }
        }
    }
}
