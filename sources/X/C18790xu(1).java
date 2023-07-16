package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.0xu  reason: invalid class name and case insensitive filesystem */
public final class C18790xu extends ArrayAdapter {
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

    public C18790xu(Context context, List list) {
        super(context, 17367048, list);
    }

    public final int getCount() {
        return super.getCount() - 1;
    }
}
