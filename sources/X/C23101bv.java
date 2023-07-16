package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.Iterator;

/* renamed from: X.1bv  reason: invalid class name and case insensitive filesystem */
public final class C23101bv extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "ProfileWizardHostingFragment";
    public int A00 = 0;
    public int A01;
    public View A02;
    public ProgressBar A03;
    public AnonymousClass4u2 A04;
    public UserSession A05;
    public final View.OnClickListener A06 = C18210wN.A0H(this, 54);
    public final C58813Hj A07 = new C58813Hj();

    public final String getModuleName() {
        return "profile_wizard";
    }

    public static void A00(C23101bv r4, int i) {
        C25764Drc A0N;
        int i2;
        r4.A00 = i;
        ProgressBar progressBar = r4.A03;
        progressBar.getClass();
        progressBar.setProgress(i + 1);
        int i3 = r4.A00;
        int i4 = r4.A01 - 1;
        View view = r4.A02;
        view.getClass();
        int i5 = 8;
        if (i3 < i4) {
            i5 = 0;
        }
        view.setVisibility(i5);
        int i6 = r4.A00;
        AnonymousClass4u2 r2 = r4.A04;
        r2.getClass();
        if (i6 == 0) {
            A0N = C18190wL.A0K();
            A0N.A0C = r4.A06;
            i2 = 2131824015;
        } else {
            A0N = C18180wK.A0N();
            A0N.A0C = r4.A06;
            i2 = 2131821803;
        }
        A0N.A04 = i2;
        AnonymousClass4u2.A03(A0N, r2);
    }

    public final void configureActionBar(AnonymousClass4u2 r5) {
        this.A04 = r5;
        int i = requireArguments().getInt("extra_number_of_steps", -1);
        this.A01 = i;
        boolean z = false;
        if (i != -1) {
            z = true;
        }
        AnonymousClass7Ko.A0D(z, "extra_number_of_steps must be provided as Fragment's arguments.");
        r5.Cqb(2131824228);
        r5.CtT(true);
        C25764Drc A0K = C18240wQ.A0K();
        A0K.A0F = getString(2131835995);
        this.A02 = r5.A7Q(C18190wL.A0L(A0K, this, 55));
        ProgressBar progressBar = (ProgressBar) r5.A5d(R.layout.layout_profile_wizard_progress).requireViewById(R.id.profile_wizard_progress);
        this.A03 = progressBar;
        progressBar.setMax(this.A01);
        A00(this, this.A00);
    }

    public final C10300i6 getSession() {
        return this.A05;
    }

    public final boolean onBackPressed() {
        Bundle requireArguments = requireArguments();
        Integer num = AnonymousClass006.A0Y;
        UserSession userSession = this.A05;
        C58813Hj r3 = this.A07;
        AnonymousClass3ZJ.A02(requireArguments, userSession, num);
        Fragment A0L = getChildFragmentManager().A0L(R.id.content_panel);
        if ((A0L instanceof C82424pb) && ((C82424pb) A0L).onBackPressed()) {
            return true;
        }
        if (!r3.A02(requireArguments)) {
            return false;
        }
        r3.A00(requireArguments, (Object) null);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        C29571yr r6;
        int A022 = C14030oh.A02(1963845605);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        AnonymousClass0RG r2 = AnonymousClass0RA.A0C;
        this.A05 = r2.A06(requireArguments);
        if (!(bundle == null || getActivity() == null)) {
            synchronized (C29571yr.class) {
                r6 = C29571yr.A00;
            }
            FragmentActivity activity = getActivity();
            UserSession A062 = r2.A06(requireArguments);
            if (((C29601yu) AnonymousClass3ZJ.A01()).A01.get("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93") == null) {
                if (bundle.getString("ProfileWizardPlugin_CurrentSavedStepName") != null) {
                    C18180wK.A0Q(activity, A062).A0D(AnonymousClass2AS.ENTRY_POINT.toString(), 1);
                }
                r6.A0A(activity, A062);
            }
        }
        C14030oh.A09(1872635083, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1760930034);
        requireArguments();
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.layout_profile_completion_wizard);
        C14030oh.A09(-1068597409, A022);
        return A0H;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1807364512);
        super.onDestroyView();
        this.A03 = null;
        this.A02 = null;
        C14030oh.A09(868683934, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(1038449565);
        super.onPause();
        getRootActivity();
        C14030oh.A09(1445313194, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-79830542);
        super.onResume();
        getRootActivity();
        C14030oh.A09(738816178, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C29571yr r3;
        super.onSaveInstanceState(bundle);
        synchronized (C29571yr.class) {
            r3 = C29571yr.A00;
        }
        Iterator it = AnonymousClass3ZJ.A01().A05().iterator();
        while (it.hasNext()) {
            if (C18180wK.A0k(it).equals("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93")) {
                bundle.putString("ProfileWizardPlugin_CurrentSavedStepName", r3.A04("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93"));
                return;
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        if (bundle == null) {
            C58813Hj r1 = this.A07;
            if (r1.A02(requireArguments)) {
                r1.A01(requireArguments, (Object) null);
            }
        }
    }
}
