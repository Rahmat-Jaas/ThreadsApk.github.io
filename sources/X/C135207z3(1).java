package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.List;

/* renamed from: X.7z3  reason: invalid class name and case insensitive filesystem */
public final class C135207z3 implements Runnable {
    public final /* synthetic */ AnonymousClass770 A00;

    public C135207z3(AnonymousClass770 r1) {
        this.A00 = r1;
    }

    public final void run() {
        ViewGroup viewGroup;
        AnonymousClass770 r4 = this.A00;
        C109686kP r3 = r4.A05;
        View view = r3.A02;
        if (!(view == null || (viewGroup = AnonymousClass7IZ.A00) == null)) {
            viewGroup.removeView(view);
        }
        ViewGroup viewGroup2 = AnonymousClass7IZ.A00;
        C04220Ms.A0C(viewGroup2, "null cannot be cast to non-null type android.view.ViewGroup");
        View view2 = new View(viewGroup2.getContext());
        r3.A02 = view2;
        view2.setBackgroundColor(-16711936);
        List list = r3.A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AnonymousClass0wJ.A04(((List) list.get(r3.A00)).get(0)), AnonymousClass0wJ.A04(C86134wK.A0k((List) list.get(r3.A00))));
        layoutParams.setMargins(AnonymousClass0wJ.A04(((List) list.get(r3.A00)).get(2)), AnonymousClass0wJ.A04(((List) list.get(r3.A00)).get(3)), 0, 0);
        ViewGroup viewGroup3 = AnonymousClass7IZ.A00;
        if (viewGroup3 != null) {
            viewGroup3.addView(r3.A02, layoutParams);
        }
        r3.A00 = (r3.A00 + 1) % list.size();
        r4.A04.postDelayed(this, 4000);
    }
}
