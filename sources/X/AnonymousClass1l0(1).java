package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1l0  reason: invalid class name */
public final class AnonymousClass1l0 extends AnonymousClass1lO {
    public final Activity A00;
    public final C83624ri A01;
    public final UserSession A02;

    public final Class modelClass() {
        return AnonymousClass19B.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass136 r11 = (AnonymousClass136) m5o;
        boolean A1Z = AnonymousClass0wJ.A1Z(mfV, r11);
        C83624ri r6 = this.A01;
        UserSession userSession = this.A02;
        Activity activity = this.A00;
        TextView textView = r11.A01;
        Context context = textView.getContext();
        C18200wM.A17(context.getResources(), textView, 2131832987);
        textView.setTextAppearance(R.style.igds_button_label_destination);
        C18180wK.A0s(context, textView, R.color.igds_secondary_text);
        C19577Ayd ayd = r11.A02;
        ayd.A09(0);
        ((ImageView) ayd.A08()).setImageResource(R.drawable.instagram_add_pano_outline_24);
        C18240wQ.A0r(ayd.A08().getContext(), (ImageView) ayd.A08(), R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_normal_text_color);
        View view = r11.A00;
        AnonymousClass0wJ.A16(view, 480, r6);
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36321065248692712L) && C28161tl.A04(userSession).getBoolean("should_show_add_interests_tooltip", A1Z)) {
            view.postDelayed(new C73544Sv(activity, view, r6, userSession), 100);
        }
    }

    public AnonymousClass1l0(Activity activity, C83624ri r2, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass136(C18200wM.A0F(layoutInflater, viewGroup, R.layout.subinterest_round_pill, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
