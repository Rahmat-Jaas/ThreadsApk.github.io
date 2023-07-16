package X;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: X.6Rk  reason: invalid class name and case insensitive filesystem */
public final class C101476Rk {
    public static final void A00(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList);
        arrayList.clear();
        arrayList.addAll(linkedHashSet);
    }
}
