package X;

import android.view.ViewStub;
import com.instagram.barcelona.R;

/* renamed from: X.7ja  reason: invalid class name and case insensitive filesystem */
public final class C128427ja implements C143568gx {
    public final int A00;

    public final C113656rv Bsg(ViewStub viewStub) {
        C04220Ms.A0B(viewStub, 0);
        viewStub.setLayoutResource(R.layout.cell_item_component_timeline);
        return new C92495ib(viewStub, this.A00);
    }

    public C128427ja(int i) {
        this.A00 = i;
    }

    public C128427ja() {
        this(0);
    }
}
