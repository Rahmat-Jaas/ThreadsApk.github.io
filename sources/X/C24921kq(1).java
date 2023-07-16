package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1kq  reason: invalid class name and case insensitive filesystem */
public final class C24921kq extends AnonymousClass1lO {
    public final C11630kW A00;
    public final C84234sm A01;

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C04220Ms.A0B(layoutInflater, 1);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.selectable_user_row);
        C04220Ms.A06(A0H);
        return new AnonymousClass12J(A0H);
    }

    public final Class modelClass() {
        return AnonymousClass48F.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass48F r8 = (AnonymousClass48F) mfV;
        AnonymousClass12J r9 = (AnonymousClass12J) m5o;
        boolean A1Y = AnonymousClass0wJ.A1Y(r8, r9);
        AnonymousClass3B1 r3 = r9.A00;
        C57713Ce r4 = r8.A00;
        C50542tA.A00((Context) null, this.A00, this.A01, r3, r4, A1Y, A1Y);
    }

    public C24921kq(C11630kW r1, C84234sm r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
