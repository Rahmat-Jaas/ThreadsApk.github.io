package X;

import java.util.List;
import java.util.Properties;

/* renamed from: X.0Y2  reason: invalid class name */
public abstract class AnonymousClass0Y2 implements AnonymousClass0O7 {
    public final AnonymousClass0O7 A00;

    public abstract boolean A00(AnonymousClass0O6 r1);

    public final boolean AxZ(AnonymousClass0O6 r3) {
        while (this.A00.AxZ(r3)) {
            if (A00(r3)) {
                return true;
            }
        }
        return false;
    }

    public final void A6C(Properties properties) {
        this.A00.A6C(properties);
    }

    public final String[] B4x(List list) {
        String str;
        String[] B4x = this.A00.B4x(list);
        AnonymousClass0O6 r2 = new AnonymousClass0O6();
        for (int i = 0; i < B4x.length; i++) {
            r2.A00 = (String) list.get(i);
            r2.A01 = B4x[i];
            if (!A00(r2)) {
                str = null;
            } else {
                str = r2.A01;
            }
            B4x[i] = str;
        }
        reset();
        return B4x;
    }

    public final void reset() {
        this.A00.reset();
    }

    public AnonymousClass0Y2(AnonymousClass0O7 r1) {
        this.A00 = r1;
    }
}
