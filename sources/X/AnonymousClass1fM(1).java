package X;

import android.content.Context;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: X.1fM  reason: invalid class name */
public final class AnonymousClass1fM extends I4A {
    public Context A00;
    public C62353Yv A01;
    public AnonymousClass0BO A02;
    public Set A03;
    public final C23741fh A04;
    public final AnonymousClass1gF A05;
    public final List A06 = AnonymousClass0wJ.A0v();
    public final List A07 = AnonymousClass0wJ.A0v();

    public AnonymousClass1fM(Context context, C11630kW r7, AnonymousClass1aS r8, C07530bf r9) {
        AnonymousClass0BO r4 = r9.A00;
        C62353Yv A002 = C62353Yv.A00(r9);
        AnonymousClass1gF r2 = new AnonymousClass1gF(r7, r8);
        C23741fh r1 = new C23741fh();
        this.A00 = context;
        this.A02 = r4;
        this.A01 = A002;
        this.A05 = r2;
        this.A04 = r1;
        A07(C18200wM.A0s(Arrays.asList(new AnonymousClass436[]{r2, r1})));
    }

    public static void A00(AnonymousClass1fM r4) {
        AnonymousClass226 r1;
        r4.A03();
        for (Object next : r4.A07) {
            if (r4.A03.contains(next)) {
                r1 = AnonymousClass226.SELECTED;
            } else {
                r1 = AnonymousClass226.NOT_SELECTED;
            }
            r4.A06(r4.A05, next, r1);
        }
        List<Object> list = r4.A06;
        if (!list.isEmpty()) {
            r4.A05(r4.A04, r4.A00.getString(2131831478));
        }
        for (Object A062 : list) {
            r4.A06(r4.A05, A062, AnonymousClass226.ALREADY_LOGGED_IN);
        }
        r4.A04();
    }
}
