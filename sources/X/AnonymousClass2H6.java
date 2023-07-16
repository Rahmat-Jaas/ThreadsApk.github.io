package X;

import android.os.Bundle;
import com.instagram.modal.ModalActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.2H6  reason: invalid class name */
public final class AnonymousClass2H6 {
    public static final Object A00(AnonymousClass601 r19, C63893iY r20) {
        AnonymousClass601 r2 = r19;
        C63893iY r0 = r20;
        boolean A1Z = AnonymousClass0wJ.A1Z(r0, r2);
        String A0D = C63893iY.A0D(r0, 0);
        if (AnonymousClass3WF.A01(r0, A1Z ? 1 : 0)) {
            AnonymousClass0LU.A0C("OpenAppealFlow", "Opening in bottom sheet is not yet supported. Opening webview in a fullscreen view");
        }
        Bundle A06 = C18180wK.A06();
        A06.putParcelable("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", new SimpleWebViewConfig(A0D, (String) null, (String) null, (String) null, false, false, A1Z, false, false, false, false, false, A1Z, false, false));
        C63863iT.A08(C63913ic.A05(r2), A06, C05030Qo.A02(C63913ic.A0F(r2)), ModalActivity.class, "xfac_webview");
        return null;
    }
}
