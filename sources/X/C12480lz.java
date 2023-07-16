package X;

import android.text.TextUtils;

/* renamed from: X.0lz  reason: invalid class name and case insensitive filesystem */
public final class C12480lz implements AnonymousClass0PW {
    public final /* synthetic */ String A00;

    public C12480lz(String str) {
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        String str = this.A00;
        if (TextUtils.isEmpty(str)) {
            return "unset";
        }
        return str;
    }
}
