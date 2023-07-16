package X;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;

/* renamed from: X.7Es  reason: invalid class name and case insensitive filesystem */
public final class C121197Es {
    public AnonymousClass75M A00;
    public Float A01;
    public List A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final boolean A0A;
    public final boolean A0B;

    public C121197Es(List list, float f, int i, long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2) {
        this.A04 = j;
        this.A09 = j2;
        this.A05 = j3;
        this.A0A = z;
        this.A07 = j4;
        this.A06 = j5;
        this.A0B = z2;
        this.A03 = i;
        this.A08 = j6;
        this.A00 = new AnonymousClass75M(false, false);
        this.A01 = Float.valueOf(f);
        this.A02 = list;
    }

    public static void A00(C121197Es r2, AnonymousClass0YY r3) {
        r3.invoke(new AnonymousClass7KC(r2.A05));
    }

    public final void A01() {
        AnonymousClass75M r1 = this.A00;
        r1.A00 = true;
        r1.A01 = true;
    }

    public final boolean A02() {
        AnonymousClass75M r1 = this.A00;
        if (r1.A00 || r1.A01) {
            return true;
        }
        return false;
    }

    public final String toString() {
        float f;
        String str;
        StringBuilder A0s = C18190wL.A0s("PointerInputChange(id=");
        A0s.append(AnonymousClass00U.A0G("PointerId(value=", ')', this.A04));
        A0s.append(", uptimeMillis=");
        A0s.append(this.A09);
        A0s.append(", position=");
        C86164wN.A14(this.A05, A0s);
        A0s.append(", pressed=");
        A0s.append(this.A0A);
        A0s.append(", pressure=");
        Float f2 = this.A01;
        if (f2 != null) {
            f = f2.floatValue();
        } else {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        A0s.append(f);
        A0s.append(", previousUptimeMillis=");
        A0s.append(this.A07);
        A0s.append(", previousPosition=");
        C86164wN.A14(this.A06, A0s);
        A0s.append(", previousPressed=");
        A0s.append(this.A0B);
        A0s.append(", isConsumed=");
        A0s.append(A02());
        A0s.append(", type=");
        int i = this.A03;
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
        A0s.append(", historical=");
        Object obj = this.A02;
        if (obj == null) {
            obj = AnonymousClass0ZV.A00;
        }
        A0s.append(obj);
        A0s.append(",scrollDelta=");
        C86164wN.A14(this.A08, A0s);
        return C86114wI.A0q(A0s, ')');
    }

    public /* synthetic */ C121197Es(float f, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2) {
        long j6 = AnonymousClass7KC.A03;
        this.A04 = j;
        this.A09 = j2;
        this.A05 = j3;
        this.A0A = false;
        this.A07 = j4;
        this.A06 = j5;
        this.A0B = z;
        this.A03 = 1;
        this.A08 = j6;
        boolean z3 = z2;
        this.A00 = new AnonymousClass75M(z3, z3);
        this.A01 = Float.valueOf(f);
    }
}
