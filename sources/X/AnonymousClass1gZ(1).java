package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1gZ  reason: invalid class name */
public final class AnonymousClass1gZ extends AnonymousClass436 {
    public boolean A00;
    public final C11630kW A01;
    public final C84234sm A02;
    public final boolean A03;

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A032 = C14030oh.A03(-467235598);
        C84234sm r4 = this.A02;
        boolean z = this.A03;
        boolean z2 = this.A00;
        C50542tA.A00(view.getContext(), this.A01, r4, (AnonymousClass3B1) view.getTag(), (C57713Ce) obj, z, z2);
        C14030oh.A0A(210962906, A032);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1gZ(C11630kW r1, C84234sm r2, boolean z) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = z;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = C14030oh.A03(-1533217654);
        View A0H = AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.selectable_user_row);
        A0H.setTag(new AnonymousClass3B1(A0H));
        C14030oh.A0A(-2094308655, A032);
        return A0H;
    }
}
