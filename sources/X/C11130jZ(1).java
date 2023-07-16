package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0jZ  reason: invalid class name and case insensitive filesystem */
public final class C11130jZ {
    public static final Set A04 = new HashSet(Arrays.asList(new String[]{"com.facebook.orca", "com.facebook.katana"}));
    public ArrayList A00 = new ArrayList();
    public boolean A01 = false;
    public final SharedPreferences A02;
    public final C11660kZ A03;

    public static void A02(C11130jZ r2) {
        ArrayList arrayList;
        synchronized (r2) {
            arrayList = r2.A00;
            r2.A00 = new ArrayList();
            r2.A01 = false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r2.A01((JXJ) it.next());
        }
    }

    public final synchronized void A03(JXJ jxj) {
        if (jxj instanceof IOm) {
            SharedPreferences sharedPreferences = this.A02;
            if (sharedPreferences.getBoolean("analytics_is_phoneid_fully_synced", true) && !jxj.A03() && A04.contains(jxj.A01())) {
                sharedPreferences.edit().putBoolean("analytics_is_phoneid_fully_synced", false).apply();
            }
            this.A00.add(jxj);
            if (!this.A01) {
                AnonymousClass0g9.A00().A01(new C15370rD(this), 10000);
                this.A01 = true;
            }
        }
    }

    private void A00(IOm iOm) {
        String str = null;
        C15730rn A012 = C15730rn.A01("phoneid_sync_stats", (String) null);
        A012.A0D("src_pkg", iOm.A01());
        A012.A0D(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, iOm.A02());
        A012.A08(Integer.valueOf(iOm.A00()), "duration");
        A012.A0D("sync_medium", iOm.A06());
        AnonymousClass3FH A05 = iOm.A05();
        if (A05 != null) {
            str = A05.toString();
        }
        A012.A0D("prev_phone_id", str);
        AnonymousClass3FH A042 = iOm.A04();
        if (A042 != null) {
            A012.A0D("phone_id", A042.toString());
        }
        iOm.toString();
        this.A03.Cd7(A012);
    }

    private void A01(JXJ jxj) {
        if (jxj instanceof IOm) {
            A00((IOm) jxj);
        }
    }

    public C11130jZ(Context context, C11660kZ r4) {
        this.A02 = context.getSharedPreferences("analyticsprefs", 0);
        this.A03 = r4;
    }
}
