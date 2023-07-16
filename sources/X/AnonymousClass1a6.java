package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxFunctionShape369S0100000_5_I2;
import com.instagram.barcelona.R;
import com.instagram.common.kotlindelegate.lifecycle.NotNullLazyAutoCleanup;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import kotlin.jvm.internal.KtLambdaShape62S0100000_I2_42;

/* renamed from: X.1a6  reason: invalid class name */
public final class AnonymousClass1a6 extends C34640IcN implements C82034oy {
    public static final /* synthetic */ AnonymousClass0A5[] A06;
    public static final String __redex_internal_original_name = "EncryptedBackupsOneTimeCodeDisplayCodeFragment";
    public AnonymousClass0ZU A00 = new KtLambdaShape62S0100000_I2_42(this, 7);
    public final NotNullLazyAutoCleanup A01 = new NotNullLazyAutoCleanup(this, new KtLambdaShape62S0100000_I2_42(this, 0));
    public final NotNullLazyAutoCleanup A02;
    public final NotNullLazyAutoCleanup A03;
    public final C04530Oa A04 = C80644m9.A00(this);
    public final C04530Oa A05;

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        r3.CtT(true);
        r3.AJb(true);
        ((E2V) this.A01.A01()).setIsLoading(false);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((IgdsBottomButtonLayout) this.A02.A01()).setPrimaryActionOnClickListener(C18190wL.A0H(this, 344));
        C04530Oa r4 = this.A05;
        C18210wN.A16(this, ((AnonymousClass10L) r4.getValue()).A01, 20);
        AnonymousClass10L r3 = (AnonymousClass10L) r4.getValue();
        r3.A06.D7t(new C58853Ht(false));
        r3.A07.D7t(new C58863Hu(true));
        r3.A03.A02(AnonymousClass47Q.A00, r3.A02.A0E(new IDxFunctionShape369S0100000_5_I2((Object) r3, 2)));
        ((AnonymousClass3IT) ((AnonymousClass10L) r4.getValue()).A05.getValue()).A02("OTC_DISPLAY_CODE_IMPRESSION");
    }

    static {
        Class<AnonymousClass1a6> cls = AnonymousClass1a6.class;
        A06 = new AnonymousClass0A5[]{new C000400f(cls, "actionBar", "getActionBar()Lcom/instagram/actionbar/ActionBarService;", 0), new C000400f(cls, "bottomButtons", "getBottomButtons()Lcom/instagram/igds/components/bottombutton/IgdsBottomButtonLayout;", 0), new C000400f(cls, "codeText", "getCodeText()Landroid/widget/TextView;", 0)};
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A04);
    }

    public AnonymousClass1a6() {
        KtLambdaShape62S0100000_I2_42 ktLambdaShape62S0100000_I2_42 = new KtLambdaShape62S0100000_I2_42(this, 6);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape62S0100000_I2_42(new KtLambdaShape62S0100000_I2_42(this, 3), 4));
        this.A05 = C18220wO.A0M(new KtLambdaShape62S0100000_I2_42(A012, 5), ktLambdaShape62S0100000_I2_42, C18250wR.A0d(A012, (Object) null, 3), C18210wN.A0l(AnonymousClass10L.class));
        this.A02 = new NotNullLazyAutoCleanup(this, new KtLambdaShape62S0100000_I2_42(this, 1));
        this.A03 = new NotNullLazyAutoCleanup(this, new KtLambdaShape62S0100000_I2_42(this, 2));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-251783473);
        C04220Ms.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_display_code_fragment, viewGroup, false);
        C14030oh.A09(-1813504545, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-408880972);
        super.onDestroy();
        ((AnonymousClass3IT) ((AnonymousClass10L) this.A05.getValue()).A05.getValue()).A01(AnonymousClass006.A00);
        C14030oh.A09(725724661, A022);
    }
}
