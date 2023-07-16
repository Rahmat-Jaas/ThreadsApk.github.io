package X;

import android.content.Context;

/* renamed from: X.7me  reason: invalid class name and case insensitive filesystem */
public final class C129747me implements C143928hX {
    public final C105126cv A00;

    public C129747me(C105126cv r1) {
        this.A00 = r1;
    }

    public final /* synthetic */ Object DBu() {
        C111146mr r1;
        Context context = this.A00.A00;
        synchronized (C111146mr.class) {
            r1 = C111146mr.A09;
            if (r1 == null) {
                r1 = new C111146mr(context, AnonymousClass6BV.A02);
                C111146mr.A09 = r1;
            }
        }
        return r1;
    }
}
