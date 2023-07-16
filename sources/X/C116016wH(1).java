package X;

import android.view.View;
import androidx.core.view.ViewKt$allViews$1;
import com.facebook.redex.IDxSequenceShape671S0100000_2_I2;
import com.instagram.barcelona.R;

/* renamed from: X.6wH  reason: invalid class name and case insensitive filesystem */
public final class C116016wH {
    public static final void A01(View view) {
        C04220Ms.A0B(view, 0);
        for (View A00 : new IDxSequenceShape671S0100000_2_I2(new ViewKt$allViews$1(view, (C146958n9) null), 0)) {
            A00(A00).A00();
        }
    }

    public static final C111676o8 A00(View view) {
        C111676o8 r0 = (C111676o8) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (r0 != null) {
            return r0;
        }
        C111676o8 r02 = new C111676o8();
        view.setTag(R.id.pooling_container_listener_holder_tag, r02);
        return r02;
    }
}
