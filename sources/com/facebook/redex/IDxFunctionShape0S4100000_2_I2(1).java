package com.facebook.redex;

import X.AnonymousClass6BW;
import X.AnonymousClass7f9;
import X.AnonymousClass7nG;
import X.AnonymousClass7nL;
import X.AnonymousClass7nO;
import X.C04220Ms;
import X.C113806sA;
import X.C116666xL;
import X.C116676xM;
import X.C116696xO;
import X.C126367f7;
import X.C126377f8;
import X.C128257jH;
import X.C128307jM;
import X.C128337jP;
import X.C1370385p;
import X.C142618fJ;
import X.C146418mD;
import X.C61953Wm;
import X.C67463zb;
import X.C86104wH;
import X.C86114wI;
import X.McB;
import com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor;
import java.lang.reflect.InvocationTargetException;

public class IDxFunctionShape0S4100000_2_I2 implements C142618fJ {
    public Object A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final int A05;

    public IDxFunctionShape0S4100000_2_I2(Object obj, String str, String str2, String str3, String str4, int i) {
        this.A05 = i;
        this.A00 = obj;
        this.A04 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C113806sA r11;
        C146418mD r2;
        FBPayIGGraphQLQueryExecutor fBPayIGGraphQLQueryExecutor;
        McB mcB;
        switch (this.A05) {
            case 0:
                r11 = (C113806sA) obj;
                ((C128257jH) this.A00).A00.getValue();
                String str = this.A04;
                String str2 = this.A01;
                String str3 = this.A02;
                String str4 = this.A03;
                try {
                    C126377f8 r22 = (C126377f8) C86104wH.A0p("create", C116666xL.class);
                    C67463zb r1 = r22.A00;
                    r1.A05("payout_record_id", str4);
                    r22.A04 = true;
                    r1.A05("fe_id", str2);
                    r22.A02 = true;
                    r1.A05(C61953Wm.A00(), str);
                    r22.A05 = true;
                    r1.A05("interface_type", "IG_ANDROID");
                    r22.A03 = true;
                    r1.A05("mma_id", str3);
                    r2 = r22.build();
                    C04220Ms.A06(r2);
                    fBPayIGGraphQLQueryExecutor = C1370385p.A00();
                    mcB = AnonymousClass7nG.A00;
                    break;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw C86114wI.A0k(e);
                }
            case 1:
                r11 = (C113806sA) obj;
                ((C128307jM) this.A00).A00.getValue();
                String str5 = this.A04;
                String str6 = this.A01;
                String str7 = this.A02;
                String str8 = this.A03;
                try {
                    AnonymousClass7f9 r23 = (AnonymousClass7f9) C86104wH.A0p("create", C116676xM.class);
                    C67463zb r12 = r23.A00;
                    r12.A05("payout_release_id", str8);
                    r23.A04 = true;
                    r12.A05("fe_id", str6);
                    r23.A02 = true;
                    r12.A05(C61953Wm.A00(), str5);
                    r23.A05 = true;
                    r12.A05("interface_type", "IG_ANDROID");
                    r23.A03 = true;
                    r12.A05("mma_id", str7);
                    r2 = r23.build();
                    C04220Ms.A06(r2);
                    fBPayIGGraphQLQueryExecutor = C1370385p.A00();
                    mcB = AnonymousClass7nL.A00;
                    break;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                    throw C86114wI.A0k(e2);
                }
            case 2:
                C113806sA r112 = (C113806sA) obj;
                ((C128337jP) this.A00).A00.getValue();
                String str9 = this.A03;
                String str10 = this.A01;
                String str11 = this.A02;
                String str12 = this.A04;
                try {
                    C126367f7 r3 = (C126367f7) C86104wH.A0p("create", C116696xO.class);
                    C67463zb r24 = r3.A00;
                    r24.A05("fe_id", str9);
                    r3.A02 = true;
                    r24.A05("interface_type", "IG_ANDROID");
                    r3.A03 = true;
                    r24.A05(C61953Wm.A00(), str12);
                    r3.A04 = true;
                    r24.A04("first", 25);
                    r24.A05("after", str10);
                    r24.A05("filter_type", str11);
                    C146418mD build = r3.build();
                    C04220Ms.A06(build);
                    return AnonymousClass6BW.A00(r112, C1370385p.A00(), build, AnonymousClass7nO.A00);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                    throw C86114wI.A0k(e3);
                }
            default:
                return null;
        }
        return AnonymousClass6BW.A00(r11, fBPayIGGraphQLQueryExecutor, r2, mcB);
    }
}
