package X;

import java.util.Arrays;
import org.pytorch.IValue;

/* renamed from: X.6Go  reason: invalid class name and case insensitive filesystem */
public final class C98696Go {
    public static final IValue A00(String str, C25322Dji dji, IValue... iValueArr) {
        try {
            IValue runMethod = dji.A00.runMethod(str, (IValue[]) Arrays.copyOf(iValueArr, iValueArr.length));
            C04220Ms.A06(runMethod);
            return runMethod;
        } catch (Exception e) {
            throw new AnonymousClass5F7(e, AnonymousClass00U.A0V("Failed to run method `", str, "` on module"));
        }
    }
}
