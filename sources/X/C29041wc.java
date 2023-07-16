package X;

import android.os.Bundle;
import android.widget.CompoundButton;
import com.facebook.redex.IDxCListenerShape267S0100000_1_I2;
import com.instagram.barcelona.R;
import java.util.ArrayList;

/* renamed from: X.1wc  reason: invalid class name and case insensitive filesystem */
public final class C29041wc extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "TwoFacOtherMethodsFragment";
    public Bundle A00;
    public final C04530Oa A01 = C80644m9.A00(this);

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public static final void A0B(C29041wc r16) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C29041wc r3 = r16;
        Bundle bundle = r3.A00;
        if (bundle != null) {
            boolean z = bundle.getBoolean("is_two_factor_enabled");
            Bundle bundle2 = r3.A00;
            if (bundle2 != null) {
                boolean z2 = bundle2.getBoolean("is_totp_two_factor_enabled");
                AnonymousClass3TL r4 = new AnonymousClass3TL(2131837134);
                r4.A01 = 1;
                r4.A06 = new C57853Cs(AnonymousClass0wJ.A0B(r3).getDimensionPixelSize(R.dimen.abc_dialog_padding_material), 0, AnonymousClass0wJ.A0B(r3).getDimensionPixelSize(R.dimen.abc_dialog_padding_material), C18220wO.A03(AnonymousClass0wJ.A0B(r3)), AnonymousClass0wJ.A0B(r3).getDimensionPixelSize(R.dimen.abc_dialog_padding_material), AnonymousClass0wJ.A0B(r3).getDimensionPixelSize(R.dimen.abc_dialog_padding_material));
                r4.A03 = R.style.TwoFacRowBodyText;
                A0v.add(r4);
                Bundle bundle3 = r3.A00;
                if (bundle3 != null) {
                    AnonymousClass4MC r42 = new AnonymousClass4MC((CompoundButton.OnCheckedChangeListener) new IDxCListenerShape267S0100000_1_I2((Object) r3, 28), (C33516HpC) AnonymousClass4DM.A00, 2131837137, bundle3.getBoolean("is_trusted_notifications_enabled"));
                    int dimensionPixelSize = AnonymousClass0wJ.A0B(r3).getDimensionPixelSize(R.dimen.account_section_text_margin_horizontal);
                    r42.A05 = dimensionPixelSize;
                    r42.A00 = dimensionPixelSize;
                    r42.A02 = 2131837136;
                    int dimensionPixelSize2 = AnonymousClass0wJ.A0B(r3).getDimensionPixelSize(R.dimen.account_section_text_margin_horizontal);
                    r42.A05 = dimensionPixelSize2;
                    r42.A00 = dimensionPixelSize2;
                    A0v.add(r42);
                    Bundle bundle4 = r3.A00;
                    if (bundle4 != null) {
                        ArrayList<String> stringArrayList = bundle4.getStringArrayList("backup_codes");
                        if ((z || z2) && stringArrayList != null) {
                            A0v.add(new C62593aM(C18200wM.A0R(r3, stringArrayList, 133), (String) null, 2131837133, 2131837132, false));
                        }
                        r3.setItems(A0v);
                        return;
                    }
                }
            }
        }
        C04220Ms.A0E("twoFacResponseBundle");
        throw null;
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A05(r2);
        r2.Cqb(2131837138);
    }

    public final String getModuleName() {
        return C63833iQ.A05();
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(2132450867);
        super.onCreate(bundle);
        this.A00 = requireArguments();
        C14030oh.A09(875197608, A02);
    }

    public final void onStart() {
        int A02 = C14030oh.A02(970375830);
        super.onStart();
        A0B(this);
        C14030oh.A09(791932301, A02);
    }
}
