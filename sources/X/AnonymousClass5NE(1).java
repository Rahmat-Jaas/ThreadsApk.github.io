package X;

import android.os.Process;
import com.facebook.common.threadutils.ThreadUtils;
import java.util.List;
import java.util.Set;

/* renamed from: X.5NE  reason: invalid class name */
public final class AnonymousClass5NE extends MGK {
    public final List A00 = AnonymousClass0wJ.A0v();
    public final boolean A01;
    public final boolean A02;
    public final int A03;
    public final Set A04 = C18200wM.A0u();

    public final int ATy() {
        return 5;
    }

    public final void A02() {
        for (Object A042 : this.A00) {
            int A043 = AnonymousClass0wJ.A04(A042);
            int i = ThreadUtils.instance.maxAffinityMask;
            if (i != 0) {
                ThreadUtils.nativeSetThreadAffinityMask(A043, i);
            }
        }
        Integer[] numArr = null;
        Set set = this.A04;
        synchronized (set) {
            if (!set.isEmpty()) {
                numArr = (Integer[]) set.toArray(new Integer[set.size()]);
                set.clear();
            }
        }
        if (numArr != null) {
            for (Integer intValue : numArr) {
                int intValue2 = intValue.intValue();
                int i2 = ThreadUtils.instance.maxAffinityMask;
                if (i2 != 0) {
                    ThreadUtils.nativeSetThreadAffinityMask(intValue2, i2);
                }
            }
        }
    }

    public final boolean A03() {
        int A002;
        List<Object> list = this.A00;
        if (list.isEmpty()) {
            if (this.A01) {
                C86144wL.A1V(list, Process.myPid());
            }
            if (this.A02 && (A002 = AnonymousClass6XH.A00()) >= 0) {
                C86144wL.A1V(list, A002);
            }
        }
        for (Object A042 : list) {
            int A043 = AnonymousClass0wJ.A04(A042);
            int i = this.A03 & ThreadUtils.instance.maxAffinityMask;
            if (i != 0) {
                ThreadUtils.nativeSetThreadAffinityMask(A043, i);
            }
        }
        return true;
    }

    public AnonymousClass5NE(int i, boolean z, boolean z2) {
        this.A03 = i;
        this.A01 = z;
        this.A02 = z2;
    }
}
