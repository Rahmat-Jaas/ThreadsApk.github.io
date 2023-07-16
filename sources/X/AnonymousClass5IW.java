package X;

import com.facebook.common.dextricks.Constants;
import com.instagram.user.model.User;
import org.webrtc.PeerConnectionFactory;

/* renamed from: X.5IW  reason: invalid class name */
public final class AnonymousClass5IW extends AnonymousClass0Sf {
    public final int A00;
    public final AnonymousClass8f5 A01;
    public final User A02;
    public final Integer A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5IW) {
                AnonymousClass5IW r5 = (AnonymousClass5IW) obj;
                if (!(this.A08 == r5.A08 && this.A07 == r5.A07 && this.A0F == r5.A0F && this.A0G == r5.A0G && this.A09 == r5.A09 && this.A0H == r5.A0H && C04220Ms.A0I(this.A01, r5.A01) && this.A03 == r5.A03 && this.A0I == r5.A0I && this.A0J == r5.A0J && C04220Ms.A0I(this.A02, r5.A02) && this.A0E == r5.A0E && this.A0C == r5.A0C && this.A0B == r5.A0B && this.A0A == r5.A0A && this.A06 == r5.A06 && C04220Ms.A0I(this.A04, r5.A04) && this.A05 == r5.A05 && this.A0D == r5.A0D && this.A00 == r5.A00 && this.A0L == r5.A0L && this.A0K == r5.A0K)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass5IW(AnonymousClass8f5 r2, User user, Integer num, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        C04220Ms.A0B(num, 8);
        this.A08 = z;
        this.A07 = z2;
        this.A0F = z3;
        this.A0G = z4;
        this.A09 = z5;
        this.A0H = z6;
        this.A01 = r2;
        this.A03 = num;
        this.A0I = z7;
        this.A0J = z8;
        this.A02 = user;
        this.A0E = z9;
        this.A0C = z10;
        this.A0B = z11;
        this.A0A = z12;
        this.A06 = z13;
        this.A04 = str;
        this.A05 = z14;
        this.A0D = z15;
        this.A00 = i;
        this.A0L = z16;
        this.A0K = z17;
    }

    public final int hashCode() {
        String str;
        boolean z = this.A08;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.A07;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.A0F;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.A0G;
        if (z4) {
            z4 = true;
        }
        int i5 = (i4 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.A09;
        if (z5) {
            z5 = true;
        }
        int i6 = (i5 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.A0H;
        if (z6) {
            z6 = true;
        }
        int A052 = AnonymousClass0wJ.A05(this.A01, (i6 + (z6 ? 1 : 0)) * 31);
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str = PeerConnectionFactory.TRIAL_ENABLED;
                break;
            case 2:
                str = "Pending";
                break;
            default:
                str = "Disabled";
                break;
        }
        int A0J2 = C86124wJ.A0J(str, intValue, A052);
        boolean z7 = this.A0I;
        if (z7) {
            z7 = true;
        }
        int i7 = (A0J2 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.A0J;
        if (z8) {
            z8 = true;
        }
        int A032 = (((i7 + (z8 ? 1 : 0)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31;
        boolean z9 = this.A0E;
        if (z9) {
            z9 = true;
        }
        int i8 = (A032 + (z9 ? 1 : 0)) * 31;
        boolean z10 = this.A0C;
        if (z10) {
            z10 = true;
        }
        int i9 = (i8 + (z10 ? 1 : 0)) * 31;
        boolean z11 = this.A0B;
        if (z11) {
            z11 = true;
        }
        int i10 = (i9 + (z11 ? 1 : 0)) * 31;
        boolean z12 = this.A0A;
        if (z12) {
            z12 = true;
        }
        int i11 = (i10 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.A06;
        if (z13) {
            z13 = true;
        }
        int A092 = (((i11 + (z13 ? 1 : 0)) * 31) + C18200wM.A09(this.A04)) * 31;
        boolean z14 = this.A05;
        if (z14) {
            z14 = true;
        }
        int i12 = (A092 + (z14 ? 1 : 0)) * 31;
        boolean z15 = this.A0D;
        if (z15) {
            z15 = true;
        }
        int i13 = (((i12 + (z15 ? 1 : 0)) * 31) + this.A00) * 31;
        boolean z16 = this.A0L;
        if (z16) {
            z16 = true;
        }
        int i14 = (i13 + (z16 ? 1 : 0)) * 31;
        if (!this.A0K) {
            i = 0;
        }
        return i14 + i;
    }

    public static /* synthetic */ AnonymousClass5IW A00(AnonymousClass5IW r28, AnonymousClass8f5 r29, User user, Integer num, String str, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i3 = i2;
        int i4 = i;
        boolean z18 = z10;
        boolean z19 = z;
        boolean z20 = z2;
        AnonymousClass8f5 r14 = r29;
        Integer num2 = num;
        boolean z21 = z3;
        boolean z22 = z4;
        User user2 = user;
        boolean z23 = z5;
        boolean z24 = z6;
        boolean z25 = z8;
        boolean z26 = z9;
        boolean z27 = z7;
        String str2 = str;
        AnonymousClass5IW r15 = r28;
        if ((i2 & 1) != 0) {
            z11 = r15.A08;
        } else {
            z11 = false;
        }
        if ((i2 & 2) != 0) {
            z12 = r15.A07;
        } else {
            z12 = false;
        }
        if ((i2 & 4) != 0) {
            z19 = r15.A0F;
        }
        if ((i2 & 8) != 0) {
            z20 = r15.A0G;
        }
        if ((i2 & 16) != 0) {
            z13 = r15.A09;
        } else {
            z13 = false;
        }
        if ((i2 & 32) != 0) {
            z14 = r15.A0H;
        } else {
            z14 = false;
        }
        if ((i2 & 64) != 0) {
            r14 = r15.A01;
        }
        if ((i3 & 128) != 0) {
            num2 = r15.A03;
        }
        if ((i3 & 256) != 0) {
            z21 = r15.A0I;
        }
        if ((i3 & 512) != 0) {
            z22 = r15.A0J;
        }
        if ((i3 & 1024) != 0) {
            user2 = r15.A02;
        }
        if ((i3 & 2048) != 0) {
            z23 = r15.A0E;
        }
        if ((i3 & 4096) != 0) {
            z24 = r15.A0C;
        }
        if ((i3 & 8192) != 0) {
            z27 = r15.A0B;
        }
        if ((i3 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            z15 = r15.A0A;
        } else {
            z15 = false;
        }
        if ((i2 & 32768) != 0) {
            z25 = r15.A06;
        }
        if ((i2 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            str2 = r15.A04;
        }
        if ((i2 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            z26 = r15.A05;
        }
        if ((i2 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            z18 = r15.A0D;
        }
        if ((i2 & 524288) != 0) {
            i4 = r15.A00;
        }
        if ((i2 & 1048576) != 0) {
            z16 = r15.A0L;
        } else {
            z16 = false;
        }
        if ((i2 & 2097152) != 0) {
            z17 = r15.A0K;
        } else {
            z17 = false;
        }
        C86104wH.A1P(r14, 6, num2);
        boolean z28 = z19;
        boolean z29 = z20;
        boolean z30 = z21;
        boolean z31 = z22;
        return new AnonymousClass5IW(r14, user2, num2, str2, i4, z11, z12, z28, z29, z13, z14, z30, z31, z23, z24, z27, z15, z25, z26, z18, z16, z17);
    }

    public AnonymousClass5IW() {
        this(C133487vm.A00, (User) null, AnonymousClass006.A00, (String) null, 2131828120, true, true, false, true, true, true, false, false, false, false, false, true, false, false, true, true, true);
    }
}
