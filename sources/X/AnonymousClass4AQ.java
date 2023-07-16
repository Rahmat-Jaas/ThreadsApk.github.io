package X;

import java.util.HashSet;

/* renamed from: X.4AQ  reason: invalid class name */
public final class AnonymousClass4AQ implements C39549KvX {
    public final AnonymousClass34G A00;

    public AnonymousClass4AQ(AnonymousClass34G r1) {
        this.A00 = r1;
    }

    public final void AKq(C37284Jnx jnx, C2R c2r) {
        C694948t r1;
        C694948t r12;
        AnonymousClass0wJ.A1Y(jnx, c2r);
        Integer BLJ = c2r.BLJ(jnx);
        C04220Ms.A06(BLJ);
        if ((BLJ == AnonymousClass006.A00 || BLJ == AnonymousClass006.A01) && c2r.BLq(jnx) > 0.3f) {
            AnonymousClass34G r0 = this.A00;
            Object obj = jnx.A02;
            C04220Ms.A05(obj);
            C83524rY r2 = (C83524rY) obj;
            H97 h97 = r0.A00.A00;
            HashSet hashSet = h97.A0a;
            synchronized (hashSet) {
                FF5 ff5 = (FF5) r2;
                if (!(ff5 == null || !hashSet.remove(ff5.A03) || (r12 = h97.A0V.A00) == null)) {
                    C83524rY r5 = (C83524rY) ff5.D9H(r12.A00);
                    AnonymousClass3TO r6 = r12.A02;
                    String Aqp = r5.Aqp(r12.A01);
                    Long A0c = C18200wM.A0c();
                    AnonymousClass7Ko.A07(r6.A09, "Must init with a valid delegate first!");
                    Aqp.getClass();
                    if (r6.A0A != null) {
                        C013306f r13 = r6.A04;
                        if (r13.containsKey(Aqp)) {
                            AnonymousClass0LU.A0B("RankingImpressionLoggingManager", "Previous impression has not stopped yet, check your logging logic");
                        } else {
                            r13.put(Aqp, A0c);
                            C013306f r22 = r6.A01;
                            Integer num = (Integer) r22.get(Aqp);
                            int i = 1;
                            if (num != null) {
                                i = num.intValue() + 1;
                            }
                            r22.put(Aqp, Integer.valueOf(i));
                            if (r6.A00 == 0 || !r6.A05.containsKey(Aqp)) {
                                r6.A05.put(Aqp, r5);
                            }
                        }
                    }
                }
            }
        } else if (BLJ == AnonymousClass006.A0C) {
            AnonymousClass34G r02 = this.A00;
            Object obj2 = jnx.A02;
            C04220Ms.A05(obj2);
            C83524rY r23 = (C83524rY) obj2;
            if (r23 != null && (r1 = r02.A00.A00.A0V.A00) != null) {
                C83524rY r52 = (C83524rY) r23.D9H(r1.A00);
                AnonymousClass3TO r4 = r1.A02;
                String Aqp2 = r52.Aqp(r1.A01);
                Long A0c2 = C18200wM.A0c();
                AnonymousClass7Ko.A07(r4.A09, "Must init with a valid delegate first!");
                Aqp2.getClass();
                if (r4.A0A != null) {
                    AnonymousClass3TO.A00(r4, A0c2, r52, Aqp2);
                }
            }
        }
    }
}
