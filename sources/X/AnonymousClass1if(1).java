package X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1if  reason: invalid class name */
public final class AnonymousClass1if extends C63873iU {
    public static final AtomicInteger A05 = new AtomicInteger();
    public final Context A00;
    public final C10300i6 A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public AnonymousClass1if(Context context, C10300i6 r3, String str, String str2, boolean z) {
        this.A00 = context.getApplicationContext();
        this.A01 = r3;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
    }

    public final void onFail(AnonymousClass3XX r7) {
        C61763Vg A022;
        int A032 = C14030oh.A03(1354652309);
        C38040KHr.A01.CWx(new AnonymousClass45R(this.A03, (Integer) null, (String) null));
        boolean z = this.A04;
        C10300i6 r3 = this.A01;
        if (z) {
            A022 = C63313hF.A02(r3, C313625r.PHONE, AnonymousClass265.A0V, "next_blocked");
        } else {
            A022 = C63313hF.A02(r3, C313625r.PHONE, (AnonymousClass265) null, "background_confirm_failed");
        }
        A022.A03("error", "request_failed");
        A022.A01();
        C14030oh.A0A(-39839357, A032);
    }

    public final void onFinish() {
        int A032 = C14030oh.A03(132043585);
        if (A05.decrementAndGet() == 0) {
            C38040KHr.A01.CWx(new AnonymousClass45D());
        }
        C14030oh.A0A(666010955, A032);
    }

    public final void onStart() {
        int A032 = C14030oh.A03(1984366167);
        if (A05.getAndIncrement() == 0) {
            C38040KHr.A01.CWx(new AnonymousClass45I(this.A02));
        }
        C14030oh.A0A(167723914, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        AnonymousClass265 r1;
        AnonymousClass269 r0;
        int A032 = C14030oh.A03(1241802302);
        C27101ry r8 = (C27101ry) obj;
        int A033 = C14030oh.A03(1794662422);
        if (r8.A01) {
            boolean z = this.A04;
            C10300i6 r3 = this.A01;
            if (!z) {
                r0 = AnonymousClass269.A06;
            } else {
                r0 = AnonymousClass269.A0R;
            }
            C61763Vg A022 = C63313hF.A02(r3, C313625r.PHONE, (AnonymousClass265) null, r0.A01);
            A022.A03("locale", C31103Gfm.A02().toString());
            A022.A01();
            C38040KHr.A01.CWx(new AnonymousClass45S(r8, this.A03, this.A02));
            C63103bV.A03.A05(this.A00);
        } else {
            C38040KHr.A01.CWx(new AnonymousClass45R(this.A03, AnonymousClass006.A15, r8.A00));
            boolean z2 = this.A04;
            C10300i6 r32 = this.A01;
            if (z2) {
                str = "next_blocked";
                r1 = AnonymousClass265.A0V;
            } else {
                str = "background_confirm_failed";
                r1 = null;
            }
            C61763Vg A034 = C63313hF.A03(r32, C313625r.PHONE, r1, str);
            A034.A03("error", "validation_failed");
            A034.A01();
        }
        C14030oh.A0A(-290632523, A033);
        C14030oh.A0A(-984025733, A032);
    }
}
