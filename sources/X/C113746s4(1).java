package X;

import com.instagram.service.session.UserSession;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.6s4  reason: invalid class name and case insensitive filesystem */
public final class C113746s4 {
    public final C03710Kk A00;
    public final UserSession A01;
    public final Map A02;

    public final void A00() {
        Map map = this.A02;
        if (map.containsKey("open_camera")) {
            Object obj = map.get("open_camera");
            if (obj != null) {
                C18190wL.A08(obj);
                this.A00.now();
            } else {
                throw AnonymousClass0wJ.A0b();
            }
        }
        map.remove("open_camera");
    }

    public final void A01(String str) {
        this.A02.put(str, Long.valueOf(this.A00.now()));
    }

    public C113746s4(C03710Kk r2, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r2;
        Map synchronizedMap = Collections.synchronizedMap(AnonymousClass0wJ.A0y());
        C04220Ms.A06(synchronizedMap);
        this.A02 = synchronizedMap;
    }
}
