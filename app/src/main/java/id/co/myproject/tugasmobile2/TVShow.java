package id.co.myproject.tugasmobile2;

import android.os.Parcel;
import android.os.Parcelable;

public class TVShow implements Parcelable {
    private int gambar;
    private String title;

    public TVShow() {
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.gambar);
        dest.writeString(this.title);
    }

    protected TVShow(Parcel in) {
        this.gambar = in.readInt();
        this.title = in.readString();
    }

    public static final Parcelable.Creator<TVShow> CREATOR = new Parcelable.Creator<TVShow>() {
        @Override
        public TVShow createFromParcel(Parcel source) {
            return new TVShow(source);
        }

        @Override
        public TVShow[] newArray(int size) {
            return new TVShow[size];
        }
    };
}
