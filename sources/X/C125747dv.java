package X;

import com.facebook.dcp.model.DcpContext;
import com.facebook.dcp.model.FeatureData;
import com.facebook.dcp.model.Type;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* renamed from: X.7dv  reason: invalid class name and case insensitive filesystem */
public final class C125747dv implements C145188k1 {
    public final C03700Kj A00;

    public C125747dv(C03700Kj r2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public final String getId() {
        return "DateTime";
    }

    public final AnonymousClass5Id ALA(DcpContext dcpContext) {
        long j = (long) 1000;
        long currentTimeMillis = (System.currentTimeMillis() / j) * j;
        Type type = Type.LONG;
        Date date = new Date(currentTimeMillis);
        Calendar instance = Calendar.getInstance();
        C04220Ms.A06(instance);
        instance.setTime(date);
        int i = instance.get(1);
        int i2 = instance.get(2);
        int i3 = instance.get(5);
        instance.clear();
        instance.set(i, i2, i3);
        Date time = instance.getTime();
        C04220Ms.A06(time);
        return AnonymousClass5Id.A01(C18180wK.A0n(new FeatureData(type, "2620", (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16376, currentTimeMillis - time.getTime(), false)), (String) null, true);
    }
}
