package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.1YU  reason: invalid class name */
public final class AnonymousClass1YU extends C34640IcN {
    public static final String __redex_internal_original_name = "FxCrosspostingAccountsCenterBottomSheetUpsellFragment";
    public C24741jy A00;
    public AnonymousClass36F A01;
    public boolean A02 = true;
    public String A03 = "";
    public final C04530Oa A04 = C80644m9.A00(this);

    public final String getModuleName() {
        return "fx_crossposting_accounts_center_bottom_sheet_upsell";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        int i = 2131820799;
        if (this.A02) {
            i = 2131820802;
        }
        C04530Oa r2 = this.A04;
        C10300i6 A0U = AnonymousClass0wJ.A0U(r2);
        AnonymousClass0TJ r8 = AnonymousClass0TJ.A06;
        int i2 = 2131820806;
        int i3 = 2131820798;
        if (C63803iN.A0E(r8, A0U, 36319025139487601L)) {
            i2 = 2131820807;
            i3 = 2131820805;
        }
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(i);
        Integer valueOf3 = Integer.valueOf(i3);
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        int intValue3 = valueOf3.intValue();
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.fx_crossposting_accounts_center_upsell_subtitle);
        TextView textView2 = (TextView) AnonymousClass0wJ.A0J(view, R.id.fx_crossposting_accounts_center_upsell_subtitle_two);
        View A0J = AnonymousClass0wJ.A0J(view, R.id.fx_crossposting_accounts_center_upsell_primary_button);
        IgdsButton igdsButton = (IgdsButton) AnonymousClass0wJ.A0J(view, R.id.fx_crossposting_accounts_center_upsell_secondary_button);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.fx_crossposting_accounts_center_upsell_foot_message);
        C18180wK.A10((TextView) AnonymousClass0wJ.A0J(view, R.id.fx_crossposting_accounts_center_upsell_title), this, intValue);
        igdsButton.setText(getString(intValue3));
        A0K.setVisibility(0);
        if (this.A02) {
            if (C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass0wJ.A0U(r2), 36325441820173407L)) {
                string = getString(2131820797);
                textView.setText(string);
                if (!this.A02 && !C63803iN.A0E(r8, AnonymousClass0wJ.A0U(r2), 2342162034353116016L)) {
                    C18180wK.A10(textView, this, 2131820800);
                    textView2.setText(C18210wN.A0C(AnonymousClass0wJ.A0B(this), this.A03, 2131820801));
                    textView2.setVisibility(0);
                }
                AnonymousClass0wJ.A17(A0J, 293, this);
                AnonymousClass0wJ.A17(igdsButton, 294, this);
            }
        }
        string = getString(intValue2);
        textView.setText(string);
        C18180wK.A10(textView, this, 2131820800);
        textView2.setText(C18210wN.A0C(AnonymousClass0wJ.A0B(this), this.A03, 2131820801));
        textView2.setVisibility(0);
        AnonymousClass0wJ.A17(A0J, 293, this);
        AnonymousClass0wJ.A17(igdsButton, 294, this);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-399008281);
        super.onCreate(bundle);
        this.A02 = requireArguments().getBoolean("ARG_IS_LINKING_ONE_TO_ONE", true);
        this.A03 = C18210wN.A0b(requireArguments(), "ARG_TARGET_ACCOUNT_NAME", "");
        C04530Oa r3 = this.A04;
        this.A00 = new C24741jy(this, this, AnonymousClass0wJ.A0X(r3), new C71894Kt());
        C696149h A002 = C49362rG.A00(requireActivity(), AnonymousClass0wJ.A0X(r3));
        AnonymousClass36F r0 = A002.A03;
        if (r0 == null) {
            r0 = new AnonymousClass36F(A002);
            A002.A03 = r0;
        }
        this.A01 = r0;
        C14030oh.A09(392101763, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1226122936);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fx_crossposting_accounts_center_bottom_sheet_upsell, viewGroup, false);
        C14030oh.A09(1463492780, A022);
        return inflate;
    }
}
