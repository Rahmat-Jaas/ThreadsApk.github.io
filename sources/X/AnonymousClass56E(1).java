package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.fbpay.logging.FBPayLoggerData;
import com.instagram.barcelona.R;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.56E  reason: invalid class name */
public final class AnonymousClass56E extends Fragment implements C143618h2, C143678h8 {
    public View A00;
    public View A01;
    public View A02;
    public AnonymousClass57Z A03;
    public FBPayLoggerData A04;
    public Context A05;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0.getVisibility() != 0) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C113986sV BH4() {
        /*
            r10 = this;
            r3 = 0
            android.view.View r0 = r10.A00
            if (r0 == 0) goto L_0x000c
            int r0 = r0.getVisibility()
            r9 = 0
            if (r0 == 0) goto L_0x000d
        L_0x000c:
            r9 = 1
        L_0x000d:
            r0 = 2131827289(0x7f111a59, float:1.9287486E38)
            java.lang.String r4 = r10.getString(r0)
            android.content.Context r1 = r10.A05
            r0 = 2130969481(0x7f040389, float:1.7547645E38)
            android.util.TypedValue r0 = X.C86104wH.A0G(r1, r0)
            int r0 = r0.resourceId
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r0)
            r0 = 60
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r2 = X.C86134wK.A0P(r10, r0)
            r7 = 1
            r5 = 2131827294(0x7f111a5e, float:1.9287497E38)
            r6 = 2
            X.6sV r0 = new X.6sV
            r8 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass56E.BH4():X.6sV");
    }

    public static void A00(AnonymousClass56E r3) {
        Map A06 = C122037Js.A06(r3.A04);
        C121817Ig.A02("target_name", "fbpay_education_info", A06).Bb8("user_click_target_atomic", A06);
        if (r3.A00 == null) {
            View A0G = C18200wM.A0G(r3.requireView(), R.id.branding_view_stub);
            r3.A00 = A0G;
            C86104wH.A1C(A0G.requireViewById(R.id.close), 61, r3);
        }
        r3.A01.setVisibility(8);
        View view = r3.A00;
        view.getClass();
        view.setVisibility(0);
        C86124wJ.A1I(r3);
    }

    public final boolean onBackPressed() {
        View view = this.A00;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        this.A01.setVisibility(0);
        View view2 = this.A00;
        view2.getClass();
        view2.setVisibility(8);
        C86124wJ.A1I(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        FBPayLoggerData fBPayLoggerData;
        int A022 = C14030oh.A02(1263525828);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || bundle2.getParcelable("logger_data") == null) {
            HashSet A0u = C18200wM.A0u();
            fBPayLoggerData = new FBPayLoggerData((String) null, "fbpay_hub", (String) null, (String) null, C122037Js.A01(), (String) null, C86104wH.A13(A0u, A0u));
        } else {
            fBPayLoggerData = (FBPayLoggerData) C18240wQ.A0D(this.mArguments, "logger_data");
        }
        this.A04 = fBPayLoggerData;
        if (bundle == null) {
            AnonymousClass7Kz.A0K().A06().Bb8("fbpay_home_page_init", C122037Js.A06(this.A04));
            AnonymousClass7Kz.A0K().A06().Bb8("client_load_fbpayhubhome_init", C122037Js.A06(this.A04));
            C121817Ig.A01().markerStart(110176278);
        }
        C14030oh.A09(240295570, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-517618943);
        FragmentActivity activity = getActivity();
        AnonymousClass7Kz.A0K();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(activity, 2131886676);
        this.A05 = contextThemeWrapper;
        View A0H = AnonymousClass0wJ.A0H(layoutInflater.cloneInContext(contextThemeWrapper), viewGroup, R.layout.fragment_hub_home);
        C14030oh.A09(-1850086790, A022);
        return A0H;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        this.A01 = view.requireViewById(R.id.content_view);
        this.A02 = view.requireViewById(R.id.progress_bar);
        this.A00 = null;
        this.A03 = (AnonymousClass57Z) C121817Ig.A00(this).A01(AnonymousClass57Z.class);
        C882957m r6 = (C882957m) C121817Ig.A00(this).A01(C92775jq.class);
        C92815ju r4 = (C92815ju) C121817Ig.A00(this).A01(C92815ju.class);
        AnonymousClass57Z r3 = this.A03;
        FBPayLoggerData fBPayLoggerData = this.A04;
        r3.A02 = fBPayLoggerData;
        r3.A08.Bb8("fbpay_home_page_display", C122037Js.A06(fBPayLoggerData));
        r3.A03 = r4;
        r3.A01 = r6;
        r3.A00 = r6;
        C880756q r2 = r3.A05;
        C880756q r0 = r6.A03;
        C143158gC r1 = r3.A06;
        r2.A0K(r0, r1);
        r2.A0K(((C882957m) C121817Ig.A00(this).A01(C92865jz.class)).A03, r1);
        r2.A0K(r4.A03, r1);
        C86104wH.A1F(this, this.A03.A05, 237);
        C86104wH.A1F(this, this.A03.A03.A02, 238);
        if (bundle == null && (bundle2 = this.mArguments) != null && bundle2.getBoolean("show_branding_page")) {
            A00(this);
        }
    }
}
