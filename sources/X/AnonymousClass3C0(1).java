package X;

import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import java.util.List;

/* renamed from: X.3C0  reason: invalid class name */
public final class AnonymousClass3C0 {
    public final Uri A00;
    public final boolean A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public AnonymousClass3C0(List list, int i) {
        Uri uri;
        Uri uri2;
        String str = "image/*";
        if (i != 2) {
            str = "video/*";
            if (i != 3) {
                this.A03 = Environment.DIRECTORY_DOWNLOADS;
                if (Build.VERSION.SDK_INT >= 29) {
                    uri2 = MediaStore.Downloads.getContentUri("external_primary");
                } else {
                    uri2 = Uri.EMPTY;
                }
                this.A00 = uri2;
            } else {
                this.A03 = Environment.DIRECTORY_MOVIES;
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                this.A00 = uri;
                this.A02 = str;
                this.A01 = true;
            }
        } else {
            this.A03 = Environment.DIRECTORY_PICTURES;
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            this.A00 = uri;
            this.A02 = str;
            this.A01 = true;
        }
        this.A04 = list;
    }
}
