package X;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.EditText;

/* renamed from: X.6zZ  reason: invalid class name and case insensitive filesystem */
public final class C117986zZ {
    public static void A00(View view, AnonymousClass3HX r3, C127397h3 r4) {
        if (Build.VERSION.SDK_INT >= 29) {
            EditText editText = (EditText) view;
            ((C105696dq) AnonymousClass7K7.A03(r3, r4)).A00 = editText.getTextCursorDrawable();
            editText.setTextCursorDrawable((Drawable) null);
        }
    }

    public static void A01(View view, AnonymousClass3HX r3, C127397h3 r4) {
        if (Build.VERSION.SDK_INT >= 29) {
            C105696dq r1 = (C105696dq) AnonymousClass7K7.A03(r3, r4);
            ((EditText) view).setTextCursorDrawable(r1.A00);
            r1.A00 = null;
        }
    }
}
