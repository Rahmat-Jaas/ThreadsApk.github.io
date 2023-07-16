package X;

import android.widget.TextView;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0hD  reason: invalid class name */
public final class AnonymousClass0hD {
    public static final AtomicBoolean A00 = new AtomicBoolean(false);

    public static void A00(TextView textView, CharSequence charSequence) {
        if (A00.get()) {
            AnonymousClass0gN.A00().AKp(new C13230nH(textView.getTextMetricsParams(), textView, charSequence));
            return;
        }
        textView.setText(charSequence);
    }
}
