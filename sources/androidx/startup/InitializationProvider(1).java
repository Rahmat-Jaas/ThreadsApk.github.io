package androidx.startup;

import X.AnonymousClass078;
import X.AnonymousClass07C;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;

public class InitializationProvider extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new AnonymousClass078();
        } else if (context.getApplicationContext() == null) {
            return true;
        } else {
            AppInitializer instance = AppInitializer.getInstance(context);
            try {
                AnonymousClass07C.A01("Startup");
                Context context2 = instance.A00;
                instance.discoverAndInitialize(context2.getPackageManager().getProviderInfo(new ComponentName(context2.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                AnonymousClass07C.A00();
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                throw new AnonymousClass078(e);
            } catch (Throwable th) {
                AnonymousClass07C.A00();
                throw th;
            }
        }
    }
}
