package com.instagram.common.ui.widget.recyclerview;

import X.C41006Ltt;
import X.C886559z;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FastScrollingGridLayoutManager extends GridLayoutManager {
    public float A00;
    public final Context A01;

    public FastScrollingGridLayoutManager(Context context, int i) {
        super(i);
        this.A01 = context;
    }

    public final void A1Q(C41006Ltt ltt, RecyclerView recyclerView, int i) {
        float f;
        int abs = Math.abs(i - A1i());
        if (abs < 10) {
            f = 25.0f;
        } else {
            f = 2.0f;
            if (abs < 100) {
                f = 10.0f;
            }
        }
        this.A00 = f;
        C886559z r0 = new C886559z(this.A01, this);
        r0.A00 = i;
        A1O(r0);
    }
}
