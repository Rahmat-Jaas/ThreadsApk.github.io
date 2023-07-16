package X;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* renamed from: X.6ZR  reason: invalid class name */
public final class AnonymousClass6ZR {
    public static final Layout.Alignment A00 = Layout.Alignment.ALIGN_NORMAL;
    public static final TextDirectionHeuristic A01;

    static {
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        C04220Ms.A08(textDirectionHeuristic);
        A01 = textDirectionHeuristic;
    }
}
