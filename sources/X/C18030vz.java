package X;

import java.util.LinkedHashMap;

/* renamed from: X.0vz  reason: invalid class name and case insensitive filesystem */
public final class C18030vz {
    public final AnonymousClass0Jz A00 = new C12400lq();

    public final void A00(String[] strArr, String[] strArr2, int i) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        AnonymousClass0w0 r4 = new AnonymousClass0w0();
        if (strArr == null) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new LinkedHashMap();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                linkedHashMap.put(strArr[i2], Integer.valueOf(i2));
            }
        }
        r4.A00 = linkedHashMap;
        if (strArr2 == null) {
            linkedHashMap2 = null;
        } else {
            linkedHashMap2 = new LinkedHashMap();
            for (int i3 = 0; i3 < strArr2.length; i3++) {
                linkedHashMap2.put(strArr2[i3], Integer.valueOf(i3));
            }
        }
        r4.A01 = linkedHashMap2;
        this.A00.put(i, r4);
    }
}
