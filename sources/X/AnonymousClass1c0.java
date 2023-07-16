package X;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.redex.IDxObjectShape170S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.1c0  reason: invalid class name */
public final class AnonymousClass1c0 extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "TwoFacTotpKeyNamingFragment";
    public boolean A00;
    public Bundle A01;
    public IgFormField A02;
    public final C04530Oa A03 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        int i = 2131837048;
        if (this.A00) {
            i = 2131837144;
        }
        AnonymousClass4u2.A07(r3, i);
        if (!this.A00) {
            return;
        }
        if (A00().length() == 0) {
            r3.A7U(2131835122);
        } else {
            r3.A7X(C18190wL.A0H(this, 551), 2131835122);
        }
    }

    public final boolean onBackPressed() {
        return false;
    }

    private final CharSequence A00() {
        IgFormField igFormField = this.A02;
        if (igFormField == null) {
            C04220Ms.A0E("nicknameView");
            throw null;
        }
        Editable text = igFormField.A00.getText();
        C04220Ms.A06(text);
        return AnonymousClass8bP.A0L(text);
    }

    public static final void A02(AnonymousClass1c0 r9) {
        IDxACallbackShape111S0100000_1_I2 A06 = C63873iU.A06(r9, 99);
        if (r9.A00().length() == 0) {
            C62973bE.A04(r9.requireContext(), r9.getString(2131837103), r9.getString(2131826851));
            return;
        }
        C10300i6 A0U = AnonymousClass0wJ.A0U(r9.A03);
        Context requireContext = r9.requireContext();
        String obj = r9.A00().toString();
        Bundle bundle = r9.A01;
        if (bundle == null) {
            C04220Ms.A0E("twoFacArguments");
            throw null;
        }
        String A0b = C18210wN.A0b(bundle, "rename_totp_seed_id", "");
        C04220Ms.A0B(A0U, 0);
        String A012 = C63833iQ.A01();
        C04220Ms.A0B(obj, 3);
        H1T A0O = AnonymousClass0wJ.A0O(A0U);
        C63833iQ.A0A(requireContext, A0O, 699, 112);
        A0O.A0O(A012, obj);
        A0O.A0O(C63833iQ.A04(), A0b);
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, AnonymousClass1RQ.class, AnonymousClass3NH.class);
        A0T.A00 = A06;
        C31155GhB.A03(A0T);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public static final void A01(AnonymousClass1c0 r3) {
        if (r3.A00().length() > 0) {
            Bundle bundle = r3.A01;
            if (bundle == null) {
                C04220Ms.A0E("twoFacArguments");
                throw null;
            }
            bundle.putString(C63833iQ.A01(), r3.A00().toString());
            Bundle A002 = C62653aT.A00(r3);
            C23021bn r2 = new C23021bn();
            AnonymousClass0wJ.A19(r2, C18210wN.A0F(A002, r2, r3), AnonymousClass0wJ.A0U(r3.A03));
        }
    }

    public final String getModuleName() {
        return C63833iQ.A05();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1695397125);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = requireArguments;
        this.A00 = requireArguments.getBoolean("is_renaming", false);
        Bundle bundle2 = this.A01;
        if (bundle2 == null) {
            C04220Ms.A0E("twoFacArguments");
            throw null;
        }
        bundle2.remove("is_renaming");
        C14030oh.A09(-1511941796, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-423605700);
        C04220Ms.A0B(layoutInflater, 0);
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.two_fac_key_naming_fragment, viewGroup, false);
        View requireViewById = inflate.requireViewById(R.id.next_button);
        requireViewById.setEnabled(false);
        if (!(!this.A00)) {
            i = 8;
        }
        requireViewById.setVisibility(i);
        AnonymousClass0wJ.A16(requireViewById, 552, this);
        IgFormField igFormField = (IgFormField) AnonymousClass0wJ.A0J(inflate, R.id.name_field);
        this.A02 = igFormField;
        String str = "nicknameView";
        if (igFormField != null) {
            C18210wN.A12(igFormField.A00, this, 9);
            IgFormField igFormField2 = this.A02;
            if (igFormField2 != null) {
                Bundle bundle2 = this.A01;
                if (bundle2 == null) {
                    str = "twoFacArguments";
                } else {
                    igFormField2.setText(bundle2.getString(C63833iQ.A01(), ""));
                    IgFormField igFormField3 = this.A02;
                    if (igFormField3 != null) {
                        igFormField3.A00.addTextChangedListener(new IDxObjectShape170S0200000_1_I2(5, requireViewById, this));
                        AnonymousClass0wJ.A0L(inflate, R.id.instagram_naming_key_paragraph).setText(2131837115);
                        C14030oh.A09(1920152174, A022);
                        return inflate;
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-49258522);
        super.onPause();
        Window A0F = C18190wL.A0F(this);
        if (A0F != null) {
            A0F.setSoftInputMode(0);
        }
        IgFormField igFormField = this.A02;
        if (igFormField == null) {
            C04220Ms.A0E("nicknameView");
            throw null;
        }
        C09860go.A0I(igFormField);
        C14030oh.A09(-777192597, A022);
    }
}
