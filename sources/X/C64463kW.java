package X;

import android.os.Handler;
import android.os.Message;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3kW  reason: invalid class name and case insensitive filesystem */
public final class C64463kW implements Handler.Callback {
    public final /* synthetic */ C685844n A00;

    public C64463kW(C685844n r1) {
        this.A00 = r1;
    }

    public final boolean handleMessage(Message message) {
        if (!AnonymousClass7J1.A04()) {
            C18510xJ r2 = this.A00.A04;
            r2.A00(r2.obtainMessage(message.what, message.obj));
        } else {
            int i = message.what;
            if (i == 1) {
                C685844n r3 = this.A00;
                Object obj = message.obj;
                obj.getClass();
                AnonymousClass145 r22 = (AnonymousClass145) obj;
                try {
                    C121247Ez r0 = r3.A01;
                    if (r0 != null) {
                        r0.A04();
                    }
                    LLF llf = r3.A00;
                    if (llf == null) {
                        C685844n.A00(r3, 8);
                    } else {
                        r22.A01.A06(llf);
                    }
                    return true;
                } finally {
                    r3.A01 = r22.A01;
                    C685844n.A00(r3, r22.A00);
                }
            } else if (i != 2) {
                return false;
            } else {
                C685844n r7 = this.A00;
                Object obj2 = message.obj;
                obj2.getClass();
                AnonymousClass146 r10 = (AnonymousClass146) obj2;
                C121247Ez r23 = r7.A01;
                if (r23 != null) {
                    Map map = r7.A08;
                    map.putAll(r10.A02);
                    HashMap hashMap = new HashMap(map);
                    Set set = r7.A09;
                    HashSet hashSet = new HashSet(set);
                    try {
                        AnonymousClass3HX A02 = r23.A02();
                        List<C61323St> list = r10.A01;
                        for (C61323St r5 : list) {
                            if (!hashSet.contains(r5)) {
                                Map A04 = C121997Jj.A04(r5.A01.A02, hashMap);
                                C61043Rr.A00(C122047Jt.A00(r5, A02, A04), C63893iY.A04(AnonymousClass3VO.A00(), A02, 0), r5.A02);
                                hashSet.add(r5);
                            }
                        }
                        set.addAll(list);
                        C685844n.A00(r7, r10.A00);
                        return true;
                    } catch (Throwable th) {
                        set.addAll(r10.A01);
                        C685844n.A00(r7, r10.A00);
                        throw th;
                    }
                }
            }
        }
        return true;
    }
}
