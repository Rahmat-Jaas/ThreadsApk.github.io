package X;

import android.view.KeyEvent;

/* renamed from: X.6El  reason: invalid class name and case insensitive filesystem */
public final class C98166El {
    public static final int A00(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action == 0) {
            return 2;
        }
        if (action != 1) {
            return 0;
        }
        return 1;
    }
}
