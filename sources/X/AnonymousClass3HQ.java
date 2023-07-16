package X;

import android.content.Context;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.3HQ  reason: invalid class name */
public final class AnonymousClass3HQ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C61213Si A01;
    public final /* synthetic */ AnonymousClass3DL A02;
    public final /* synthetic */ CUV A03;

    public AnonymousClass3HQ(Context context, C61213Si r2, AnonymousClass3DL r3, CUV cuv) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = cuv;
        this.A00 = context;
    }

    public final void A00() {
        IgdsButton igdsButton = this.A02.A08;
        igdsButton.setLoading(false);
        igdsButton.setEnabled(true);
        this.A03.A0B.notifyDataSetChanged();
        C63813iO.A03(this.A00, "feed_share_auto_xpost_upsell_failure", 2131827439, 0);
    }

    public final void A01() {
        this.A01.A01 = true;
        IgdsButton igdsButton = this.A02.A08;
        igdsButton.setLoading(false);
        igdsButton.setEnabled(true);
        this.A03.A0B.notifyDataSetChanged();
        Context context = this.A00;
        C63733iD A012 = C63733iD.A01();
        C63733iD.A07(context, A012, 2131827438);
        A012.A0C();
        C63733iD.A09(C38040KHr.A01, A012);
    }
}
