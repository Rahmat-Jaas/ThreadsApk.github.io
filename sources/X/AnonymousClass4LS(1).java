package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape2S1600000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.4LS  reason: invalid class name */
public final class AnonymousClass4LS implements C83014qe {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C34640IcN A01;
    public final /* synthetic */ BKU A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ AnonymousClass3DL A04;
    public final /* synthetic */ CUV A05;
    public final /* synthetic */ String A06;

    public AnonymousClass4LS(Context context, C34640IcN icN, BKU bku, UserSession userSession, AnonymousClass3DL r5, CUV cuv, String str) {
        this.A01 = icN;
        this.A03 = userSession;
        this.A00 = context;
        this.A02 = bku;
        this.A04 = r5;
        this.A05 = cuv;
        this.A06 = str;
    }

    public final void CGw(boolean z) {
        C34640IcN icN = this.A01;
        FragmentActivity activity = icN.getActivity();
        if (activity != null && !z) {
            UserSession userSession = this.A03;
            AnonymousClass2AC r11 = AnonymousClass2AC.A0H;
            Context context = this.A00;
            BKU bku = this.A02;
            AnonymousClass3DL r5 = this.A04;
            CUV cuv = this.A05;
            String str = this.A06;
            if (!C60423Oz.A01(activity, context, r11, userSession, new IDxCListenerShape2S1600000_1_I2(context, icN, bku, userSession, r5, cuv, str, 2), 64, false)) {
                C63023bL.A01(context, icN, bku, userSession, r5, cuv, str);
            }
        }
    }
}
