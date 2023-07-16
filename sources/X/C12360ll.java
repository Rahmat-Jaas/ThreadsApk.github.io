package X;

import java.io.File;
import java.util.Arrays;
import java.util.Set;

/* renamed from: X.0ll  reason: invalid class name and case insensitive filesystem */
public final class C12360ll implements AnonymousClass0OB {
    public static final C12360ll A00 = new C12360ll();

    public final /* bridge */ /* synthetic */ Object AFC(AnonymousClass0OK r8) {
        C04220Ms.A0B(r8, 0);
        Set<String> A03 = r8.A03().A03();
        int size = A03.size();
        File[] fileArr = new File[size];
        int i = 0;
        for (String A02 : A03) {
            fileArr[i] = r8.A03().A02(A02);
            i++;
        }
        return new AnonymousClass0UO(C12300lf.A00(), (File[]) Arrays.copyOf(fileArr, size));
    }
}
