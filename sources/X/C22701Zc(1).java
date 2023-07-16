package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxTListenerShape295S0100000_1_I2;
import com.instagram.actionbar.ActionButton;
import com.instagram.barcelona.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.ui.text.IDxCSpanShape63S0200000_1_I2;

/* renamed from: X.1Zc  reason: invalid class name and case insensitive filesystem */
public final class C22701Zc extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "BusinessEnableNativeCallingFragment";
    public BusinessFlowAnalyticsLogger A00;
    public IgSwitch A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public ActionButton A05;
    public final Handler A06 = AnonymousClass0wJ.A0F();
    public final C04530Oa A07 = C80644m9.A00(this);

    public final String getModuleName() {
        return "Business enable native calling";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.enable_calling_text);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.enable_calling_toggle);
        String string = requireContext.getString(2131829574);
        SpannableStringBuilder A0E = C18200wM.A0E(requireContext.getString(2131822783));
        AnonymousClass3Zw.A00(A0E, new IDxCSpanShape63S0200000_1_I2(requireContext.getColor(R.color.igds_primary_button), 0, (Object) requireContext, (Object) this), string);
        textView.setText(A0E);
        C18180wK.A0z(textView);
        AnonymousClass0wJ.A0L(A0K, R.id.title).setText(2131822794);
        IgSwitch A0N = C18250wR.A0N(A0K, R.id.toggle);
        A0N.setChecked(this.A03);
        A0N.A07 = new IDxTListenerShape295S0100000_1_I2(this, 1);
        this.A01 = A0N;
    }

    public final void configureActionBar(AnonymousClass4u2 r5) {
        if (r5 != null) {
            ActionButton Crr = r5.Crr(new C25348Dk8(C18190wL.A0H(this, 120), "Instagram Calling", R.drawable.instagram_arrow_back_24));
            Crr.setEnabled(true);
            this.A05 = Crr;
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A07);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(2144852060);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = requireArguments.getBoolean("is_profile_audio_call_enabled", false);
        this.A04 = requireArguments.getBoolean("maybe_show_confirmation_dialog", false);
        this.A02 = requireArguments.getString("entry_point");
        C14030oh.A09(-686228201, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-524724417);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.business_enable_native_calling_layout, viewGroup, false);
        C14030oh.A09(1488042307, A022);
        return inflate;
    }
}
