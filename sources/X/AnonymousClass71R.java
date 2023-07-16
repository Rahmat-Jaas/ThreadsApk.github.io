package X;

import androidx.compose.ui.Modifier;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.common.typedurl.SimpleImageUrl;
import kotlin.coroutines.jvm.internal.KtSLambdaShape15S0100000_I2_4;
import kotlin.jvm.internal.IDxRImplShape181S0000000_1_I2;
import kotlin.jvm.internal.KtLambdaShape2S0211000_I2;

/* renamed from: X.71R  reason: invalid class name */
public final class AnonymousClass71R {
    public static final void A00(C147188nY r20, int i) {
        C147188nY r4 = r20;
        r4.Cvd(-983071018);
        int i2 = i;
        if (i != 0 || !r4.BCM()) {
            AnonymousClass7I9.A02(r4, AnonymousClass7K4.A06(AnonymousClass7Kq.A06(Modifier.A00, (float) 48), (float) 16, 14), AnonymousClass7J9.A00(r4), (C114236su) null, (C134817yQ) null, (C121117Ee) null, AnonymousClass7JS.A01(r4, 2131836378), 0, 1, 2, 805306416, 6, HttpStatus.SC_GATEWAY_TIMEOUT, AnonymousClass7KB.A02(r4), 0, false);
        } else {
            r4.CuJ();
        }
        C147178nW AKE = r4.AKE();
        if (AKE != null) {
            C147178nW.A00(AKE, i2, 10);
        }
    }

    public static final void A01(C147188nY r41, AnonymousClass3CJ r42, String str, String str2, String str3, String str4, String str5, String str6, String str7, AnonymousClass0YP r50, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        int i3;
        int i4;
        SimpleImageUrl simpleImageUrl;
        SimpleImageUrl simpleImageUrl2;
        C146798ms r4;
        C146798ms r43;
        Object A13;
        Object A132;
        AnonymousClass3CJ r9 = r42;
        String str8 = str7;
        C86154wM.A1R(str8, 10, r9);
        C147188nY r10 = r41;
        r10.Cvd(1965213489);
        int i5 = i;
        if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r10, str) | i;
        } else {
            i3 = i5;
        }
        String str9 = str2;
        if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r10, str9);
        }
        int i6 = 256;
        String str10 = str3;
        if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r10, str10);
        }
        String str11 = str4;
        if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0I(r10, str11);
        }
        String str12 = str5;
        if ((i & 57344) == 0) {
            i3 |= C147188nY.A0J(r10, str12);
        }
        String str13 = str6;
        if ((i & 458752) == 0) {
            i3 |= C147188nY.A0K(r10, str13);
        }
        boolean z5 = z;
        if ((i & 3670016) == 0) {
            i3 |= C86104wH.A01(r10.ACZ(z5) ? 1 : 0);
        }
        boolean z6 = z2;
        if ((i & 29360128) == 0) {
            i3 |= C86104wH.A04(r10.ACZ(z6) ? 1 : 0);
        }
        boolean z7 = z3;
        if ((i & 234881024) == 0) {
            i3 |= C86104wH.A03(r10.ACZ(z7) ? 1 : 0);
        }
        boolean z8 = z4;
        if ((i & 1879048192) == 0) {
            i3 |= C86104wH.A02(r10.ACZ(z8) ? 1 : 0);
        }
        int i7 = i2;
        if ((i2 & 14) == 0) {
            i4 = i2 | C147188nY.A0F(r10, str8);
        } else {
            i4 = i7;
        }
        if ((i2 & 112) == 0) {
            i4 |= C147188nY.A0G(r10, r9);
        }
        AnonymousClass0YP r39 = r50;
        if ((i7 & 896) == 0) {
            if (!r10.ACa(r39)) {
                i6 = 128;
            }
            i4 |= i6;
        }
        if ((i3 & 1533916891) == 306783378 && (i4 & 731) == 146 && r10.BCM()) {
            r10.CuJ();
        } else {
            SimpleImageUrl A0K = C18250wR.A0K(str);
            if (str5 != null) {
                simpleImageUrl = C18250wR.A0K(str12);
            } else {
                simpleImageUrl = null;
            }
            if (str6 != null) {
                simpleImageUrl2 = C18250wR.A0K(str13);
            } else {
                simpleImageUrl2 = null;
            }
            if (!z2) {
                r4 = C132837ua.A00;
            } else if (simpleImageUrl == null) {
                r4 = C132847ub.A00;
            } else {
                if (simpleImageUrl2 == null) {
                    r43 = new AnonymousClass5MU(simpleImageUrl);
                } else {
                    r43 = new AnonymousClass5MV(simpleImageUrl, simpleImageUrl2);
                }
                float f = (float) 16;
                float f2 = (float) 0;
                float f3 = (float) 56;
                AnonymousClass5I7 r13 = new AnonymousClass5I7(new AnonymousClass7V9(f, f2, f, f2), (float) 80, f3, f3);
                boolean A1T = AnonymousClass0wJ.A1T(i4 & 112, 32);
                AnonymousClass7W3 r3 = (AnonymousClass7W3) r10;
                A13 = r3.A13();
                if (A1T || A13 == AnonymousClass7GN.A00) {
                    A13 = new IDxRImplShape181S0000000_1_I2(r9, 5);
                    r3.A14(A13);
                }
                int i8 = i3 << 3;
                C147188nY r20 = r10;
                C146798ms r23 = r43;
                AnonymousClass5I7 r24 = r13;
                String str14 = str9;
                String str15 = str10;
                String str16 = str11;
                AnonymousClass0ZU r28 = (AnonymousClass0ZU) ((AnonymousClass0A8) A13);
                C121747Hv.A00(r20, (Modifier) null, A0K, r23, r24, str14, str15, str16, r28, (AnonymousClass0YY) null, AnonymousClass7JR.A00(r10, new KtLambdaShape2S0211000_I2(r39, r9, i4, 0, z5), -1367340940), (i3 & 234881024) | C86144wL.A04(i3 & 112, i8 & 7168, i8, 57344) | ((i3 >> 6) & 29360128), 3080, 4196, false, false, z8, z7);
                boolean A0y = C147188nY.A0y(r10, r9);
                A132 = r3.A13();
                if (A0y || A132 == AnonymousClass7GN.A00) {
                    A132 = new KtSLambdaShape15S0100000_I2_4(r9, (C146958n9) null, 15);
                    r3.A14(A132);
                }
                AnonymousClass7W3.A0b(r10, r3, A132, str8, false);
            }
            r43 = r4;
            float f4 = (float) 16;
            float f22 = (float) 0;
            float f32 = (float) 56;
            AnonymousClass5I7 r132 = new AnonymousClass5I7(new AnonymousClass7V9(f4, f22, f4, f22), (float) 80, f32, f32);
            boolean A1T2 = AnonymousClass0wJ.A1T(i4 & 112, 32);
            AnonymousClass7W3 r32 = (AnonymousClass7W3) r10;
            A13 = r32.A13();
            A13 = new IDxRImplShape181S0000000_1_I2(r9, 5);
            r32.A14(A13);
            int i82 = i3 << 3;
            C147188nY r202 = r10;
            C146798ms r232 = r43;
            AnonymousClass5I7 r242 = r132;
            String str142 = str9;
            String str152 = str10;
            String str162 = str11;
            AnonymousClass0ZU r282 = (AnonymousClass0ZU) ((AnonymousClass0A8) A13);
            C121747Hv.A00(r202, (Modifier) null, A0K, r232, r242, str142, str152, str162, r282, (AnonymousClass0YY) null, AnonymousClass7JR.A00(r10, new KtLambdaShape2S0211000_I2(r39, r9, i4, 0, z5), -1367340940), (i3 & 234881024) | C86144wL.A04(i3 & 112, i82 & 7168, i82, 57344) | ((i3 >> 6) & 29360128), 3080, 4196, false, false, z8, z7);
            boolean A0y2 = C147188nY.A0y(r10, r9);
            A132 = r32.A13();
            A132 = new KtSLambdaShape15S0100000_I2_4(r9, (C146958n9) null, 15);
            r32.A14(A132);
            AnonymousClass7W3.A0b(r10, r32, A132, str8, false);
        }
        C147178nW AKE = r10.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new AnonymousClass8U6(r9, str, str9, str10, str11, str12, str13, str8, r39, i5, i7, z5, z6, z7, z8));
        }
    }
}
