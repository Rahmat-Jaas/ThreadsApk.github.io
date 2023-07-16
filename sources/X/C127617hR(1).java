package X;

import android.content.Context;

/* renamed from: X.7hR  reason: invalid class name and case insensitive filesystem */
public final class C127617hR implements Mcm {
    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        if (obj3 == null || obj4 == null) {
            return false;
        }
        C108796ix r6 = (C108796ix) obj3;
        C108796ix r7 = (C108796ix) obj4;
        return (r6.A01 == r7.A01 && r6.A00 == r7.A00 && r6.A02.equals(r7.A02)) ? false : true;
    }

    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        C90975fO r4 = (C90975fO) obj2;
        if (obj3 != null) {
            r4.A0D.A00((C108796ix) obj3);
            return null;
        }
        throw C18180wK.A0a("List data was not computed during layout");
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
    }
}
