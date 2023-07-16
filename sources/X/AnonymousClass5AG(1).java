package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5AG  reason: invalid class name */
public final class AnonymousClass5AG extends C61803Vq {
    public final AnonymousClass3HX A00;
    public final C127397h3 A01;

    public AnonymousClass5AG(AnonymousClass3HX r1, C127397h3 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C41006Ltt ltt) {
        List unmodifiableList;
        Rect rect2;
        AnonymousClass0wJ.A1N(rect, view);
        C04220Ms.A0B(recyclerView, 2);
        int A03 = RecyclerView.A03(view);
        List list = ((C130767qj) AnonymousClass7K7.A03(this.A00, this.A01)).A08;
        if (list != null && (unmodifiableList = Collections.unmodifiableList(list)) != null && (rect2 = (Rect) AnonymousClass00J.A0G(unmodifiableList, A03)) != null) {
            rect.set(rect2);
        }
    }
}
