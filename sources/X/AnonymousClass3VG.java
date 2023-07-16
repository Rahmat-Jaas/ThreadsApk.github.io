package X;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.Map;

/* renamed from: X.3VG  reason: invalid class name */
public abstract class AnonymousClass3VG {
    public Activity A00;
    public Context A01;
    public SparseArray A02;
    public Window A03;
    public Fragment A04;
    public String A05;
    public final C10300i6 A06;

    public final Map A02() {
        if (this instanceof C26131q6) {
            C26131q6 r2 = (C26131q6) this;
            K9R k9r = K9R.A00;
            IVw iVw = new IVw(k9r);
            String str = r2.A05;
            if (str == null || (!str.equals("PHOTO_MEDIA_PREVIEW_PICKER") && !str.equals("PHOTO_SETTINGS") && !str.equals("TOGGLE_CENTRAL_IDENTITY_SYNC") && !str.equals("USERNAME_SETTINGS"))) {
                iVw.A04("opt_in_flow_type", str);
            } else {
                iVw.A04("flow", str);
                C10300i6 r1 = r2.A06;
                C04220Ms.A0B(r1, 0);
                iVw.A03("cds_client_value", C59713Ma.A00(r1));
            }
            int i = r2.A00;
            if (i != 0) {
                iVw.A03("requested_screen_component_type", i);
            }
            iVw.A04("entry_point", r2.A01);
            iVw.A04("origin", r2.A02);
            iVw.A04("extra_string", (String) null);
            return new AnonymousClass4W3(C18180wK.A0M(k9r, iVw), r2);
        }
        K9R k9r2 = K9R.A00;
        IVw iVw2 = new IVw(k9r2);
        iVw2.A04("flow", this.A05);
        iVw2.A04("logging_event", "linking_flow_initiated");
        C10300i6 r12 = this.A06;
        C04220Ms.A0B(r12, 0);
        iVw2.A03("cds_client_value", C59713Ma.A00(r12));
        return C63203gz.A03("params", C18180wK.A0M(k9r2, iVw2).toString());
    }

    public AnonymousClass3VG(Fragment fragment, C10300i6 r4) {
        Window window;
        AnonymousClass0wJ.A1O(r4, fragment);
        this.A06 = r4;
        this.A04 = fragment;
        this.A01 = fragment.getContext();
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            window = activity.getWindow();
        } else {
            window = null;
        }
        this.A03 = window;
        this.A05 = "ig_default";
        this.A00 = null;
    }

    public void A03() {
        C35682Ok.A00().A01(this.A03);
    }

    public AnonymousClass3VG(Activity activity, C10300i6 r3) {
        this.A06 = r3;
        this.A03 = activity.getWindow();
        this.A05 = "ig_default";
        this.A00 = activity;
        this.A01 = activity.getApplicationContext();
        this.A04 = null;
    }
}
