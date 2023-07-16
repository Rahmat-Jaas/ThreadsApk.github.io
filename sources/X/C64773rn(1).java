package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape2S1600000_1_I2;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.service.session.UserSession;

/* renamed from: X.3rn  reason: invalid class name and case insensitive filesystem */
public final class C64773rn implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C34640IcN A01;
    public final /* synthetic */ BKU A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C61213Si A04;
    public final /* synthetic */ AnonymousClass3DL A05;
    public final /* synthetic */ CUV A06;
    public final /* synthetic */ String A07;

    public C64773rn(Context context, C34640IcN icN, BKU bku, UserSession userSession, C61213Si r5, AnonymousClass3DL r6, CUV cuv, String str) {
        this.A03 = userSession;
        this.A07 = str;
        this.A04 = r5;
        this.A05 = r6;
        this.A06 = cuv;
        this.A00 = context;
        this.A01 = icN;
        this.A02 = bku;
    }

    public final void onClick(View view) {
        int A052 = C14030oh.A05(172962022);
        UserSession userSession = this.A03;
        String str = this.A07;
        C63353hL.A06(userSession, "likes_sheet", (String) null, str);
        AnonymousClass2AC r3 = AnonymousClass2AC.A0H;
        AnonymousClass2AD r5 = AnonymousClass2AD.A0W;
        AnonymousClass29W r1 = AnonymousClass29W.ACCEPT;
        AnonymousClass14U A002 = AnonymousClass14U.A00();
        C61213Si r11 = this.A04;
        C61213Si.A00(A002, r11);
        C49322rC.A00(r3, r1, r5, A002, userSession);
        AnonymousClass3DL r12 = this.A05;
        CUV cuv = this.A06;
        Context context = this.A00;
        C34640IcN icN = this.A01;
        BKU bku = this.A02;
        if (!r11.A00) {
            AnonymousClass2AI.A04.A03(icN, C35762Os.A00().A00(icN, userSession, new C72214Nb(context, icN, bku, userSession, r11, r12, cuv, str)), userSession, AnonymousClass264.A0b);
        } else {
            IgdsButton igdsButton = r12.A09;
            igdsButton.setLoading(true);
            igdsButton.setEnabled(false);
            cuv.A0B.notifyDataSetChanged();
            C58063Ds r13 = AnonymousClass31Q.A00;
            FragmentActivity requireActivity = icN.requireActivity();
            C04220Ms.A0B(r3, 2);
            r13.A00(new AnonymousClass3CX(requireActivity, (Context) null, r3, userSession, new IDxCListenerShape2S1600000_1_I2(context, icN, bku, userSession, r12, cuv, str, 1)), new AnonymousClass4LS(context, icN, bku, userSession, r12, cuv, str));
        }
        C14030oh.A0C(115524387, A052);
    }
}
