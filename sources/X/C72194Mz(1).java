package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4Mz  reason: invalid class name and case insensitive filesystem */
public final class C72194Mz implements C84794ts {
    public UserSession A00;

    public final /* bridge */ /* synthetic */ Object C8i(AnonymousClass3DI r4, Object obj, int i) {
        Integer num;
        AnonymousClass3D9 r5 = (AnonymousClass3D9) obj;
        r5.getClass();
        if (i == 1) {
            C23101bv r0 = r5.A03;
            if (r0.A00 == r0.A01 - 1) {
                num = AnonymousClass006.A0j;
            } else {
                num = AnonymousClass006.A01;
            }
            C60093Nq.A00(this.A00, r4.A07, num);
            C23101bv r1 = r5.A03;
            C23101bv.A00(r1, r1.A00 + 1);
            return r5;
        }
        C23101bv r12 = r5.A03;
        C23101bv.A00(r12, r12.A00 - 1);
        r5.A03.getChildFragmentManager().A0d();
        return r5;
    }

    public C72194Mz(UserSession userSession) {
        this.A00 = userSession;
    }
}
