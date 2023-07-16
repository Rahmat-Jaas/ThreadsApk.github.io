package X;

import android.content.Context;
import android.view.View;
import com.facebook.redex.IDxCListenerShape2S1300000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.3rM  reason: invalid class name and case insensitive filesystem */
public final class C64653rM implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ BKU A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public C64653rM(Context context, BKU bku, UserSession userSession, String str, boolean z) {
        this.A00 = context;
        this.A02 = userSession;
        this.A04 = z;
        this.A01 = bku;
        this.A03 = str;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1109170121);
        Context context = this.A00;
        UserSession userSession = this.A02;
        boolean z = this.A04;
        BKU bku = this.A01;
        String str = this.A03;
        int i = 2131824371;
        if (z) {
            i = 2131824372;
        }
        C25828Dsm A0W = C18190wL.A0W(context);
        A0W.A0r(true);
        A0W.A0L(i);
        AnonymousClass25l.A00(new IDxCListenerShape2S1300000_1_I2(context, bku, userSession, str, 0), A0W, 2131824870);
        C18200wM.A1P(A0W);
        AnonymousClass0wJ.A1K(A0W);
        C14030oh.A0C(441310113, A05);
    }
}
