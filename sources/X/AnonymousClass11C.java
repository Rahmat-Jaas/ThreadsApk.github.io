package X;

import android.view.ViewGroup;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.11C  reason: invalid class name */
public final class AnonymousClass11C extends C41030Luu {
    public List A00;
    public final C11630kW A01;
    public final UserSession A02;

    public final void onBindViewHolder(M5O m5o, int i) {
        C04220Ms.A0B(m5o, 0);
        AnonymousClass3GQ r1 = C29831zN.values()[getItemViewType(i)].A00;
        List list = this.A00;
        UserSession userSession = this.A02;
        r1.A01(m5o, this.A01, userSession, list, i);
    }

    public final M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        C04220Ms.A0B(viewGroup, 0);
        return C29831zN.values()[i].A00.A00(viewGroup);
    }

    public /* synthetic */ AnonymousClass11C(C11630kW r3, UserSession userSession) {
        AnonymousClass0ZV r1 = AnonymousClass0ZV.A00;
        C04220Ms.A0B(userSession, 2);
        this.A02 = userSession;
        this.A01 = r3;
        this.A00 = r1;
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(385662323);
        int size = this.A00.size();
        C14030oh.A0A(1151882426, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        C29831zN r0;
        int A03 = C14030oh.A03(908436402);
        Object obj = this.A00.get(i);
        C04220Ms.A0B(obj, 0);
        if (KtCSuperShape0S2100000_I2.A00(21, obj)) {
            r0 = C29831zN.A02;
        } else if (KtCSuperShape0S0300000_I2.A01(12, obj)) {
            r0 = C29831zN.A08;
        } else if (KtCSuperShape0S2100000_I2.A00(22, obj)) {
            r0 = C29831zN.A03;
        } else if (KtCSuperShape0S2101000_I2.A00(2, obj)) {
            r0 = C29831zN.A05;
        } else if (KtCSuperShape0S2101000_I2.A00(4, obj)) {
            r0 = C29831zN.A07;
        } else if (KtCSuperShape0S2101000_I2.A00(3, obj)) {
            r0 = C29831zN.A06;
        } else if (obj instanceof AnonymousClass348) {
            r0 = C29831zN.A04;
        } else {
            throw C18190wL.A0a("Unsupported item type");
        }
        int ordinal = r0.ordinal();
        C14030oh.A0A(2068828962, A03);
        return ordinal;
    }
}
