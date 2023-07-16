package X;

import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxObserverShape211S0100000_2_I2;

/* renamed from: X.7JD  reason: invalid class name */
public final class AnonymousClass7JD {
    public boolean A00 = false;
    public final Object A01;

    public static Object A00(Object obj) {
        AnonymousClass7JD r1 = (AnonymousClass7JD) obj;
        C04220Ms.A0B(r1, 0);
        return r1.A05();
    }

    public static Object A01(Object obj) {
        return ((AnonymousClass7JD) obj).A05();
    }

    public static void A02(M5J m5j, Object obj) {
        m5j.A0H(new AnonymousClass7JD(obj));
    }

    public static void A03(M5J m5j, Object obj) {
        m5j.A0G(new AnonymousClass7JD(obj));
    }

    public static void A04(IDxObserverShape211S0100000_2_I2 iDxObserverShape211S0100000_2_I2, Object obj) {
        AnonymousClass8e7 r1 = (AnonymousClass8e7) ((AnonymousClass7JD) obj).A05();
        if (r1 != null) {
            AnonymousClass6IG.A00((Fragment) iDxObserverShape211S0100000_2_I2.A00, r1);
        }
    }

    public final Object A05() {
        if (this.A00) {
            return null;
        }
        this.A00 = true;
        return this.A01;
    }

    public AnonymousClass7JD(Object obj) {
        this.A01 = obj;
    }
}
