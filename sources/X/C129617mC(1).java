package X;

import android.util.Pair;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.7mC  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C129617mC implements C143858hQ {
    public final FirebaseInstanceId A00;
    public final String A01;
    public final String A02;

    public C129617mC(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.A00 = firebaseInstanceId;
        this.A01 = str;
        this.A02 = str2;
    }

    public final Object Cx8(AnonymousClass7HU r13) {
        AnonymousClass7HU r5;
        FirebaseInstanceId firebaseInstanceId = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        String A022 = FirebaseInstanceId.A02();
        AnonymousClass76F A002 = FirebaseInstanceId.A00(str, str2);
        if (!firebaseInstanceId.A08(A002)) {
            C105166cz r0 = new C105166cz(A002.A01);
            AnonymousClass7HU r52 = new AnonymousClass7HU();
            r52.A0B(r0);
            return r52;
        }
        C107526gt r7 = firebaseInstanceId.A05;
        synchronized (r7) {
            Pair pair = new Pair(str, str2);
            Map map = r7.A00;
            r5 = (AnonymousClass7HU) map.get(pair);
            if (r5 != null) {
                C86114wI.A1N("FirebaseInstanceId", pair);
            } else {
                C86114wI.A1N("FirebaseInstanceId", pair);
                C120937De r1 = firebaseInstanceId.A00;
                AnonymousClass7HU A012 = C120937De.A01(C120937De.A00(C18180wK.A06(), r1, A022, str, str2), r1);
                Executor executor = firebaseInstanceId.A07;
                AnonymousClass7mM r2 = new AnonymousClass7mM(firebaseInstanceId, str, str2, A022);
                AnonymousClass7HU r4 = new AnonymousClass7HU();
                A012.A03.A00(new C129647mF(r2, r4, executor));
                AnonymousClass7HU.A02(A012);
                Executor executor2 = r7.A01;
                C129607mB r22 = new C129607mB(pair, r7);
                r5 = new AnonymousClass7HU();
                r4.A03.A00(new C129637mE(r22, r5, executor2));
                AnonymousClass7HU.A02(r4);
                map.put(pair, r5);
            }
        }
        return r5;
    }
}
