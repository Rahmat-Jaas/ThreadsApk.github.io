package X;

import java.util.Set;

/* renamed from: X.7do  reason: invalid class name and case insensitive filesystem */
public final class C125677do implements C146988nC {
    public final IT9 A00;
    public final Set A01;

    public static C125677do A00(C37295Joc joc) {
        return new C125677do(joc.A05(joc.A03((C36853Jfk) null, 341716450), "dcp_ig4a"));
    }

    public static boolean A01(C125677do r1, String str) {
        C04220Ms.A0B(str, 0);
        return r1.A00.hasKey(str);
    }

    public final String getString(String str) {
        C04220Ms.A0B(str, 0);
        IT9 it9 = this.A00;
        if (it9.hasKey(str)) {
            byte[] CZA = it9.CZA(str);
            if (CZA == null) {
                CZA = new byte[0];
            }
            return new String(CZA, AnonymousClass74V.A05);
        }
        throw new C97426Bh();
    }

    public C125677do(IT9 it9) {
        this.A00 = it9;
        it9.getItemCount();
        Set allKeys = it9.getAllKeys();
        C04220Ms.A06(allKeys);
        this.A01 = allKeys;
        it9.getSizeBytes();
    }

    public final void CYP(String str, String str2, long j) {
        AnonymousClass0wJ.A1N(str, str2);
        byte[] A002 = AnonymousClass74V.A00(str2);
        IT9 it9 = this.A00;
        it9.DBJ(str, A002);
        it9.A00.A00.A03(Long.valueOf(System.currentTimeMillis() + j), str, I17.A00(627));
    }
}
