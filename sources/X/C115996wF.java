package X;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.6wF  reason: invalid class name and case insensitive filesystem */
public final class C115996wF {
    public static void A01(XmlPullParser xmlPullParser) {
        int i = 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            } else {
                continue;
            }
            if (i <= 0) {
                return;
            }
        }
    }

    public static List A00(Resources resources, int i) {
        ArrayList arrayList;
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                arrayList = Collections.emptyList();
            } else {
                ArrayList A0v = AnonymousClass0wJ.A0v();
                if (obtainTypedArray.getType(0) == 1) {
                    for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                        int resourceId = obtainTypedArray.getResourceId(i2, 0);
                        if (resourceId != 0) {
                            String[] stringArray = resources.getStringArray(resourceId);
                            ArrayList A0v2 = AnonymousClass0wJ.A0v();
                            for (String decode : stringArray) {
                                A0v2.add(Base64.decode(decode, 0));
                            }
                            A0v.add(A0v2);
                        }
                    }
                    arrayList = A0v;
                } else {
                    String[] stringArray2 = resources.getStringArray(i);
                    ArrayList A0v3 = AnonymousClass0wJ.A0v();
                    for (String decode2 : stringArray2) {
                        A0v3.add(Base64.decode(decode2, 0));
                    }
                    A0v.add(A0v3);
                    arrayList = A0v;
                }
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }
}
