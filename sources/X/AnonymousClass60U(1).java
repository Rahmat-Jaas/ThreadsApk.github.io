package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.service.session.UserSession;

/* renamed from: X.60U  reason: invalid class name */
public final class AnonymousClass60U extends AnonymousClass1lO {
    public final Context A00;
    public final FragmentActivity A01;
    public final C11630kW A02;
    public final UserSession A03;

    public AnonymousClass60U(Context context, FragmentActivity fragmentActivity, C11630kW r4, UserSession userSession) {
        C04220Ms.A0B(userSession, 4);
        this.A00 = context;
        this.A02 = r4;
        this.A01 = fragmentActivity;
        this.A03 = userSession;
    }

    public final Class modelClass() {
        return C131847su.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        C131847su r8 = (C131847su) mfV;
        C89075Bu r9 = (C89075Bu) m5o;
        boolean A1Y = AnonymousClass0wJ.A1Y(r8, r9);
        IgImageView igImageView = r9.A04;
        igImageView.setUrl(r8.A02, this.A02);
        C86104wH.A1D(igImageView, 56, r8, this);
        String str = r8.A04;
        TextView textView = r9.A02;
        if (str != null) {
            textView.setText(str);
            textView.setVisibility(A1Y);
        } else {
            textView.setVisibility(8);
        }
        long j = r8.A00;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        TextView textView2 = r9.A03;
        if (i != 0) {
            textView2.setText(C63543hm.A03(this.A00, 2131822616, j, A1Y));
            textView2.setVisibility(A1Y ? 1 : 0);
        } else {
            textView2.setVisibility(8);
        }
        C86104wH.A1C(r9.A00, 97, r8);
        C86104wH.A1D(r9.A01, 57, r8, this);
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C89075Bu(C18200wM.A0F(layoutInflater, viewGroup, R.layout.bca_pending_sponsor_boost_with_action_buttons, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
