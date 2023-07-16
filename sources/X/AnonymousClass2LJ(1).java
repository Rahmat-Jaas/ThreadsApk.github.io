package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.BitSet;
import java.util.Map;

/* renamed from: X.2LJ  reason: invalid class name */
public final class AnonymousClass2LJ {
    public static Fragment A00(Context context, IgBloksScreenConfig igBloksScreenConfig, BitSet bitSet, Map map, Map map2, Map map3) {
        if (bitSet.nextClearBit(0) >= 2) {
            C63743iE A05 = C63743iE.A05("com.bloks.www.bloks.p2m.incentive.landing.page.screen", C37067Jjv.A02(map3), map2);
            A05.A03 = null;
            A05.A02 = null;
            return C63743iE.A00(context, igBloksScreenConfig, A05, map);
        }
        throw C18180wK.A0a("Missing Required Props");
    }
}
