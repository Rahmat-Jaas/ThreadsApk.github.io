package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.service.session.UserSession;

/* renamed from: X.44W  reason: invalid class name */
public final class AnonymousClass44W implements C11630kW, C10420iJ, AnonymousClass0i4 {
    public static final long A02 = C18230wP.A07();
    public static final String __redex_internal_original_name = "QPSurveyController";
    public C28301u1 A00;
    public final UserSession A01;

    public final void BjV(Activity activity) {
        C04220Ms.A0B(activity, 0);
        A00(activity);
    }

    public final void BjW(Activity activity) {
        C04220Ms.A0B(activity, 0);
        A00(activity);
    }

    public final void BjX(Activity activity) {
        C04220Ms.A0B(activity, 0);
        C28301u1 r0 = this.A00;
        if (r0 != null && activity == r0.A04) {
            this.A00 = null;
        }
    }

    public final void BjY(Activity activity) {
        C04220Ms.A0B(activity, 0);
        C28301u1 r2 = this.A00;
        if (r2 != null && activity == r2.A04) {
            r2.A08.D8U(r2.A0A);
        }
    }

    public final void Bjb(Activity activity) {
        C04220Ms.A0B(activity, 0);
        A00(activity);
        C28301u1 r2 = this.A00;
        if (r2 != null) {
            r2.A08.Cia(r2, r2.A0A);
        }
    }

    public final void Bjc(Activity activity) {
    }

    public final void Bjd(Activity activity) {
    }

    public final String getModuleName() {
        return "quick_promotion_survey_controller";
    }

    private final void A00(Activity activity) {
        Activity activity2 = activity;
        C28301u1 r0 = this.A00;
        if (r0 != null && activity2 == r0.A04) {
            return;
        }
        if (!(activity2 instanceof FragmentActivity)) {
            this.A00 = null;
            C10450iM.A03("IG-QP", "Activity is not fragment activity");
            return;
        }
        UserSession userSession = this.A01;
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0t;
        C36622Sa.A00();
        this.A00 = C36622Sa.A00().A03((FragmentActivity) activity2, this, C61403Th.A00((C17701AKf) null, (AnonymousClass38Q) null, (AnonymousClass35B) null, (AnonymousClass35C) null, (C559435e) null, (C82894qR) null, (C82904qS) null, (C83704rq) null, (C82914qT) null, (AnonymousClass47H) null, (C561335x) null, (Boolean) null), quickPromotionSlot, userSession);
    }

    public final void onSessionWillEnd() {
        this.A01.A03(AnonymousClass44W.class);
        C10410iI.A00.A01(this);
    }

    public AnonymousClass44W(UserSession userSession) {
        this.A01 = userSession;
        C10410iI.A00.A00(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0031, code lost:
        if ((((X.C694548p) r3.A01(X.C694548p.class, new kotlin.jvm.internal.KtLambdaShape132S0100000_I2_112(r3, 24))).A00.getLong(X.AnonymousClass00U.A0L("id_request_time_millis_", r9), -1) + A02) <= java.lang.System.currentTimeMillis()) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.app.Activity r8, java.lang.String r9, java.util.Map r10, boolean r11) {
        /*
            r7 = this;
            boolean r4 = X.AnonymousClass0wJ.A1Y(r8, r9)
            if (r11 != 0) goto L_0x0033
            com.instagram.service.session.UserSession r3 = r7.A01
            X.C04220Ms.A0B(r3, r4)
            java.lang.Class<X.48p> r2 = X.C694548p.class
            r1 = 24
            kotlin.jvm.internal.KtLambdaShape132S0100000_I2_112 r0 = new kotlin.jvm.internal.KtLambdaShape132S0100000_I2_112
            r0.<init>(r3, r1)
            java.lang.Object r0 = r3.A01(r2, r0)
            X.48p r0 = (X.C694548p) r0
            android.content.SharedPreferences r3 = r0.A00
            java.lang.String r0 = "id_request_time_millis_"
            java.lang.String r2 = X.AnonymousClass00U.A0L(r0, r9)
            r0 = -1
            long r5 = r3.getLong(r2, r0)
            long r0 = A02
            long r5 = r5 + r0
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0041
        L_0x0033:
            r7.A00(r8)
            X.1u1 r2 = r7.A00
            if (r2 != 0) goto L_0x0045
            java.lang.String r1 = "IG-QP"
            java.lang.String r0 = "survey requested but delegate is null."
            X.C10450iM.A03(r1, r0)
        L_0x0041:
            X.C550831r.A00()
            return
        L_0x0045:
            X.4t3 r1 = r2.A08
            com.instagram.quickpromotion.intf.QuickPromotionSlot r0 = r2.A0A
            r1.Cia(r2, r0)
            if (r10 != 0) goto L_0x0052
            java.util.HashMap r10 = X.AnonymousClass0wJ.A0y()
        L_0x0052:
            java.lang.String r0 = "integration_point_id"
            r10.put(r0, r9)
            X.1u1 r3 = r7.A00
            if (r3 == 0) goto L_0x0096
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1d
            java.util.EnumSet r2 = java.util.EnumSet.of(r0)
            X.4tR r1 = r3.A09
            java.lang.String r0 = "ad_hoc_trigger"
            r1.ANI(r2, r0)
            boolean r0 = X.C70894Gs.A00(r3, r10, r2, r11)
            if (r0 == 0) goto L_0x0041
            com.instagram.service.session.UserSession r3 = r7.A01
            X.C04220Ms.A0B(r3, r4)
            java.lang.Class<X.48p> r2 = X.C694548p.class
            r1 = 24
            kotlin.jvm.internal.KtLambdaShape132S0100000_I2_112 r0 = new kotlin.jvm.internal.KtLambdaShape132S0100000_I2_112
            r0.<init>(r3, r1)
            java.lang.Object r0 = r3.A01(r2, r0)
            X.48p r0 = (X.C694548p) r0
            long r1 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r0 = r0.A00
            android.content.SharedPreferences$Editor r3 = r0.edit()
            java.lang.String r0 = "id_request_time_millis_"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r9)
            X.AnonymousClass0wJ.A12(r3, r0, r1)
            return
        L_0x0096:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass44W.A01(android.app.Activity, java.lang.String, java.util.Map, boolean):void");
    }
}
