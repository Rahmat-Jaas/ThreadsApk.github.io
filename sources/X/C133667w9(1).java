package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7w9  reason: invalid class name and case insensitive filesystem */
public class C133667w9 implements C21715Bz1, AnonymousClass0i4 {
    public final C109446k1 A00;
    public final UserSession A01;

    public C133667w9(C109446k1 r2, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
    }

    public final AnonymousClass8rP Agr(String str) {
        C04220Ms.A0B(str, 0);
        return (AnonymousClass8rP) ((C142118dt) this.A00.A01.A04.get(str));
    }

    public final C126897g8 CZK(C21839C2o c2o, C126857g3 r10, String str, boolean z) {
        C126897g8 r0;
        String str2 = str;
        C04220Ms.A0B(str, 1);
        C109446k1 r4 = this.A00;
        synchronized (r4) {
            AnonymousClass78G r1 = r4.A01;
            r0 = (C126897g8) AnonymousClass78G.A00(r10, new C126867g5(r10), new C126887g7(c2o, r4, r10.A04, str2, z), r1);
        }
        return r0;
    }

    public final void Bg9(C126857g3 r6) {
        AnonymousClass78G r4 = this.A00.A01;
        synchronized (r4) {
            String AqJ = r6.AqJ();
            r4.A06.put(AqJ, AnonymousClass7IY.A00.A04(r6, r4.A01(AqJ)));
        }
    }

    public final void onSessionWillEnd() {
        synchronized (this.A00.A01) {
        }
    }
}
