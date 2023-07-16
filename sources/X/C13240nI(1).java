package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.0nI  reason: invalid class name and case insensitive filesystem */
public final class C13240nI {
    public final C14410pM A00;
    public final C12310lg A01;
    public final File A02;

    public C13240nI(Context context, C12310lg r6, AnonymousClass0PW r7, String str, String str2) {
        this.A00 = new C14410pM(new C14050oj(r7), AnonymousClass00U.A0V("725056107548211", "|", "0e20c3123a90c76c02c901b7415ff67f"), str2);
        File A002 = C14630pr.A00(context, 343672752);
        A002.mkdirs();
        File file = new File(A002, str);
        new File(context.getFilesDir(), AnonymousClass00U.A0L("mqtt_analytics.", str)).renameTo(file);
        this.A02 = file;
        this.A01 = r6;
    }
}
