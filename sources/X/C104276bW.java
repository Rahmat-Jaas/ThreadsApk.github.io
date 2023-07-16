package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.PopupWindow;

/* renamed from: X.6bW  reason: invalid class name and case insensitive filesystem */
public final class C104276bW {
    public final PopupWindow A00;

    public C104276bW(Context context) {
        PopupWindow popupWindow = new PopupWindow(context);
        this.A00 = popupWindow;
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setContentView(new LLH(context));
        popupWindow.setInputMethodMode(1);
    }
}
