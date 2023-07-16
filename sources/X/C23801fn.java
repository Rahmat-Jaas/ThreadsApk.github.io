package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1fn  reason: invalid class name and case insensitive filesystem */
public final class C23801fn extends AnonymousClass436 {
    public final Context A00;

    public final int getViewTypeCount() {
        return AnonymousClass006.A00(2).length;
    }

    public C23801fn(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        C14030oh.A0A(97211782, C14030oh.A03(-971280847));
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(AnonymousClass0wJ.A1Z(r2, obj) ? 1 : 0);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        LayoutInflater from;
        int i2;
        int A03 = C14030oh.A03(1225349337);
        C04220Ms.A0B(viewGroup, 1);
        int intValue = AnonymousClass006.A00(2)[i].intValue();
        if (intValue == 1) {
            from = LayoutInflater.from(this.A00);
            i2 = R.layout.row_divider;
        } else if (intValue == 0) {
            from = LayoutInflater.from(this.A00);
            i2 = R.layout.row_divider_thick;
        } else {
            AnonymousClass4VZ A002 = AnonymousClass4VZ.A00();
            C14030oh.A0A(-1135844003, A03);
            throw A002;
        }
        View inflate = from.inflate(i2, viewGroup, false);
        C14030oh.A0A(397229717, A03);
        return inflate;
    }
}
