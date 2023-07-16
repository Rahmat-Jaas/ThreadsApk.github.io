package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: X.3mX  reason: invalid class name and case insensitive filesystem */
public final class C64553mX implements TransformationMethod {
    public Locale A00;

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.A00);
        }
        return null;
    }

    public C64553mX(Context context) {
        this.A00 = context.getResources().getConfiguration().locale;
    }
}
