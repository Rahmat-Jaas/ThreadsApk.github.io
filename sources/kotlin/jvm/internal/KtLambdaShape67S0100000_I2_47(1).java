package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape67S0100000_I2_47 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape67S0100000_I2_47(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b4, code lost:
        r5.A03 = r0;
        r5.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0130, code lost:
        r1.CrC(java.lang.Boolean.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0139, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01f0, code lost:
        r1 = ((X.C19577Ayd) r0.getValue()).A08();
        r0 = com.instagram.barcelona.R.id.social_proof_text;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0201, code lost:
        return r1.findViewById(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0225, code lost:
        return ((X.C19577Ayd) r0.getValue()).A08().findViewById(com.instagram.barcelona.R.id.bottom_legibility_gradient);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x024d, code lost:
        return ((X.C19577Ayd) r0.getValue()).A08().findViewById(com.instagram.barcelona.R.id.reshare_button);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r15 = this;
            int r0 = r15.A01
            switch(r0) {
                case 0: goto L_0x0232;
                case 1: goto L_0x0226;
                case 2: goto L_0x020e;
                case 3: goto L_0x0202;
                case 4: goto L_0x01ea;
                case 5: goto L_0x01cf;
                case 6: goto L_0x01c3;
                case 7: goto L_0x01a8;
                case 8: goto L_0x0198;
                case 9: goto L_0x0226;
                case 10: goto L_0x0191;
                case 11: goto L_0x0202;
                case 12: goto L_0x018a;
                case 13: goto L_0x017a;
                case 14: goto L_0x0177;
                case 15: goto L_0x016e;
                case 16: goto L_0x0165;
                case 17: goto L_0x014a;
                case 18: goto L_0x0155;
                case 19: goto L_0x0177;
                case 20: goto L_0x016e;
                case 21: goto L_0x0165;
                case 22: goto L_0x014a;
                case 23: goto L_0x013a;
                case 24: goto L_0x012b;
                case 25: goto L_0x0125;
                case 26: goto L_0x011f;
                case 27: goto L_0x010b;
                case 28: goto L_0x00e7;
                case 29: goto L_0x00de;
                case 30: goto L_0x00ba;
                case 31: goto L_0x0093;
                case 32: goto L_0x007b;
                case 33: goto L_0x0005;
                case 34: goto L_0x0067;
                case 35: goto L_0x0005;
                case 36: goto L_0x0053;
                case 37: goto L_0x0005;
                case 38: goto L_0x0048;
                case 39: goto L_0x0005;
                case 40: goto L_0x0034;
                case 41: goto L_0x0005;
                case 42: goto L_0x0048;
                case 43: goto L_0x0005;
                case 44: goto L_0x0020;
                case 45: goto L_0x0177;
                case 46: goto L_0x016e;
                case 47: goto L_0x0165;
                case 48: goto L_0x000c;
                case 49: goto L_0x0177;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A00
            X.06B r2 = X.C18230wP.A0K(r0)
            return r2
        L_0x000c:
            java.lang.Object r2 = r15.A00
            X.1aM r2 = (X.AnonymousClass1aM) r2
            X.0Oa r0 = r2.A03
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r0)
            android.app.Application r0 = X.C18190wL.A09(r2)
            X.3xR r2 = new X.3xR
            r2.<init>(r0, r1)
            return r2
        L_0x0020:
            java.lang.Object r2 = r15.A00
            X.5xK r2 = (X.AnonymousClass5xK) r2
            X.0Oa r0 = r2.A02
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r0)
            android.app.Application r0 = X.C18190wL.A09(r2)
            X.3xO r2 = new X.3xO
            r2.<init>(r0, r1)
            return r2
        L_0x0034:
            java.lang.Object r2 = r15.A00
            X.1YL r2 = (X.AnonymousClass1YL) r2
            X.0Oa r0 = r2.A01
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r0)
            android.app.Application r0 = X.C18190wL.A09(r2)
            X.3xQ r2 = new X.3xQ
            r2.<init>(r0, r1)
            return r2
        L_0x0048:
            java.lang.Object r0 = r15.A00
            androidx.fragment.app.FragmentActivity r0 = X.C18240wQ.A0I(r0)
            X.8nS r2 = r0.getDefaultViewModelProviderFactory()
            return r2
        L_0x0053:
            java.lang.Object r2 = r15.A00
            X.1Zk r2 = (X.C22771Zk) r2
            X.0Oa r0 = r2.A07
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r0)
            android.app.Application r0 = X.C18190wL.A09(r2)
            X.3xP r2 = new X.3xP
            r2.<init>(r0, r1)
            return r2
        L_0x0067:
            java.lang.Object r2 = r15.A00
            X.1Zl r2 = (X.C22781Zl) r2
            X.0Oa r0 = r2.A02
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r0)
            android.app.Application r0 = X.C18190wL.A09(r2)
            X.3xO r2 = new X.3xO
            r2.<init>(r0, r1)
            return r2
        L_0x007b:
            java.lang.Object r0 = r15.A00
            X.1Zl r0 = (X.C22781Zl) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0Oa r0 = r0.A02
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.Drz r5 = X.C18180wK.A0Q(r1, r0)
            X.5xK r0 = new X.5xK
            r0.<init>()
            goto L_0x00b4
        L_0x0093:
            java.lang.Object r0 = r15.A00
            X.1Zl r0 = (X.C22781Zl) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0Oa r0 = r0.A02
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.Drz r5 = X.C18180wK.A0Q(r1, r0)
            X.DnJ r0 = X.C25529DnJ.A02
            r0.A01()
            java.lang.String r4 = "EVENT"
            r3 = 0
            r1 = -1
            r0 = 1
            X.CRf r0 = X.C22266CRf.A00(r3, r4, r1, r0)
        L_0x00b4:
            r5.A03 = r0
            r5.A05()
            goto L_0x0137
        L_0x00ba:
            java.lang.Object r0 = r15.A00
            X.1Zl r0 = (X.C22781Zl) r0
            X.4tU r4 = r0.A01
            if (r4 != 0) goto L_0x00c9
            java.lang.String r0 = "captureFlowHelper"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x00c9:
            X.FeI r3 = X.C28923FeI.PROFILE_PHOTO
            X.DsX r2 = new X.DsX
            r2.<init>(r3)
            r0 = 0
            r2.A05 = r0
            com.instagram.model.creation.MediaCaptureConfig r1 = new com.instagram.model.creation.MediaCaptureConfig
            r1.<init>((X.C25818DsX) r2)
            X.9vX r0 = X.C170769vX.EVENT_CREATION
            r4.Cvr(r0, r1, r3)
            goto L_0x0137
        L_0x00de:
            java.lang.Object r1 = r15.A00
            X.10I r1 = (X.AnonymousClass10I) r1
            r0 = 0
            r1.A00(r0)
            goto L_0x0137
        L_0x00e7:
            java.lang.Object r0 = r15.A00
            X.10I r0 = (X.AnonymousClass10I) r0
            X.4wE r2 = r0.A04
        L_0x00ed:
            java.lang.Object r1 = r2.getValue()
            r6 = r1
            X.17S r6 = (X.AnonymousClass17S) r6
            r3 = 0
            r13 = 0
            r12 = 895(0x37f, float:1.254E-42)
            r4 = r3
            r5 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r10 = r3
            r11 = r3
            r14 = r13
            X.17S r0 = X.AnonymousClass17S.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x00ed
            goto L_0x0137
        L_0x010b:
            java.lang.Object r1 = r15.A00
            X.3ak r1 = (X.C62793ak) r1
            X.4qz r3 = X.AnonymousClass3J5.A00(r1)
            r2 = 0
            r0 = 15
            kotlin.coroutines.jvm.internal.KtSLambdaShape10S0101000_I2_7 r1 = X.C18240wQ.A0n(r1, r2, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
            goto L_0x0137
        L_0x011f:
            java.lang.Object r1 = r15.A00
            X.8pE r1 = (X.C147368pE) r1
            r0 = 1
            goto L_0x0130
        L_0x0125:
            java.lang.Object r0 = r15.A00
            X.C18240wQ.A1G(r0)
            goto L_0x0137
        L_0x012b:
            java.lang.Object r1 = r15.A00
            X.8pE r1 = (X.C147368pE) r1
            r0 = 0
        L_0x0130:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.CrC(r0)
        L_0x0137:
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x013a:
            java.lang.Object r0 = r15.A00
            X.1xg r0 = (X.C29281xg) r0
            X.0Oa r0 = r0.A03
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.3ww r2 = new X.3ww
            r2.<init>(r0)
            return r2
        L_0x014a:
            X.0RG r1 = X.AnonymousClass0RA.A0C
            java.lang.Object r0 = r15.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            com.instagram.service.session.UserSession r2 = X.C18180wK.A0W(r0, r1)
            return r2
        L_0x0155:
            java.lang.Object r0 = r15.A00
            X.1dH r0 = (X.AnonymousClass1dH) r0
            X.0Oa r0 = r0.A05
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.3wx r2 = new X.3wx
            r2.<init>(r0)
            return r2
        L_0x0165:
            java.lang.Object r0 = r15.A00
            X.0Oa r0 = (X.C04530Oa) r0
            X.06B r2 = X.C18180wK.A0H(r0)
            return r2
        L_0x016e:
            java.lang.Object r0 = r15.A00
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
            java.lang.Object r2 = r0.invoke()
            return r2
        L_0x0177:
            java.lang.Object r2 = r15.A00
            return r2
        L_0x017a:
            java.lang.Object r0 = r15.A00
            X.1dH r0 = (X.AnonymousClass1dH) r0
            X.0Oa r0 = r0.A05
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.3Ue r2 = new X.3Ue
            r2.<init>(r0)
            return r2
        L_0x018a:
            java.lang.Object r0 = r15.A00
            X.13x r0 = (X.C202713x) r0
            X.0Oa r0 = r0.A03
            goto L_0x01f0
        L_0x0191:
            java.lang.Object r0 = r15.A00
            X.13x r0 = (X.C202713x) r0
            X.0Oa r0 = r0.A03
            goto L_0x0214
        L_0x0198:
            java.lang.Object r1 = r15.A00
            X.13x r1 = (X.C202713x) r1
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x01a4
            X.0Oa r0 = r1.A01
            goto L_0x023c
        L_0x01a4:
            X.0Oa r0 = r1.A02
            goto L_0x023c
        L_0x01a8:
            java.lang.Object r1 = r15.A00
            X.13x r1 = (X.C202713x) r1
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x01c0
            X.0Oa r0 = r1.A01
        L_0x01b2:
            java.lang.Object r0 = r0.getValue()
            X.Ayd r0 = (X.C19577Ayd) r0
            android.view.View r1 = r0.A08()
            r0 = 2131296512(0x7f090100, float:1.8210943E38)
            goto L_0x01fd
        L_0x01c0:
            X.0Oa r0 = r1.A02
            goto L_0x01b2
        L_0x01c3:
            java.lang.Object r1 = r15.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 2131302580(0x7f0918b4, float:1.822325E38)
            X.Ayd r2 = X.C18190wL.A0T(r1, r0)
            return r2
        L_0x01cf:
            java.lang.Object r1 = r15.A00
            X.13x r1 = (X.C202713x) r1
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x01e7
            X.0Oa r0 = r1.A01
        L_0x01d9:
            java.lang.Object r0 = r0.getValue()
            X.Ayd r0 = (X.C19577Ayd) r0
            android.view.View r1 = r0.A08()
            r0 = 2131296483(0x7f0900e3, float:1.8210884E38)
            goto L_0x01fd
        L_0x01e7:
            X.0Oa r0 = r1.A02
            goto L_0x01d9
        L_0x01ea:
            java.lang.Object r0 = r15.A00
            X.CHD r0 = (X.CHD) r0
            X.0Oa r0 = r0.A0A
        L_0x01f0:
            java.lang.Object r0 = r0.getValue()
            X.Ayd r0 = (X.C19577Ayd) r0
            android.view.View r1 = r0.A08()
            r0 = 2131307283(0x7f092b13, float:1.8232789E38)
        L_0x01fd:
            android.view.View r2 = r1.findViewById(r0)
            return r2
        L_0x0202:
            java.lang.Object r1 = r15.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 2131307282(0x7f092b12, float:1.8232787E38)
            X.Ayd r2 = X.C18190wL.A0T(r1, r0)
            return r2
        L_0x020e:
            java.lang.Object r0 = r15.A00
            X.CHD r0 = (X.CHD) r0
            X.0Oa r0 = r0.A0A
        L_0x0214:
            java.lang.Object r0 = r0.getValue()
            X.Ayd r0 = (X.C19577Ayd) r0
            android.view.View r1 = r0.A08()
            r0 = 2131297609(0x7f090549, float:1.8213168E38)
            android.view.View r2 = r1.findViewById(r0)
            return r2
        L_0x0226:
            java.lang.Object r1 = r15.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 2131306513(0x7f092811, float:1.8231227E38)
            X.Ayd r2 = X.C18190wL.A0T(r1, r0)
            return r2
        L_0x0232:
            java.lang.Object r1 = r15.A00
            X.CHD r1 = (X.CHD) r1
            boolean r0 = r1.A0D
            if (r0 == 0) goto L_0x024e
            X.0Oa r0 = r1.A08
        L_0x023c:
            java.lang.Object r0 = r0.getValue()
            X.Ayd r0 = (X.C19577Ayd) r0
            android.view.View r1 = r0.A08()
            r0 = 2131305851(0x7f09257b, float:1.8229885E38)
            android.view.View r2 = r1.findViewById(r0)
            return r2
        L_0x024e:
            X.0Oa r0 = r1.A09
            goto L_0x023c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape67S0100000_I2_47.invoke():java.lang.Object");
    }
}
