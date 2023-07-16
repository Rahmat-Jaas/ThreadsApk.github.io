package X;

import android.content.ComponentName;
import android.net.Uri;

/* renamed from: X.7Em  reason: invalid class name */
public final class AnonymousClass7Em {
    public static final Uri A04 = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final ComponentName A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7Em) {
                AnonymousClass7Em r5 = (AnonymousClass7Em) obj;
                if (!C117046y2.A01(this.A01, r5.A01) || !C117046y2.A01(this.A02, r5.A02) || !C117046y2.A01(this.A00, r5.A00) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass7Em(String str, boolean z) {
        C13320nQ.A03(str);
        this.A01 = str;
        C13320nQ.A03("com.google.android.gms");
        this.A02 = "com.google.android.gms";
        this.A00 = null;
        this.A03 = z;
    }

    public final int hashCode() {
        return C86154wM.A05(this.A01, this.A02, this.A00, 4225, Boolean.valueOf(this.A03));
    }

    public final String toString() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.A00;
        C13320nQ.A01(componentName);
        return componentName.flattenToString();
    }

    public AnonymousClass7Em(ComponentName componentName) {
        this.A01 = null;
        this.A02 = null;
        C13320nQ.A01(componentName);
        this.A00 = componentName;
        this.A03 = false;
    }
}
