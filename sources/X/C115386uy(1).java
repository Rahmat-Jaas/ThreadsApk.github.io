package X;

import java.util.List;

/* renamed from: X.6uy  reason: invalid class name and case insensitive filesystem */
public final class C115386uy {
    public final float A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115386uy) {
                C115386uy r8 = (C115386uy) obj;
                if (!(this.A02 == r8.A02 && this.A06 == r8.A06 && this.A04 == r8.A04 && this.A03 == r8.A03 && this.A08 == r8.A08 && Float.compare(this.A00, r8.A00) == 0 && this.A01 == r8.A01 && this.A09 == r8.A09 && C04220Ms.A0I(this.A07, r8.A07) && this.A05 == r8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A062 = C86104wH.A06(C86104wH.A06(C86104wH.A06(C86154wM.A04(this.A02), this.A06), this.A04), this.A03);
        boolean z = this.A08;
        int i = 1;
        if (z) {
            z = true;
        }
        int A052 = (C86104wH.A05((A062 + (z ? 1 : 0)) * 31, this.A00) + this.A01) * 31;
        if (!this.A09) {
            i = 0;
        }
        return C86134wK.A06(AnonymousClass0wJ.A05(this.A07, (A052 + i) * 31), this.A05);
    }

    public final String toString() {
        String str;
        StringBuilder A0s = C18190wL.A0s("PointerInputEventData(id=");
        A0s.append(AnonymousClass00U.A0G("PointerId(value=", ')', this.A02));
        A0s.append(", uptime=");
        A0s.append(this.A06);
        A0s.append(", positionOnScreen=");
        C86164wN.A14(this.A04, A0s);
        A0s.append(", position=");
        C86164wN.A14(this.A03, A0s);
        A0s.append(", down=");
        A0s.append(this.A08);
        A0s.append(", pressure=");
        A0s.append(this.A00);
        A0s.append(", type=");
        int i = this.A01;
        if (i == 1) {
            str = "Touch";
        } else if (i == 2) {
            str = "Mouse";
        } else if (i == 3) {
            str = "Stylus";
        } else if (i != 4) {
            str = "Unknown";
        } else {
            str = "Eraser";
        }
        A0s.append(str);
        A0s.append(", issuesEnterExit=");
        A0s.append(this.A09);
        A0s.append(", historical=");
        A0s.append(this.A07);
        A0s.append(", scrollDelta=");
        C86164wN.A14(this.A05, A0s);
        return C86114wI.A0q(A0s, ')');
    }

    public C115386uy(List list, float f, int i, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2) {
        this.A02 = j;
        this.A06 = j2;
        this.A04 = j3;
        this.A03 = j4;
        this.A08 = z;
        this.A00 = f;
        this.A01 = i;
        this.A09 = z2;
        this.A07 = list;
        this.A05 = j5;
    }
}
