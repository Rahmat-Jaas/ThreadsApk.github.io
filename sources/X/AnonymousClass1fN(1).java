package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1fN  reason: invalid class name */
public final class AnonymousClass1fN extends I4A {
    public final ArrayList A00 = AnonymousClass0wJ.A0v();
    public final Context A01;
    public final AnonymousClass1g7 A02;
    public final C23691fc A03;

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public AnonymousClass1fN(Context context, AnonymousClass1cA r4, C11630kW r5) {
        this.A01 = context;
        AnonymousClass1g7 r1 = new AnonymousClass1g7(r4, r5);
        this.A02 = r1;
        C23691fc r0 = new C23691fc();
        this.A03 = r0;
        A08(r0, r1);
    }

    public static void A00(AnonymousClass1fN r3) {
        r3.A03();
        r3.A05(r3.A03, r3.A01.getString(2131820847));
        Iterator it = r3.A00.iterator();
        while (it.hasNext()) {
            r3.A05(r3.A02, it.next());
        }
        r3.A04();
    }
}
