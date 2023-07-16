package X;

import android.widget.LinearLayout;
import com.facebook.browser.lite.extensions.igcallextension.IGCallExtensionModel;
import com.instagram.service.session.UserSession;

/* renamed from: X.5Eh  reason: invalid class name and case insensitive filesystem */
public final class C89385Eh extends C115616vd implements L3Z, L3Y, L3X {
    public LinearLayout A00;
    public boolean A01;
    public final IGCallExtensionModel A02;
    public final UserSession A03;

    public C89385Eh(IGCallExtensionModel iGCallExtensionModel, UserSession userSession) {
        boolean A1Z = C18200wM.A1Z(iGCallExtensionModel);
        this.A03 = userSession;
        this.A02 = iGCallExtensionModel;
        this.A01 = A1Z;
    }
}
