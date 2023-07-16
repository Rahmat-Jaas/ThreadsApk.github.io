package X;

import java.util.AbstractCollection;
import java.util.HashMap;

/* renamed from: X.73y  reason: invalid class name and case insensitive filesystem */
public final class C1192073y {
    public static final HashMap A00 = AnonymousClass0wJ.A0y();
    public static final HashMap A01 = AnonymousClass0wJ.A0y();

    public static final void A00(String str, String str2) {
        HashMap hashMap = A00;
        if (!hashMap.containsKey(str2)) {
            hashMap.put(str2, AnonymousClass4WM.A04(str));
            return;
        }
        AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(str2);
        if (abstractCollection != null) {
            abstractCollection.add(str);
        }
    }
}
