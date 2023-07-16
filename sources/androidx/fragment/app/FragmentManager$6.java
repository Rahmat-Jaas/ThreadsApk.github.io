package androidx.fragment.app;

import X.AnonymousClass05D;
import X.AnonymousClass060;
import X.AnonymousClass062;
import X.AnonymousClass066;
import X.C12560m7;
import X.C14260p5;
import android.os.Bundle;
import java.util.Map;

public class FragmentManager$6 implements C14260p5 {
    public final /* synthetic */ C12560m7 A00;
    public final /* synthetic */ AnonymousClass05D A01;
    public final /* synthetic */ AnonymousClass062 A02;
    public final /* synthetic */ String A03;

    public FragmentManager$6(C12560m7 r1, AnonymousClass05D r2, AnonymousClass062 r3, String str) {
        this.A00 = r1;
        this.A03 = str;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void CMI(AnonymousClass060 r5, AnonymousClass066 r6) {
        if (r5 == AnonymousClass060.ON_START) {
            Map map = this.A00.A0X;
            String str = this.A03;
            Bundle bundle = (Bundle) map.get(str);
            if (bundle != null) {
                this.A01.Bzx(str, bundle);
                map.remove(str);
                C12560m7.A0E(2);
            }
        }
        if (r5 == AnonymousClass060.ON_DESTROY) {
            this.A02.A08(this);
            this.A00.A0W.remove(this.A03);
        }
    }
}
