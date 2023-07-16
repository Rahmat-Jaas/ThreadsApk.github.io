package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.0xv  reason: invalid class name and case insensitive filesystem */
public final class C18800xv extends ArrayAdapter {
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Object obj;
        C04220Ms.A0B(viewGroup, 2);
        View view2 = super.getView(i, view, viewGroup);
        C04220Ms.A06(view2);
        TextView A0E = C18210wN.A0E(view2, 16908308);
        if (i == getCount()) {
            obj = getItem(getCount());
        } else {
            obj = "";
        }
        A0E.setHint((CharSequence) obj);
        return view2;
    }

    public C18800xv(Context context, List list) {
        super(context, 17367048, list);
    }

    public final int getCount() {
        int count = super.getCount() - 1;
        if (count < 0) {
            return 0;
        }
        return count;
    }
}
