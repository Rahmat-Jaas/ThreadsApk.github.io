package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.service.session.UserSession;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Map;

/* renamed from: X.1jo  reason: invalid class name and case insensitive filesystem */
public final class C24671jo extends C19819BBt {
    public C23401dk A00;
    public UserSession A01;
    public List A02;
    public final Handler A03 = new C18570xP(Looper.getMainLooper(), this);
    public final C145538kf A04;
    public final Deque A05 = new ArrayDeque(3);
    public final Map A06 = Collections.synchronizedMap(C18220wO.A0y());

    public final void onDestroy() {
        this.A03.removeCallbacksAndMessages((Object) null);
        this.A00 = null;
    }

    public final void onDestroyView() {
        this.A05.clear();
        for (List<C32165H8c> it : this.A06.values()) {
            for (C32165H8c A002 : it) {
                A002.A00();
            }
        }
    }

    public C24671jo(C145538kf r3, UserSession userSession, List list) {
        this.A01 = userSession;
        this.A04 = r3;
        this.A02 = list;
    }
}
