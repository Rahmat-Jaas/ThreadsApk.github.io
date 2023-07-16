package X;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0OM  reason: invalid class name */
public final class AnonymousClass0OM {
    public int A00 = 0;
    public long A01;
    public long A02 = 0;
    public long A03 = 0;
    public AnonymousClass0hP A04;
    public C04560Oe A05;
    public C04560Oe A06;
    public C04560Oe A07;
    public C04560Oe A08;
    public C04560Oe A09;
    public C04560Oe A0A;
    public C04560Oe A0B;
    public C04560Oe A0C;
    public C04560Oe A0D;
    public C04560Oe A0E;
    public C04560Oe A0F;
    public boolean A0G = false;
    public boolean A0H;
    public boolean A0I = false;
    public final Application A0J;
    public final List A0K = new ArrayList();
    public final List A0L = new ArrayList();
    public final List A0M = new ArrayList();
    public final List A0N = new ArrayList();

    public final void A00(AnonymousClass0OE r3) {
        List list;
        if (r3 != null) {
            int intValue = r3.BM7().intValue();
            if (intValue == 0) {
                list = this.A0K;
            } else if (intValue == 1) {
                list = this.A0L;
            } else if (intValue == 2) {
                list = this.A0M;
            } else if (intValue == 3) {
                list = this.A0N;
            } else {
                return;
            }
            list.add(r3);
        }
    }

    public AnonymousClass0OM(Application application) {
        this.A0J = application;
    }
}
