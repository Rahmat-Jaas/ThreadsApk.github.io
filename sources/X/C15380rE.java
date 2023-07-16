package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.util.ArrayList;

/* renamed from: X.0rE  reason: invalid class name and case insensitive filesystem */
public final class C15380rE implements C16800tl {
    public final FbnsServiceDelegate A00;

    public final Bundle AIQ(Context context, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        AnonymousClass0s5.A01(context, arrayList, arrayList2);
        bundle2.putStringArrayList("valid_compatible_apps", arrayList);
        bundle2.putStringArrayList("enabled_compatible_apps", arrayList2);
        ArrayList arrayList3 = new ArrayList();
        this.A00.A0g(arrayList3);
        bundle2.putStringArrayList("registered_apps", arrayList3);
        return bundle2;
    }

    public final void AIW(Context context, Bundle bundle) {
        AnonymousClass0LU.A0B("AppsStatisticsFetcher", "not implemented for AppsStatisticsFetcher");
        throw new IllegalArgumentException("not implemented for AppsStatisticsFetcher");
    }

    public C15380rE(FbnsServiceDelegate fbnsServiceDelegate) {
        this.A00 = fbnsServiceDelegate;
    }
}
