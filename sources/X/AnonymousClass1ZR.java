package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import kotlin.jvm.internal.KtLambdaShape62S0100000_I2_42;

/* renamed from: X.1ZR  reason: invalid class name */
public final class AnonymousClass1ZR extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "EncryptedBackupsOneTimeCodeDisplayCodeIntroFragment";
    public final C04530Oa A00 = C62373Zc.A03(new KtLambdaShape62S0100000_I2_42(this, 8));
    public final C04530Oa A01 = C80644m9.A00(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0J(requireView(), R.id.bottom_button);
        igdsBottomButtonLayout.setPrimaryActionOnClickListener(C18190wL.A0H(this, 345));
        igdsBottomButtonLayout.setSecondaryActionOnClickListener(C18190wL.A0H(this, 346));
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass0wJ.A0J(requireView(), R.id.display_code_headline);
        igdsHeadline.setHeadline(2131826806);
        igdsHeadline.setBody(2131826805);
        igdsHeadline.A09(C18190wL.A0H(this, 347), 2131826802);
        C04530Oa r3 = this.A00;
        AnonymousClass1oU r2 = (AnonymousClass1oU) r3.getValue();
        r2.A03("LOGGED_IN_ACCOUNTS", String.valueOf(r2.A00.A0B()));
        ((AnonymousClass3IT) r3.getValue()).A02("OTC_DISPLAY_CODE_CONFIRM_IMPRESSION");
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-166141941);
        C04220Ms.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_display_code_intro_fragment, viewGroup, false);
        C14030oh.A09(-1625186160, A02);
        return inflate;
    }

    public final void onDestroy() {
        int A02 = C14030oh.A02(553549566);
        super.onDestroy();
        ((AnonymousClass3IT) this.A00.getValue()).A01(AnonymousClass006.A00);
        C14030oh.A09(1919827603, A02);
    }

    public final void configureActionBar(AnonymousClass4u2 r1) {
        AnonymousClass4u2.A05(r1);
    }
}
