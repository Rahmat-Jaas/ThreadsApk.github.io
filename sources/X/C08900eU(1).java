package X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0eU  reason: invalid class name and case insensitive filesystem */
public final class C08900eU implements AnonymousClass0WM {
    public Map A00;
    public final /* synthetic */ AnonymousClass0WN A01;
    public final /* synthetic */ Map A02;

    public C08900eU(AnonymousClass0WN r1, Map map) {
        this.A01 = r1;
        this.A02 = map;
    }

    public final void DAd(String str, double d) {
        this.A00.put(str, String.valueOf(d));
    }

    public final void DAe(String str, int i) {
        this.A00.put(str, String.valueOf(i));
    }

    public final void DAf(String str, long j) {
        this.A00.put(str, String.valueOf(j));
    }

    public final void DAg(String str, String str2) {
        this.A00.put(str, str2);
    }

    public final void DAh(String str, boolean z) {
        this.A00.put(str, String.valueOf(z));
    }

    public final void DAi(String str, int[] iArr) {
        this.A00.put(str, Arrays.toString(iArr));
    }

    public final void DAj(String str, long[] jArr) {
        this.A00.put(str, Arrays.toString(jArr));
    }

    public final void DAk(String str, String[] strArr) {
        this.A00.put(str, Arrays.toString(strArr));
    }

    public final void DAm(String str) {
        HashMap hashMap = new HashMap();
        this.A00 = hashMap;
        this.A02.put(str, hashMap);
    }
}
