package X;

import android.graphics.Rect;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.6nx  reason: invalid class name and case insensitive filesystem */
public final class C111596nx {
    public final ArrayList A00(Layout layout, float f) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Rect rect = new Rect(-1, -1, -1, -1);
        float f2 = f * 0.4f;
        float f3 = f * 0.15f;
        float f4 = f * 0.05f;
        Layout layout2 = layout;
        int lineCount = layout2.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            int lineLeft = (int) layout2.getLineLeft(i);
            int lineTop = layout2.getLineTop(i);
            int lineRight = (int) layout2.getLineRight(i);
            int lineBottom = layout2.getLineBottom(i);
            Rect A0F = C86164wN.A0F(lineLeft, lineTop, lineRight, lineBottom);
            int lineStart = layout2.getLineStart(i);
            int lineEnd = layout2.getLineEnd(i);
            CharSequence text = layout2.getText();
            C04220Ms.A06(text);
            String obj = text.subSequence(lineStart, lineEnd).toString();
            if (A0F.width() > 0 && !TextUtils.isEmpty(AnonymousClass8bQ.A0l(obj, "\n", "", false))) {
                rect.bottom = lineBottom;
                if (rect.top == -1) {
                    rect.top = lineTop;
                }
                if (rect.left == -1) {
                    rect.left = lineLeft;
                } else {
                    rect.left = Math.min(lineLeft, rect.left);
                }
                if (rect.right == -1) {
                    rect.right = lineRight;
                } else {
                    rect.right = Math.max(lineRight, rect.right);
                }
            } else if (!(rect.left == -1 || rect.right == -1 || rect.top == -1 || rect.bottom == -1)) {
                rect.inset(-((int) f2), 0);
                rect.bottom += (int) f3;
                A0v.add(rect);
                rect = new Rect(-1, -1, -1, -1);
            }
        }
        if (!(rect.left == -1 || rect.right == -1 || rect.top == -1 || rect.bottom == -1)) {
            rect.inset(-((int) f2), 0);
            rect.bottom += (int) f3;
            rect.top -= (int) f4;
            A0v.add(rect);
        }
        return A0v;
    }
}
