package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0EG  reason: invalid class name */
public abstract class AnonymousClass0EG extends AnonymousClass0DS {
    public ArrayList A00 = new ArrayList();
    public C002000x A01 = new C002000x();

    public final Object A00(String str) {
        Object obj = this.A01.get(str);
        obj.getClass();
        return obj;
    }

    public AnonymousClass0EG(C16190sd... r10) {
        for (C16190sd r6 : r10) {
            Iterator it = r6.ApV().iterator();
            while (it.hasNext()) {
                IntentFilter intentFilter = (IntentFilter) it.next();
                this.A00.add(intentFilter);
                int countActions = intentFilter.countActions();
                for (int i = 0; i < countActions; i++) {
                    String action = intentFilter.getAction(i);
                    C002000x r0 = this.A01;
                    action.getClass();
                    r0.put(action, r6);
                }
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        int A012 = C14030oh.A01(1837733310);
        String action = intent.getAction();
        action.getClass();
        C16190sd r0 = (C16190sd) A00(action);
        if (r0 != null) {
            try {
                super.onReceive(context, intent);
                r0.CEI(context, intent, this);
                C16260sk.A00.A00(intent, A01(context), (String) null, "allow");
            } catch (SecurityException e) {
                C16260sk.A00.A00(intent, A01(context), (String) null, "deny");
                i = -880590552;
                if (e instanceof C15630rd) {
                    C14030oh.A0E(-1748760256, A012, intent);
                    throw e;
                }
            }
        }
        i = -559286012;
        C14030oh.A0E(i, A012, intent);
    }
}
