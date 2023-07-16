package X;

import android.util.SparseArray;
import com.instagram.barcelona.R;
import com.instagram.common.lispy.lang.BloksScript;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.601  reason: invalid class name */
public final class AnonymousClass601 extends C110486ll {
    public static final AnonymousClass6HH A09 = new AnonymousClass6HH();
    public final AnonymousClass3HX A00;
    public final AnonymousClass7A1 A01;
    public final AnonymousClass73X A02;
    public final BloksScript A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final Map A07;
    public final Set A08;

    public static AnonymousClass601 A00(AnonymousClass3HX r11, BloksScript bloksScript, List list) {
        AnonymousClass3HX r3 = r11;
        C83454rP r1 = r11.A02;
        SparseArray sparseArray = r11.A01;
        C82414pa r7 = (C82414pa) sparseArray.get(R.id.bk_context_key_interpreter_extensions);
        if (r7 == null) {
            r7 = AnonymousClass794.A00().A0C;
        }
        C1197476t ATb = r1.ATb();
        return new AnonymousClass601(ATb.A01, r3, (AnonymousClass7A1) null, ATb.A05, bloksScript, r7, AnonymousClass006.A01, (String) sparseArray.get(R.id.bk_context_key_logging_id), (String) null, list, (Map) null, (Set) null);
    }

    public static AnonymousClass601 A01(AnonymousClass601 r14, List list) {
        AnonymousClass601 r1 = r14;
        List list2 = list;
        if (list == r14.A04) {
            return r14;
        }
        AnonymousClass3HX r5 = r14.A00;
        BloksScript bloksScript = r14.A03;
        Map map = r14.A07;
        AnonymousClass7A1 r6 = r1.A01;
        Set set = r1.A08;
        C82414pa r9 = r1.A02;
        AnonymousClass73X r7 = r1.A02;
        String str = r1.A06;
        AnonymousClass601 r3 = new AnonymousClass601(r1.A01, r5, r6, r7, bloksScript, r9, r1.A04, str, r1.A05, list2, map, set);
        C131627sW r2 = r3.A03;
        CopyOnWriteArraySet copyOnWriteArraySet = r1.A03.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            r2.A00.addAll(copyOnWriteArraySet);
        }
        return r3;
    }

    public AnonymousClass601(C104686cC r3, AnonymousClass3HX r4, AnonymousClass7A1 r5, AnonymousClass73X r6, BloksScript bloksScript, C82414pa r8, Integer num, String str, String str2, List list, Map map, Set set) {
        super(A09, r3, r8, list);
        this.A00 = r4;
        this.A03 = bloksScript;
        this.A07 = map;
        this.A01 = r5;
        this.A08 = set;
        this.A02 = r6;
        this.A06 = str;
        this.A04 = num;
        C131627sW r0 = this.A03;
        r0.A00.add(new C131617sV());
        if (str2 == null) {
            this.A05 = C18180wK.A0e();
        } else {
            this.A05 = str2;
        }
    }
}
