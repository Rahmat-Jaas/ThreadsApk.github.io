package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.adshistory.fragment.RecentAdActivityFragment;

/* renamed from: X.1g8  reason: invalid class name */
public final class AnonymousClass1g8 extends AnonymousClass436 {
    public final RecentAdActivityFragment A00;
    public final C130667qT A01;

    public AnonymousClass1g8(RecentAdActivityFragment recentAdActivityFragment, C130667qT r3) {
        C04220Ms.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = recentAdActivityFragment;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        C14030oh.A0A(-1498268834, C14030oh.A03(-58471063));
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r1, Object obj, Object obj2) {
        AnonymousClass436.A01(r1);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A002 = AnonymousClass436.A00(-456021166, viewGroup);
        Context context = viewGroup.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        LLF llf = new LLF(context);
        llf.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        frameLayout.addView(llf);
        C121997Jj r2 = this.A00.A07;
        if (r2 != null) {
            new C58513Fy(context, r2, this.A01).A00().A06(llf);
        }
        C14030oh.A0A(-908164157, A002);
        return frameLayout;
    }
}
