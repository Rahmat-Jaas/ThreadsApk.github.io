package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7g7  reason: invalid class name and case insensitive filesystem */
public final class C126887g7 implements C143418gg {
    public final C21839C2o A00;
    public final Integer A01;
    public final String A02;
    public final boolean A03;
    public final /* synthetic */ C109446k1 A04;

    public C126887g7(C21839C2o c2o, C109446k1 r2, Integer num, String str, boolean z) {
        this.A04 = r2;
        this.A00 = c2o;
        this.A02 = str;
        this.A01 = num;
        this.A03 = z;
    }

    public final /* bridge */ /* synthetic */ void CUi(C142128du r17, Boolean bool, String str, boolean z) {
        boolean z2;
        C126897g8 r5 = (C126897g8) r17;
        C04220Ms.A0B(r5, 0);
        C109446k1 r4 = this.A04;
        C21839C2o c2o = this.A00;
        String str2 = this.A02;
        Integer num = this.A01;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = this.A03;
        }
        UserSession userSession = r4.A02;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36315743784995595L)) {
            AnonymousClass0gN.A00().AKp(new AnonymousClass61Q(c2o, r4, r5, num, str2, z2));
        } else {
            C19518Axf.A03(r4.A00, c2o, r5, userSession, num, str2, z2);
        }
    }
}
