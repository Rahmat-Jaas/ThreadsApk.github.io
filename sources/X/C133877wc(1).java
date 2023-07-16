package X;

import android.util.SparseIntArray;
import android.util.SparseLongArray;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.KtLambdaShape161S0100000_I2_16;
import kotlin.jvm.internal.KtLambdaShape2S2100000_I2;
import kotlin.jvm.internal.KtLambdaShape6S1100000_I2;

/* renamed from: X.7wc  reason: invalid class name and case insensitive filesystem */
public final class C133877wc implements C84574tR {
    public static final SparseIntArray A02;
    public final SparseLongArray A00 = new SparseLongArray(A02.size());
    public final UserFlowLogger A01;

    public C133877wc(UserFlowLogger userFlowLogger) {
        C04220Ms.A0B(userFlowLogger, 1);
        this.A01 = userFlowLogger;
    }

    private final void A01(AnonymousClass0YY r6) {
        try {
            SparseLongArray sparseLongArray = this.A00;
            int size = sparseLongArray.size();
            for (int i = 0; i < size; i++) {
                r6.invoke(Long.valueOf(sparseLongArray.valueAt(i)));
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            A01(r6);
        }
    }

    public final void ANE(String str) {
        C04220Ms.A0B(str, 0);
        A01(new KtLambdaShape6S1100000_I2(str, this, 40));
        this.A00.clear();
    }

    public final void ANG(String str) {
        C04220Ms.A0B(str, 0);
        A01(new KtLambdaShape6S1100000_I2(str, this, 41));
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A02 = sparseIntArray;
        sparseIntArray.put(845063405, 332019702);
        sparseIntArray.put(-1432540386, 332018946);
        sparseIntArray.put(-556981757, 332019815);
        sparseIntArray.put(-1200394103, 332009051);
        sparseIntArray.put(-315516710, 332019202);
        sparseIntArray.put(1020135502, 332016926);
        sparseIntArray.put(-1191075339, 332014390);
        sparseIntArray.put(-1839630844, 332011758);
        sparseIntArray.put(1261600549, 332008904);
    }

    public static final long A00(C133877wc r2, Trigger trigger) {
        return r2.A00.get(A02.get(trigger.name().hashCode()));
    }

    public final void ANC() {
        A01(new KtLambdaShape161S0100000_I2_16(this, 33));
        this.A00.clear();
    }

    public final void AND(C81644o8 r12, String str, String str2) {
        C04220Ms.A0B(str2, 2);
        for (Trigger trigger : EnumSet.copyOf(((C28291u0) r12).A0F)) {
            C04220Ms.A04(trigger);
            SparseIntArray sparseIntArray = A02;
            int hashCode = trigger.name().hashCode();
            if (!(sparseIntArray.get(hashCode) == 0 || A00(this, trigger) == 0)) {
                UserFlowLogger userFlowLogger = this.A01;
                userFlowLogger.flowAnnotate(A00(this, trigger), "resolution", str2);
                userFlowLogger.flowEndCancel(A00(this, trigger), C28174Ezk.A00(637));
                this.A00.delete(sparseIntArray.get(hashCode));
            }
        }
    }

    public final void ANF(C81644o8 r12, String str, String str2) {
        C04220Ms.A0B(r12, 0);
        for (Trigger trigger : EnumSet.copyOf(((C28291u0) r12).A0F)) {
            C04220Ms.A04(trigger);
            SparseIntArray sparseIntArray = A02;
            int hashCode = trigger.name().hashCode();
            if (!(sparseIntArray.get(hashCode) == 0 || A00(this, trigger) == 0)) {
                UserFlowLogger userFlowLogger = this.A01;
                userFlowLogger.flowAnnotate(A00(this, trigger), "resolution", "success");
                userFlowLogger.flowEndSuccess(A00(this, trigger));
                this.A00.delete(sparseIntArray.get(hashCode));
            }
        }
    }

    public final void ANA(String str, String str2) {
        AnonymousClass0wJ.A1N(str, str2);
        A01(new KtLambdaShape2S2100000_I2((Object) this, str2, str, 6));
    }

    public final void ANI(Set set, String str) {
        boolean A1Y = AnonymousClass0wJ.A1Y(set, str);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Trigger trigger = (Trigger) it.next();
            SparseIntArray sparseIntArray = A02;
            int hashCode = trigger.name().hashCode();
            if (sparseIntArray.get(hashCode) != 0) {
                if (A00(this, trigger) != 0) {
                    UserFlowLogger userFlowLogger = this.A01;
                    userFlowLogger.flowAnnotate(A00(this, trigger), "repeat_trigger_source", str);
                    userFlowLogger.flowMarkPoint(A00(this, trigger), AnonymousClass00U.A0L("repeat_trigger_source_", str));
                } else {
                    UserFlowLogger userFlowLogger2 = this.A01;
                    long generateNewFlowId = userFlowLogger2.generateNewFlowId(sparseIntArray.get(hashCode));
                    this.A00.put(sparseIntArray.get(hashCode), generateNewFlowId);
                    userFlowLogger2.flowStart(generateNewFlowId, new UserFlowConfig(str, A1Y));
                }
            }
        }
    }
}
