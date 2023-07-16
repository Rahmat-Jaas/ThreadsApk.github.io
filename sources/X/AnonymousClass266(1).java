package X;

import android.text.TextUtils;

/* renamed from: X.266  reason: invalid class name */
public enum AnonymousClass266 {
    A07("", 0, "UNKNOWN"),
    A06("personal", 1, "PERSONAL"),
    A04("business", 2, "BUSINESS"),
    A05("creator", 3, "CREATOR");
    
    public final int A00;
    public final String A01;
    public final String A02;

    /* access modifiers changed from: public */
    AnonymousClass266(String str, int i, String str2) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }

    public static AnonymousClass266 A00(int i) {
        for (AnonymousClass266 r1 : values()) {
            if (r1.A00 == i) {
                return r1;
            }
        }
        throw C18190wL.A0a("Unsupported UserAccountType");
    }

    public static AnonymousClass266 A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (AnonymousClass266 r4 : values()) {
            if (r4.A01.equals(str)) {
                return r4;
            }
        }
        throw C18190wL.A0a(AnonymousClass00U.A0L("Unsupported UserAccountType, logName: ", str));
    }
}
