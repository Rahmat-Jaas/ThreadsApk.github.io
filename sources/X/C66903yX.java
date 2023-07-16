package X;

import com.facebook.AccessToken;
import java.util.HashMap;

/* renamed from: X.3yX  reason: invalid class name and case insensitive filesystem */
public final class C66903yX implements C83984sK {
    public final /* synthetic */ C10300i6 A00;
    public final /* synthetic */ C84214sk A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public C66903yX(C10300i6 r1, C84214sk r2, String str, boolean z) {
        this.A00 = r1;
        this.A02 = str;
        this.A03 = z;
        this.A01 = r2;
    }

    public final void onCancel() {
        C35772Ot.A00(this.A00, "facebook_auth_cancel", this.A02, A00((String) null), this.A03);
        this.A01.onCancel();
    }

    public final void onError(String str) {
        C35772Ot.A00(this.A00, "facebook_auth_error", this.A02, A00(str), this.A03);
        this.A01.BwY();
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass39Q r7 = (AnonymousClass39Q) obj;
        C10300i6 r5 = this.A00;
        HashMap A002 = A00((String) null);
        String str = this.A02;
        boolean z = this.A03;
        C35772Ot.A00(r5, "facebook_auth_success", str, A002, z);
        if (z) {
            C35772Ot.A00(r5, "facebook_link_success", str, A00((String) null), z);
        }
        C84214sk r2 = this.A01;
        AccessToken accessToken = r7.A00;
        r2.BrC(accessToken.A02, accessToken.A03);
    }

    public static HashMap A00(String str) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("fb4a_installed", String.valueOf(AnonymousClass0wJ.A1W(C63443hU.A00())));
        A0y.put("exception", str);
        return A0y;
    }
}
