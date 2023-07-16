package X;

import java.util.Arrays;

/* renamed from: X.7wx  reason: invalid class name and case insensitive filesystem */
public final class C134057wx implements C144928jW {
    public final void A00(C41012LuB luB) {
        luB.A02(1);
        luB.A05 = true;
        luB.A03 = true;
        Lr4[] lr4Arr = (Lr4[]) C40600Lje.A0N.getValue();
        luB.A03((Lr4[]) Arrays.copyOf(lr4Arr, lr4Arr.length));
        luB.A09.add(new AnonymousClass5C6());
    }

    public final String dbFilenamePrefix() {
        return "clips";
    }
}
