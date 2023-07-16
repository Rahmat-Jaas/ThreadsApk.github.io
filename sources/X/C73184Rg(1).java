package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.nux.activity.BloksSignedOutFragmentActivity;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.4Rg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C73184Rg implements Runnable {
    public final /* synthetic */ C130667qT A00;
    public final /* synthetic */ BloksSignedOutFragmentActivity A01;

    public /* synthetic */ C73184Rg(C130667qT r1, BloksSignedOutFragmentActivity bloksSignedOutFragmentActivity) {
        this.A01 = bloksSignedOutFragmentActivity;
        this.A00 = r1;
    }

    public final void run() {
        long j;
        BloksSignedOutFragmentActivity bloksSignedOutFragmentActivity = this.A01;
        C130667qT r6 = this.A00;
        IgBloksScreenConfig A002 = BloksSignedOutFragmentActivity.A00(bloksSignedOutFragmentActivity, C18180wK.A0Y(), "com.bloks.www.caa.login.home_template");
        String A0V = AnonymousClass00U.A0V("com.bloks.www.caa.login.home_template", ":", C31103Gfm.A00());
        String A0D = C09120et.A02().A0D();
        if (AnonymousClass0hA.A08(A0D)) {
            A0D = C18230wP.A0h();
            C09120et.A02().A0F(A0D);
        }
        String A0l = C18190wL.A0l(bloksSignedOutFragmentActivity.A03);
        if (A0l == null) {
            A0l = "";
        }
        if (C63173fJ.A05(AnonymousClass0TJ.A05, 18313774909958451L)) {
            j = 0;
        } else {
            j = 604800;
        }
        Long valueOf = Long.valueOf(j);
        FragmentActivity fragmentActivity = r6.A03;
        HashMap A0y = AnonymousClass0wJ.A0y();
        HashMap A0y2 = AnonymousClass0wJ.A0y();
        HashMap A0y3 = AnonymousClass0wJ.A0y();
        new BitSet(0);
        long longValue = valueOf.longValue();
        A0y2.put(C62983bG.A02(0), C09140ev.A00(bloksSignedOutFragmentActivity));
        A0y2.put("family_device_id", A0l);
        A0y2.put("logged_out_user", C18220wO.A0f(C09120et.A02().A07));
        A0y2.put("offline_experiment_group", AnonymousClass3Y9.A00(bloksSignedOutFragmentActivity.A01));
        A0y2.put("show_internal_settings", false);
        A0y2.put("waterfall_id", A0D);
        try {
            C63743iE r8 = new C63743iE(C37067Jjv.A02(A0y), A0y2, "com.bloks.www.caa.login.home_template");
            r8.A00 = 719983200;
            r8.A05 = A0V;
            if (longValue >= 0) {
                r8.A01 = longValue;
                r8.A03 = null;
                r8.A02 = null;
                r8.A04 = null;
                r8.A0G(A0y3);
                r8.A0E(fragmentActivity, A002);
                if (C34819Ifn.A05.A04(C32062H3c.A01(AnonymousClass00U.A0L(AnonymousClass2G0.A00(AnonymousClass0wJ.A0y(), "com.bloks.www.caa.login.home_template", A0V), "loaded_screen_query")))) {
                    AnonymousClass01V.A0p.markerPoint(896612552, "disk_cache_hit");
                } else if (AnonymousClass30T.A00.A00(AnonymousClass00U.A0L(AnonymousClass2G0.A00(AnonymousClass0wJ.A0y(), "com.bloks.www.caa.login.home_template", A0V), "loaded_screen_query")) != null) {
                    AnonymousClass01V.A0p.markerPoint(896612552, "memory_cache_hit");
                } else {
                    AnonymousClass01V.A0p.markerPoint(896612552, "cache_miss");
                }
            } else {
                throw C18190wL.A0a("CacheTTL must be positive");
            }
        } catch (IllegalStateException e) {
            AnonymousClass0LU.A0E("BloksSignedOutFragmentActivity", "Failed to open cacheable login home screen", e);
            AnonymousClass01V.A0p.markerAnnotate(896612552, TraceFieldType.FailureReason, AnonymousClass0wJ.A0t("Failed to open cacheable login home screen: ", e));
            AnonymousClass01V.A0p.markerEnd(896612552, 3);
        }
    }
}
