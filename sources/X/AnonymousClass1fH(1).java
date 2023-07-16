package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.1fH  reason: invalid class name */
public final class AnonymousClass1fH extends I4A {
    public final AnonymousClass1gI A00;
    public final List A01 = AnonymousClass0wJ.A0v();

    public AnonymousClass1fH(Context context, C11630kW r4) {
        AnonymousClass1gI r1 = new AnonymousClass1gI(context, r4);
        this.A00 = r1;
        A08(r1);
    }

    public final void notifyDataSetChanged() {
        A03();
        for (Object A05 : this.A01) {
            A05(this.A00, A05);
        }
        A04();
    }
}
