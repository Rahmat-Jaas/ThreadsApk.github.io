package X;

import com.facebook.redex.IDxFCallbackShape314S0100000_2_I2;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.6oD  reason: invalid class name and case insensitive filesystem */
public final class C111726oD {
    public final C83304rA A00;

    public final void A00(C145168jy r5) {
        try {
            C146418mD build = ((C126217en) C86104wH.A0p("create", C116206wb.class)).build();
            C04220Ms.A06(build);
            this.A00.AMA(build, new IDxFCallbackShape314S0100000_2_I2(r5, 0));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C86114wI.A0k(e);
        }
    }

    public C111726oD(C83304rA r1) {
        this.A00 = r1;
    }
}
