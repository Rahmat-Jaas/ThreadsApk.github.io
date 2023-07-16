package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.78t  reason: invalid class name and case insensitive filesystem */
public class C1201278t {
    public static C1201278t A03;
    public String A00;
    public final Context A01;
    public final File A02;

    public File A01(Pair pair) {
        File file;
        String str;
        switch (AnonymousClass0wJ.A04(pair.first)) {
            case -1:
                throw C18180wK.A0a("Invalid source path");
            case 0:
            case 1:
                file = this.A02;
                break;
            case 2:
                file = this.A01.getFilesDir();
                break;
            case 3:
                file = this.A01.getCacheDir();
                break;
            case 4:
                file = this.A01.getExternalFilesDir((String) null);
                break;
            case 5:
                file = this.A01.getExternalCacheDir();
                break;
            default:
                throw C18190wL.A0a("Cask path factory cannot handle this location");
        }
        if (file == null) {
            Object[] objArr = {pair.first, pair.second};
            AnonymousClass0JW r1 = AnonymousClass0JV.A00;
            if (r1.isLoggable(6)) {
                r1.e("PathFactory", String.format((Locale) null, "createRootPathFromType returned null for location=%d path=%s", objArr));
            }
            String str2 = this.A00;
            if (str2 == null) {
                str2 = C18180wK.A0e();
            }
            this.A00 = str2;
            file = C86154wM.A0U(this.A02, AnonymousClass00U.A0L("cache/tmp_invalid_path/", str2));
        }
        int A04 = AnonymousClass0wJ.A04(pair.first);
        if (A04 != 0) {
            if (A04 == 1) {
                file = this.A02;
                str = AnonymousClass00U.A0L("app_", (String) pair.second);
                return C86154wM.A0U(file, str);
            } else if (!(A04 == 2 || A04 == 3 || A04 == 4 || A04 == 5)) {
                throw C18190wL.A0a(AnonymousClass00U.A0L("Cask path factory cannot handle this location = ", (String) pair.second));
            }
        }
        str = (String) pair.second;
        return C86154wM.A0U(file, str);
    }

    public C1201278t(Context context) {
        this.A01 = context.getApplicationContext();
        this.A02 = A00(context);
    }

    public static File A00(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null && !TextUtils.isEmpty(applicationInfo.dataDir)) {
            return C86144wL.A0Z(applicationInfo.dataDir);
        }
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return cacheDir.getParentFile();
        }
        throw C18180wK.A0a("Path Factory initialised without a valid path");
    }

    public final Map A02(String str, int i) {
        int length;
        Object value;
        File A012 = A01(C36607JbX.A00(i));
        if (!A012.isDirectory()) {
            return Collections.emptyMap();
        }
        String A013 = C37242Jn9.A01(i);
        if (TextUtils.isEmpty(A013)) {
            return Collections.singletonMap(A012, (Object) null);
        }
        String[] split = A013.split("/");
        HashMap A0y = AnonymousClass0wJ.A0y();
        HashMap A0y2 = AnonymousClass0wJ.A0y();
        A0y.put(A012, (Object) null);
        for (String equals : split) {
            boolean equals2 = equals.equals(str);
            Iterator A0u = C18190wL.A0u(A0y);
            while (A0u.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0u);
                File[] listFiles = ((File) A0o.getKey()).listFiles();
                if (listFiles != null && (length = listFiles.length) != 0) {
                    int i2 = 0;
                    do {
                        File file = listFiles[i2];
                        if (file.isDirectory()) {
                            if (equals2) {
                                value = file.getName();
                            } else {
                                value = A0o.getValue();
                            }
                            A0y2.put(file, value);
                        }
                        i2++;
                    } while (i2 < length);
                }
            }
            A0y.clear();
            A0y.putAll(A0y2);
            A0y2.clear();
        }
        return A0y;
    }
}
