package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.0nt  reason: invalid class name and case insensitive filesystem */
public final class C13550nt {
    public final C12310lg A00;
    public final File A01;

    public C13550nt(Context context, C12310lg r6, String str) {
        File A002 = C14630pr.A00(context, 343672752);
        A002.mkdirs();
        File file = new File(A002, str);
        new File(context.getFilesDir(), AnonymousClass00U.A0L("mqtt_analytics.", str)).renameTo(file);
        this.A01 = file;
        this.A00 = r6;
    }
}
