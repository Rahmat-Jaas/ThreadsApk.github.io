package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.32G  reason: invalid class name */
public final class AnonymousClass32G {
    public final File A00;

    public AnonymousClass32G(Context context, String str) {
        File A002 = C14630pr.A00(context, 344748284);
        A002.mkdirs();
        this.A00 = new File(A002, AnonymousClass00U.A0L("libs_", str));
    }
}
