package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.CompoundButton;
import com.facebook.redex.IDxCListenerShape2S0110000_1_I2;
import com.facebook.redex.IDxCListenerShape4S0210000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.login.twofac.model.TotpSeed;
import com.instagram.ui.text.IDxCSpanShape62S0000000_1_I2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1wr  reason: invalid class name */
public final class AnonymousClass1wr extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "TwoFacMultipleTotpFragment";
    public Bundle A00;
    public AnonymousClass4MC A01;
    public final C04530Oa A02 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131837117);
    }

    public static final void A0B(AnonymousClass1wr r16) {
        AnonymousClass1wr r6 = r16;
        Bundle bundle = r6.A00;
        String str = "twoFacResponseBundle";
        if (bundle != null) {
            boolean z = bundle.getBoolean("can_add_additional_totp_seed");
            AnonymousClass4MC r0 = r6.A01;
            if (r0 == null) {
                str = "authenticatorAppSwitch";
            } else {
                List A18 = C06750aI.A18(r0);
                C62153Xk r7 = new C62153Xk((View.OnClickListener) new IDxCListenerShape2S0110000_1_I2(5, r6, z), 2131837049);
                r7.A06 = true;
                SpannableStringBuilder A0E = C18200wM.A0E(r6.getString(2131821015));
                A0E.setSpan(new IDxCSpanShape62S0000000_1_I2(C18220wO.A04(r6), 1), 0, A0E.length(), 18);
                r7.A04 = A0E;
                A18.add(r7);
                AnonymousClass3TL r3 = new AnonymousClass3TL((CharSequence) r6.getString(2131837080));
                r3.A06 = new C57853Cs(AnonymousClass0wJ.A0B(r6).getDimensionPixelSize(R.dimen.abc_dialog_padding_material), AnonymousClass0wJ.A0B(r6).getDimensionPixelSize(R.dimen.account_section_text_margin_horizontal), AnonymousClass0wJ.A0B(r6).getDimensionPixelSize(R.dimen.account_section_text_margin_horizontal), AnonymousClass0wJ.A0B(r6).getDimensionPixelSize(R.dimen.account_section_text_margin_horizontal), AnonymousClass0wJ.A0B(r6).getDimensionPixelSize(R.dimen.abc_floating_window_z), AnonymousClass0wJ.A0B(r6).getDimensionPixelSize(R.dimen.abc_floating_window_z));
                r3.A03 = R.style.TwoFacRowBodyText;
                A18.add(r3);
                Bundle bundle2 = r6.A00;
                if (bundle2 != null) {
                    ArrayList parcelableArrayList = bundle2.getParcelableArrayList("totp_seeds");
                    if (parcelableArrayList != null) {
                        Iterator it = parcelableArrayList.iterator();
                        while (it.hasNext()) {
                            TotpSeed totpSeed = (TotpSeed) it.next();
                            boolean A1T = AnonymousClass0wJ.A1T(parcelableArrayList.size(), 1);
                            String str2 = totpSeed.A01;
                            String str3 = totpSeed.A00;
                            C62593aM r1 = new C62593aM((View.OnClickListener) new IDxCListenerShape4S0210000_1_I2(1, r6, totpSeed, A1T), (CharSequence) str2, (CharSequence) str3, "");
                            r1.A0A = true;
                            if (str3 == null || str3.length() == 0) {
                                r1.A07 = null;
                            }
                            A18.add(r1);
                        }
                    }
                    r6.setItems(A18);
                    return;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0C(X.AnonymousClass1wr r5, com.instagram.login.twofac.model.TotpSeed r6, boolean r7, boolean r8, boolean r9) {
        /*
            java.lang.String r3 = "\n\n                "
            java.lang.String r2 = "\n                "
            if (r8 == 0) goto L_0x006a
            if (r7 == 0) goto L_0x006a
            if (r9 == 0) goto L_0x0058
            if (r6 == 0) goto L_0x0058
            r0 = 2131837107(0x7f1140b3, float:1.93074E38)
            java.lang.String r4 = X.C18180wK.A0g(r5, r0)
            r1 = 2131837106(0x7f1140b2, float:1.9307398E38)
        L_0x0016:
            java.lang.String r0 = r6.A01
            java.lang.String r1 = X.AnonymousClass0wJ.A0o(r5, r0, r1)
            X.C04220Ms.A06(r1)
            r0 = 2131837142(0x7f1140d6, float:1.930747E38)
            java.lang.String r0 = r5.getString(r0)
            java.lang.String r0 = X.AnonymousClass00U.A0h(r2, r1, r3, r0, r2)
            java.lang.String r3 = X.AnonymousClass4n8.A08(r0)
        L_0x002e:
            r0 = 2131837167(0x7f1140ef, float:1.9307521E38)
        L_0x0031:
            java.lang.String r1 = X.C18180wK.A0g(r5, r0)
            X.Dsm r2 = X.AnonymousClass0wJ.A0V(r5)
            r2.A02 = r4
            r2.A0p(r3)
            r0 = 100
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r0 = X.C18220wO.A0O(r5, r0)
            r2.A0c(r0, r1)
            r1 = 2131823054(0x7f1109ce, float:1.9278897E38)
            if (r9 == 0) goto L_0x004f
            r1 = 2131837079(0x7f114097, float:1.9307343E38)
        L_0x004f:
            r0 = 101(0x65, float:1.42E-43)
            X.C18180wK.A1N(r2, r5, r0, r1)
            X.AnonymousClass0wJ.A1K(r2)
            return
        L_0x0058:
            r0 = 2131836994(0x7f114042, float:1.930717E38)
            java.lang.String r4 = X.C18180wK.A0g(r5, r0)
            r0 = 2131836993(0x7f114041, float:1.9307168E38)
            java.lang.String r3 = X.C18180wK.A0g(r5, r0)
            r0 = 2131837141(0x7f1140d5, float:1.9307469E38)
            goto L_0x0031
        L_0x006a:
            if (r9 == 0) goto L_0x0079
            if (r6 == 0) goto L_0x0079
            r0 = 2131837105(0x7f1140b1, float:1.9307396E38)
            java.lang.String r4 = X.C18180wK.A0g(r5, r0)
            r1 = 2131837104(0x7f1140b0, float:1.9307394E38)
            goto L_0x0016
        L_0x0079:
            r0 = 2131836992(0x7f114040, float:1.9307166E38)
            java.lang.String r4 = X.C18180wK.A0g(r5, r0)
            r0 = 2131836991(0x7f11403f, float:1.9307164E38)
            java.lang.String r3 = X.C18180wK.A0g(r5, r0)
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1wr.A0C(X.1wr, com.instagram.login.twofac.model.TotpSeed, boolean, boolean, boolean):void");
    }

    public final void A0D() {
        IDxACallbackShape111S0100000_1_I2 A06 = C63873iU.A06(this, 96);
        C32165H8c A012 = C62403Zn.A01(requireContext(), AnonymousClass0wJ.A0X(this.A02));
        A012.A00 = A06;
        schedule(A012);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final String getModuleName() {
        return C63833iQ.A05();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-752794386);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = requireArguments;
        boolean z = requireArguments.getBoolean("is_totp_two_factor_enabled");
        Bundle bundle2 = this.A00;
        if (bundle2 == null) {
            C04220Ms.A0E("twoFacResponseBundle");
            throw null;
        }
        AnonymousClass4MC r1 = new AnonymousClass4MC((CompoundButton.OnCheckedChangeListener) C65733vd.A00, (C33516HpC) new AnonymousClass4DH(this, z, bundle2.getBoolean("is_two_factor_enabled")), 2131837117, z);
        this.A01 = r1;
        r1.A0A = getString(2131837119);
        A0D();
        C14030oh.A09(724341396, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(325272472);
        super.onResume();
        A0D();
        C14030oh.A09(-1843027971, A022);
    }
}
