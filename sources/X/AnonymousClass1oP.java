package X;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.instagram.barcelona.R;
import com.instagram.common.kotlindelegate.lifecycle.NotNullLazyAutoCleanup;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import kotlin.jvm.internal.KtLambdaShape61S0100000_I2_41;

/* renamed from: X.1oP  reason: invalid class name */
public final class AnonymousClass1oP extends AnonymousClass5x3 implements C82034oy {
    public static final /* synthetic */ AnonymousClass0A5[] A02 = C18220wO.A1b(AnonymousClass1oP.class, "actionBar", "getActionBar()Lcom/instagram/actionbar/ActionBarService;");
    public static final String __redex_internal_original_name = "EncryptedBackupsGDriveSetupFragment";
    public IgdsBottomButtonLayout A00;
    public final NotNullLazyAutoCleanup A01 = new NotNullLazyAutoCleanup(this, new KtLambdaShape61S0100000_I2_41(this, 33));

    public final void A02() {
    }

    public final void A04(GoogleSignInAccount googleSignInAccount) {
        C04220Ms.A0B(googleSignInAccount, 0);
        ((C8C) this.A01.getValue()).A09(googleSignInAccount);
    }

    public final void configureActionBar(AnonymousClass4u2 r18) {
        AnonymousClass4u2 r1 = r18;
        C04220Ms.A0B(r1, 0);
        r1.setTitle("");
        r1.Cro(new C24758DYo((ColorFilter) null, (ColorFilter) null, (Drawable) null, (Drawable) null, (View.OnClickListener) null, AnonymousClass006.A00, -2, -2, -2, -2, R.drawable.instagram_x_pano_outline_24, -2, -2, true));
        r1.CtT(true);
    }

    public final String getModuleName() {
        return "encrypted_backups_gdrive_setup";
    }

    public final void A05(boolean z) {
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A00;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionIsLoading(z);
        }
    }

    public final void A03() {
        A01();
    }

    public final void afterOnViewCreated() {
        if (AnonymousClass3Zi.A03(this)) {
            configureActionBar((E2V) this.A01.A01());
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1346854204);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_eb_gdrive_settings_layout, viewGroup, false);
        C62263Ya r5 = new C62263Ya(requireContext(), C18180wK.A0Y(), false);
        r5.A03((CharSequence) null, getString(2131826345), R.drawable.instagram_rotate_pano_outline_24);
        String A0g = C18180wK.A0g(this, 2131829574);
        String A0o = AnonymousClass0wJ.A0o(this, A0g, 2131826344);
        C04220Ms.A06(A0o);
        SpannableStringBuilder A0E = C18200wM.A0E(A0o);
        AnonymousClass3Zw.A02(A0E, this, A0g, 7);
        ((IgdsHeadline) AnonymousClass0wJ.A0J(inflate, R.id.headline)).setBulletList(C62263Ya.A01(r5, (CharSequence) null, A0E, R.drawable.instagram_app_icloud_pano_outline_24));
        IgdsBottomButtonLayout A0W = C18230wP.A0W(inflate, R.id.bottom_buttons);
        this.A00 = A0W;
        if (A0W != null) {
            A0W.setPrimaryActionOnClickListener(C18190wL.A0H(this, 337));
        }
        C14030oh.A09(-74591877, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1482685444);
        this.A00 = null;
        super.onDestroyView();
        C14030oh.A09(355177831, A022);
    }

    public final void onResume() {
        View view;
        int A022 = C14030oh.A02(2041867855);
        super.onResume();
        if (!AnonymousClass2MX.A00(AnonymousClass0wJ.A0X(this.A00)).A05() && (view = this.mView) != null) {
            view.post(new C72594Oy(this));
        }
        C14030oh.A09(-1809162261, A022);
    }
}
