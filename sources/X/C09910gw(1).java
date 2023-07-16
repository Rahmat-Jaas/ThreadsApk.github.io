package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.instagram.barcelona.R;

/* renamed from: X.0gw  reason: invalid class name and case insensitive filesystem */
public final class C09910gw implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;

    public C09910gw(View view, View view2) {
        this.A01 = view;
        this.A00 = view2;
    }

    public final void run() {
        Rect rect = new Rect();
        View view = this.A01;
        view.getHitRect(rect);
        Resources resources = view.getResources();
        rect.left -= resources.getDimensionPixelSize(R.dimen.account_section_text_margin_horizontal);
        rect.bottom += resources.getDimensionPixelSize(R.dimen.account_section_text_margin_horizontal);
        this.A00.setTouchDelegate(new TouchDelegate(rect, view));
    }
}
