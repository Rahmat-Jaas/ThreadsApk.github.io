package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.autofill.AutofillManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2;
import com.facebook.redex.IDxCListenerShape267S0100000_1_I2;
import com.facebook.redex.IDxObserverShape210S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.nux.aymh.viewmodel.AymhViewModel;
import com.instagram.nux.aymh.viewmodel.AymhViewModel$login$2;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.1bo  reason: invalid class name and case insensitive filesystem */
public final class C23031bo extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "AymhPasswordInputFragment";
    public CheckBox A00;
    public EditText A01;
    public ImageUrl A02;
    public IgTextView A03;
    public AnonymousClass3F0 A04;
    public ProgressButton A05;
    public String A06;
    public String A07;
    public boolean A08;
    public int A09;
    public AymhViewModel A0A;
    public Integer A0B;
    public final C04530Oa A0C = C18190wL.A0x(this, 23);
    public final Runnable A0D = new AnonymousClass4PU(this);

    public final String getModuleName() {
        return "aymh_password_input";
    }

    public static final void A00(C23031bo r11) {
        r11.A09++;
        String str = r11.A07;
        String A062 = C63833iQ.A06();
        if (str != null) {
            EditText editText = r11.A01;
            if (editText == null) {
                A062 = "password";
            } else {
                KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I2 = new KtCSuperShape0S2000000_I2(str, AnonymousClass0wJ.A0n(editText), 37);
                ImageUrl imageUrl = r11.A02;
                String str2 = r11.A07;
                if (str2 != null) {
                    C209216q r4 = new C209216q(imageUrl, AnonymousClass006.A1L, ktCSuperShape0S2000000_I2, str2, r11.A06);
                    AymhViewModel aymhViewModel = r11.A0A;
                    if (aymhViewModel == null) {
                        A062 = "aymhViewModel";
                    } else {
                        C07530bf r6 = (C07530bf) r11.A0C.getValue();
                        boolean z = r11.A08;
                        Integer num = r11.A0B;
                        int i = r11.A09;
                        C04220Ms.A0B(r6, 1);
                        C18230wP.A0J(aymhViewModel.A0A).A0H(new AnonymousClass38Z(2131835972, true));
                        C25237DiI.A00((Integer) null, (C27952Ew2) null, new AymhViewModel$login$2(r4, aymhViewModel, r6, num, (C146958n9) null, i, z), AnonymousClass3J5.A00(aymhViewModel), 3);
                        return;
                    }
                }
            }
        }
        C04220Ms.A0E(A062);
        throw null;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0C);
    }

    public final boolean onBackPressed() {
        AutofillManager autofillManager;
        Context context = getContext();
        if (!(context == null || (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) == null)) {
            autofillManager.cancel();
        }
        C62223Xv.A00(AnonymousClass0wJ.A0U(this.A0C), (C313625r) null, (Boolean) null, (Integer) null, "aymh_password_input");
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        Integer num;
        String str;
        boolean z2;
        int A022 = C14030oh.A02(1487807942);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.aymh_password_input_fragment, viewGroup, false);
        this.A06 = requireArguments().getString("USER_ID", (String) null);
        String string = requireArguments().getString("USERNAME", (String) null);
        if (string != null) {
            this.A07 = string;
            this.A02 = (ImageUrl) requireArguments().getParcelable("PROFILE_PIC_URL");
            String str2 = this.A06;
            if (str2 != null) {
                z = C63533hk.A01().A0I(str2);
            } else {
                z = false;
            }
            this.A08 = z;
            String string2 = requireArguments().getString("ORIGINATING_ACCOUNT_SOURCE", (String) null);
            if (string2 == null) {
                num = null;
            } else if (string2.equals("PROFILE")) {
                num = AnonymousClass006.A00;
            } else if (string2.equals("ONE_TAP")) {
                num = AnonymousClass006.A01;
            } else if (string2.equals("FACEBOOK")) {
                num = AnonymousClass006.A0C;
            } else if (string2.equals("FX_MANI_FACEBOOK")) {
                num = AnonymousClass006.A0N;
            } else if (string2.equals("FX_MANI_IG_LOGGED_IN")) {
                num = AnonymousClass006.A0Y;
            } else if (string2.equals("GOOGLE")) {
                num = AnonymousClass006.A0j;
            } else if (string2.equals("SMART_LOCK_AUTO_SIGNIN")) {
                num = AnonymousClass006.A0u;
            } else if (string2.equals("SMART_LOCK_RESOLVED")) {
                num = AnonymousClass006.A15;
            } else if (string2.equals("ONE_TAP_BACKUP")) {
                num = AnonymousClass006.A1C;
            } else if (string2.equals("STANDARD_LOGIN")) {
                num = AnonymousClass006.A1L;
            } else {
                throw C18190wL.A0a(string2);
            }
            this.A0B = num;
            C04220Ms.A06(inflate);
            TextView A0L = AnonymousClass0wJ.A0L(inflate, R.id.username);
            String str3 = this.A07;
            if (str3 == null) {
                str = C63833iQ.A06();
            } else {
                A0L.setText(str3);
                IgImageView igImageView = (IgImageView) AnonymousClass0wJ.A0J(inflate, R.id.avatar_image_view);
                ImageUrl imageUrl = this.A02;
                if (imageUrl != null) {
                    igImageView.setUrl(imageUrl, this);
                } else {
                    C18180wK.A0r(requireContext(), igImageView, R.drawable.profile_anonymous_user);
                }
                C04530Oa r6 = this.A0C;
                this.A04 = new AnonymousClass3F0(this, (C07530bf) r6.getValue());
                IgTextView igTextView = (IgTextView) AnonymousClass0wJ.A0J(inflate, R.id.login_forgot_button);
                C18200wM.A18(igTextView.getResources(), igTextView, 2131837568);
                this.A03 = igTextView;
                str = "forgotButton";
                AnonymousClass3X6.A00(igTextView);
                IgTextView igTextView2 = this.A03;
                if (igTextView2 != null) {
                    AnonymousClass0wJ.A16(igTextView2, 567, this);
                    ProgressButton progressButton = (ProgressButton) AnonymousClass0wJ.A0J(inflate, R.id.login_button);
                    progressButton.setOnClickListener(C18200wM.A0R(this, progressButton, 148));
                    progressButton.setEnabled(false);
                    this.A05 = progressButton;
                    EditText editText = (EditText) AnonymousClass0wJ.A0J(inflate, R.id.password);
                    editText.setTypeface(Typeface.DEFAULT);
                    C18240wQ.A0z(editText);
                    editText.setImeOptions(6);
                    C18230wP.A17(editText, this, 18);
                    editText.setInputType(524416);
                    C18210wN.A12(editText, this, 10);
                    this.A01 = editText;
                    this.A00 = (CheckBox) AnonymousClass0wJ.A0J(inflate, R.id.save_password_checkbox);
                    String str4 = this.A06;
                    if (str4 != null) {
                        z2 = C63533hk.A01().A0I(str4);
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        this.A08 = true;
                        CheckBox checkBox = this.A00;
                        if (checkBox != null) {
                            checkBox.setChecked(true);
                            CheckBox checkBox2 = this.A00;
                            if (checkBox2 != null) {
                                checkBox2.setOnCheckedChangeListener(new IDxCListenerShape267S0100000_1_I2((Object) this, 29));
                            }
                        }
                        C04220Ms.A0E("savePasswordCheckBox");
                        throw null;
                    }
                    CheckBox checkBox3 = this.A00;
                    if (checkBox3 != null) {
                        checkBox3.setVisibility(8);
                    }
                    C04220Ms.A0E("savePasswordCheckBox");
                    throw null;
                    this.A0A = (AymhViewModel) new AnonymousClass7IU(requireActivity()).A01(AymhViewModel.class);
                    AnonymousClass3YT.A00(AnonymousClass0wJ.A0U(r6), (AnonymousClass3V1) null, (C313625r) null, (Integer) null, "aymh_password_input", (String) null);
                    if (requireArguments().getBoolean("IS_FROM_NDX", false)) {
                        IDxObserverShape210S0100000_1_I2 iDxObserverShape210S0100000_1_I2 = new IDxObserverShape210S0100000_1_I2(this, 34);
                        AymhViewModel aymhViewModel = this.A0A;
                        if (aymhViewModel == null) {
                            C04220Ms.A0E("aymhViewModel");
                            throw null;
                        }
                        C18230wP.A0J(aymhViewModel.A09).A0C(this, iDxObserverShape210S0100000_1_I2);
                    }
                    C14030oh.A09(-759695539, A022);
                    return inflate;
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A09(-918915031, A022);
        throw A0b;
    }

    public final void onResume() {
        Window window;
        int A022 = C14030oh.A02(-1788136075);
        super.onResume();
        EditText editText = this.A01;
        if (editText == null) {
            C04220Ms.A0E("password");
            throw null;
        }
        editText.postDelayed(this.A0D, 200);
        FragmentActivity activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.setFlags(8192, 8192);
        }
        C14030oh.A09(2068392418, A022);
    }

    public final void onStop() {
        Window window;
        int A022 = C14030oh.A02(1658294903);
        super.onStop();
        FragmentActivity activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.clearFlags(8192);
        }
        C14030oh.A09(-402301346, A022);
    }

    public final void configureActionBar(AnonymousClass4u2 r1) {
        AnonymousClass4u2.A05(r1);
    }
}
