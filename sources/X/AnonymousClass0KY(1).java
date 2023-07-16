package X;

import android.text.TextUtils;
import android.util.Pair;

/* renamed from: X.0KY  reason: invalid class name */
public final class AnonymousClass0KY {
    public static volatile AnonymousClass0KY A02;
    public final AnonymousClass0KX A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.A01;
        String str2 = ((AnonymousClass0KY) obj).A01;
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public static AnonymousClass0KY A00() {
        AnonymousClass0KY r0 = A02;
        if (r0 == null) {
            r0 = A01(AnonymousClass0Ep.A00().getProcessName());
            A02 = r0;
            if (TextUtils.isEmpty(r0.A01)) {
                Pair A002 = C03620Ka.A00("/proc/self/cmdline");
                if (TextUtils.isEmpty((CharSequence) A002.first) || (r0 = A01((String) A002.first)) == null) {
                    return A02;
                }
                A02 = r0;
            }
        }
        return r0;
    }

    public static AnonymousClass0KY A01(String str) {
        String str2;
        AnonymousClass0KX r0;
        if (str == null) {
            return new AnonymousClass0KY((AnonymousClass0KX) null, (String) null);
        }
        String[] split = str.split(":");
        if (split.length > 1) {
            str2 = split[1];
            if (str2 == null) {
                throw new IllegalArgumentException("Invalid name");
            }
        } else {
            str2 = "";
        }
        if ("".equals(str2)) {
            r0 = AnonymousClass0KX.A01;
        } else {
            r0 = new AnonymousClass0KX(str2);
        }
        return new AnonymousClass0KY(r0, str);
    }

    public final String A02() {
        if (this.A01 == null) {
            return "<unknown>";
        }
        if (A03()) {
            return "<default>";
        }
        AnonymousClass0KX r0 = this.A00;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public final boolean A03() {
        return AnonymousClass0KX.A01.equals(this.A00);
    }

    public final int hashCode() {
        String str = this.A01;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String str = this.A01;
        if (str == null) {
            return "<unknown>";
        }
        return str;
    }

    public AnonymousClass0KY(AnonymousClass0KX r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public AnonymousClass0KY() {
        this((AnonymousClass0KX) null, (String) null);
    }
}
