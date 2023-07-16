package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsFooterCell;
import com.instagram.service.session.UserSession;

/* renamed from: X.1kh  reason: invalid class name and case insensitive filesystem */
public final class C24831kh extends AnonymousClass1lO {
    public final C34640IcN A00;
    public final UserSession A01;

    public C24831kh(C34640IcN icN, UserSession userSession) {
        C04220Ms.A0B(userSession, 2);
        this.A00 = icN;
        this.A01 = userSession;
    }

    public final Class modelClass() {
        return AnonymousClass48H.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass48H r3 = (AnonymousClass48H) mfV;
        C202613w r4 = (C202613w) m5o;
        AnonymousClass0wJ.A1N(r3, r4);
        r4.A01(r3.A00, r3.A01);
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C18240wQ.A1H(viewGroup);
        C34640IcN icN = this.A00;
        UserSession userSession = this.A01;
        Context A0A = C18190wL.A0A(viewGroup);
        return new C202613w(A0A, icN, new IgdsFooterCell(A0A, (AttributeSet) null), userSession);
    }
}
