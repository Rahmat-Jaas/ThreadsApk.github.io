package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.1fL  reason: invalid class name */
public final class AnonymousClass1fL extends I4A {
    public Context A00;
    public final C24021gl A01;
    public final List A02 = AnonymousClass0wJ.A0v();
    public final AnonymousClass1gA A03;

    public AnonymousClass1fL(Context context, C23371df r4) {
        this.A00 = context;
        AnonymousClass1gA r1 = new AnonymousClass1gA(context, r4);
        this.A03 = r1;
        C24021gl r0 = new C24021gl(context);
        this.A01 = r0;
        A08(r1, r0);
    }

    public static void A00(AnonymousClass1fL r4) {
        r4.A03();
        for (Object A06 : r4.A02) {
            r4.A06(r4.A03, A06, (Object) null);
        }
        r4.A04();
    }
}
