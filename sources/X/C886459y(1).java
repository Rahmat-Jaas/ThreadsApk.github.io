package X;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: X.59y  reason: invalid class name and case insensitive filesystem */
public final class C886459y extends M5N {
    public final /* synthetic */ AnonymousClass3HX A00;
    public final /* synthetic */ C127397h3 A01;

    public final void onSwiped(M5O m5o, int i) {
    }

    public C886459y(AnonymousClass3HX r1, C127397h3 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final int getMovementFlags(RecyclerView recyclerView, M5O m5o) {
        return M5N.makeMovementFlags(15, 0);
    }

    public final boolean onMove(RecyclerView recyclerView, M5O m5o, M5O m5o2) {
        if (AnonymousClass6DL.A02 != null) {
            int absoluteAdapterPosition = m5o.getAbsoluteAdapterPosition();
            int absoluteAdapterPosition2 = m5o2.getAbsoluteAdapterPosition();
            C109326jp A08 = C127397h3.A08(this.A01);
            if (A08 == null) {
                AnonymousClass7HV A012 = AnonymousClass7K7.A01(this.A00);
                if (AnonymousClass7J1.A04()) {
                    A012.A00++;
                }
                A012.A0A(new AnonymousClass7r4((long) AnonymousClass6DL.A02.A02), new C95315zq(this, absoluteAdapterPosition, absoluteAdapterPosition2));
                A012.A05();
            } else if (!(AnonymousClass6DL.A00 == absoluteAdapterPosition || AnonymousClass6DL.A01 == absoluteAdapterPosition2)) {
                C127397h3 r4 = AnonymousClass6DL.A02;
                AnonymousClass3VO A002 = AnonymousClass3VO.A00();
                AnonymousClass3HX r2 = this.A00;
                A002.A02(r2, 0);
                A002.A02(Integer.valueOf(absoluteAdapterPosition), 1);
                A002.A02(Integer.valueOf(absoluteAdapterPosition2), 2);
                C122047Jt.A07(r2, r4, A002, A08);
                AnonymousClass6DL.A00 = absoluteAdapterPosition;
                AnonymousClass6DL.A01 = absoluteAdapterPosition2;
                return true;
            }
        }
        return true;
    }

    public final void clearView(RecyclerView recyclerView, M5O m5o) {
        super.clearView(recyclerView, m5o);
        C109326jp A0V = C18230wP.A0V(this.A01);
        AnonymousClass6DL.A00 = -1;
        AnonymousClass6DL.A01 = -1;
        if (A0V != null && AnonymousClass6DL.A02 != null) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (int i = 0; i < AnonymousClass6DL.A02.A0P().size(); i++) {
                A0v.add(C86154wM.A0Q(AnonymousClass6DL.A02.A0P(), i).A0M());
            }
            C122047Jt.A03(this.A00, AnonymousClass6DL.A02, C86114wI.A0V(A0v), A0V);
        }
    }

    public final void onChildDraw(Canvas canvas, RecyclerView recyclerView, M5O m5o, float f, float f2, int i, boolean z) {
        super.onChildDraw(canvas, recyclerView, m5o, f, f2, i, z);
        if (z) {
            View view = m5o.itemView;
            view.setElevation(Math.max(20.0f, view.getElevation()));
        }
    }
}
