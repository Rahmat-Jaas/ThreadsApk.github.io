package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5AH  reason: invalid class name */
public final class AnonymousClass5AH extends C61803Vq {
    public final AnonymousClass3HX A00;
    public final C127397h3 A01;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C41006Ltt ltt) {
        LBI lbi;
        List unmodifiableList;
        Rect rect2;
        C04220Ms.A0B(rect, 0);
        AnonymousClass0wJ.A1O(view, recyclerView);
        int A03 = RecyclerView.A03(view);
        AnonymousClass3HX r0 = this.A00;
        C127397h3 r1 = this.A01;
        List list = ((C130767qj) AnonymousClass7K7.A03(r0, r1)).A08;
        if (!(list == null || (unmodifiableList = Collections.unmodifiableList(list)) == null || (rect2 = (Rect) AnonymousClass00J.A0G(unmodifiableList, A03)) == null)) {
            rect.set(rect2);
        }
        Object obj = r1.A0P().get(A03);
        C04220Ms.A06(obj);
        C127397h3 A06 = C127397h3.A06((C127397h3) obj);
        boolean z = false;
        if (A06 != null && A06.A03 == 16482) {
            z = AnonymousClass2LL.A00(C127397h3.A0A(A06, 36), false);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof LBI) && (lbi = (LBI) layoutParams) != null) {
            lbi.A01 = z;
        }
    }

    public AnonymousClass5AH(AnonymousClass3HX r1, C127397h3 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
