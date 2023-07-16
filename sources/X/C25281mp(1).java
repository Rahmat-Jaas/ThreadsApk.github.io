package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.1mp  reason: invalid class name and case insensitive filesystem */
public final class C25281mp extends AnonymousClass0gG {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C11630kW A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25281mp(Context context, C11630kW r3, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        super(300);
        this.A00 = context;
        this.A01 = r3;
        this.A07 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
        this.A02 = userSession;
    }

    public final void run() {
        Context context = this.A00;
        String string = C18200wM.A0C().getString("fb_attribution_id", (String) null);
        String string2 = C18200wM.A0C().getString("google_ad_id", (String) null);
        if (string == null || string2 == null) {
            C61383Sz A002 = C61383Sz.A00(context);
            if (A002 == null) {
                C10450iM.A03("family-bridges", "failed to fetch AttributionIdentifiers");
            } else {
                if (A002.A02 != null) {
                    C08350dD A003 = C08360dF.A00();
                    C18180wK.A0v(C18220wO.A0B(A003), "fb_attribution_id", A002.A02);
                }
                if (A002.A01 != null) {
                    C08360dF.A00().A00(A002.A01);
                }
                C08350dD A004 = C08360dF.A00();
                AnonymousClass0wJ.A13(C18220wO.A0B(A004), "opt_out_ads", A002.A03);
            }
        }
        C15730rn A005 = C15730rn.A00(this.A01, "open_family_app");
        A005.A0D("source_surface", this.A07);
        A005.A0D("dest_intended_surface", "fb_homepage");
        A005.A0D("dest_type", this.A03);
        A005.A0D("funnel_id", this.A04);
        A005.A0D("fb_attribution_id", C18200wM.A0C().getString("fb_attribution_id", (String) null));
        A005.A0D("google_ad_id", C18200wM.A0C().getString("google_ad_id", (String) null));
        A005.A09("opt_out_ads", Boolean.valueOf(C18190wL.A1X(C18200wM.A0C(), "opt_out_ads")));
        String str = this.A05;
        if (str != null) {
            A005.A0D("netego_id", str);
        }
        String str2 = this.A06;
        if (str2 != null) {
            A005.A0D("netego_tracking_token", str2);
        }
        C18180wK.A1K(A005, this.A02);
    }
}
