package X;

import android.os.Bundle;

/* renamed from: X.2GN  reason: invalid class name */
public final class AnonymousClass2GN {
    public static final Object A00(AnonymousClass601 r32, C63893iY r33) {
        String str;
        C63893iY r2 = r33;
        boolean A1Z = AnonymousClass0wJ.A1Z(r2, r32);
        AnonymousClass3HX A01 = C63893iY.A01(r2, 0);
        AnonymousClass1TP parseFromJson = AnonymousClass3N8.parseFromJson(C18180wK.A0L(C63893iY.A0D(r2, A1Z ? 1 : 0)));
        C10300i6 A0E = C63913ic.A0E(A01);
        C04220Ms.A06(parseFromJson);
        String str2 = parseFromJson.A01.A01;
        C04220Ms.A06(str2);
        String str3 = parseFromJson.A01.A03;
        if (str3 != null) {
            C62653aT.A02().A02(str2, str3);
        }
        AnonymousClass3DR r1 = parseFromJson.A01;
        if (!(!r1.A09 || (str = r1.A04) == null || str.length() == 0)) {
            AnonymousClass3YZ A02 = C62653aT.A02();
            String str4 = parseFromJson.A01.A01;
            C04220Ms.A06(str4);
            String str5 = parseFromJson.A01.A04;
            C04220Ms.A06(str5);
            A02.A03(str4, str5);
        }
        String str6 = parseFromJson.A01.A01;
        C04220Ms.A06(str6);
        C09120et A0X = C18190wL.A0X();
        if (A0X.A0E().contains(str6)) {
            A0X.A0G(AnonymousClass4WL.A02(str6, A0X.A0E()));
        }
        AnonymousClass3DR r0 = parseFromJson.A01;
        C04220Ms.A06(r0);
        AnonymousClass3Um r12 = parseFromJson.A00;
        Bundle A06 = C18180wK.A06();
        r12.A00(A06);
        C61753Vf A012 = C63463hW.A01();
        String str7 = r0.A05;
        String str8 = r0.A06;
        String str9 = r0.A01;
        String str10 = r0.A00;
        boolean z = r0.A0A;
        boolean z2 = r0.A0E;
        boolean z3 = r0.A0F;
        boolean z4 = r0.A0B;
        String str11 = r0.A02;
        boolean z5 = r0.A09;
        boolean z6 = z5;
        boolean z7 = z3;
        boolean z8 = z4;
        boolean z9 = z;
        boolean z10 = z2;
        String str12 = str11;
        boolean z11 = A1Z;
        String str13 = str9;
        String str14 = str10;
        String str15 = str7;
        String str16 = str8;
        Bundle bundle = A06;
        AnonymousClass0wJ.A19(A012.A02(bundle, str15, str16, str13, str14, str12, z11, z9, z10, z7, z8, false, z6, r0.A07, r0.A08), C63913ic.A05(r32), A0E);
        return null;
    }
}
