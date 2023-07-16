package X;

import com.facebook.mobileconfig.MobileConfigCxxChangeListener;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: X.0TY  reason: invalid class name */
public final class AnonymousClass0TY implements MobileConfigCxxChangeListener {
    public Map A00 = new HashMap();
    public ExecutorService A01 = null;

    public final synchronized void A00(AnonymousClass0TG r6, C07810cE r7) {
        int AYu = r6.AYu();
        Map map = this.A00;
        Integer valueOf = Integer.valueOf(AYu);
        if (!map.containsKey(valueOf)) {
            map.put(valueOf, new HashMap());
        }
        if (map.containsKey(valueOf)) {
            AnonymousClass0TW r2 = new AnonymousClass0TW(r6, r7);
            Class<?> cls = r6.getClass();
            if (((Map) map.get(valueOf)).containsKey(cls)) {
                cls.toString();
            } else {
                ((Map) map.get(valueOf)).put(cls, r2);
            }
        }
    }

    public final synchronized void A01(ExecutorService executorService) {
        this.A01 = executorService;
    }

    public final synchronized void A02(String[] strArr) {
        int length;
        Map map = this.A00;
        if (map.containsKey(-2)) {
            for (AnonymousClass0TW r0 : ((Map) map.get(-2)).values()) {
                r0.A00.BrR(r0.A01, -2);
            }
        }
        if (strArr != null && (length = strArr.length) != 0) {
            int i = 0;
            while (true) {
                try {
                    int parseInt = Integer.parseInt(strArr[i]);
                    if (map.containsKey(Integer.valueOf(parseInt))) {
                        for (AnonymousClass0TW r02 : ((Map) map.get(Integer.valueOf(parseInt))).values()) {
                            r02.A00.BrR(r02.A01, parseInt);
                        }
                    }
                    if (map.containsKey(-1)) {
                        for (AnonymousClass0TW r03 : ((Map) map.get(-1)).values()) {
                            r03.A00.BrR(r03.A01, parseInt);
                        }
                    }
                } catch (NumberFormatException e) {
                    e.toString();
                }
                i++;
                if (i >= length) {
                    break;
                }
            }
        }
    }

    public final synchronized void onConfigChanged(String[] strArr) {
        ExecutorService executorService = this.A01;
        if (executorService == null) {
            A02(strArr);
        } else {
            executorService.execute(new AnonymousClass0TV(this, strArr));
        }
    }
}
