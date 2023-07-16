package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.privacy.consent.bloks.instagram.InstagramConsentFlowHostActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.7Ed  reason: invalid class name and case insensitive filesystem */
public final class C121107Ed {
    public static final C121107Ed A00 = new C121107Ed();
    public static final HashMap A01 = AnonymousClass0wJ.A0y();
    public static final HashMap A02 = AnonymousClass0wJ.A0y();
    public static final ReentrantLock A03 = new ReentrantLock();
    public static final AnonymousClass8AL A04 = new AnonymousClass8AL();

    public static final void A00(Context context, Bundle bundle, C115436v4 r9, String str, String str2, String str3, String str4, String str5, String str6) {
        String str7 = str6;
        C121107Ed r1 = A00;
        synchronized (r1) {
            if (str6 == null) {
                str7 = C18190wL.A0n(C03480Iw.A00());
            }
            A02.put(str7, r9);
        }
        r1.A02(context, bundle, (C1196176d) null, str, str7, str2, str3, str4, str5);
    }

    public final synchronized void A02(Context context, Bundle bundle, C1196176d r8, String str, String str2, String str3, String str4, String str5, String str6) {
        synchronized (this) {
            if (str2 == null) {
                str2 = A01();
                if (str2 == null) {
                    try {
                        str2 = C18190wL.A0n(C03480Iw.A00());
                        A02.put(str2, (Object) null);
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
            String A0f = C18240wQ.A0f(str2, A01);
            if (A0f != null) {
                str2 = A0f;
            }
            Intent intent = new Intent(context, InstagramConsentFlowHostActivity.class);
            intent.putExtra("flow_name", str);
            intent.putExtra("experience_id", str2);
            if (str3 != null) {
                intent.putExtra("source", str3);
            }
            if (str4 != null) {
                intent.putExtra(AnonymousClass3QJ.A00(0, 9, 113), str4);
            }
            if (str5 == null) {
                str5 = "flow.action";
            }
            intent.putExtra("app_id", AnonymousClass00U.A0L("com.bloks.www.consent.", str5));
            if (str6 != null) {
                intent.putExtra("extra_params_json", str6);
            }
            intent.putExtras(bundle);
            String A0N = AnonymousClass00U.A0N(str2, str, '$');
            A04.A0X(A0N);
            if (r8 != null) {
                C04220Ms.A0B(A0N, 0);
                ReentrantReadWriteLock.WriteLock writeLock = AnonymousClass749.A02.writeLock();
                C04220Ms.A06(writeLock);
                writeLock.lock();
                try {
                    AnonymousClass749.A00.put(A0N, r8);
                    writeLock.unlock();
                } catch (Throwable th2) {
                    th = th2;
                    writeLock.unlock();
                    throw th;
                }
            }
            C18230wP.A0O().A09(context, intent);
        }
    }

    public final synchronized void A03(String str) {
        C04220Ms.A0B(str, 1);
        A02.remove(str);
        AnonymousClass8AL r5 = A04;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = r5.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str2 = (String) next;
            String A0A = AnonymousClass00U.A0A(str, '$');
            AnonymousClass0wJ.A1Y(str2, A0A);
            if (str2.startsWith(A0A)) {
                A0v.add(next);
            }
        }
        Iterator it2 = A0v.iterator();
        while (it2.hasNext()) {
            String A0k = C18180wK.A0k(it2);
            Activity A002 = AnonymousClass77M.A00.A00(A0k);
            if (A002 != null) {
                A002.finish();
            }
            r5.remove(A0k);
        }
    }

    public final String A01() {
        String str = (String) A04.A0T();
        if (str == null) {
            return null;
        }
        return (String) AnonymousClass00J.A0C(AnonymousClass8bP.A0e(str, new char[]{'$'}, 0));
    }
}
