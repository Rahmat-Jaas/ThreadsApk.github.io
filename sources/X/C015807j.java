package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.07j  reason: invalid class name and case insensitive filesystem */
public final class C015807j extends AnonymousClass00X {
    public final /* bridge */ /* synthetic */ Intent A02(Context context, Object obj) {
        C04220Ms.A0B(obj, 1);
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) obj});
        C04220Ms.A06(putExtra);
        return putExtra;
    }

    public final /* bridge */ /* synthetic */ Object A04(Intent intent, int i) {
        int[] intArrayExtra;
        boolean z = false;
        if (intent != null && i == -1 && (intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS")) != null) {
            int length = intArrayExtra.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (intArrayExtra[i2] == 0) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass00W A03(Context context, Object obj) {
        String str = (String) obj;
        C04220Ms.A0B(str, 1);
        if (AnonymousClass01R.A00(context, str) == 0) {
            return new AnonymousClass00W(true);
        }
        return null;
    }
}
