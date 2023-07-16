package X;

import com.instagram.service.session.UserSession;
import java.util.Set;

/* renamed from: X.41Y  reason: invalid class name */
public final class AnonymousClass41Y implements C143978hc {
    public final /* synthetic */ GXN A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public AnonymousClass41Y(GXN gxn, UserSession userSession, String str) {
        this.A02 = str;
        this.A01 = userSession;
        this.A00 = gxn;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        String str;
        GXN gxn = new GXN();
        gxn.A05("upload_id", this.A02);
        gxn.A05("use_fbuploader", "true");
        Boolean BYa = C18240wQ.A0W(this.A01, C06810aP.A01).BYa();
        if (BYa == null || !BYa.booleanValue()) {
            str = "False";
        } else {
            str = "True";
        }
        gxn.A05("remove_birthday_selfie", str);
        gxn.A04(this.A00, (Set) null);
        return gxn;
    }
}
