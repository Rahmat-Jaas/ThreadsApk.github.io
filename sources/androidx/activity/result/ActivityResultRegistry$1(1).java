package androidx.activity.result;

import X.AnonymousClass00M;
import X.AnonymousClass00P;
import X.AnonymousClass00R;
import X.AnonymousClass00X;
import X.AnonymousClass060;
import X.AnonymousClass066;
import X.C14260p5;
import android.os.Bundle;
import java.util.Map;

public class ActivityResultRegistry$1 implements C14260p5 {
    public final /* synthetic */ AnonymousClass00M A00;
    public final /* synthetic */ AnonymousClass00R A01;
    public final /* synthetic */ AnonymousClass00X A02;
    public final /* synthetic */ String A03;

    public ActivityResultRegistry$1(AnonymousClass00M r1, AnonymousClass00R r2, AnonymousClass00X r3, String str) {
        this.A01 = r2;
        this.A03 = str;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void CMI(AnonymousClass060 r7, AnonymousClass066 r8) {
        if (AnonymousClass060.ON_START.equals(r7)) {
            AnonymousClass00R r5 = this.A01;
            Map map = r5.A07;
            String str = this.A03;
            AnonymousClass00M r3 = this.A00;
            AnonymousClass00X r2 = this.A02;
            map.put(str, new AnonymousClass00P(r3, r2));
            Map map2 = r5.A04;
            if (map2.containsKey(str)) {
                Object obj = map2.get(str);
                map2.remove(str);
                r3.BjZ(obj);
            }
            Bundle bundle = r5.A02;
            ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
            if (activityResult != null) {
                bundle.remove(str);
                r3.BjZ(r2.A04(activityResult.A01, activityResult.A00));
            }
        } else if (AnonymousClass060.ON_STOP.equals(r7)) {
            this.A01.A07.remove(this.A03);
        } else if (AnonymousClass060.ON_DESTROY.equals(r7)) {
            this.A01.A04(this.A03);
        }
    }
}
