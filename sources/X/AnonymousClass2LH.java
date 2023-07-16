package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.BitSet;
import java.util.Map;

/* renamed from: X.2LH  reason: invalid class name */
public final class AnonymousClass2LH {
    public static Fragment A00(Context context, IgBloksScreenConfig igBloksScreenConfig, BitSet bitSet, Map map, Map map2, Map map3) {
        if (bitSet.nextClearBit(0) >= 2) {
            C63743iE r1 = new C63743iE(C37067Jjv.A02(map3), map2, "com.bloks.www.bsc.settings");
            C63743iE.A0A(r1, 667749724);
            r1.A03 = null;
            r1.A02 = null;
            return C63743iE.A00(context, igBloksScreenConfig, r1, map);
        }
        throw C18180wK.A0a("Missing Required Props");
    }
}
