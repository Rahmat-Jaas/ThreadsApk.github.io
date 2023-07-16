package X;

import android.view.ViewGroup;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3000000_I2;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.11D  reason: invalid class name */
public final class AnonymousClass11D extends C41030Luu {
    public List A00 = AnonymousClass0ZV.A00;
    public final C11630kW A01;
    public final UserSession A02;

    public final void onBindViewHolder(M5O m5o, int i) {
        C04220Ms.A0B(m5o, 0);
        AnonymousClass3GQ r1 = C29811zL.values()[getItemViewType(i)].A00;
        List list = this.A00;
        UserSession userSession = this.A02;
        r1.A01(m5o, this.A01, userSession, list, i);
    }

    public final M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        C04220Ms.A0B(viewGroup, 0);
        return C29811zL.values()[i].A00.A00(viewGroup);
    }

    public AnonymousClass11D(C11630kW r2, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = r2;
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(1305103358);
        int size = this.A00.size();
        C14030oh.A0A(298397061, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        C29811zL r0;
        int A03 = C14030oh.A03(-969903628);
        Object obj = this.A00.get(i);
        C04220Ms.A0B(obj, 0);
        if (KtCSuperShape0S2210000_I2.A00(6, obj)) {
            r0 = C29811zL.A02;
        } else if (KtCSuperShape0S3000000_I2.A00(15, obj)) {
            r0 = C29811zL.A03;
        } else {
            throw C18190wL.A0a("Unsupported item type");
        }
        int ordinal = r0.ordinal();
        C14030oh.A0A(321839275, A03);
        return ordinal;
    }
}
