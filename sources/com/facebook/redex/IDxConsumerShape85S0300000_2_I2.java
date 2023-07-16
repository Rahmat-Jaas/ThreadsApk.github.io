package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass5z0;
import X.C04220Ms;
import X.C110916mU;
import X.C146368m8;
import X.C146578mT;
import X.C147978qF;
import X.C148178qb;
import X.C148188qc;
import X.C148568rI;
import X.C26743EUq;
import X.C35355ItJ;
import X.C35383Ito;
import X.C35387Itt;
import X.C40289Lbs;
import X.C685344e;
import X.C82404pZ;
import X.C880856r;
import X.CLm;
import X.E1T;
import X.I6I;
import X.IM8;
import X.KK5;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3000000_I2;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IDxConsumerShape85S0300000_2_I2 implements C82404pZ {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxConsumerShape85S0300000_2_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A00 = obj3;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        I6I i6i;
        C880856r r1;
        C148568rI r6;
        IM8 im8;
        String str;
        Integer num;
        Object obj2 = obj;
        switch (this.A03) {
            case 0:
                if (!((C40289Lbs) obj2).A01) {
                    C110916mU r7 = (C110916mU) this.A02;
                    E1T e1t = r7.A04;
                    Iterable<KtCSuperShape0S3000000_I2> iterable = (Iterable) this.A01;
                    ArrayList A0w = AnonymousClass0wJ.A0w(iterable);
                    for (KtCSuperShape0S3000000_I2 ktCSuperShape0S3000000_I2 : iterable) {
                        A0w.add(ktCSuperShape0S3000000_I2.A01);
                    }
                    e1t.A00.A0D(new IDxQListenerShape138S0300000_2_I2(0, r7, iterable, this.A00), A0w, (List) null);
                    return;
                }
                C146368m8 r2 = (C146368m8) this.A00;
                r2.D7w(new CLm(AnonymousClass000.A00(371), (String) null, (String) null));
                r2.ADR((Throwable) null);
                return;
            case 1:
                C26743EUq eUq = (C26743EUq) obj2;
                if (!eUq.A06() || !((C685344e) eUq.A03()).isOk() || AnonymousClass5z0.A00(eUq) == null) {
                    ((IM8) this.A01).A0l = false;
                    i6i = (I6I) this.A02;
                    Integer num2 = AnonymousClass006.A0C;
                    KK5.A04(i6i.A0F, i6i.A01, (C35387Itt) this.A00, num2, AnonymousClass006.A04, (String) null, (String) null, 96);
                    I6I.A02(i6i);
                } else {
                    Object A002 = AnonymousClass5z0.A00(eUq);
                    if (A002 != null) {
                        ImmutableList B0I = ((C148188qc) A002).B0I();
                        C04220Ms.A06(B0I);
                        ArrayList A0w2 = AnonymousClass0wJ.A0w(B0I);
                        Iterator it = B0I.iterator();
                        while (it.hasNext()) {
                            A0w2.add(((C148178qb) it.next()).A9Q());
                        }
                        i6i = (I6I) this.A02;
                        if (i6i.A03 != null) {
                            Iterator it2 = A0w2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    r6 = (C148568rI) it2.next();
                                    String str2 = i6i.A03;
                                    if (str2 == null) {
                                        throw AnonymousClass0wJ.A0b();
                                    } else if (str2.equals(r6.getId())) {
                                    }
                                }
                            }
                        } else {
                            Iterator it3 = A0w2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    r6 = (C148568rI) it3.next();
                                    if (!r6.B0K().isEmpty()) {
                                        ImmutableList B0K = r6.B0K();
                                        C04220Ms.A06(B0K);
                                        Iterator it4 = B0K.iterator();
                                        while (it4.hasNext()) {
                                            if (((C147978qF) it4.next()).BEq() == C35383Ito.valueOf(i6i.A02.A00)) {
                                            }
                                        }
                                        continue;
                                    }
                                }
                            }
                        }
                        i6i.A09(r6, true);
                        KK5 kk5 = i6i.A0F;
                        Integer num3 = AnonymousClass006.A01;
                        KK5.A04(kk5, i6i.A01, (C35387Itt) this.A00, num3, (Integer) null, ((IM8) this.A01).A0N, (String) null, 88);
                        i6i.A07();
                    } else {
                        throw AnonymousClass0wJ.A0b();
                    }
                }
                r1 = i6i.A0D;
                im8 = this.A01;
                break;
            default:
                C26743EUq eUq2 = (C26743EUq) obj2;
                C04220Ms.A0B(eUq2, 0);
                boolean A06 = eUq2.A06();
                if (!A06 || ((C146578mT) eUq2.A03()).getStatusCode() != 400) {
                    I6I i6i2 = (I6I) this.A02;
                    I6I.A02(i6i2);
                    KK5 kk52 = i6i2.A0F;
                    C35387Itt itt = i6i2.A02;
                    C35355ItJ itJ = i6i2.A01;
                    Integer num4 = AnonymousClass006.A0C;
                    Integer num5 = AnonymousClass006.A0Y;
                    String str3 = i6i2.A04;
                    if (A06) {
                        str = eUq2.A03().toString();
                        num = AnonymousClass006.A0j;
                    } else {
                        str = null;
                        num = AnonymousClass006.A00;
                    }
                    KK5.A03(kk52, itJ, itt, num4, num5, num, (Integer) this.A01, str3, str, ((IM8) this.A00).A0N, (Map) null, 256);
                }
                r1 = ((I6I) this.A02).A0D;
                IM8 im82 = (IM8) this.A00;
                im82.A0l = false;
                im8 = im82;
                break;
        }
        r1.A0G(im8);
    }
}
