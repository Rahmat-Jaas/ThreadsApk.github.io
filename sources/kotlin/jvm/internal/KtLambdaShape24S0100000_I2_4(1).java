package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape24S0100000_I2_4 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape24S0100000_I2_4(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0385, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c5, code lost:
        if (X.AnonymousClass0wJ.A1X(r1.A03.getValue()) != false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e4, code lost:
        r3 = r0.contains(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ec, code lost:
        return java.lang.Boolean.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0173, code lost:
        X.AnonymousClass0LU.A0C(r1, r0);
        r2 = ((X.C31372Gnk) r13.A00).A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017c, code lost:
        if (r2 == null) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017e, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0181, code lost:
        if (r2.isProxyMode == false) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0183, code lost:
        r2.isProxyMode = false;
        r2.proxyAddress = "";
        r2.socksProxyPort = 0;
        r2.httpProxyPort = 0;
        r2.clientAddress = "";
        r2.clientRegion = "";
        r1 = r2.observers.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x019c, code lost:
        if (r1.hasNext() == false) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019e, code lost:
        ((X.C145248kA) r1.next()).Bu2();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a8, code lost:
        monitor-exit(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r13 = this;
            int r0 = r13.A01
            switch(r0) {
                case 0: goto L_0x03b3;
                case 1: goto L_0x03a9;
                case 2: goto L_0x039f;
                case 3: goto L_0x0393;
                case 4: goto L_0x0389;
                case 5: goto L_0x0402;
                case 6: goto L_0x03fb;
                case 7: goto L_0x03f4;
                case 8: goto L_0x03ed;
                case 9: goto L_0x0386;
                case 10: goto L_0x037c;
                case 11: goto L_0x036d;
                case 12: goto L_0x035e;
                case 13: goto L_0x034e;
                case 14: goto L_0x0342;
                case 15: goto L_0x0324;
                case 16: goto L_0x031c;
                case 17: goto L_0x0315;
                case 18: goto L_0x02fb;
                case 19: goto L_0x02f1;
                case 20: goto L_0x02e7;
                case 21: goto L_0x02de;
                case 22: goto L_0x02cf;
                case 23: goto L_0x02cc;
                case 24: goto L_0x02c0;
                case 25: goto L_0x02b5;
                case 26: goto L_0x02ab;
                case 27: goto L_0x0269;
                case 28: goto L_0x0215;
                case 29: goto L_0x020b;
                case 30: goto L_0x0005;
                case 31: goto L_0x0005;
                case 32: goto L_0x0201;
                case 33: goto L_0x01ae;
                case 34: goto L_0x016f;
                case 35: goto L_0x016a;
                case 36: goto L_0x015f;
                case 37: goto L_0x0049;
                case 38: goto L_0x0155;
                case 39: goto L_0x0031;
                case 40: goto L_0x0148;
                case 41: goto L_0x0011;
                case 42: goto L_0x00fe;
                case 43: goto L_0x00ed;
                case 44: goto L_0x00c9;
                case 45: goto L_0x00aa;
                case 46: goto L_0x008e;
                case 47: goto L_0x0081;
                case 48: goto L_0x0071;
                case 49: goto L_0x005d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.A00
            X.7Ez r0 = (X.C121247Ez) r0
            X.3HX r3 = r0.A02()
            X.C04220Ms.A06(r3)
        L_0x0010:
            return r3
        L_0x0011:
            java.util.LinkedHashSet r3 = X.C86134wK.A0u()
            java.lang.Object r0 = r13.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2) r0
            java.lang.Object r0 = r0.A02
            java.util.Iterator r2 = X.C86154wM.A0q(r0)
        L_0x001f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r2.next()
            X.ILq r0 = (X.ILq) r0
            long r0 = r0.A02
            X.C86144wL.A1U(r3, r0)
            goto L_0x001f
        L_0x0031:
            java.lang.Object r0 = r13.A00
            X.75x r0 = (X.C1195675x) r0
            X.ITF r1 = r0.A00
            if (r1 != 0) goto L_0x0040
            java.lang.String r0 = "cask"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0040:
            r3 = 0
            r0 = 384226697(0x16e6d589, float:3.7293264E-25)
            java.io.File r3 = r1.AOC(r3, r0)     // Catch:{ Exception -> 0x0010 }
            return r3
        L_0x0049:
            java.lang.Object r0 = r13.A00
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r1 = r0.getApplicationContext()
            java.lang.String r0 = "bluetooth"
            java.lang.Object r3 = r1.getSystemService(r0)
            boolean r0 = r3 instanceof android.bluetooth.BluetoothManager
            if (r0 != 0) goto L_0x0010
            r3 = 0
            return r3
        L_0x005d:
            java.lang.Object r0 = r13.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            r3 = 0
            if (r1 == 0) goto L_0x00e8
            r0 = 528(0x210, float:7.4E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            boolean r3 = r1.getBoolean(r0, r3)
            goto L_0x00e8
        L_0x0071:
            java.lang.Object r0 = r13.A00
            X.I4m r0 = (X.C34152I4m) r0
            android.content.Context r1 = r0.getContext()
            X.C5T r0 = r0.A0B
            android.view.GestureDetector r3 = new android.view.GestureDetector
            r3.<init>(r1, r0)
            return r3
        L_0x0081:
            java.lang.Object r0 = r13.A00
            X.76v r0 = (X.C1197676v) r0
            java.util.Map r1 = r0.A01
            java.lang.String r0 = "unique_id"
            java.lang.Object r3 = r1.get(r0)
            return r3
        L_0x008e:
            java.lang.Object r0 = r13.A00
            X.76v r0 = (X.C1197676v) r0
            java.lang.String r2 = r0.A00
            r1 = 95
            r3 = 0
            boolean r0 = X.C04220Ms.A0B(r2, 0)
            if (r0 == 0) goto L_0x00e8
            int r0 = X.AnonymousClass8bP.A0F(r2, r1)
            int r0 = r0 + 1
            java.lang.String r1 = X.C86134wK.A0q(r2, r0)
            java.util.Set r0 = X.C1197676v.A09
            goto L_0x00e4
        L_0x00aa:
            java.lang.Object r1 = r13.A00
            X.76v r1 = (X.C1197676v) r1
            X.0Oa r0 = r1.A05
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 != 0) goto L_0x00c7
            X.0Oa r0 = r1.A03
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            r3 = 0
            if (r0 == 0) goto L_0x00e8
        L_0x00c7:
            r3 = 1
            goto L_0x00e8
        L_0x00c9:
            java.lang.Object r0 = r13.A00
            X.76v r0 = (X.C1197676v) r0
            java.lang.String r2 = r0.A00
            r1 = 95
            r3 = 0
            boolean r0 = X.C04220Ms.A0B(r2, 0)
            if (r0 == 0) goto L_0x00e8
            int r0 = X.AnonymousClass8bP.A0F(r2, r1)
            int r0 = r0 + 1
            java.lang.String r1 = X.C86134wK.A0q(r2, r0)
            java.util.Set r0 = X.C1197676v.A08
        L_0x00e4:
            boolean r3 = r0.contains(r1)
        L_0x00e8:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L_0x00ed:
            java.lang.Object r0 = r13.A00
            X.76v r0 = (X.C1197676v) r0
            java.lang.String r1 = r0.A00
            r0 = 35
            boolean r0 = X.C04220Ms.A0B(r1, 0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x00fe:
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            java.lang.Object r0 = r13.A00
            X.76v r0 = (X.C1197676v) r0
            java.lang.String r3 = r0.A00
            r0 = 1
            char[] r2 = new char[r0]
            r1 = 95
            r0 = 0
            r2[r0] = r1
            r4 = 0
            java.util.List r0 = X.AnonymousClass8bP.A0e(r3, r2, r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0119:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x013d
            java.lang.String r1 = X.C18180wK.A0k(r2)
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0119
            java.util.Set r0 = X.C1197676v.A09
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0119
            java.util.Set r0 = X.C1197676v.A08
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0119
            r6.add(r1)
            goto L_0x0119
        L_0x013d:
            java.lang.String r3 = "_"
            r8 = 62
            r5 = r4
            r7 = r4
            java.lang.String r3 = X.AnonymousClass00J.A0H(r3, r4, r5, r6, r7, r8)
            return r3
        L_0x0148:
            X.0on r0 = X.C10770iu.A00()
            X.C04220Ms.A06(r0)
            X.BEq r3 = new X.BEq
            r3.<init>(r0)
            return r3
        L_0x0155:
            java.lang.Object r0 = r13.A00
            X.M6F r0 = (X.M6F) r0
            X.I2L r3 = new X.I2L
            r3.<init>(r0)
            return r3
        L_0x015f:
            java.lang.Object r0 = r13.A00
            X.39U r0 = (X.AnonymousClass39U) r0
            X.0ZU r0 = r0.A02
            java.lang.Object r3 = r0.invoke()
            return r3
        L_0x016a:
            java.lang.String r1 = "proxy_service"
            java.lang.String r0 = "onExiting"
            goto L_0x0173
        L_0x016f:
            java.lang.String r1 = "proxy_service"
            java.lang.String r0 = "onConnecting"
        L_0x0173:
            X.AnonymousClass0LU.A0C(r1, r0)
            java.lang.Object r0 = r13.A00
            X.Gnk r0 = (X.C31372Gnk) r0
            com.facebook.proxyservice.observer.ProxyServiceBroadcaster r2 = r0.A05
            if (r2 == 0) goto L_0x0383
            monitor-enter(r2)
            boolean r0 = r2.isProxyMode     // Catch:{ all -> 0x01ab }
            if (r0 == 0) goto L_0x01a8
            r1 = 0
            r2.isProxyMode = r1     // Catch:{ all -> 0x01ab }
            java.lang.String r0 = ""
            r2.proxyAddress = r0     // Catch:{ all -> 0x01ab }
            r2.socksProxyPort = r1     // Catch:{ all -> 0x01ab }
            r2.httpProxyPort = r1     // Catch:{ all -> 0x01ab }
            r2.clientAddress = r0     // Catch:{ all -> 0x01ab }
            r2.clientRegion = r0     // Catch:{ all -> 0x01ab }
            java.util.List r0 = r2.observers     // Catch:{ all -> 0x01ab }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x01ab }
        L_0x0198:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01ab }
            if (r0 == 0) goto L_0x01a8
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x01ab }
            X.8kA r0 = (X.C145248kA) r0     // Catch:{ all -> 0x01ab }
            r0.Bu2()     // Catch:{ all -> 0x01ab }
            goto L_0x0198
        L_0x01a8:
            monitor-exit(r2)
            goto L_0x0383
        L_0x01ab:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01ae:
            java.lang.String r1 = "proxy_service"
            java.lang.String r0 = "onConnected"
            X.AnonymousClass0LU.A0C(r1, r0)
            java.lang.Object r1 = r13.A00
            X.Gnk r1 = (X.C31372Gnk) r1
            com.facebook.proxyservice.observer.ProxyServiceBroadcaster r6 = r1.A05
            if (r6 == 0) goto L_0x0383
            int r4 = r1.A00
            int r3 = r1.A01
            java.lang.String r2 = r1.A02
            java.lang.String r0 = ""
            if (r2 != 0) goto L_0x01c8
            r2 = r0
        L_0x01c8:
            java.lang.String r1 = r1.A03
            if (r1 != 0) goto L_0x01cd
            r1 = r0
        L_0x01cd:
            java.lang.String r0 = "localhost"
            monitor-enter(r6)
            r6.proxyAddress = r0     // Catch:{ all -> 0x01fe }
            r6.httpProxyPort = r4     // Catch:{ all -> 0x01fe }
            r6.socksProxyPort = r3     // Catch:{ all -> 0x01fe }
            r6.clientAddress = r2     // Catch:{ all -> 0x01fe }
            r6.clientRegion = r1     // Catch:{ all -> 0x01fe }
            r0 = 1
            r6.isProxyMode = r0     // Catch:{ all -> 0x01fe }
            java.util.List r0 = r6.observers     // Catch:{ all -> 0x01fe }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x01fe }
        L_0x01e3:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x01fb
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x01fe }
            X.8kA r4 = (X.C145248kA) r4     // Catch:{ all -> 0x01fe }
            java.lang.String r3 = r6.proxyAddress     // Catch:{ all -> 0x01fe }
            int r2 = r6.httpProxyPort     // Catch:{ all -> 0x01fe }
            int r1 = r6.socksProxyPort     // Catch:{ all -> 0x01fe }
            java.lang.String r0 = r6.clientAddress     // Catch:{ all -> 0x01fe }
            r4.Brj(r3, r2, r1, r0)     // Catch:{ all -> 0x01fe }
            goto L_0x01e3
        L_0x01fb:
            monitor-exit(r6)
            goto L_0x0383
        L_0x01fe:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0201:
            java.lang.Object r0 = r13.A00
            X.0i6 r0 = (X.C10300i6) r0
            X.49v r3 = new X.49v
            r3.<init>(r0)
            return r3
        L_0x020b:
            java.lang.Object r0 = r13.A00
            X.0i6 r0 = (X.C10300i6) r0
            X.7tM r3 = new X.7tM
            r3.<init>(r0)
            return r3
        L_0x0215:
            java.lang.Object r3 = r13.A00
            X.0i6 r3 = (X.C10300i6) r3
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36882335871009054(0x83084a0014011e, double:3.38787594584762E-306)
            java.lang.String r4 = X.C63803iN.A0C(r2, r3, r0)
            r0 = 36319385916937353(0x81084a000a1489, double:3.031864128075159E-306)
            boolean r7 = X.C63803iN.A0E(r2, r3, r0)
            r0 = 2342162395130762378(0x2081084a000c148a, double:4.0650651900026E-152)
            boolean r8 = X.C63803iN.A0E(r2, r3, r0)
            r0 = 2342162395131221133(0x2081084a0013148d, double:4.0650651903915855E-152)
            boolean r9 = X.C63803iN.A0E(r2, r3, r0)
            r0 = 2342162395130893451(0x2081084a000e148b, double:4.065065190113739E-152)
            boolean r10 = X.C63803iN.A0E(r2, r3, r0)
            r0 = 36882335870812444(0x83084a0011011c, double:3.387875945723283E-306)
            java.lang.String r5 = X.C63803iN.A0C(r2, r3, r0)
            r0 = 36882335870877981(0x83084a0012011d, double:3.387875945764729E-306)
            java.lang.String r6 = X.C63803iN.A0C(r2, r3, r0)
            r0 = 36319385917330572(0x81084a0010148c, double:3.031864128323832E-306)
            boolean r11 = X.C63803iN.A0E(r2, r3, r0)
            X.7gQ r3 = new X.7gQ
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r3
        L_0x0269:
            java.lang.Object r3 = r13.A00
            X.0i6 r3 = (X.C10300i6) r3
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36600860893056598(0x82084a00010e56, double:3.2098700363817244E-306)
            long r4 = X.C63803iN.A03(r2, r3, r0)
            r0 = 36600860893122135(0x82084a00020e57, double:3.20987003642317E-306)
            long r6 = X.C63803iN.A03(r2, r3, r0)
            r0 = 36600860893187672(0x82084a00030e58, double:3.209870036464616E-306)
            long r8 = X.C63803iN.A03(r2, r3, r0)
            r0 = 2342162395130303622(0x2081084a00051486, double:4.065065189613614E-152)
            boolean r10 = X.C63803iN.A0E(r2, r3, r0)
            r0 = 2342162395130369159(0x2081084a00061487, double:4.065065189669184E-152)
            boolean r11 = X.C63803iN.A0E(r2, r3, r0)
            r0 = 2342162395130434696(0x2081084a00071488, double:4.065065189724754E-152)
            boolean r12 = X.C63803iN.A0E(r2, r3, r0)
            X.7tn r3 = new X.7tn
            r3.<init>(r4, r6, r8, r10, r11, r12)
            return r3
        L_0x02ab:
            java.lang.Object r0 = r13.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.7tX r3 = new X.7tX
            r3.<init>(r0)
            return r3
        L_0x02b5:
            X.01V r0 = X.AnonymousClass01V.A0p
            X.C04220Ms.A06(r0)
            X.7ts r3 = new X.7ts
            r3.<init>(r0)
            return r3
        L_0x02c0:
            java.lang.Object r1 = r13.A00
            X.Hxy r1 = (X.C33975Hxy) r1
            X.GMK r0 = X.C33938HxM.A00
            r1.AYx(r0)
            X.01V r3 = X.AnonymousClass01V.A0p
            return r3
        L_0x02cc:
            X.01V r3 = X.AnonymousClass01V.A0p
            return r3
        L_0x02cf:
            java.lang.Object r1 = r13.A00
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            X.6cD r0 = new X.6cD
            r0.<init>(r1)
            X.7tg r3 = new X.7tg
            r3.<init>(r0, r1)
            return r3
        L_0x02de:
            java.lang.Object r0 = r13.A00
            X.8mW r0 = (X.C146608mW) r0
            X.8dt r3 = r0.Agq()
            return r3
        L_0x02e7:
            java.lang.Object r0 = r13.A00
            X.Gdg r0 = (X.C31022Gdg) r0
            X.6c9 r3 = new X.6c9
            r3.<init>(r0)
            return r3
        L_0x02f1:
            java.lang.Object r0 = r13.A00
            X.GHs r0 = (X.C30523GHs) r0
            X.6c8 r3 = new X.6c8
            r3.<init>(r0)
            return r3
        L_0x02fb:
            java.lang.Object r1 = r13.A00
            X.74p r1 = (X.C1193274p) r1
            X.M0S.A00()
            java.lang.Object r0 = r1.A00
            int r0 = X.AnonymousClass0wJ.A04(r0)
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.M0S.A00()
            r1.A00 = r0
            r3 = 0
            return r3
        L_0x0315:
            java.lang.Object r0 = r13.A00
            java.lang.Object r3 = X.C86144wL.A0j(r0)
            return r3
        L_0x031c:
            java.lang.Object r0 = r13.A00
            X.Acd r3 = new X.Acd
            r3.<init>(r0)
            return r3
        L_0x0324:
            java.lang.Object r0 = r13.A00
            X.39P r0 = (X.AnonymousClass39P) r0
            X.6qV r0 = r0.A00
            android.content.Context r2 = r0.A04
            X.C04220Ms.A06(r2)
            X.LqL r1 = X.LyB.A01
            android.content.res.Configuration r0 = X.C86114wI.A0B(r2)
            X.C04220Ms.A06(r0)
            X.LyB r0 = r1.A00(r0)
            X.AsR r3 = new X.AsR
            r3.<init>(r2, r0)
            return r3
        L_0x0342:
            java.lang.Object r0 = r13.A00
            java.lang.Object r0 = X.C86144wL.A0j(r0)
            X.74p r3 = new X.74p
            r3.<init>(r0)
            return r3
        L_0x034e:
            java.lang.String r1 = "onEvent: "
            java.lang.Object r0 = r13.A00
            X.LIj r0 = (X.LIj) r0
            java.lang.String r0 = r0.A00
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            X.C41228M0s.A01(r0)
            goto L_0x0383
        L_0x035e:
            java.lang.Object r1 = r13.A00
            kotlin.Function r1 = (kotlin.Function) r1
            X.6c6 r0 = new X.6c6
            r0.<init>(r1)
            X.86O r3 = new X.86O
            r3.<init>(r0)
            return r3
        L_0x036d:
            java.lang.Object r1 = r13.A00
            kotlin.Function r1 = (kotlin.Function) r1
            X.6c6 r0 = new X.6c6
            r0.<init>(r1)
            X.86D r3 = new X.86D
            r3.<init>(r0)
            return r3
        L_0x037c:
            java.lang.Object r0 = r13.A00
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.invalidateSelf()
        L_0x0383:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x0386:
            java.lang.Object r3 = r13.A00
            return r3
        L_0x0389:
            java.lang.Object r0 = r13.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.7tw r3 = new X.7tw
            r3.<init>(r0)
            return r3
        L_0x0393:
            java.lang.Object r0 = r13.A00
            X.7tm r0 = (X.C132367tm) r0
            com.instagram.service.session.UserSession r0 = r0.A01
            X.7eT r3 = new X.7eT
            r3.<init>(r0)
            return r3
        L_0x039f:
            java.lang.Object r0 = r13.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.7tm r3 = new X.7tm
            r3.<init>(r0)
            return r3
        L_0x03a9:
            java.lang.Object r0 = r13.A00
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.7eT r3 = new X.7eT
            r3.<init>(r0)
            return r3
        L_0x03b3:
            java.lang.Object r1 = r13.A00
            X.7tq r1 = (X.C132407tq) r1
            X.0Oa r0 = r1.A09
            java.lang.Object r8 = r0.getValue()
            X.8n5 r8 = (X.C146918n5) r8
            X.0Oa r0 = r1.A03
            java.lang.Object r5 = r0.getValue()
            X.7e7 r5 = (X.AnonymousClass7e7) r5
            X.0Oa r0 = r1.A02
            java.lang.Object r4 = r0.getValue()
            X.8k1 r4 = (X.C145188k1) r4
            X.0Oa r0 = r1.A08
            java.lang.Object r7 = r0.getValue()
            X.7Gq r7 = (X.C121547Gq) r7
            X.0Oa r0 = r1.A06
            java.lang.Object r10 = X.C18190wL.A0f(r0)
            X.4w7 r10 = (X.C86004w7) r10
            X.0Oa r0 = r1.A0B
            X.8nR r9 = X.C86154wM.A0K(r0)
            X.68S r6 = X.AnonymousClass68S.PREDICT
            X.7eD r3 = new X.7eD
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        L_0x03ed:
            java.lang.String r0 = "isShown"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x03f4:
            java.lang.String r0 = "getTag"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x03fb:
            java.lang.String r0 = "getValue"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x0402:
            java.lang.String r0 = "getValue"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape24S0100000_I2_4.invoke():java.lang.Object");
    }
}
