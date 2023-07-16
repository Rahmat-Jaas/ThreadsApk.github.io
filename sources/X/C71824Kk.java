package X;

import android.content.Context;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Kk  reason: invalid class name and case insensitive filesystem */
public final class C71824Kk implements C83804s1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C34640IcN A01;
    public final /* synthetic */ BKU A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ AnonymousClass3DL A04;
    public final /* synthetic */ CUV A05;
    public final /* synthetic */ String A06;

    public C71824Kk(Context context, C34640IcN icN, BKU bku, UserSession userSession, AnonymousClass3DL r5, CUV cuv, String str) {
        this.A02 = bku;
        this.A00 = context;
        this.A04 = r5;
        this.A05 = cuv;
        this.A06 = str;
        this.A03 = userSession;
        this.A01 = icN;
    }

    public final void Byp() {
        IgdsButton igdsButton = this.A04.A09;
        igdsButton.setLoading(false);
        igdsButton.setEnabled(true);
        this.A05.A0B.notifyDataSetChanged();
        C63813iO.A03(this.A00, "feed_share_auto_xpost_upsell_failure", 2131827439, 0);
    }

    public final void Byq() {
        BKU bku = this.A02;
        Context context = this.A00;
        AnonymousClass3DL r4 = this.A04;
        CUV cuv = this.A05;
        String str = this.A06;
        C63023bL.A02(context, this.A01, bku, this.A03, r4, cuv, str);
    }
}
