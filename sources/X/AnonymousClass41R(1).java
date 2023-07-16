package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.41R  reason: invalid class name */
public final class AnonymousClass41R implements C143978hc {
    public final /* synthetic */ UserSession A00;

    public AnonymousClass41R(UserSession userSession) {
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        String str;
        GXN gxn = new GXN();
        Boolean BYa = C18240wQ.A0W(this.A00, C06810aP.A01).BYa();
        if (BYa == null || !BYa.booleanValue()) {
            str = "False";
        } else {
            str = "True";
        }
        gxn.A05("remove_birthday_selfie", str);
        return gxn;
    }
}
