package X;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.40x  reason: invalid class name and case insensitive filesystem */
public final class C678840x implements C83994sM {
    public final ContentValues A00;
    public final Context A01;
    public final Uri A02;

    public final void ADh() {
        Uri uri = this.A02;
        if (uri != null) {
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues contentValues = this.A00;
            Long valueOf = Long.valueOf(currentTimeMillis);
            contentValues.put("date_added", valueOf);
            contentValues.put(C28174Ezk.A00(518), valueOf);
            if (Build.VERSION.SDK_INT >= 29) {
                contentValues.put("datetaken", valueOf);
                contentValues.put("is_pending", C18220wO.A0d());
            }
            this.A01.getContentResolver().update(uri, contentValues, (String) null, (String[]) null);
            return;
        }
        throw new IOException("Content Resolver resource is not available");
    }

    public final OutputStream BMO() {
        Uri uri = this.A02;
        if (uri != null) {
            OutputStream openOutputStream = this.A01.getContentResolver().openOutputStream(uri);
            if (openOutputStream != null) {
                return openOutputStream;
            }
            throw new IOException("CRWritableResource returned a null output stream");
        }
        throw new IOException("Content Resolver resource is not available");
    }

    public C678840x(ContentValues contentValues, Context context, Uri uri) {
        this.A01 = context;
        this.A00 = contentValues;
        this.A02 = uri;
    }

    public final void DBQ(InputStream inputStream) {
        AnonymousClass2CX.A00(inputStream, BMO());
    }
}
