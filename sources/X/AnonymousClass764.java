package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1321100_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.764  reason: invalid class name */
public final class AnonymousClass764 {
    public final C19554AyF A00;
    public final UserSession A01;
    public final AnonymousClass7GM A02;

    public static final KtCSuperShape0S1321100_I2 A00(C208816m r10, AnonymousClass764 r11) {
        String str = r10.A03;
        User user = r10.A02;
        AnonymousClass5HW r0 = r10.A01;
        long j = r0.A01;
        return new KtCSuperShape0S1321100_I2(C18250wR.A0K(r0.A04), r11.A00.A06(r11.A01, user), user, str, r10.A00, 1, j, r10.A04, AnonymousClass7GM.A01(user));
    }

    public /* synthetic */ AnonymousClass764(UserSession userSession) {
        C19554AyF A022 = C19554AyF.A02();
        C04220Ms.A06(A022);
        AnonymousClass7GM r0 = AnonymousClass7GM.A00;
        this.A01 = userSession;
        this.A00 = A022;
        this.A02 = r0;
    }
}
