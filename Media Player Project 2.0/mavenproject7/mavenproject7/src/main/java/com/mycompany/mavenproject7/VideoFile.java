
package com.mycompany.mavenproject7;


import com.google.gson.annotations.SerializedName;

public class VideoFile {

    public VideoFile(String VideoName, String FileName) {
        this.VideoName = VideoName;

        this.FileName = FileName;

    }

    @Override
    public String toString() {
        return "Video Name{" + "Video Title=" + VideoName + ", FileName=" + FileName + '}';
    }
    @SerializedName("VideoName")
    public String VideoName;

    @SerializedName("FileName")
    public String FileName;

    public String getVideoName() {
        return VideoName;
    }

    public void setVideoName(String VideoName) {
        this.VideoName = VideoName;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

}
