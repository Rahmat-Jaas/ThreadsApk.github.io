package X;

import android.os.Bundle;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.4RV  reason: invalid class name */
public final class AnonymousClass4RV implements Runnable {
    public final /* synthetic */ AnonymousClass1TW A00;
    public final /* synthetic */ C24331hv A01;

    public AnonymousClass4RV(AnonymousClass1TW r1, C24331hv r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C24331hv r6 = this.A01;
        if (r6.A04) {
            r6.A02.A16();
        }
        AnonymousClass1TW r4 = this.A00;
        User user = r4.A00;
        AnonymousClass3V1 r5 = new AnonymousClass3V1();
        if (r6 instanceof C26701r4) {
            AnonymousClass3V1 r0 = ((C26701r4) r6).A00.A00.A06;
            Bundle bundle = r5.A00;
            bundle.putAll(r0.A00);
            AnonymousClass267.A00(bundle);
        } else if (r6 instanceof C26691r3) {
            AnonymousClass1c9 r3 = ((C26691r3) r6).A00;
            Integer num = r3.A0H;
            if (num != null) {
                AnonymousClass267.A01(r5.A00, AnonymousClass267.A03, num);
            }
            Integer A012 = AnonymousClass1c9.A01(C18180wK.A0f(r3.A0E));
            Bundle bundle2 = r5.A00;
            AnonymousClass267.A01(bundle2, AnonymousClass267.A05, A012);
            AnonymousClass267.A02(bundle2, r3);
            AnonymousClass267.A00(bundle2);
        }
        C25786Drz A002 = C63463hW.A00(r6.A01, r6.A03);
        String str = r4.A03;
        String id = user.getId();
        String BK7 = user.BK7();
        ImageUrl B4M = user.B4M();
        Bundle A06 = C18180wK.A06();
        A06.putAll(r5.A00);
        AnonymousClass1c4 r1 = new AnonymousClass1c4();
        Bundle A062 = C18180wK.A06();
        C18190wL.A13(A062, "IgSessionManager.LOGGED_OUT_TOKEN");
        C18220wO.A16(A062, B4M, str, id, BK7);
        A062.putAll(A06);
        C18180wK.A0x(A062, r1, A002);
    }
}
