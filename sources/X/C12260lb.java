package X;

import java.util.Map;

/* renamed from: X.0lb  reason: invalid class name and case insensitive filesystem */
public final class C12260lb implements AnonymousClass0WM {
    public String A00 = null;
    public final /* synthetic */ C02970Dp A01;
    public final /* synthetic */ Map A02;

    public final void DAd(String str, double d) {
    }

    public final void DAg(String str, String str2) {
    }

    public final void DAh(String str, boolean z) {
    }

    public final void DAi(String str, int[] iArr) {
    }

    public final void DAj(String str, long[] jArr) {
    }

    public final void DAk(String str, String[] strArr) {
    }

    public C12260lb(C02970Dp r2, Map map) {
        this.A01 = r2;
        this.A02 = map;
    }

    public final void DAe(String str, int i) {
        String str2 = this.A00;
        Map map = this.A02;
        if (str2 != null) {
            str = AnonymousClass00U.A0V(str2, ".", str);
        }
        map.put(str, Long.valueOf((long) i));
    }

    public final void DAf(String str, long j) {
        String str2 = this.A00;
        Map map = this.A02;
        if (str2 != null) {
            str = AnonymousClass00U.A0V(str2, ".", str);
        }
        map.put(str, Long.valueOf(j));
    }

    public final void DAm(String str) {
        this.A00 = str;
    }
}
