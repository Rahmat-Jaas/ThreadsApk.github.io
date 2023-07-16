package X;

import android.os.SystemClock;
import android.view.View;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.0hc  reason: invalid class name and case insensitive filesystem */
public abstract class C10030hc implements View.OnClickListener {
    public final Map A00 = new WeakHashMap();

    public abstract void A00(View view);

    public /* synthetic */ C10030hc(DefaultConstructorMarker defaultConstructorMarker, int i, long j) {
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1408268978);
        C04220Ms.A0B(view, 0);
        Map map = this.A00;
        Number number = (Number) map.get(view);
        long uptimeMillis = SystemClock.uptimeMillis();
        map.put(view, Long.valueOf(uptimeMillis));
        if (number == null || Math.abs(uptimeMillis - number.longValue()) > 500) {
            A00(view);
        }
        C14030oh.A0C(203492076, A05);
    }
}
