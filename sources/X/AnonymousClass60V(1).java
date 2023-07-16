package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.service.session.UserSession;

/* renamed from: X.60V  reason: invalid class name */
public final class AnonymousClass60V extends AnonymousClass1lO {
    public final Context A00;
    public final FragmentActivity A01;
    public final C34640IcN A02;
    public final C11630kW A03;
    public final UserSession A04;
    public final String A05;
    public final C04530Oa A06 = C86154wM.A0v(this, 0);

    public AnonymousClass60V(Context context, FragmentActivity fragmentActivity, C34640IcN icN, C11630kW r5, UserSession userSession, String str) {
        C04220Ms.A0B(userSession, 5);
        this.A03 = r5;
        this.A00 = context;
        this.A02 = icN;
        this.A01 = fragmentActivity;
        this.A04 = userSession;
        this.A05 = str;
    }

    public final Class modelClass() {
        return AnonymousClass5MP.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass5MP r4 = (AnonymousClass5MP) mfV;
        C89115By r5 = (C89115By) m5o;
        AnonymousClass0wJ.A1N(r4, r5);
        IgImageView igImageView = r5.A00;
        igImageView.setUrl(r4.A01, this.A03);
        C86104wH.A1D(igImageView, 55, r4, this);
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C89115By(C18200wM.A0F(layoutInflater, viewGroup, R.layout.branded_content_partner_promotion_media_preview, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
