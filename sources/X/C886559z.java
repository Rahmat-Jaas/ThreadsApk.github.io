package X;

import android.content.Context;
import android.util.DisplayMetrics;
import com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager;

/* renamed from: X.59z  reason: invalid class name and case insensitive filesystem */
public final class C886559z extends LBP {
    public final /* synthetic */ FastScrollingGridLayoutManager A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C886559z(Context context, FastScrollingGridLayoutManager fastScrollingGridLayoutManager) {
        super(context);
        this.A00 = fastScrollingGridLayoutManager;
    }

    public final float A07(DisplayMetrics displayMetrics) {
        return this.A00.A00 / ((float) displayMetrics.densityDpi);
    }
}
