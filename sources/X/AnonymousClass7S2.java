package X;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: X.7S2  reason: invalid class name */
public final class AnonymousClass7S2 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AdapterView.OnItemClickListener A00;

    public AnonymousClass7S2(AdapterView.OnItemClickListener onItemClickListener) {
        this.A00 = onItemClickListener;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AdapterView.OnItemClickListener onItemClickListener = this.A00;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(adapterView, view, i, j);
        }
    }
}
