package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.google.android.material.textfield.TextInputLayout;
import com.instagram.actionbar.ActionButton;
import com.instagram.barcelona.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgButton;
import java.util.HashMap;

/* renamed from: X.1c4  reason: invalid class name */
public final class AnonymousClass1c4 extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "PasswordResetFragment";
    public View A00;
    public EditText A01;
    public EditText A02;
    public TextInputLayout A03;
    public TextInputLayout A04;
    public ImageUrl A05;
    public AnonymousClass3G5 A06;
    public C07530bf A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public IgButton A0C;
    public AnonymousClass3V1 A0D;
    public C70224Dh A0E;
    public final View.OnClickListener A0F = C18190wL.A0H(this, HttpStatus.SC_GATEWAY_TIMEOUT);
    public final C63873iU A0G = C63873iU.A06(this, 66);

    public final String getModuleName() {
        return "password_reset";
    }

    public static void A00(View view, AnonymousClass1c4 r5) {
        TextView A0L;
        String str;
        if (view != null) {
            C18250wR.A0M(view, R.id.user_profile_picture).setUrl(r5.A05, r5);
            if (r5.A0A) {
                A0L = C18180wK.A0G(view, R.id.passwordless_reset_title);
                if (A0L != null) {
                    str = AnonymousClass0wJ.A0o(r5, r5.A09, 2131827786);
                }
                r5.A0B = false;
                C18190wL.A0M(r5).setIsLoading(false);
            }
            A0L = AnonymousClass0wJ.A0L(view, R.id.username_textview);
            str = r5.A09;
            A0L.setText(str);
            r5.A0B = false;
            C18190wL.A0M(r5).setIsLoading(false);
        }
    }

    public static void A01(FragmentActivity fragmentActivity, AnonymousClass1c4 r17) {
        String A0n;
        EditText editText;
        String A0n2;
        AnonymousClass1c4 r12 = r17;
        C07530bf r9 = r12.A07;
        String str = r12.A08;
        EditText editText2 = r12.A02;
        if (editText2 == null) {
            A0n = null;
        } else {
            A0n = AnonymousClass0wJ.A0n(editText2);
        }
        if (r12.A0A) {
            editText = r12.A02;
        } else {
            editText = r12.A01;
        }
        if (editText == null) {
            A0n2 = null;
        } else {
            A0n2 = AnonymousClass0wJ.A0n(editText);
        }
        String string = r12.requireArguments().getString("argument_reset_token");
        FragmentActivity fragmentActivity2 = fragmentActivity;
        String A002 = C09140ev.A00(fragmentActivity2);
        String A0i = C18230wP.A0i(fragmentActivity2);
        H1T A0N = AnonymousClass0wJ.A0N(r9);
        A0N.A0O("enc_new_password2", C62663aU.A01(A0N, r9, "enc_new_password1", C62663aU.A00(A0N, r9, A0n), A0n2));
        C18250wR.A17(A0N, str);
        A0N.A0O("token", string);
        C63213h0.A04(A0N, A002);
        A0N.A0O("guid", A0i);
        C32165H8c A0S = C18180wK.A0S(A0N);
        C07530bf r15 = r12.A07;
        AnonymousClass265 r16 = AnonymousClass265.A17;
        Integer num = AnonymousClass006.A00;
        C70224Dh r13 = r12.A0E;
        Uri A012 = C67323zM.A01(r12);
        Bundle bundle = r12.mArguments;
        if (bundle != null) {
            bundle.getString("flow_id");
        }
        A0S.A00 = new C26811rF(fragmentActivity2, A012, r12, r13, r12, r15, r16, num);
        r12.schedule(A0S);
    }

    public static void A02(AnonymousClass1c4 r5) {
        Context context;
        int i;
        String str;
        AnonymousClass3G5 r1 = r5.A06;
        String A0n = AnonymousClass0wJ.A0n(r1.A06);
        String A0n2 = AnonymousClass0wJ.A0n(r1.A05);
        if (A0n.length() < 6 || !A0n2.equals(A0n)) {
            AnonymousClass3G5 r0 = r5.A06;
            EditText editText = r0.A06;
            String A0n3 = AnonymousClass0wJ.A0n(editText);
            String A0n4 = AnonymousClass0wJ.A0n(r0.A05);
            if (A0n3.length() < 6 || A0n4.length() < 6) {
                context = editText.getContext();
                i = 2131832179;
            } else if (!A0n3.equals(A0n4)) {
                context = editText.getContext();
                i = 2131832184;
            } else {
                str = null;
                C63813iO.A0F(str);
                return;
            }
            str = context.getString(i);
            C63813iO.A0F(str);
            return;
        }
        C54232z7.A00(r5.A07, "password_reset");
        FragmentActivity activity = r5.getActivity();
        if (activity != null) {
            if (C63803iN.A05(AnonymousClass0TJ.A05, r5.A07, 36312251975664517L).booleanValue()) {
                AnonymousClass0gN.A00().AKp(new AnonymousClass1mW(activity, r5));
            } else {
                A01(activity, r5);
            }
        }
    }

    public static boolean A03(AnonymousClass1c4 r2) {
        Bundle bundle = r2.mArguments;
        if (bundle == null || !bundle.getString("flow_id", "").equals("fxcal")) {
            return false;
        }
        return true;
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        if (this.A0A) {
            if (getContext() != null) {
                ((E2V) r3).A0K.setBackground(getContext().getDrawable(R.color.direct_widget_primary_background));
            }
            AnonymousClass4u2.A06(r3);
        } else {
            ActionButton A002 = AnonymousClass4u2.A00(this.A0F, r3, AnonymousClass0wJ.A0B(this).getString(2131823209));
            this.A00 = A002;
            A002.setEnabled(this.A06.A00());
        }
        r3.setIsLoading(this.A0B);
    }

    public final C10300i6 getSession() {
        return this.A07;
    }

    public final boolean onBackPressed() {
        C62223Xv.A00.A01(this.A07, "password_reset");
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(908624642);
        super.onCreate(bundle);
        this.A07 = C18210wN.A0N(this);
        this.A0D = AnonymousClass3V1.A00(requireArguments());
        AnonymousClass3YT.A00.A02(this.A07, "password_reset");
        this.A08 = requireArguments().getString("argument_user_id");
        this.A09 = requireArguments().getString("argument_user_name");
        this.A05 = (ImageUrl) requireArguments().getParcelable("argument_profile_pic_url");
        C04740Ox r4 = C04740Ox.A00;
        if (this.A09 != null) {
            this.A0B = false;
        } else {
            H1T A0O = C18180wK.A0O(this.A07);
            A0O.A0T("users/%s/filtered_info/", this.A08);
            A0O.A08(r4, AnonymousClass1TB.class, AnonymousClass3OG.class);
            C32165H8c A023 = A0O.A02();
            A023.A00 = this.A0G;
            schedule(A023);
        }
        this.A0E = new C70224Dh(getActivity());
        if (A03(this)) {
            C07530bf r42 = this.A07;
            String str = this.A08;
            C04220Ms.A0B(r42, 0);
            C35782Ou.A00(AnonymousClass2A5.A04, r42, str, (HashMap) null);
        }
        C14030oh.A09(-1533949028, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EditText editText;
        EditText editText2;
        EditText editText3;
        EditText editText4;
        EditText editText5;
        int A022 = C14030oh.A02(985780102);
        boolean A032 = A03(this);
        this.A0A = A032;
        int i = R.layout.fragment_password_reset;
        if (A032) {
            i = R.layout.fragment_passwordless_reset;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        this.A02 = (EditText) inflate.requireViewById(R.id.new_password);
        IgButton igButton = null;
        if (this.A0A) {
            editText = null;
        } else {
            editText = (EditText) inflate.findViewById(R.id.confirm_new_password);
        }
        this.A01 = editText;
        if (this.A0A) {
            igButton = (IgButton) inflate.findViewById(R.id.save_password_button);
        }
        this.A0C = igButton;
        if (this.A0A && igButton != null) {
            igButton.setOnClickListener(this.A0F);
        }
        EditText editText6 = this.A02;
        Typeface typeface = Typeface.DEFAULT;
        editText6.setTypeface(typeface);
        C18240wQ.A0z(this.A02);
        if (!this.A0A && (editText5 = this.A01) != null) {
            editText5.setTypeface(typeface);
            C18240wQ.A0z(this.A01);
        }
        Resources A0B2 = AnonymousClass0wJ.A0B(this);
        EditText editText7 = this.A02;
        if (this.A0A) {
            editText2 = editText7;
        } else {
            editText2 = this.A01;
        }
        AnonymousClass3G5 r4 = new AnonymousClass3G5(A0B2, editText7, editText2);
        this.A06 = r4;
        r4.A00 = new AnonymousClass354(this);
        if (this.A09 != null) {
            A00(inflate, this);
        }
        this.A04 = (TextInputLayout) inflate.findViewById(R.id.new_password_input_layout);
        if (!this.A0A) {
            this.A03 = (TextInputLayout) inflate.findViewById(R.id.confirm_password_input_layout);
        }
        TextInputLayout textInputLayout = this.A04;
        if (textInputLayout != null) {
            textInputLayout.setEndIconVisible(false);
        }
        TextInputLayout textInputLayout2 = this.A03;
        if (textInputLayout2 != null) {
            textInputLayout2.setEndIconVisible(false);
        }
        C18210wN.A10(this.A02, 4, this);
        if (!this.A0A && (editText4 = this.A01) != null) {
            C18210wN.A10(editText4, 5, this);
        }
        if (!this.A0A && (editText3 = this.A01) != null) {
            C18210wN.A12(editText3, this, 5);
        }
        C14030oh.A09(-1616507862, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(1085259463);
        super.onDestroy();
        C14030oh.A09(-1232551366, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1011213320);
        super.onDestroyView();
        AnonymousClass3G5 r2 = this.A06;
        r2.A00 = null;
        r2.A06.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        r2.A05.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        this.A06 = null;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A0C = null;
        this.A03 = null;
        this.A04 = null;
        C14030oh.A09(-72044962, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-1668860928);
        super.onPause();
        if (C18250wR.A09(this) != null) {
            C09860go.A0I(C18250wR.A09(this));
        }
        getRootActivity();
        C14030oh.A09(1821339296, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1691875454);
        super.onResume();
        ((BaseFragmentActivity) requireActivity()).A0C();
        ((BaseFragmentActivity) requireActivity()).A09();
        getRootActivity();
        C14030oh.A09(433037402, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass01V.A0p.markerEnd(725091390, 2);
    }
}
