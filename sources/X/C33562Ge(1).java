package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.fxcropapp.ig.IgCropActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Ge  reason: invalid class name and case insensitive filesystem */
public final class C33562Ge {
    public static final Object A00(AnonymousClass601 r7, C63893iY r8) {
        AnonymousClass3HX A01 = C63893iY.A01(r8, AnonymousClass0wJ.A1Y(r8, r7) ? 1 : 0);
        UserSession A02 = C05030Qo.A02(C63913ic.A0F(r7));
        Context context = A01.A00;
        String A0q = C18190wL.A0q(r8.A00, 2);
        AnonymousClass3RS.A00 = r7;
        AnonymousClass05L A07 = C10650ih.A00.A07();
        Uri A012 = C15430rJ.A01(A0q);
        String str = A02.token;
        Intent A04 = C18250wR.A04(context, IgCropActivity.class);
        A04.putExtra("", A012);
        A04.putExtra("IgSessionManager.SESSION_TOKEN_KEY", str);
        A07.A09(context, A04);
        return null;
    }
}
