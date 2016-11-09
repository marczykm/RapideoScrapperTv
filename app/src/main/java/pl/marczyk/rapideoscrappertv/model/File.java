package pl.marczyk.rapideoscrappertv.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 * Created by marcin on 08.11.16.
 */

public class File implements Serializable {
    private String name;
    private String mainUrl;
    private Collection<String> backUpUrls;
    private Long expirationDate;
    private String size;

    public File() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainUrl() {
        return mainUrl;
    }

    public void setMainUrl(String mainUrl) {
        this.mainUrl = mainUrl;
    }

    public Collection<String> getBackUpUrls() {
        return backUpUrls;
    }

    public void setBackUpUrls(Collection<String> backUpUrls) {
        this.backUpUrls = backUpUrls;
    }

    public Long getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Long expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
