package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.03f  reason: invalid class name and case insensitive filesystem */
public final class C007403f implements C003901u {
    public int A00;
    public int A01;
    public ClipData A02;
    public Uri A03;
    public Bundle A04;

    public final C004101w AB3() {
        return new C004101w(new AnonymousClass03E(this));
    }

    public C007403f(ClipData clipData, int i) {
        this.A02 = clipData;
        this.A01 = i;
    }

    public final void Cl9(int i) {
        this.A00 = i;
    }

    public final void CmY(Uri uri) {
        this.A03 = uri;
    }

    public final void setExtras(Bundle bundle) {
        this.A04 = bundle;
    }
}
