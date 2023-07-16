package X;

import android.util.Pair;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0MW  reason: invalid class name */
public final class AnonymousClass0MW implements Runnable {
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ C000200d A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass0MW(Pair pair, C000200d r2, Boolean bool, Integer num, boolean z) {
        this.A01 = r2;
        this.A00 = pair;
        this.A04 = z;
        this.A02 = bool;
        this.A03 = num;
    }

    public final void run() {
        List list;
        List<SubscribeTopic> list2;
        String str;
        try {
            Pair pair = this.A00;
            Boolean bool = null;
            if (pair != null) {
                list = (List) pair.first;
                list2 = (List) pair.second;
            } else {
                list = null;
                list2 = null;
            }
            ArrayList arrayList = new ArrayList();
            if (list2 != null) {
                for (SubscribeTopic subscribeTopic : list2) {
                    arrayList.add(subscribeTopic.A01);
                }
            }
            C000200d r4 = this.A01;
            C17060uE r6 = r4.A0S;
            if (this.A04) {
                str = null;
            } else {
                bool = this.A02;
                str = C17040uC.A00().A03(bool);
            }
            byte[] convertForegroundStateWithSubscriptionToThriftPayload = r6.convertForegroundStateWithSubscriptionToThriftPayload(str, bool, this.A03, list, arrayList);
            if (convertForegroundStateWithSubscriptionToThriftPayload != null) {
                r4.A04(new C13070mx(this, list, list2), AnonymousClass006.A01, "/t_fs", convertForegroundStateWithSubscriptionToThriftPayload);
            }
        } catch (C17450uv unused) {
        }
    }
}
