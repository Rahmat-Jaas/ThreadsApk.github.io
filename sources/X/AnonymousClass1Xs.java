package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.1Xs  reason: invalid class name */
public final class AnonymousClass1Xs extends C34640IcN {
    public static final String __redex_internal_original_name = "FanClubSubscribeInLiveBottomSheetFragment";
    public AnonymousClass342 A00;
    public final C04530Oa A01 = C80644m9.A00(this);

    public final String getModuleName() {
        return "fan_club_subscribe_in_live_bottom_sheet";
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-557134145);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.iglive_fan_club_subscribe_in_live_bottom_sheet, viewGroup, false);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass0wJ.A0J(inflate, R.id.subscribe_in_live_headline);
        Context context = inflate.getContext();
        igdsHeadline.setImageDrawable(context.getDrawable(R.drawable.ig_illustrations_illo_subscriber_crown_badge));
        igdsHeadline.A05 = true;
        igdsHeadline.setHeadline((CharSequence) context.getString(2131836318));
        igdsHeadline.setBody(context.getString(2131836317), (View.OnClickListener) null);
        ((IgdsBottomButtonLayout) AnonymousClass0wJ.A0J(inflate, R.id.subscribe_in_live_setting_bottom_button)).setPrimaryAction(context.getString(2131836316), C18210wN.A0H(this, 356));
        C14030oh.A09(1662335975, A02);
        return inflate;
    }
}
