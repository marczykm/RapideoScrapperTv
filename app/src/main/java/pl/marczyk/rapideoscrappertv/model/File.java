package pl.marczyk.rapideoscrappertv.model;

import java.util.Collection;
import java.util.Date;

/**
 * Created by marcin on 08.11.16.
 */

public class File {
    private String name;
    private String mainUrl;
    private Collection<String> backUpUrls;
    private Date expirationDate;
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

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        File file = (File) o;

        if (name != null ? !name.equals(file.name) : file.name != null) return false;
        if (mainUrl != null ? !mainUrl.equals(file.mainUrl) : file.mainUrl != null) return false;
        if (backUpUrls != null ? !backUpUrls.equals(file.backUpUrls) : file.backUpUrls != null)
            return false;
        if (expirationDate != null ? !expirationDate.equals(file.expirationDate) : file.expirationDate != null)
            return false;
        return size != null ? size.equals(file.size) : file.size == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (mainUrl != null ? mainUrl.hashCode() : 0);
        result = 31 * result + (backUpUrls != null ? backUpUrls.hashCode() : 0);
        result = 31 * result + (expirationDate != null ? expirationDate.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", mainUrl='" + mainUrl + '\'' +
                ", backUpUrls=" + backUpUrls +
                ", expirationDate=" + expirationDate +
                ", size='" + size + '\'' +
                '}';
    }
}
