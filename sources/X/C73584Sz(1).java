package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import java.lang.ref.Reference;

/* renamed from: X.4Sz  reason: invalid class name and case insensitive filesystem */
public final class C73584Sz implements Runnable {
    public final /* synthetic */ C84494tE A00;
    public final /* synthetic */ C84844tx A01;
    public final /* synthetic */ C28281tz A02;
    public final /* synthetic */ AnonymousClass47H A03;

    public C73584Sz(C84494tE r1, C84844tx r2, C28281tz r3, AnonymousClass47H r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        View view;
        D0f d0f;
        String str;
        String str2;
        AnonymousClass47H r7 = this.A03;
        C28281tz r6 = this.A02;
        if (!r7.A03(r6)) {
            AnonymousClass44Y A022 = C36622Sa.A00().A02(r7.A05);
            QPTooltipAnchor qPTooltipAnchor = r6.A00;
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(A022, A022.A00), "ig_qp_tooltip_cancelled"), 1407);
            if (qPTooltipAnchor == null || (str2 = qPTooltipAnchor.A00) == null) {
                str2 = "unknown";
            }
            A0I.A0T("qp_anchor_id", str2);
            A0I.A0T("qp_promotion_id", r6.A0D);
            A0I.Bb4();
            r7.A03 = false;
            return;
        }
        QPTooltipAnchor qPTooltipAnchor2 = r6.A00;
        Reference reference = (Reference) r7.A06.get(qPTooltipAnchor2);
        if (reference != null) {
            view = (View) reference.get();
        } else {
            view = null;
        }
        if (view != null) {
            Context context = view.getContext();
            Activity activity = (Activity) C10050he.A00(context, Activity.class);
            if (activity == null) {
                AnonymousClass44Y A023 = C36622Sa.A00().A02(r7.A05);
                USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(A023, A023.A00), "ig_qp_tooltip_without_activity"), 1410);
                if (qPTooltipAnchor2 == null || (str = qPTooltipAnchor2.A00) == null) {
                    str = "unknown";
                }
                A0I2.A0T("anchor_name", str);
                A0I2.A0T("promotion_id", r6.A0D);
                A0I2.Bb4();
                return;
            }
            String str3 = r6.A02;
            if (str3 != null) {
                C84494tE r5 = this.A00;
                int BMj = r5.BMj(context);
                Integer num = r6.A01;
                if (num == null) {
                    num = r5.Aci();
                }
                if (AnonymousClass006.A00 == num) {
                    d0f = D0f.BELOW_ANCHOR;
                } else {
                    d0f = D0f.ABOVE_ANCHOR;
                }
                C25553Dnn A012 = AnonymousClass4DS.A01(activity, str3);
                A012.A03(d0f);
                int BMU = r5.BMU(context, r7.A05);
                if (D0f.BELOW_ANCHOR != d0f) {
                    BMj = -BMj;
                }
                A012.A02(view, BMU, BMj, r5.BUP());
                A012.A05 = new AnonymousClass4DP(r6, this.A01, r7);
                if ("instagram_tool_tip_inverted".equals(r6.A09.A00)) {
                    A012.A04(AnonymousClass3TC.A09);
                    A012.A05(AnonymousClass3TC.A08);
                }
                C18200wM.A1Q(A012);
                return;
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }
}
