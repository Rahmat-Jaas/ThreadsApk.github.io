package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.barcelona.R;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.location.surface.data.LocationPageInfo;
import com.instagram.service.session.UserSession;

/* renamed from: X.1db  reason: invalid class name and case insensitive filesystem */
public final class C23341db extends I5x implements C82034oy, C84284st, C84264sr {
    public static final CallerContext A08 = CallerContext.A01(C23341db.class.getName());
    public static final String __redex_internal_original_name = "ClaimLocationPageFragment";
    public AnonymousClass3VI A00;
    public LocationPageInfo A01;
    public C24731jw A02;
    public BusinessNavBar A03;
    public C24711ju A04;
    public AnonymousClass1fE A05;
    public UserSession A06;
    public final Handler A07 = AnonymousClass0wJ.A0F();

    public final void CCX() {
        String A012;
        Context context = getContext();
        LocationPageInfo locationPageInfo = this.A01;
        String str = locationPageInfo.A04;
        String str2 = locationPageInfo.A03;
        boolean A3D = AnonymousClass0wJ.A0Y(this.A06).A3D();
        UserSession userSession = this.A06;
        CallerContext callerContext = A08;
        if (A3D) {
            A012 = C61853Wb.A00(callerContext, userSession, "ig_professional_fb_page_linking");
        } else {
            A012 = C62963bD.A01(callerContext, userSession, "ig_professional_fb_page_linking");
        }
        AnonymousClass2KX.A00(context, this, this, this.A06, str, str2, A012, "claim_location_page", "ig_local");
    }

    public final void CJ9() {
    }

    public final String getModuleName() {
        return "claim_location_page";
    }

    public static void A01(AnonymousClass3VI r2, C23341db r3, String str) {
        r2.A04 = str;
        r2.A07 = "claim_location_page";
        LocationPageInfo locationPageInfo = r3.A01;
        r2.A05 = locationPageInfo.A04;
        r2.A06 = locationPageInfo.A02;
        r2.A00();
    }

    public final C10300i6 A0I() {
        return this.A06;
    }

    public final void AHz() {
        this.A03.setPrimaryButtonEnabled(false);
    }

    public final void AJV() {
        this.A03.setPrimaryButtonEnabled(true);
    }

    public final void CGO() {
        this.A04.A00();
    }

    public final void CGY() {
        this.A04.A01();
    }

    public final void CGK(String str, String str2, String str3, String str4) {
        C63813iO.A02(getContext(), str, "SwitchPage onRequestFail", 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r1 == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CGh(java.lang.String r4) {
        /*
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.getTargetFragment()
            boolean r0 = r0 instanceof X.C23381dg
            if (r0 == 0) goto L_0x001c
            androidx.fragment.app.Fragment r2 = r3.getTargetFragment()
            X.1dg r2 = (X.C23381dg) r2
            java.lang.String r0 = r2.A06
            if (r0 == 0) goto L_0x0019
            boolean r1 = r0.equals(r4)
            r0 = 1
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r2.A08 = r0
        L_0x001c:
            android.os.Handler r1 = r3.A07
            X.4P8 r0 = new X.4P8
            r0.<init>(r3)
            r1.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23341db.CGh(java.lang.String):void");
    }

    public final void configureActionBar(AnonymousClass4u2 r4) {
        C25764Drc A0K = C18240wQ.A0K();
        A0K.A08 = R.layout.location_page_info_page_edit_button;
        A0K.A04 = 2131823054;
        A0K.A0C = C18190wL.A0H(this, 487);
        ((TextView) r4.A7T(new C25435DlZ(A0K))).setText(2131823054);
    }

    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        int A022 = C14030oh.A02(-1265107825);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        if (bundle == null) {
            parcelable = requireArguments.getParcelable("location_page_info");
        } else {
            parcelable = bundle.getParcelable("location_page_info");
        }
        this.A01 = (LocationPageInfo) parcelable;
        this.A06 = C18180wK.A0V(requireArguments);
        C24731jw r0 = new C24731jw(getActivity());
        this.A02 = r0;
        registerLifecycleListener(r0);
        AnonymousClass3VI r1 = this.A00;
        if (r1 != null) {
            A01(r1, this, "start_step");
        }
        C14030oh.A09(-1158716951, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1694813992);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.location_page_claim_fragment);
        BusinessNavBar businessNavBar = (BusinessNavBar) A0H.findViewById(R.id.navigation_bar);
        this.A03 = businessNavBar;
        C24711ju r0 = new C24711ju(businessNavBar, (C84264sr) this, 2131831737, -1);
        this.A04 = r0;
        registerLifecycleListener(r0);
        AnonymousClass1fE r02 = new AnonymousClass1fE(getContext(), this, this.A06);
        this.A05 = r02;
        A0F(r02);
        C14030oh.A09(-1151864861, A022);
        return A0H;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-1178947632);
        unregisterLifecycleListener(this.A02);
        unregisterLifecycleListener(this.A04);
        super.onDestroy();
        C14030oh.A09(1748851081, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(791846543);
        super.onPause();
        AnonymousClass3VI r1 = this.A00;
        if (r1 != null) {
            A01(r1, this, "finish_step");
        }
        C14030oh.A09(1338444038, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("location_page_info", this.A01);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A03.setPrimaryButtonText(2131823299);
        AnonymousClass1fE r3 = this.A05;
        r3.A00 = this.A01;
        r3.A03();
        r3.A06(r3.A02, (Object) null, (Object) null);
        r3.A05(r3.A03, r3.A00);
        r3.A06(r3.A01, (Object) null, C18180wK.A0Y());
        r3.A04();
    }
}
