package X;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.0fQ  reason: invalid class name and case insensitive filesystem */
public final class C09430fQ {
    public static File A00;
    public static String A01;

    public static File A01(Context context, String str) {
        File file = A00;
        if (file == null) {
            file = new File(C14620pq.A00(Environment.DIRECTORY_PICTURES), C10170hq.A00(context).replace(' ', '_'));
            A00 = file;
        }
        if (file.exists() || file.mkdirs()) {
            return new File(file, String.format((Locale) null, "%s%s%s", new Object[]{"IMG_", new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US).format(new Date()), str}));
        }
        return null;
    }

    public static String A03(Context context) {
        String str = A01;
        if (str != null) {
            return str;
        }
        String A0L = AnonymousClass00U.A0L("Pictures/", C10170hq.A00(context).replace(' ', '_'));
        A01 = A0L;
        return A0L;
    }

    public static File A00() {
        return ITF.A00().A02();
    }

    public static File A02(String str) {
        try {
            if (!A00().exists()) {
                A00().mkdirs();
            }
            return File.createTempFile("pending_media_", str, A00());
        } catch (IOException e) {
            AnonymousClass0LU.A0E("PhotoFileUtil", "unable to create temp file", e);
            return null;
        }
    }

    public static void A04(String str, String str2, WeakReference weakReference) {
        AnonymousClass0gN.A00().AKp(new C11260jo(str, str2, weakReference));
    }
}
