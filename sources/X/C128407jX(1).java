package X;

import android.view.ViewStub;
import com.instagram.barcelona.R;

/* renamed from: X.7jX  reason: invalid class name and case insensitive filesystem */
public final class C128407jX implements C143568gx {
    public final int A00;

    public final C113656rv Bsg(ViewStub viewStub) {
        C04220Ms.A0B(viewStub, 0);
        viewStub.setLayoutResource(R.layout.cell_item_component_image);
        return new C92475iZ(viewStub, this.A00);
    }

    public C128407jX(int i) {
        this.A00 = i;
    }

    public C128407jX() {
        this(0);
    }
}
