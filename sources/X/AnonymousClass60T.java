package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.60T  reason: invalid class name */
public final class AnonymousClass60T extends AnonymousClass1lO {
    public final C105366dJ A00;
    public final C11630kW A01;
    public final UserSession A02;

    public AnonymousClass60T(C105366dJ r2, C11630kW r3, UserSession userSession) {
        C18180wK.A1P(userSession, 1, r2);
        this.A02 = userSession;
        this.A01 = r3;
        this.A00 = r2;
    }

    public final Class modelClass() {
        return C131877sx.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        C131877sx r5 = (C131877sx) mfV;
        AnonymousClass5BY r6 = (AnonymousClass5BY) m5o;
        AnonymousClass0wJ.A1N(r5, r6);
        ConstraintLayout constraintLayout = r6.A00;
        constraintLayout.setSelected(r5.A05);
        constraintLayout.setContentDescription(r5.A02);
        AnonymousClass7FY.A01(constraintLayout, r6.itemView.getResources().getString(2131821409));
        r6.A01.setText(r5.A04);
        r6.A02.setUrl(r5.A01, this.A01);
        C86144wL.A1C(constraintLayout, this, r6, r5, 12);
        Context A0B = C18240wQ.A0B(r6);
        C04220Ms.A06(A0B);
        C29573FqZ.A00(A0B).A04(new C133207vJ(), r5.A00.getUrl());
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass5BY(C18180wK.A0D(layoutInflater, viewGroup, R.layout.item_appreciation_gift, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
