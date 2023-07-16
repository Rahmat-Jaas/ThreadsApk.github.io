package X;

import android.content.Context;
import android.os.Handler;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0NG  reason: invalid class name */
public final class AnonymousClass0NG {
    public C06890aY A00;
    public final Context A01;
    public final Handler A02;
    public final C06870aW A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final String A00() {
        File A002 = C14630pr.A00(this.A01, 194178138);
        A002.mkdirs();
        try {
            return new File(A002, this.A04.replace('.', '_').replace(':', '_')).getCanonicalPath();
        } catch (IOException unused) {
            C04790Pd.A00();
            return null;
        }
    }

    public AnonymousClass0NG(Context context, Handler handler, C06870aW r3, C06890aY r4, String str, String str2, boolean z) {
        this.A01 = context;
        this.A04 = str;
        this.A03 = r3;
        this.A00 = r4;
        this.A02 = handler;
        this.A05 = str2;
        this.A06 = z;
    }
}
