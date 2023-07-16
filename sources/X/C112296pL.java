package X;

import android.os.Bundle;
import com.facebook.browser.lite.callback.IDxSRunnableShape5S0300000_2_I2;
import java.util.ArrayList;

/* renamed from: X.6pL  reason: invalid class name and case insensitive filesystem */
public final class C112296pL {
    public static C112296pL A02;
    public ArrayList A00 = C18240wQ.A0k(8);
    public final AnonymousClass7Ep A01 = AnonymousClass7Ep.A00();

    public final void A00(Bundle bundle) {
        AnonymousClass7Ep r5 = this.A01;
        if (r5.A01 != null) {
            ArrayList arrayList = this.A00;
            arrayList.add(C18200wM.A0c());
            if (arrayList.size() >= 8) {
                long[] jArr = new long[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    jArr[i] = C18190wL.A08(arrayList.get(i));
                }
                arrayList.clear();
                AnonymousClass7Ep.A01(new IDxSRunnableShape5S0300000_2_I2(bundle, r5, jArr), r5);
            }
        }
    }
}
