package X;

import android.text.TextUtils;

/* renamed from: X.3V7  reason: invalid class name */
public final class AnonymousClass3V7 {
    public Integer A00;
    public String A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.A01, ((AnonymousClass3V7) obj).A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public AnonymousClass3V7(C81604o4 r2, int i) {
        this.A01 = ((AnonymousClass2AQ) r2).name();
        this.A00 = Integer.valueOf(i);
    }

    public AnonymousClass3V7() {
    }
}
