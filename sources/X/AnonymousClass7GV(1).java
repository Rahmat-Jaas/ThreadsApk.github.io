package X;

import android.content.SharedPreferences;
import com.instagram.common.notifications.push.intf.PushChannelType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7GV  reason: invalid class name */
public final class AnonymousClass7GV {
    public static HGC A00;
    public static final long A01 = TimeUnit.HOURS.toMillis(5);

    public static String A00(PushChannelType pushChannelType) {
        if (AnonymousClass0wJ.A1X(C09120et.A02().A1M.A00.invoke())) {
            return pushChannelType.A00;
        }
        return null;
    }

    public static void A01() {
        A02();
        C1190873l.A00().CZk();
    }

    public static void A02() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (PushChannelType pushChannelType : PushChannelType.values()) {
            A0v.add(pushChannelType.A01);
        }
        SharedPreferences.Editor edit = C18200wM.A0C().edit();
        C04220Ms.A06(edit);
        Iterator it = A0v.iterator();
        while (it.hasNext()) {
            edit.remove(AnonymousClass00U.A0L("push_reg_date", C18180wK.A0k(it)));
        }
        edit.apply();
    }
}
