package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.instagram.barcelona.R;

/* renamed from: X.7Rn  reason: invalid class name */
public final class AnonymousClass7Rn implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ListView A01;
    public final /* synthetic */ C95235zg A02;

    public AnonymousClass7Rn(View view, ListView listView, C95235zg r3) {
        this.A01 = listView;
        this.A02 = r3;
        this.A00 = view;
    }

    public final void onGlobalLayout() {
        ListView listView = this.A01;
        if (listView.getLayoutParams().height != -2) {
            listView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            return;
        }
        int height = listView.getHeight();
        C86154wM.A1J(listView, this);
        C95235zg r2 = this.A02;
        C95235zg.A00(r2, height);
        listView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        View findViewById = this.A00.findViewById(R.id.row_feed_comment_textview_layout);
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new AnonymousClass7RZ(findViewById, r2, height));
        }
    }
}
