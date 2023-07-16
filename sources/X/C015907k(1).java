package X;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* renamed from: X.07k  reason: invalid class name and case insensitive filesystem */
public final class C015907k extends AnonymousClass00X {
    public static final AnonymousClass00W A00(Context context, String[] strArr) {
        Map map;
        C04220Ms.A0B(strArr, 1);
        int length = strArr.length;
        int i = 0;
        if (length == 0) {
            map = AnonymousClass4WJ.A0A();
        } else {
            int i2 = 0;
            while (AnonymousClass01R.A00(context, strArr[i2]) == 0) {
                i2++;
                if (i2 >= length) {
                    int A0N = AnonymousClass4WK.A0N(length);
                    if (A0N < 16) {
                        A0N = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(A0N);
                    do {
                        Pair A00 = C54682zq.A00(strArr[i], true);
                        linkedHashMap.put(A00.A00(), A00.A01());
                        i++;
                    } while (i < length);
                    map = linkedHashMap;
                }
            }
            return null;
        }
        return new AnonymousClass00W(map);
    }

    public static final Map A01(Intent intent, int i) {
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (!(intArrayExtra == null || stringArrayExtra == null)) {
                ArrayList arrayList = new ArrayList(r4);
                for (int i2 : intArrayExtra) {
                    boolean z = false;
                    if (i2 == 0) {
                        z = true;
                    }
                    arrayList.add(Boolean.valueOf(z));
                }
                return AnonymousClass4WJ.A0B(AnonymousClass00J.A0T(AnonymousClass8AP.A0A(stringArrayExtra), arrayList));
            }
        }
        return AnonymousClass4WJ.A0A();
    }

    public final /* bridge */ /* synthetic */ Intent A02(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        C04220Ms.A0B(strArr, 1);
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        C04220Ms.A06(putExtra);
        return putExtra;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass00W A03(Context context, Object obj) {
        return A00(context, (String[]) obj);
    }

    public final /* bridge */ /* synthetic */ Object A04(Intent intent, int i) {
        return A01(intent, i);
    }
}
