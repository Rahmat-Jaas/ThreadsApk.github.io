package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1lM  reason: invalid class name */
public final class AnonymousClass1lM extends C18523Agw {
    public final C11630kW A00;
    public final C84234sm A01;

    public final Class modelClass() {
        return AnonymousClass48E.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass48E r8 = (AnonymousClass48E) mfV;
        AnonymousClass127 r9 = (AnonymousClass127) m5o;
        boolean A1Y = AnonymousClass0wJ.A1Y(r8, r9);
        AnonymousClass3B1 r3 = r9.A00;
        C57713Ce r4 = r8.A00;
        C50542tA.A00((Context) null, this.A00, this.A01, r3, r4, A1Y, A1Y);
    }

    public AnonymousClass1lM(C11630kW r1, C84234sm r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass127(C18180wK.A0D(layoutInflater, viewGroup, R.layout.selectable_user_row, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
