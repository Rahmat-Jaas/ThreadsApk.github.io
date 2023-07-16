package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import com.facebook.redex.IDxObserverShape210S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.nux.aymh.viewmodel.AymhViewModel;
import com.instagram.nux.ui.NetzDgTermsTextView;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0501000_I2;

/* renamed from: X.1d4  reason: invalid class name */
public final class AnonymousClass1d4 extends C34640IcN implements C83674rn {
    public static final String __redex_internal_original_name = "AymhLoginLandingFragment";
    public AnonymousClass113 A00;
    public AymhViewModel A01;
    public AnonymousClass3FR A02;
    public final C04530Oa A03 = C18190wL.A0x(this, 22);

    public final String getModuleName() {
        return "aymh";
    }

    public final void D7q(KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2) {
        C04530Oa r4 = this.A03;
        r4.getValue();
        AnonymousClass01V r3 = AnonymousClass01V.A0p;
        r3.markerStart(2293785);
        r3.markerAnnotate(2293785, "login_flow", "prod");
        C62713aZ.A00.A02(AnonymousClass0wJ.A0U(r4), (C313625r) null, (Boolean) null, (Boolean) null, (Integer) null, "aymh", ktCSuperShape0S1200000_I2.A04());
        AymhViewModel aymhViewModel = this.A01;
        if (aymhViewModel == null) {
            C04220Ms.A0E("aymhViewModel");
            throw null;
        } else {
            aymhViewModel.A01(ktCSuperShape0S1200000_I2, (C62903b6) null, (C209216q) null, (C07530bf) r4.getValue());
        }
    }

    public final void D7r(KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2) {
        C25828Dsm A0W;
        String string;
        Intent intent;
        Bundle extras;
        String string2;
        AnonymousClass3Wh.A02(AnonymousClass0wJ.A0U(this.A03), AnonymousClass265.A0G, ktCSuperShape0S1200000_I2.A04());
        Collection collection = (Collection) ktCSuperShape0S1200000_I2.A00;
        if (collection == null || !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C209216q) it.next()).A01 == AnonymousClass006.A0Y) {
                    A0W = C18190wL.A0W(requireActivity());
                    FragmentActivity activity = getActivity();
                    if (activity == null || (intent = activity.getIntent()) == null || (extras = intent.getExtras()) == null || (string2 = extras.getString("current_username")) == null || string2.length() == 0) {
                        string = getString(2131827783);
                    } else {
                        string = AnonymousClass0wJ.A0o(this, string2, 2131827784);
                    }
                    C04220Ms.A06(string);
                    A0W.A02 = string;
                    C18230wP.A1B(this, A0W, 2131827793);
                    A0W.A0c((DialogInterface.OnClickListener) null, getString(2131831976));
                }
            }
        }
        A0W = C18190wL.A0W(requireActivity());
        A0W.A0L(2131834608);
        C18230wP.A1B(this, A0W, 2131834609);
        C18190wL.A1R(A0W, ktCSuperShape0S1200000_I2, this, 41, 2131834607);
        C18230wP.A1M(A0W, ktCSuperShape0S1200000_I2, this, 42, 2131823054);
        AnonymousClass0wJ.A1K(A0W);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && C18190wL.A0i(bundle2) != null && bundle2.getBoolean("ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG")) {
            C25828Dsm A002 = C62973bE.A00(getRootActivity());
            A002.A0L(2131830181);
            C18180wK.A1M(A002);
            AnonymousClass0wJ.A1K(A002);
            bundle2.remove("ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG");
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1654388863);
        super.onCreate(bundle);
        FragmentActivity requireActivity = requireActivity();
        C04530Oa r3 = this.A03;
        C10300i6 A0U = AnonymousClass0wJ.A0U(r3);
        C04220Ms.A0B(A0U, 2);
        this.A02 = new AnonymousClass3FR(requireActivity, A0U, false);
        registerLifecycleListener(new C24691jq(getActivity(), this, (C07530bf) r3.getValue(), AnonymousClass265.A0G));
        C14030oh.A09(-726101396, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1941793941);
        LayoutInflater layoutInflater2 = layoutInflater;
        C04220Ms.A0B(layoutInflater2, 0);
        ViewGroup A0I = C18220wO.A0I(layoutInflater2, viewGroup, R.layout.one_tap_login_landing_fragment, false);
        A0I.removeAllViews();
        LayoutInflater.from(requireContext()).inflate(R.layout.aymh_multiple_users, A0I);
        this.A00 = new AnonymousClass113(this);
        View findViewById = A0I.findViewById(R.id.aymh_recycler_view);
        C04220Ms.A0C(findViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        requireContext();
        C18190wL.A1D(recyclerView);
        AnonymousClass113 r0 = this.A00;
        if (r0 == null) {
            C04220Ms.A0E("aymhAdapter");
            throw null;
        }
        recyclerView.setAdapter(r0);
        IDxObserverShape210S0100000_1_I2 iDxObserverShape210S0100000_1_I2 = new IDxObserverShape210S0100000_1_I2(this, 33);
        this.A01 = (AymhViewModel) new AnonymousClass7IU(requireActivity()).A01(AymhViewModel.class);
        Set A08 = AnonymousClass4WM.A08(C313725t.ONE_TAP, C313725t.SMART_LOCK, C313725t.PROFILE, C313725t.GOOGLE, C313725t.FX_MANI_IG_LOGGED_IN);
        AymhViewModel aymhViewModel = this.A01;
        if (aymhViewModel == null) {
            C04220Ms.A0E("aymhViewModel");
            throw null;
        }
        FragmentActivity requireActivity = requireActivity();
        C04530Oa r4 = this.A03;
        Object value = r4.getValue();
        E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, 3);
        AnonymousClass0wJ.A1O(value, A08);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape4S0501000_I2(A0J, A08, aymhViewModel, value, requireActivity, (C146958n9) null, 36), AnonymousClass3J5.A00(aymhViewModel), 3);
        AymhViewModel aymhViewModel2 = this.A01;
        if (aymhViewModel2 == null) {
            C04220Ms.A0E("aymhViewModel");
            throw null;
        }
        C18230wP.A0J(aymhViewModel2.A08).A0C(this, iDxObserverShape210S0100000_1_I2);
        View findViewById2 = A0I.findViewById(R.id.netz_dg_terms_text_view);
        C04220Ms.A0C(findViewById2, "null cannot be cast to non-null type com.instagram.nux.ui.NetzDgTermsTextView");
        ((NetzDgTermsTextView) findViewById2).A00(AnonymousClass0wJ.A0U(r4));
        TextView textView = (TextView) AnonymousClass0wJ.A0I(A0I, R.id.left_button);
        C18180wK.A10(textView, this, 2131836487);
        Integer num = AnonymousClass006.A01;
        AnonymousClass7FY.A02(textView, num);
        AnonymousClass0wJ.A16(textView, 565, this);
        TextView textView2 = (TextView) AnonymousClass0wJ.A0I(A0I, R.id.right_button);
        C18180wK.A10(textView2, this, 2131831926);
        AnonymousClass7FY.A02(textView2, num);
        AnonymousClass0wJ.A16(textView2, 566, this);
        AnonymousClass3X6.A01(textView, textView2);
        View findViewById3 = A0I.findViewById(R.id.login_landing_logo);
        C04220Ms.A0C(findViewById3, "null cannot be cast to non-null type android.widget.ImageView");
        C63163fI.A00(requireContext(), (ImageView) findViewById3);
        AnonymousClass3YT.A00(AnonymousClass0wJ.A0U(r4), (AnonymousClass3V1) null, (C313625r) null, (Integer) null, "aymh", (String) null);
        C14030oh.A09(-955211950, A022);
        return A0I;
    }
}
