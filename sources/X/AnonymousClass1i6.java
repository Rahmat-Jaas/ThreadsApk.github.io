package X;

import com.google.common.collect.ImmutableList;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.user.model.MicroUserDict;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1i6  reason: invalid class name */
public final class AnonymousClass1i6 extends C63873iU {
    public String A00;
    public final /* synthetic */ AnonymousClass49X A01;

    public AnonymousClass1i6(AnonymousClass49X r1, String str) {
        this.A01 = r1;
        this.A00 = str;
    }

    public final void onFail(AnonymousClass3XX r4) {
        int A03 = C14030oh.A03(-647534302);
        AnonymousClass49X r1 = this.A01;
        if (r1.A00.get() == 0) {
            AnonymousClass49X.A01(r1);
        }
        C14030oh.A0A(1382458373, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(1571572908);
        synchronized (this) {
            this.A01.A00.decrementAndGet();
        }
        C14030oh.A0A(834927482, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(-267097235);
        ConcurrentHashMap concurrentHashMap = this.A01.A06;
        String str = this.A00;
        if (!concurrentHashMap.containsKey(str)) {
            concurrentHashMap.put(str, new AccountFamily(str));
        }
        C14030oh.A0A(340660648, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass22H r0;
        int i;
        int A03 = C14030oh.A03(-1482977424);
        AnonymousClass1TI r12 = (AnonymousClass1TI) obj;
        int A032 = C14030oh.A03(253111727);
        AnonymousClass49X r6 = this.A01;
        ConcurrentHashMap concurrentHashMap = r6.A06;
        String str = this.A00;
        if (!concurrentHashMap.containsKey(str)) {
            i = -1130629014;
        } else {
            AccountFamily accountFamily = (AccountFamily) concurrentHashMap.get(str);
            MicroUserDict microUserDict = r12.A00;
            ArrayList A0t = C18200wM.A0t(r12.A02);
            for (AnonymousClass37A r02 : r12.A02) {
                A0t.add(r02.A01);
            }
            ImmutableList copyOf = ImmutableList.copyOf((Collection) A0t);
            ArrayList A0t2 = C18200wM.A0t(r12.A01);
            for (AnonymousClass37A r03 : r12.A01) {
                A0t2.add(r03.A01);
            }
            ImmutableList copyOf2 = ImmutableList.copyOf((Collection) A0t2);
            accountFamily.A01 = microUserDict;
            accountFamily.A04.clear();
            accountFamily.A03.clear();
            accountFamily.A04.addAll(copyOf);
            accountFamily.A03.addAll(copyOf2);
            if (!accountFamily.A04.isEmpty()) {
                r0 = AnonymousClass22H.CHILD_ACCOUNT;
            } else if (!accountFamily.A03.isEmpty()) {
                r0 = AnonymousClass22H.MAIN_ACCOUNT;
            } else {
                r0 = AnonymousClass22H.UNLINKED_ACCOUNT;
            }
            accountFamily.A00 = r0;
            AtomicInteger atomicInteger = r6.A00;
            if (atomicInteger.get() == 0) {
                AnonymousClass49X.A01(r6);
            }
            if (atomicInteger.get() <= 0) {
                Iterator it = concurrentHashMap.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((AccountFamily) it.next()).A00 == AnonymousClass22H.UNKNOWN) {
                            break;
                        }
                    } else {
                        C62353Yv r04 = r6.A03;
                        if (r04 != null) {
                            r04.A02();
                        }
                    }
                }
            }
            C38040KHr.A01.CWx(new AnonymousClass45E(str));
            i = -497014974;
        }
        C14030oh.A0A(i, A032);
        C14030oh.A0A(-347701936, A03);
    }
}
