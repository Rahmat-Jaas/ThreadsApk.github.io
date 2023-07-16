package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.debug.devoptions.api.DevOptionsPreferenceAdapter;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.1wa  reason: invalid class name and case insensitive filesystem */
public final class C29031wa extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "IgBloksNativeHybridFragment";
    public UserSession A00;
    public DevOptionsPreferenceAdapter A01;

    public final String getModuleName() {
        return "ig_bloks_native_hybrid_options";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public static void A0B(C66883yU r4, C29031wa r5) {
        HashMap A02 = C37067Jjv.A02(AnonymousClass0wJ.A0y());
        IgBloksScreenConfig A0N = C18190wL.A0N(r5.A00);
        A0N.A0P = "com.bloks.www.bloks.demos.cds.nativebottomsheet";
        A0N.A01 = r4;
        C63743iE.A04("com.bloks.www.bloks.demos.cds.nativebottomsheet", A02, Collections.emptyMap()).A0E(r5.requireContext(), A0N);
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131825008);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(624325669);
        super.onCreate(bundle);
        this.A00 = C18180wK.A0V(this.mArguments);
        C14030oh.A09(556345493, A02);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C18200wM.A0H(this).setBackgroundColor(C121907Is.A00(getContext(), R.attr.backgroundColorPrimary));
        Context context = getContext();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C63613hu.A03(A0v, 2131825023);
        AnonymousClass4MA.A03(C18200wM.A0R(C130667qT.A02(this, this.A00, (C30938GbW) null), this, 19), A0v, 2131825009);
        AnonymousClass4MA.A03(C18190wL.A0H(this, 51), A0v, 2131825022);
        AnonymousClass4MA.A03(C18190wL.A0H(this, 52), A0v, 2131825025);
        AnonymousClass4MA.A03(C18190wL.A0H(this, 54), A0v, 2131825012);
        C63613hu.A03(A0v, 2131825020);
        AnonymousClass4MA.A03(C18190wL.A0H(this, 55), A0v, 2131825021);
        C63613hu.A01("Bloks Screen Query Examples", A0v);
        AnonymousClass4MA.A02(C18190wL.A0H(this, 56), "Simple Screen Query Example", A0v);
        C63613hu.A03(A0v, 2131825019);
        AnonymousClass4MA.A03(C18190wL.A0H(this, 57), A0v, 2131825017);
        AnonymousClass4MA.A03(C18190wL.A0H(this, 58), A0v, 2131825015);
        AnonymousClass4MA.A03(C18190wL.A0H(this, 59), A0v, 2131825016);
        AnonymousClass4MA.A03(C18200wM.A0R(context, this, 20), A0v, 2131825018);
        AnonymousClass4MA.A03(C18190wL.A0H(this, 53), A0v, 2131825014);
        C63613hu.A03(A0v, 2131825010);
        AnonymousClass4MA.A03(C18200wM.A0R(context, this, 17), A0v, 2131825011);
        AnonymousClass4MA.A03(C18200wM.A0R(context, this, 18), A0v, 2131825013);
        DevOptionsPreferenceAdapter devOptionsPreferenceAdapter = new DevOptionsPreferenceAdapter(getActivity(), this.A00, this);
        this.A01 = devOptionsPreferenceAdapter;
        devOptionsPreferenceAdapter.setUnfilteredItems(A0v);
        getScrollingViewProxy().ChZ(this.A01);
        this.A01.getFilter().filter((CharSequence) null);
    }
}
