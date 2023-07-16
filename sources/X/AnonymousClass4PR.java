package X;

import android.util.SparseArray;
import com.instagram.barcelona.R;
import com.instagram.nux.activity.BloksSignedOutFragmentActivity;
import java.util.Map;

/* renamed from: X.4PR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4PR implements Runnable {
    public final /* synthetic */ BloksSignedOutFragmentActivity A00;

    public /* synthetic */ AnonymousClass4PR(BloksSignedOutFragmentActivity bloksSignedOutFragmentActivity) {
        this.A00 = bloksSignedOutFragmentActivity;
    }

    public final void run() {
        BloksSignedOutFragmentActivity bloksSignedOutFragmentActivity = this.A00;
        String A0D = C09120et.A02().A0D();
        if (AnonymousClass0hA.A08(A0D)) {
            A0D = C18230wP.A0h();
            C09120et.A02().A0F(A0D);
        }
        String A0l = C18190wL.A0l(bloksSignedOutFragmentActivity.A03);
        if (A0l == null) {
            A0l = "";
        }
        AnonymousClass140 r2 = new AnonymousClass140();
        String A002 = C09140ev.A00(bloksSignedOutFragmentActivity);
        if (!(A002 == null || A002.length() == 0)) {
            r2.A02.put(C62983bG.A02(0), A002);
        }
        if (A0l.length() != 0) {
            r2.A02.put("family_device_id", A0l);
        }
        String A0j = C18200wM.A0j(C09120et.A02().A07);
        if (!(A0j == null || A0j.length() == 0)) {
            r2.A02.put("logged_out_user", A0j);
        }
        String A003 = AnonymousClass3Y9.A00(bloksSignedOutFragmentActivity.A01);
        if (!(A003 == null || A003.length() == 0)) {
            r2.A02.put("offline_experiment_group", A003);
        }
        Map map = r2.A02;
        map.put("show_internal_settings", false);
        if (!(A0D == null || A0D.length() == 0)) {
            map.put("waterfall_id", A0D);
        }
        r2.A01 = 604800;
        r2.A00();
        AnonymousClass4WJ.A0E(map);
        C07530bf r22 = bloksSignedOutFragmentActivity.A03;
        C04220Ms.A0B(r22, 0);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(R.id.bloks_ig_session, r22);
        sparseArray.put(R.id.bloks_ig_use_prelogin_json_parser, false);
        C04220Ms.A06(sparseArray.clone());
        throw C18190wL.A0a(String.format("No implementation bound to key: %s", C18210wN.A1X(1)));
    }
}
