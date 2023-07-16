package X;

import android.media.MediaMetadataRetriever;
import java.io.IOException;
import java.util.Locale;

/* renamed from: X.7Bx  reason: invalid class name and case insensitive filesystem */
public final class C120657Bx {
    public static int A00(String str) {
        IOException iOException;
        String str2;
        String str3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            if (extractMetadata != null) {
                int parseInt = Integer.parseInt(extractMetadata);
                if (parseInt > 0) {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Exception unused) {
                    }
                    return parseInt;
                }
                str3 = AnonymousClass00U.A0J("got invalid integer duration value: ", parseInt);
            } else {
                str3 = "got null duration metadata string";
            }
            String format = String.format(Locale.US, "%s - pathExists=%b, path=%s", new Object[]{str3, Boolean.valueOf(C86144wL.A0Z(str).exists()), str});
            C10450iM.A03(C120657Bx.class.toString(), format);
            iOException = new IOException(format, (Throwable) null);
        } catch (IllegalArgumentException e) {
            e = e;
            str2 = "Cannot setDataSource: file corrupted or incomplete";
            String format2 = String.format(Locale.US, "%s - pathExists=%b, path=%s", new Object[]{str2, Boolean.valueOf(C86144wL.A0Z(str).exists()), str});
            C10450iM.A06(C120657Bx.class.toString(), format2, e);
            iOException = new IOException(format2, e);
            throw iOException;
        } catch (RuntimeException e2) {
            e = e2;
            str2 = "Cannot setDataSource: got RuntimeException";
            String format22 = String.format(Locale.US, "%s - pathExists=%b, path=%s", new Object[]{str2, Boolean.valueOf(C86144wL.A0Z(str).exists()), str});
            C10450iM.A06(C120657Bx.class.toString(), format22, e);
            iOException = new IOException(format22, e);
            throw iOException;
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception unused2) {
            }
            throw th;
        }
        throw iOException;
    }

    public static int A01(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            extractMetadata.getClass();
            return Integer.parseInt(extractMetadata);
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception unused) {
            }
        }
    }
}
