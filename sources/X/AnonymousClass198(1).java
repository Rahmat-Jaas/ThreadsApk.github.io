package X;

import com.instagram.user.model.User;

/* renamed from: X.198  reason: invalid class name */
public final class AnonymousClass198 extends AnonymousClass0Sf implements C41882MfV {
    public boolean A00;
    public final C57943Dd A01;
    public final C57943Dd A02;
    public final C57943Dd A03;
    public final C170019uI A04;
    public final C170019uI A05;
    public final User A06;
    public final Integer A07;
    public final Integer A08;
    public final boolean A09;

    public /* synthetic */ AnonymousClass198(C57943Dd r7, C57943Dd r8, C170019uI r9, User user, Integer num, Integer num2, int i, boolean z, boolean z2) {
        C57943Dd r1;
        C170019uI r2 = null;
        r7 = (i & 4) != 0 ? AnonymousClass2LU.A00("") : r7;
        r9 = (i & 8) != 0 ? C170019uI.SECONDARY : r9;
        num2 = (i & 16) != 0 ? AnonymousClass006.A0Y : num2;
        if ((i & 32) != 0) {
            r1 = AnonymousClass2LU.A00("");
        } else {
            r1 = null;
        }
        r2 = (i & 64) != 0 ? C170019uI.UNKNOWN : r2;
        boolean A1R = C18240wQ.A1R(i & 128, z);
        boolean A1R2 = C18240wQ.A1R(i & 256, z2);
        r8 = (i & 1024) != 0 ? AnonymousClass2LU.A00("") : r8;
        C04220Ms.A0B(user, 1);
        AnonymousClass0wJ.A1R(r7, r9);
        C18230wP.A1R(num2, 5, r1);
        C04220Ms.A0B(r2, 7);
        C04220Ms.A0B(r8, 11);
        this.A06 = user;
        this.A07 = num;
        this.A02 = r7;
        this.A04 = r9;
        this.A08 = num2;
        this.A03 = r1;
        this.A05 = r2;
        this.A00 = A1R;
        this.A09 = A1R2;
        this.A01 = r8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass198) {
                AnonymousClass198 r5 = (AnonymousClass198) obj;
                if (!(C04220Ms.A0I(this.A06, r5.A06) && this.A07 == r5.A07 && C04220Ms.A0I(this.A02, r5.A02) && this.A04 == r5.A04 && this.A08 == r5.A08 && C04220Ms.A0I(this.A03, r5.A03) && this.A05 == r5.A05 && this.A00 == r5.A00 && this.A09 == r5.A09 && C04220Ms.A0I(this.A01, r5.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C04220Ms.A0B(obj, 0);
        return equals(obj);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A06.getId();
    }

    public final int hashCode() {
        int A052 = AnonymousClass0wJ.A05(this.A02, (C18210wN.A04(this.A06) + C34352Jf.A00(this.A07)) * 31);
        int A053 = AnonymousClass0wJ.A05(this.A05, AnonymousClass0wJ.A05(this.A03, (AnonymousClass0wJ.A05(this.A04, A052) + C34352Jf.A00(this.A08)) * 31));
        boolean z = this.A00;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A053 + (z ? 1 : 0)) * 31;
        if (!this.A09) {
            i = 0;
        }
        return C18220wO.A06(this.A01, (i2 + i) * 31 * 31);
    }
}
