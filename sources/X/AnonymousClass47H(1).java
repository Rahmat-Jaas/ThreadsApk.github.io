package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.service.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.47H  reason: invalid class name */
public final class AnonymousClass47H implements C21800C0z {
    public C84334sy A00;
    public C28281tz A01;
    public Runnable A02;
    public boolean A03;
    public final Handler A04 = AnonymousClass0wJ.A0F();
    public final UserSession A05;
    public final HashMap A06 = AnonymousClass0wJ.A0y();
    public final Map A07;

    public final void A02(C28281tz r5) {
        String str;
        C04220Ms.A0B(r5, 0);
        AnonymousClass44Y A022 = C36622Sa.A00().A02(this.A05);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(A022, A022.A00), "ig_qp_tooltip_clash"), 1408);
        QPTooltipAnchor qPTooltipAnchor = r5.A00;
        if (AnonymousClass0wJ.A1U(A0I)) {
            if (qPTooltipAnchor == null || (str = qPTooltipAnchor.A00) == null) {
                str = "unknown";
            }
            A0I.A0T("qp_anchor_id", str);
            A0I.A0T("qp_promotion_id", r5.A0D);
            A0I.A0T("native_anchor_id", (String) null);
            A0I.Bb4();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r1 = (android.view.View) r0.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.C81644o8 r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x0026
            X.1tz r4 = (X.C28281tz) r4
            com.instagram.quickpromotion.intf.QPTooltipAnchor r1 = r4.A00
            java.util.HashMap r0 = r3.A06
            java.lang.Object r0 = r0.get(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x0026
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x0026
            boolean r0 = r1.isAttachedToWindow()
            if (r0 == 0) goto L_0x0026
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0026
            r2 = 1
        L_0x0026:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass47H.A03(X.4o8):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r0 = r4.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(X.C81644o8 r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x001a
            X.1tz r4 = (X.C28281tz) r4
            com.instagram.quickpromotion.intf.QPTooltipAnchor r1 = r4.A00
            java.util.Map r0 = r3.A07
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = r4.A02
            if (r0 == 0) goto L_0x001a
            int r0 = r0.length()
            if (r0 == 0) goto L_0x001a
            r2 = 1
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass47H.A04(X.4o8):boolean");
    }

    public final void Bsd(View view) {
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onCreate() {
    }

    public final void onDestroy() {
    }

    public final void onResume() {
    }

    public final void onSaveInstanceState(Bundle bundle) {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
    }

    public final void onViewStateRestored(Bundle bundle) {
    }

    public final void onDestroyView() {
        this.A06.clear();
        this.A01 = null;
        Runnable runnable = this.A02;
        if (runnable != null) {
            this.A04.removeCallbacks(runnable);
            this.A02 = null;
            this.A03 = false;
        }
    }

    public final void onPause() {
        Runnable runnable = this.A02;
        if (runnable != null) {
            this.A04.removeCallbacks(runnable);
            this.A02 = null;
            this.A03 = false;
        }
    }

    public AnonymousClass47H(UserSession userSession, Map map) {
        this.A05 = userSession;
        this.A07 = map;
    }

    public final void A00(View view, QPTooltipAnchor qPTooltipAnchor, C84844tx r5) {
        AnonymousClass0wJ.A1N(r5, qPTooltipAnchor);
        if (view != null) {
            this.A06.put(qPTooltipAnchor, new WeakReference(view));
            C28281tz r1 = this.A01;
            if (!this.A03 && r1 != null && A04(r1) && A03(r1)) {
                A01(r5, r1);
            }
        }
    }

    public final void A01(C84844tx r5, C28281tz r6) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r5, r6);
        if (!A04(r6) || !A03(r6)) {
            throw C18180wK.A0a("showQuickPromotion() should not be called unless it is eligible and has an anchor view.");
        }
        C84494tE r0 = (C84494tE) this.A07.get(r6.A00);
        if (r0 != null) {
            this.A03 = A1Z;
            C73584Sz r3 = new C73584Sz(r0, r5, r6, this);
            this.A02 = r3;
            this.A04.postDelayed(r3, r0.Cg7());
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
