package X;

import android.view.ViewStub;
import com.instagram.barcelona.R;

/* renamed from: X.7jZ  reason: invalid class name and case insensitive filesystem */
public final class C128417jZ implements C143568gx {
    public final int A00;

    public final C113656rv Bsg(ViewStub viewStub) {
        C04220Ms.A0B(viewStub, 0);
        viewStub.setLayoutResource(R.layout.cell_component_text_image);
        return new C92485ia(viewStub, this.A00);
    }

    public C128417jZ(int i) {
        this.A00 = i;
    }

    public C128417jZ() {
        this(0);
    }
}
