package X;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: X.7zQ  reason: invalid class name and case insensitive filesystem */
public abstract class C135417zQ implements Runnable {
    public final /* synthetic */ C129347lj A00;

    public /* synthetic */ C135417zQ(C129347lj r1) {
        this.A00 = r1;
    }

    public final void run() {
        C148588rW r1;
        Set hashSet;
        C129347lj r4 = this.A00;
        Lock lock = r4.A0G;
        lock.lock();
        try {
            if (!Thread.interrupted()) {
                if (this instanceof C93395lX) {
                    C93395lX r8 = (C93395lX) this;
                    C129347lj r9 = r8.A01;
                    C129387ln r11 = r9.A0D;
                    C93285lJ r7 = r11.A07;
                    C110886mR r12 = r9.A0E;
                    if (r12 == null) {
                        hashSet = Collections.emptySet();
                    } else {
                        hashSet = new HashSet(r12.A05);
                        Map map = r12.A04;
                        Iterator A0x = C18220wO.A0x(map);
                        while (A0x.hasNext()) {
                            C108946jD r2 = (C108946jD) A0x.next();
                            if (!r11.A0A.containsKey(r2.A01)) {
                                map.get(r2);
                                throw C18210wN.A0W("zaa");
                            }
                        }
                    }
                    r7.A03 = hashSet;
                    ArrayList arrayList = r8.A00;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((C148598rX) arrayList.get(i)).B6o(r9.A00, r7.A03);
                    }
                } else {
                    C93385lW r82 = (C93385lW) this;
                    C129347lj r5 = r82.A01;
                    AnonymousClass77f r72 = new AnonymousClass77f(r5.A0C);
                    ArrayList A0v = AnonymousClass0wJ.A0v();
                    ArrayList A0v2 = AnonymousClass0wJ.A0v();
                    Map map2 = r82.A00;
                    Iterator A0x2 = C18220wO.A0x(map2);
                    while (A0x2.hasNext()) {
                        Object next = A0x2.next();
                        if (!((C129427lr) map2.get(next)).A00) {
                            A0v.add(next);
                        } else {
                            A0v2.add(next);
                        }
                    }
                    int i2 = -1;
                    int i3 = 0;
                    if (A0v.isEmpty()) {
                        int size2 = A0v2.size();
                        while (true) {
                            if (i3 >= size2) {
                                break;
                            }
                            i2 = r72.A00(r5.A0B, (C148598rX) A0v2.get(i3));
                            i3++;
                            if (i2 == 0) {
                                break;
                            }
                        }
                        ConnectionResult connectionResult = new ConnectionResult(i2, (PendingIntent) null);
                        C129387ln r0 = r5.A0D;
                        C86124wJ.A1E(r0.A08, new C93425la(connectionResult, r82, r5), 1);
                    } else {
                        int size3 = A0v.size();
                        while (true) {
                            if (i3 < size3) {
                                i2 = r72.A00(r5.A0B, (C148598rX) A0v.get(i3));
                                i3++;
                                if (i2 != 0) {
                                    break;
                                }
                            } else if (i2 != 0) {
                            }
                        }
                        ConnectionResult connectionResult2 = new ConnectionResult(i2, (PendingIntent) null);
                        C129387ln r02 = r5.A0D;
                        C86124wJ.A1E(r02.A08, new C93425la(connectionResult2, r82, r5), 1);
                    }
                    if (r5.A03 && (r1 = r5.A01) != null) {
                        C121837Ij r13 = (C121837Ij) r1;
                        C121837Ij.A01(new C129417lq(r13), r13);
                    }
                    Iterator A0x3 = C18220wO.A0x(map2);
                    while (A0x3.hasNext()) {
                        C148598rX r22 = (C148598rX) A0x3.next();
                        C143808hL r14 = (C143808hL) map2.get(r22);
                        if (r72.A00(r5.A0B, r22) != 0) {
                            C129387ln r03 = r5.A0D;
                            C86124wJ.A1E(r03.A08, new C93415lZ(r5, r14), 1);
                        } else {
                            C121837Ij.A01(r14, (C121837Ij) r22);
                        }
                    }
                }
            }
        } catch (RuntimeException e) {
            C86124wJ.A1E(r4.A0D.A08, e, 2);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
        lock.unlock();
    }
}
