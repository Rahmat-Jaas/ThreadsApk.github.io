package X;

import android.content.res.Resources;

/* renamed from: X.0u3  reason: invalid class name */
public final class AnonymousClass0u3 implements C16380sx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Resources A02;

    public AnonymousClass0u3(Resources resources, int i, int i2) {
        this.A02 = resources;
        this.A00 = i;
        this.A01 = i2;
    }

    public final String buildString(String... strArr) {
        return this.A02.getQuantityString(this.A00, this.A01, strArr);
    }
}
