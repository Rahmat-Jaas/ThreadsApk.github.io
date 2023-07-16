package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.50i  reason: invalid class name */
public final class AnonymousClass50i extends ViewGroup {
    public int A00;
    public final int A01 = 5;
    public final C106776fb A02;
    public final List A03;
    public final List A04;

    public AnonymousClass50i(Context context) {
        super(context);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A03 = A0v;
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        this.A04 = A0v2;
        this.A02 = new C106776fb();
        setClipChildren(false);
        AnonymousClass50c r0 = new AnonymousClass50c(context);
        addView(r0);
        A0v.add(r0);
        A0v2.add(r0);
        this.A00 = 1;
        setTag(R.id.hide_in_inspector_tag, true);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
