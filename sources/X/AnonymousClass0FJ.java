package X;

import android.content.Context;
import java.io.File;
import java.io.InputStream;

/* renamed from: X.0FJ  reason: invalid class name */
public abstract class AnonymousClass0FJ {
    public File A00;
    public final String A01;
    public final String A02;

    public void A01(boolean z) {
    }

    public abstract boolean A02(Context context, byte[] bArr);

    public AnonymousClass0FJ(String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
    }

    public InputStream A00(Context context) {
        return context.getAssets().open(this.A02, 2);
    }
}
