package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.barcelona.R;

/* renamed from: X.1Zj  reason: invalid class name and case insensitive filesystem */
public final class C22761Zj extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "TwoFacLandingFragment";
    public Bundle A00;
    public ViewStub A01;
    public ViewStub A02;
    public boolean A03;
    public final C04530Oa A04 = C18210wN.A0j(this, 9);
    public final C04530Oa A05 = C18210wN.A0j(this, 10);
    public final C04530Oa A06 = C18210wN.A0j(this, 11);
    public final C04530Oa A07 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A08(r2, getString(2131837078));
        r2.CtP(this.A03);
        r2.setIsLoading(this.A03);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewStub viewStub = this.A01;
        if (viewStub == null) {
            C04220Ms.A0E("loadingViewStub");
            throw null;
        } else {
            viewStub.inflate();
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A07);
    }

    public final String getModuleName() {
        return C63833iQ.A05();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1131148672);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        C04530Oa r5 = this.A07;
        C10300i6 A0U = AnonymousClass0wJ.A0U(r5);
        String A0b = C18210wN.A0b(requireArguments, "entry_point", "");
        C04220Ms.A0B(A0U, 0);
        if (!NetInfoModule.CONNECTION_TYPE_NONE.equals(A0b)) {
            AnonymousClass1o2.A00(C60923Rc.A01, "two_factor").A06();
            C60923Rc.A00 = null;
        }
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(C60923Rc.A01, A0U), "instagram_two_fac_setup_entry"), 2318);
        A0I.A0T("entry_point", A0b);
        C63833iQ.A0D(A0I);
        A0I.Bb4();
        AnonymousClass3WQ.A02(AnonymousClass0wJ.A0X(r5), "education");
        C14030oh.A09(575795709, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-4914501);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_landing_fragment, viewGroup, false);
        this.A01 = (ViewStub) AnonymousClass0wJ.A0I(inflate, R.id.two_fac_loading_spinner_stub);
        this.A02 = (ViewStub) AnonymousClass0wJ.A0I(inflate, R.id.two_fac_landing_success_stub);
        C24731jw.A02(this);
        C14030oh.A09(2031407002, A022);
        return inflate;
    }

    public final void onStart() {
        int A022 = C14030oh.A02(770611821);
        super.onStart();
        C32165H8c A012 = C62403Zn.A01(requireContext(), AnonymousClass0wJ.A0X(this.A07));
        A012.A00 = (C63873iU) this.A04.getValue();
        schedule(A012);
        C14030oh.A09(1932334383, A022);
    }
}
