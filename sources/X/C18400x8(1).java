package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.0x8  reason: invalid class name and case insensitive filesystem */
public final class C18400x8 extends ContentObserver {
    public final Context A00;
    public final List A01 = new LinkedList();
    public final ContentResolver A02;
    public final UriMatcher A03;

    public C18400x8(ContentResolver contentResolver, Context context, Handler handler) {
        super(handler);
        String packageName;
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.A03 = uriMatcher;
        this.A00 = context;
        this.A02 = contentResolver;
        String str = C550031h.A01;
        if ("com.facebook.appmanager".equals(context.getPackageName())) {
            packageName = "*";
        } else {
            packageName = context.getPackageName();
        }
        uriMatcher.addURI(str, AnonymousClass00U.A0d(packageName, "/", "sessions", "/#"), 1);
    }

    public final void onChange(boolean z) {
    }

    public final void onChange(boolean z, Uri uri) {
        String lastPathSegment;
        if (uri != null && this.A03.match(uri) == 1 && (lastPathSegment = uri.getLastPathSegment()) != null && lastPathSegment.length() != 0) {
            try {
                if (Long.parseLong(lastPathSegment) != -1) {
                    List list = this.A01;
                    synchronized (list) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            it.next();
                            try {
                                AnonymousClass0LU.A0C("FacebookVoltronDownloader", "modules api is null when on session changed callback is hit");
                            } catch (Throwable th) {
                                AnonymousClass0LU.A0E("FacebookVoltronDownloader", "Oxygen request failed", th);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }
}
