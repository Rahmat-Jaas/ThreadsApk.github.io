package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;

/* renamed from: X.6rv  reason: invalid class name and case insensitive filesystem */
public abstract class C113656rv {
    public View A00;
    public final int A01;
    public final ViewStub A02;

    public final View A00() {
        View view = this.A00;
        if (view != null) {
            return view;
        }
        C04220Ms.A0E("itemView");
        throw null;
    }

    public final void A01() {
        ImageView imageView;
        if ((this instanceof C92475iZ) && (imageView = ((C92475iZ) this).A00) != null) {
            AnonymousClass7A2.A00(imageView);
        }
    }

    public C113656rv(ViewStub viewStub, int i) {
        this.A02 = viewStub;
        this.A01 = i;
    }
}
