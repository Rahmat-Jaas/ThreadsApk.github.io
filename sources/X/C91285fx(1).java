package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.5fx  reason: invalid class name and case insensitive filesystem */
public final class C91285fx extends C127967i8 {
    public static C91285fx A01;
    public final C1201278t A00;

    public final String B8y() {
        return null;
    }

    public static C91285fx A00(Context context) {
        C91285fx r1 = A01;
        if (r1 != null) {
            return r1;
        }
        C91285fx r12 = new C91285fx(context.getApplicationContext());
        A01 = r12;
        return r12;
    }

    public C91285fx(Context context) {
        C1201278t r0;
        synchronized (C1201278t.class) {
            r0 = C1201278t.A03;
            if (r0 == null) {
                r0 = new C1201278t(context);
                C1201278t.A03 = r0;
            }
        }
        this.A00 = r0;
    }

    public final File BMF(C109746kY r2, int i) {
        ITS A002 = C37242Jn9.A00(i);
        if (A002 == null || !A002.A00) {
            return super.BMF(r2, i);
        }
        throw C18190wL.A0a("Cannot use scoped paths with ContextCask");
    }
}
