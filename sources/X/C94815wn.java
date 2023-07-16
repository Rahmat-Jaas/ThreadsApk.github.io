package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape268S0100000_2_I2;
import com.facebook.redex.IDxObserverShape28S0400000_2_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.text.IDxCSpanShape187S0100000_1_I2;
import java.io.Serializable;
import kotlin.coroutines.jvm.internal.KtSLambdaShape24S0201000_I2_10;
import kotlin.jvm.internal.KtLambdaShape143S0100000_I2_123;
import kotlin.jvm.internal.KtLambdaShape38S0200000_I2_22;

/* renamed from: X.5wn  reason: invalid class name and case insensitive filesystem */
public final class C94815wn extends C34640IcN {
    public static final String __redex_internal_original_name = "RemixSettingsUpsellsBottomSheetFragment";
    public C170759vW A00;
    public AnonymousClass79D A01;
    public AnonymousClass76U A02;
    public String A03;
    public final C04530Oa A04 = AnonymousClass3W9.A00(this);
    public final C04530Oa A05;

    public final String getModuleName() {
        return "remix_settings_upsell_bottom_sheet";
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A04);
    }

    public C94815wn() {
        KtLambdaShape143S0100000_I2_123 ktLambdaShape143S0100000_I2_123 = new KtLambdaShape143S0100000_I2_123(this, 42);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape143S0100000_I2_123(new KtLambdaShape143S0100000_I2_123(this, 39), 40));
        this.A05 = C18220wO.A0M(new KtLambdaShape143S0100000_I2_123(A012, 41), ktLambdaShape143S0100000_I2_123, new KtLambdaShape38S0200000_I2_22(14, (Object) null, A012), C18210wN.A0l(AnonymousClass57W.class));
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(1143949258);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Serializable serializable = null;
        if (bundle2 != null) {
            str = bundle2.getString(C86144wL.A0n());
        } else {
            str = null;
        }
        this.A03 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            serializable = bundle3.getSerializable("entrypoint");
        }
        this.A00 = (C170759vW) serializable;
        AnonymousClass79D r4 = new AnonymousClass79D(this, AnonymousClass0wJ.A0X(this.A04));
        this.A01 = r4;
        this.A02 = new AnonymousClass76U(this.A00, r4, C972868t.REMIX_SETTINGS, this.A03);
        C14030oh.A09(114605898, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1900082170);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.remix_settings_upsell_bottom_sheet, viewGroup, false);
        CompoundButton compoundButton = (CompoundButton) AnonymousClass0wJ.A0J(inflate, R.id.everyone_radio);
        CompoundButton compoundButton2 = (CompoundButton) AnonymousClass0wJ.A0J(inflate, R.id.people_you_follow_radio);
        CompoundButton compoundButton3 = (CompoundButton) AnonymousClass0wJ.A0J(inflate, R.id.off_radio);
        TextView textView = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.upsell_remix_settings_body2);
        String A0g = C18180wK.A0g(this, 2131837525);
        String A0o = AnonymousClass0wJ.A0o(this, A0g, 2131837524);
        C04220Ms.A06(A0o);
        IDxCSpanShape187S0100000_1_I2 iDxCSpanShape187S0100000_1_I2 = new IDxCSpanShape187S0100000_1_I2(C18180wK.A00(this), 56, this);
        SpannableStringBuilder A0E = C18200wM.A0E(A0o);
        AnonymousClass3Zw.A00(A0E, iDxCSpanShape187S0100000_1_I2, A0g);
        textView.setText(A0E);
        C18180wK.A0z(textView);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass0wJ.A0J(inflate, R.id.upsell_bottom_sheet_headline);
        String A0k = AnonymousClass0wJ.A0k(requireContext(), 2131837529);
        C04220Ms.A0B(igdsHeadline, 0);
        igdsHeadline.A05 = true;
        igdsHeadline.setHeadline((CharSequence) A0k);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0J(inflate, R.id.bottom_bar);
        C102476Vi.A00(igdsBottomButtonLayout, new C110156lD(C86134wK.A0P(this, 170), C18230wP.A0a(this), 2131835122, 2131831869));
        AnonymousClass57W r6 = (AnonymousClass57W) this.A05.getValue();
        r6.A00.A0C(getViewLifecycleOwner(), new IDxObserverShape28S0400000_2_I2(5, compoundButton3, compoundButton2, compoundButton, igdsBottomButtonLayout));
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape24S0201000_I2_10((Object) r6, (Object) this, (C146958n9) null, 8), C18200wM.A0M(this), 3);
        compoundButton.setOnCheckedChangeListener(new IDxCListenerShape268S0100000_2_I2(this, 4));
        compoundButton2.setOnCheckedChangeListener(new IDxCListenerShape268S0100000_2_I2(this, 5));
        compoundButton3.setOnCheckedChangeListener(new IDxCListenerShape268S0100000_2_I2(this, 6));
        C14030oh.A09(-1165880708, A022);
        return inflate;
    }
}
