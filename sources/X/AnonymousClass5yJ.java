package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.5yJ  reason: invalid class name */
public final class AnonymousClass5yJ extends AnonymousClass436 {
    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-1224546745);
        C04220Ms.A0B(view, 1);
        Object tag = view.getTag();
        C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.newsfeed.adapter.rowbinder.ActivityFeedNuxViewBinder.Holder");
        C106286en r1 = (C106286en) tag;
        C18240wQ.A1I(obj);
        String str = (String) obj;
        C18210wN.A0n(1, r1, str);
        r1.A00.setText(str);
        C14030oh.A0A(1554471208, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A00 = AnonymousClass436.A00(1720213295, viewGroup);
        View A0D = C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.bundled_activity_feed_nux_centered_header_text, false);
        A0D.setTag(new C106286en(A0D));
        C14030oh.A0A(-294485902, A00);
        return A0D;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r1, Object obj, Object obj2) {
        AnonymousClass436.A01(r1);
    }
}
