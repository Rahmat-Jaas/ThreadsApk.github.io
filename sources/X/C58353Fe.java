package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.3Fe  reason: invalid class name and case insensitive filesystem */
public final class C58353Fe {
    public C83464rQ A00;
    public Map A01;
    public Map A02;
    public final String A03;

    public final void A00(Context context, C83454rP r7) {
        C04220Ms.A0B(context, 0);
        String str = this.A03;
        Map map = this.A02;
        C571539y r3 = new C571539y(context, this, r7);
        C04220Ms.A0B(str, 1);
        if (r7 instanceof C130667qT) {
            C130667qT r72 = (C130667qT) r7;
            C10300i6 r0 = r72.A06;
            C04220Ms.A06(r0);
            C145538kf r2 = r72.A07;
            AnonymousClass4A9 A002 = C63263h8.A00(r0, str, map);
            AnonymousClass4A9.A00(A002, r3, 0);
            r2.schedule(A002);
            return;
        }
        throw C18190wL.A0a("Host instance must be an instance of IgBloksHost");
    }

    public C58353Fe(String str) {
        this.A03 = str;
    }
}
