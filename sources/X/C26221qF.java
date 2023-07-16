package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape267S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.service.session.UserSession;

/* renamed from: X.1qF  reason: invalid class name and case insensitive filesystem */
public final class C26221qF extends AnonymousClass1dC {
    public static final String __redex_internal_original_name = "ManageDataSheetFragment";
    public View A00;
    public Button A01;
    public LinearLayout A02;
    public LinearLayout A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public AnonymousClass3HL A07;
    public IgSwitch A08;
    public boolean A09;
    public View A0A;
    public Button A0B;
    public ImageView A0C;
    public TextView A0D;
    public AnonymousClass3HL A0E;
    public UserSession A0F;
    public final View.OnClickListener A0G = C18190wL.A0H(this, 454);
    public final CompoundButton.OnCheckedChangeListener A0H = new IDxCListenerShape267S0100000_1_I2((Object) this, 23);
    public final View.OnClickListener A0I = C18190wL.A0H(this, 452);
    public final View.OnClickListener A0J = C18190wL.A0H(this, 453);

    public final String getModuleName() {
        return "manage_data_settings";
    }

    public static void A00(C26221qF r4) {
        TextView textView;
        boolean z = r4.A09;
        int i = 0;
        TextView textView2 = r4.A06;
        if (z) {
            textView2.setText(2131830246);
            r4.A05.setText(2131830247);
            r4.A04.setText(r4.A07.A00(0));
            textView = r4.A0D;
            i = 8;
        } else {
            textView2.setText(2131830249);
            r4.A05.setText(2131830248);
            r4.A04.setText(r4.A07.A00(0));
            r4.A0D.setText(r4.A07.A00(1));
            textView = r4.A0D;
        }
        textView.setVisibility(i);
    }

    public final C10300i6 getSession() {
        return this.A0F;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1783709655);
        super.onCreate(bundle);
        this.A0F = C18180wK.A0V(this.mArguments);
        this.A09 = true;
        this.A0E = AnonymousClass3VH.A00().A00.A09;
        this.A07 = AnonymousClass3VH.A00().A00.A06;
        C14030oh.A09(1924202744, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1209472579);
        View inflate = layoutInflater.inflate(R.layout.manage_data_settings_layout, viewGroup, false);
        this.A0A = inflate;
        this.A03 = (LinearLayout) inflate.findViewById(R.id.intro_linearlayout);
        this.A0C = C18200wM.A0J(this.A0A, R.id.manage_data_cross_button);
        this.A02 = (LinearLayout) this.A0A.requireViewById(R.id.manage_data_button_container);
        this.A0B = (Button) this.A0A.findViewById(R.id.manage_data_next_button);
        View findViewById = this.A0A.findViewById(R.id.checked_paragraph);
        View findViewById2 = this.A0A.findViewById(R.id.cancel_paragraph);
        View findViewById3 = this.A0A.findViewById(R.id.followup_screen);
        this.A00 = findViewById3;
        this.A01 = (Button) findViewById3.findViewById(R.id.manage_data_followup_button);
        this.A04 = C18180wK.A0G(this.A00, R.id.manage_data_settings_followup_detail);
        this.A0D = C18180wK.A0G(this.A00, R.id.manage_data_settings_followup_optional);
        if (this.A0E != null) {
            C18180wK.A0G(this.A0A, R.id.manage_data_settings_title).setText(this.A0E.A01(0));
            Drawable drawable = getContext().getDrawable(R.drawable.circle_checked);
            String A012 = this.A0E.A01(1);
            C18200wM.A0J(findViewById, R.id.image_view).setImageDrawable(drawable);
            AnonymousClass0wJ.A0L(findViewById, R.id.paragraph_text).setText(A012);
            Drawable drawable2 = getContext().getDrawable(R.drawable.circled_cancel);
            String A013 = this.A0E.A01(2);
            C18200wM.A0J(findViewById2, R.id.image_view).setImageDrawable(drawable2);
            AnonymousClass0wJ.A0L(findViewById2, R.id.paragraph_text).setText(A013);
            this.A0C.setOnClickListener(this.A0I);
            this.A0B.setOnClickListener(this.A0J);
        }
        View view = this.A0A;
        C14030oh.A09(357728937, A022);
        return view;
    }
}
