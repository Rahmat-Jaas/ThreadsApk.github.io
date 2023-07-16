package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebookpay.otc.models.OtcInput;
import com.google.common.collect.ImmutableList;

/* renamed from: X.7Et  reason: invalid class name and case insensitive filesystem */
public final class C121207Et {
    public ImmutableList A00;
    public final GQLCallInputCInputShape0S0000000 A01;
    public final GQLCallInputCInputShape0S0000000 A02;
    public final OtcInput A03;
    public final ImmutableList A04;
    public final ImmutableList A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C121207Et) {
                C121207Et r5 = (C121207Et) obj;
                if (!C04220Ms.A0I(this.A0E, r5.A0E) || !C04220Ms.A0I(this.A0D, r5.A0D) || !C04220Ms.A0I(this.A0B, r5.A0B) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A0A, r5.A0A) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A08, r5.A08) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A0C, r5.A0C) || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A09, r5.A09) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C121207Et A00(C121207Et r25, OtcInput otcInput, ImmutableList immutableList, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        ImmutableList immutableList2;
        ImmutableList immutableList3;
        GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S0000000;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        OtcInput otcInput2 = otcInput;
        ImmutableList immutableList4 = immutableList;
        GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S00000002 = null;
        int i2 = i;
        C121207Et r14 = r25;
        if ((i & 1) != 0) {
            str = r14.A0E;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = r14.A0D;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = r14.A0B;
        } else {
            str3 = null;
        }
        if ((i & 8) != 0) {
            immutableList4 = r14.A00;
        }
        if ((i & 16) != 0) {
            str4 = r14.A0A;
        } else {
            str4 = null;
        }
        if ((i & 32) != 0) {
            immutableList2 = r14.A05;
        } else {
            immutableList2 = null;
        }
        if ((i & 64) != 0) {
            immutableList3 = r14.A04;
        } else {
            immutableList3 = null;
        }
        if ((i2 & 128) != 0) {
            gQLCallInputCInputShape0S0000000 = r14.A01;
        } else {
            gQLCallInputCInputShape0S0000000 = null;
        }
        if ((i2 & 256) != 0) {
            str5 = r14.A08;
        } else {
            str5 = null;
        }
        if ((i2 & 512) != 0) {
            str6 = r14.A06;
        } else {
            str6 = null;
        }
        if ((i2 & 1024) != 0) {
            str7 = r14.A0C;
        } else {
            str7 = null;
        }
        if ((i2 & 2048) != 0) {
            str8 = r14.A07;
        } else {
            str8 = null;
        }
        if ((i2 & 4096) != 0) {
            str9 = r14.A09;
        } else {
            str9 = null;
        }
        if ((i2 & 8192) != 0) {
            otcInput2 = r14.A03;
        }
        if ((i2 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            gQLCallInputCInputShape0S00000002 = r14.A02;
        }
        AnonymousClass0wJ.A1N(str, str2);
        AnonymousClass0wJ.A1Q(str3, immutableList4);
        C18190wL.A1S(str4, 4, immutableList2);
        C18210wN.A1M(immutableList3, 6, str5);
        return new C121207Et(gQLCallInputCInputShape0S0000000, gQLCallInputCInputShape0S00000002, otcInput2, immutableList4, immutableList2, immutableList3, str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public final int hashCode() {
        int A052 = AnonymousClass0wJ.A05(this.A05, AnonymousClass0wJ.A07(this.A0A, AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A07(this.A0B, AnonymousClass0wJ.A07(this.A0D, C18180wK.A03(this.A0E))))));
        return ((((((((((AnonymousClass0wJ.A07(this.A08, (AnonymousClass0wJ.A05(this.A04, A052) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A06(this.A06)) * 31) + AnonymousClass0wJ.A06(this.A0C)) * 31) + AnonymousClass0wJ.A06(this.A07)) * 31) + AnonymousClass0wJ.A06(this.A09)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + C18200wM.A07(this.A02);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ComponentDataQueryInput(sessionId=");
        A0s.append(this.A0E);
        A0s.append(AnonymousClass000.A00(526));
        A0s.append(this.A0D);
        A0s.append(", paymentProductId=");
        A0s.append(this.A0B);
        A0s.append(", componentTypes=");
        A0s.append(this.A00);
        A0s.append(", paymentContainerMode=");
        A0s.append(this.A0A);
        A0s.append(", supportedContainerTypes=");
        A0s.append(this.A05);
        A0s.append(", paymentActionTypes=");
        A0s.append(this.A04);
        A0s.append(", chargeAmount=");
        A0s.append(this.A01);
        A0s.append(", fetchType=");
        A0s.append(this.A08);
        A0s.append(", clientReceiverId=");
        A0s.append(this.A06);
        A0s.append(", receiverId=");
        A0s.append(this.A0C);
        A0s.append(", ecpUserExperienceType=");
        A0s.append(this.A07);
        A0s.append(", orderId=");
        A0s.append(this.A09);
        A0s.append(", otcInput=");
        A0s.append(this.A03);
        A0s.append(", otcComponentInput=");
        return C86104wH.A0y(this.A02, A0s);
    }

    public C121207Et(GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S0000000, GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S00000002, OtcInput otcInput, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        AnonymousClass0wJ.A1O(str, str2);
        C18190wL.A1S(str3, 3, str4);
        C04220Ms.A0B(str5, 9);
        this.A0E = str;
        this.A0D = str2;
        this.A0B = str3;
        this.A00 = immutableList;
        this.A0A = str4;
        this.A05 = immutableList2;
        this.A04 = immutableList3;
        this.A01 = gQLCallInputCInputShape0S0000000;
        this.A08 = str5;
        this.A06 = str6;
        this.A0C = str7;
        this.A07 = str8;
        this.A09 = str9;
        this.A03 = otcInput;
        this.A02 = gQLCallInputCInputShape0S00000002;
    }

    public static C104996ci A01(C121207Et r1, Object obj) {
        ImmutableList of = ImmutableList.of(obj);
        C04220Ms.A06(of);
        r1.A00 = of;
        return AnonymousClass7Kz.A0C();
    }
}
