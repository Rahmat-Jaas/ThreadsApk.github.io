package X;

import android.content.res.Resources;

/* renamed from: X.0u1  reason: invalid class name and case insensitive filesystem */
public final class C16940u1 implements C16380sx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Resources A01;

    public C16940u1(Resources resources, int i) {
        this.A01 = resources;
        this.A00 = i;
    }

    public final String buildString(String... strArr) {
        return this.A01.getString(this.A00, strArr);
    }
}
