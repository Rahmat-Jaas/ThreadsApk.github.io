package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import kotlin.jvm.internal.KtLambdaShape65S0100000_I2_45;

/* renamed from: X.1Xz  reason: invalid class name and case insensitive filesystem */
public final class C22411Xz extends C34640IcN {
    public static final String __redex_internal_original_name = "SharedStackUpsellBottomSheetFragment";
    public final C04530Oa A00 = C80644m9.A00(this);

    public final String getModuleName() {
        return "SHARED_STACK_UPSELL_BOTTOM_SHEET";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C04530Oa r3 = this.A00;
        C10300i6 A0U = AnonymousClass0wJ.A0U(r3);
        C04220Ms.A0B(A0U, 0);
        A0U.A01(C27261sE.class, new KtLambdaShape65S0100000_I2_45(A0U, 34));
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass0wJ.A0I(view, R.id.upsell_bottom_sheet_headerline);
        igdsHeadline.A08(R.drawable.ig_illustrations_illo_collaborative_albums_refresh, false);
        igdsHeadline.setHeadline(2131835719);
        Context A0A = C18190wL.A0A(igdsHeadline);
        Resources resources = A0A.getResources();
        C62263Ya A002 = C62263Ya.A00(A0A);
        A002.A03(resources.getString(2131835725), resources.getString(2131835716), R.drawable.instagram_collage_pano_outline_24);
        A002.A03(resources.getString(2131835726), resources.getString(2131835717), R.drawable.instagram_users_pano_outline_24);
        if (C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass0wJ.A0U(r3), 36321301474122424L)) {
            A002.A03(resources.getString(2131835727), resources.getString(2131835718), R.drawable.instagram_new_post_pano_outline_24);
        }
        igdsHeadline.setBulletList(A002.A02());
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0I(view, R.id.upsell_bottom_sheet_buttons_layout);
        igdsBottomButtonLayout.setDividerVisible(true);
        C18210wN.A15(this, igdsBottomButtonLayout, 2131835720);
        igdsBottomButtonLayout.setPrimaryActionOnClickListener(C18190wL.A0H(this, 380));
        igdsBottomButtonLayout.setSecondaryActionText(getString(2131835724));
        igdsBottomButtonLayout.setSecondaryActionOnClickListener(C18190wL.A0H(this, 381));
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(121779989);
        C04220Ms.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.shared_stack_upsell_bottom_sheet, viewGroup, false);
        C14030oh.A09(565587529, A02);
        return inflate;
    }
}
