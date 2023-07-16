package X;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5AS  reason: invalid class name */
public final class AnonymousClass5AS extends C113246qz {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ AnonymousClass627 A01;

    public AnonymousClass5AS(RecyclerView recyclerView, AnonymousClass627 r2) {
        this.A01 = r2;
        this.A00 = recyclerView;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Parcelable parcelable;
        int A03 = C14030oh.A03(1679013096);
        AnonymousClass627 r1 = this.A01;
        M6x m6x = this.A00.A0H;
        if (m6x != null) {
            parcelable = m6x.A0p();
        } else {
            parcelable = null;
        }
        r1.A00 = parcelable;
        C14030oh.A0A(-788385679, A03);
    }
}
