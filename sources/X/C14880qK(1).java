package X;

import android.util.Log;

/* renamed from: X.0qK  reason: invalid class name and case insensitive filesystem */
public final class C14880qK {
    public int A00 = 0;
    public final String[] A01 = new String[5];

    public final synchronized void A00(StringBuilder sb) {
        sb.append("Previously recorded ");
        int i = this.A00;
        sb.append(i);
        sb.append(" base apk paths.");
        if (i > 0) {
            sb.append(" Most recent ones:");
        }
        int i2 = 0;
        while (true) {
            String[] strArr = this.A01;
            int length = strArr.length;
            if (i2 < length) {
                int i3 = (i - i2) - 1;
                if (i3 >= 0) {
                    sb.append("\n");
                    sb.append(strArr[i3 % length]);
                }
                i2++;
            }
        }
    }

    public final synchronized boolean A01(String str) {
        String[] strArr = this.A01;
        for (String equals : strArr) {
            if (str.equals(equals)) {
                return false;
            }
        }
        StringBuilder sb = new StringBuilder("Recording new base apk path: ");
        sb.append(str);
        sb.append("\n");
        A00(sb);
        Log.w("SoLoader", sb.toString());
        int i = this.A00;
        this.A00 = i + 1;
        strArr[i % r3] = str;
        return true;
    }
}
