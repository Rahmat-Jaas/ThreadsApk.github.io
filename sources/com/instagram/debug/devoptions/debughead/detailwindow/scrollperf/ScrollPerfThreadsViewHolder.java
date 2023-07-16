package com.instagram.debug.devoptions.debughead.detailwindow.scrollperf;

import X.AnonymousClass0wJ;
import X.M5O;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;

public final class ScrollPerfThreadsViewHolder extends M5O {
    public final Context mContext;
    public final View mRow;
    public final TextView mThread;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollPerfThreadsViewHolder(View view, Context context) {
        super(view);
        AnonymousClass0wJ.A1O(view, context);
        this.mRow = view;
        this.mContext = context;
        this.mThread = (TextView) AnonymousClass0wJ.A0J(view, R.id.active_thread);
    }
}
