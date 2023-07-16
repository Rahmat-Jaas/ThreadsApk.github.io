package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape201S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.text.IDxCSpanShape187S0100000_1_I2;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape66S0100000_I2_46;

/* renamed from: X.1dT  reason: invalid class name */
public final class AnonymousClass1dT extends C34640IcN implements C21659By5 {
    public static final String __redex_internal_original_name = "ShareSheetReactionNuxFragment";
    public boolean A00;
    public final C04530Oa A01 = C62373Zc.A03(new KtLambdaShape66S0100000_I2_46(this, 1));
    public final C04530Oa A02 = C80644m9.A00(this);

    public final void Bmq() {
    }

    public final String getModuleName() {
        return "DIRECT_SHARE_REACTION_UPSELL";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        BKU A05;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (!(bundle2 == null || (string = bundle2.getString("REACTION_UPSELL_KEY_MEDIA_ID")) == null || (A05 = C19462Awj.A01(AnonymousClass0wJ.A0X(this.A02)).A05(string)) == null)) {
            View requireViewById = view.requireViewById(R.id.upsell_clips_image);
            C04220Ms.A0C(requireViewById, "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.RoundedCornerImageView");
            IgImageView igImageView = (IgImageView) requireViewById;
            igImageView.setImageRendererAndReset((C33450Ho5) this.A01.getValue());
            ImageUrl A22 = A05.A22();
            C04220Ms.A06(A22);
            igImageView.setUrl(A22, this);
        }
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass0wJ.A0I(view, R.id.upsell_bottom_sheet_headerline);
        igdsHeadline.setHeadline(2131834457);
        Context A0A = C18190wL.A0A(igdsHeadline);
        Resources resources = A0A.getResources();
        C62263Ya r8 = new C62263Ya(A0A, true, false);
        r8.A03((CharSequence) null, resources.getString(2131834456), R.drawable.instagram_camera_pano_outline_24);
        String A0g = C18190wL.A0g(resources, 2131834458);
        String A0h = C18190wL.A0h(resources, A0g, 2131834460);
        C04220Ms.A06(A0h);
        IDxCSpanShape187S0100000_1_I2 A002 = C18730xl.A00(this, C18180wK.A00(this), 19);
        SpannableStringBuilder A0E = C18200wM.A0E(A0h);
        AnonymousClass3Zw.A01(A0E, A002, A0g);
        List A012 = C62263Ya.A01(r8, (CharSequence) null, A0E, R.drawable.instagram_comment_pano_outline_24);
        ((IgdsBulletCell) A012.get(1)).setMovementMethod((MovementMethod) null, LinkMovementMethod.getInstance());
        igdsHeadline.setBulletList(A012);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0I(view, R.id.upsell_bottom_sheet_buttons_layout);
        igdsBottomButtonLayout.setDividerVisible(true);
        C10300i6 A0U = AnonymousClass0wJ.A0U(this.A02);
        C04220Ms.A0B(A0U, 0);
        A0U.A01(C27271sF.class, new KtLambdaShape66S0100000_I2_46(A0U, 2));
        C18210wN.A15(this, igdsBottomButtonLayout, 2131834459);
        igdsBottomButtonLayout.setPrimaryActionOnClickListener(new IDxCListenerShape201S0100000_1_I2(this, 382));
        igdsBottomButtonLayout.setSecondaryActionText(getString(2131834461));
        igdsBottomButtonLayout.setSecondaryActionOnClickListener(new IDxCListenerShape201S0100000_1_I2(this, 383));
    }

    public final void Bmo() {
        if (!this.A00) {
            C10300i6 A0U = AnonymousClass0wJ.A0U(this.A02);
            C04220Ms.A0B(A0U, 0);
            A0U.A01(C27271sF.class, new KtLambdaShape66S0100000_I2_46(A0U, 2));
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1146505635);
        C04220Ms.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.share_sheet_reaction_bottom_sheet_nux, viewGroup, false);
        C14030oh.A09(-1829828140, A022);
        return inflate;
    }
}
