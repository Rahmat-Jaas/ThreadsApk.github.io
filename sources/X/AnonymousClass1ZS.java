package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.ui.text.IDxCSpanShape187S0100000_1_I2;

/* renamed from: X.1ZS  reason: invalid class name */
public final class AnonymousClass1ZS extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "SaveAutofillLearnMoreFragment";
    public C10300i6 A00;
    public boolean A01;
    public boolean A02;

    public final String getModuleName() {
        return "save_autofill_learn_more";
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        int i = 2131821696;
        if (this.A02) {
            i = 2131820789;
        }
        AnonymousClass4u2.A07(r3, i);
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1370929042);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = C18190wL.A0S(requireArguments);
        this.A01 = requireArguments.getBoolean("is_payment_enabled", false);
        this.A02 = requireArguments.getBoolean("is_reconsent_enabled", false);
        C14030oh.A09(-1014506691, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(658627141);
        boolean z = this.A02;
        int i = R.layout.fragment_save_autofill_learn_more;
        if (z) {
            i = R.layout.fragment_about_autofill;
        }
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, i);
        C14030oh.A09(-1243178124, A022);
        return A0H;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.A02) {
            TextView A0L = AnonymousClass0wJ.A0L(view, R.id.what_is_autofill_description);
            String string = getString(2131838085);
            int i = 2131838157;
            if (this.A01) {
                i = 2131838156;
            }
            A0L.setText(AnonymousClass00U.A0V(string, " ", getString(i)));
            StringBuilder A0r = C18200wM.A0r();
            String string2 = getString(2131826227);
            A0r.append(string2);
            A0r.append(getString(2131836706));
            A0r.append("\n");
            A0r.append(string2);
            C18230wP.A1S(getString(2131836705), "\n", string2, A0r);
            C18230wP.A1S(getString(2131836704), "\n", string2, A0r);
            A0r.append(getString(2131828424));
            AnonymousClass0wJ.A0L(view, R.id.autofill_activity_list).setText(A0r);
            IDxCSpanShape187S0100000_1_I2 A002 = C18730xl.A00(this, requireContext().getColor(R.color.igds_link), 4);
            TextView A0L2 = AnonymousClass0wJ.A0L(view, R.id.control_autofill_preferences);
            String string3 = getString(2131821226);
            AnonymousClass3Zw.A03(A002, A0L2, string3, AnonymousClass0wJ.A0o(this, string3, 2131824404));
            TextView A0L3 = AnonymousClass0wJ.A0L(view, R.id.who_can_see_autofill_info_title);
            TextView A0L4 = AnonymousClass0wJ.A0L(view, R.id.who_can_see_autofill_info_description);
            int i2 = 2131838105;
            int i3 = 2131838104;
            if (this.A01) {
                i2 = 2131838103;
                i3 = 2131838102;
            }
            A0L3.setText(i2);
            A0L4.setText(i3);
            TextView A0L5 = AnonymousClass0wJ.A0L(view, R.id.how_is_my_contact_info_stored_description);
            C10300i6 r0 = this.A00;
            AnonymousClass0TJ r7 = AnonymousClass0TJ.A05;
            boolean booleanValue = C63803iN.A05(r7, r0, 36310512515743859L).booleanValue();
            int i4 = 2131828381;
            if (booleanValue) {
                i4 = 2131828382;
            }
            C18180wK.A10(A0L5, this, i4);
            if (this.A01) {
                ViewStub viewStub = (ViewStub) view.requireViewById(R.id.saved_payment_info_relevant_ads_title);
                ViewStub viewStub2 = (ViewStub) view.requireViewById(R.id.saved_payment_info_relevant_ads_description);
                boolean booleanValue2 = C63803iN.A05(r7, this.A00, 36310512515743859L).booleanValue();
                int i5 = R.id.payment_info_section;
                if (booleanValue2) {
                    i5 = R.id.payment_info_section_metapay;
                }
                viewStub.inflate();
                viewStub2.inflate();
                ((ViewStub) view.requireViewById(i5)).inflate();
                IDxCSpanShape187S0100000_1_I2 A003 = C18730xl.A00(this, requireContext().getColor(R.color.igds_link), 5);
                TextView A0L6 = AnonymousClass0wJ.A0L(view, R.id.payment_method_description);
                String string4 = getString(2131829574);
                int i6 = 2131828384;
                if (C63803iN.A05(r7, this.A00, 36310512515743859L).booleanValue()) {
                    i6 = 2131828385;
                }
                String string5 = getString(i6);
                StringBuilder A0r2 = C18200wM.A0r();
                A0r2.append(string5);
                A0r2.append(' ');
                A0r2.append(string4);
                A0r2.append(' ');
                AnonymousClass3Zw.A03(A003, A0L6, string4, A0r2.toString());
            }
        }
    }
}
