package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7RP  reason: invalid class name */
public final class AnonymousClass7RP implements View.OnClickListener {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ C11630kW A01;
    public final /* synthetic */ C120717Cd A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public AnonymousClass7RP(TextView textView, C11630kW r2, C120717Cd r3, UserSession userSession, User user, List list, boolean z, boolean z2) {
        this.A01 = r2;
        this.A07 = z;
        this.A06 = z2;
        this.A05 = list;
        this.A03 = userSession;
        this.A00 = textView;
        this.A04 = user;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        if (r0 == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (r0 != null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        if (r0.length() <= 0) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0098, code lost:
        r6 = java.lang.Long.parseLong(r10.A04.getId());
        r3 = X.C18180wK.A0I(X.AnonymousClass0wJ.A0M(X.C13330nS.A01(r3, r5), "instagram_link_clicks"), 1845);
        r3.A0S("authorid", java.lang.Long.valueOf(r6));
        r3.A0T("link_address", r0);
        r3.A0T("link_type", "profile");
        r3.Bb4();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            r0 = 2026581959(0x78cb2fc7, float:3.2968916E34)
            int r4 = X.C14030oh.A05(r0)
            X.0kW r3 = r10.A01
            boolean r0 = r10.A07
            if (r0 != 0) goto L_0x00ca
            boolean r2 = r10.A06
            r1 = 1
            java.util.List r0 = r10.A05
            if (r2 == 0) goto L_0x0036
            java.lang.Object r6 = X.AnonymousClass00J.A0C(r0)
            X.8m2 r6 = (X.C146318m2) r6
            com.instagram.service.session.UserSession r5 = r10.A03
            android.widget.TextView r0 = r10.A00
            android.content.Context r9 = X.C18190wL.A0A(r0)
            r8 = 0
            X.C04220Ms.A0B(r6, r8)
            java.lang.String r2 = r6.getUrl()
            int r0 = r2.length()
            if (r0 == 0) goto L_0x008c
            r7 = 0
            android.net.Uri r7 = X.C15430rJ.A01(r2)     // Catch:{ IllegalArgumentException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0049 }
            goto L_0x0049
        L_0x0036:
            int r0 = r0.size()
            if (r0 <= r1) goto L_0x00ca
            com.instagram.service.session.UserSession r1 = r10.A03
            com.instagram.user.model.User r0 = r10.A04
            java.lang.String r0 = r0.getId()
            X.C120717Cd.A00(r3, r1, r0)
            goto L_0x00ca
        L_0x0049:
            if (r7 == 0) goto L_0x008c
            boolean r0 = X.AnonymousClass7D2.A00(r7)
            if (r0 == 0) goto L_0x008c
            java.lang.String r1 = r7.getPath()
            if (r1 == 0) goto L_0x005f
            java.lang.String r0 = "/help/"
            boolean r0 = X.AnonymousClass8bP.A0j(r1, r0, r8)
            if (r0 != 0) goto L_0x008c
        L_0x005f:
            r0 = 0
            boolean r0 = X.C37412JrW.A09(r9, r2, r0)
            if (r0 == 0) goto L_0x008c
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36324935014621994(0x810d560009232a, double:3.035373399795349E-306)
            boolean r0 = X.C63803iN.A0E(r2, r5, r0)
            if (r0 == 0) goto L_0x008c
            r0 = 36887884967707107(0x830d56000401e3, double:3.3913852169438874E-306)
            java.lang.String r2 = X.C63803iN.A0C(r2, r5, r0)
            android.net.Uri$Builder r1 = r7.buildUpon()
            java.lang.String r0 = "ref_id"
            android.net.Uri r0 = X.C18220wO.A0F(r1, r0, r2)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0092
        L_0x008c:
            java.lang.String r0 = r6.AtF()
            if (r0 == 0) goto L_0x00ca
        L_0x0092:
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x00ca
            com.instagram.user.model.User r1 = r10.A04
            java.lang.String r1 = r1.getId()
            long r6 = java.lang.Long.parseLong(r1)
            X.0nS r2 = X.C13330nS.A01(r3, r5)
            java.lang.String r1 = "instagram_link_clicks"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 1845(0x735, float:2.585E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r2, r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r1 = "authorid"
            r3.A0S(r1, r2)
            java.lang.String r1 = "link_address"
            r3.A0T(r1, r0)
            java.lang.String r1 = "profile"
            java.lang.String r0 = "link_type"
            r3.A0T(r0, r1)
            r3.Bb4()
        L_0x00ca:
            r0 = -346084310(0xffffffffeb5f2c2a, float:-2.6979902E26)
            X.C14030oh.A0C(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7RP.onClick(android.view.View):void");
    }
}
