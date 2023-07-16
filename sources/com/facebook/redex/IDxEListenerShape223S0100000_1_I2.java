package com.facebook.redex;

import X.C23391dj;
import X.C82394pY;
import com.instagram.creation.fragment.FollowersShareFragment;
import com.instagram.profile.fragment.UserDetailFragment;

public class IDxEListenerShape223S0100000_1_I2 implements C82394pY {
    public Object A00;
    public final int A01;

    public IDxEListenerShape223S0100000_1_I2(C23391dj r1, int i) {
        this.A01 = i;
        if (29 - i != 0) {
            this.A00 = r1;
        } else {
            this.A00 = r1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0812, code lost:
        if (X.C63803iN.A0E(X.AnonymousClass0TJ.A05, r7.A04, 36321387371043577L) != false) goto L_0x0814;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x11e7, code lost:
        X.C14030oh.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x11ea, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x1308, code lost:
        X.C04220Ms.A0E("quietModeToggle");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x130e, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x132f, code lost:
        X.C04220Ms.A0E(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x1333, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x1371, code lost:
        X.C14030oh.A0A(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x1374, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
        X.C14030oh.A0A(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x087d  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0899  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.A01
            switch(r0) {
                case 0: goto L_0x12aa;
                case 1: goto L_0x12cc;
                case 2: goto L_0x0db2;
                case 3: goto L_0x1353;
                case 4: goto L_0x11eb;
                case 5: goto L_0x0df6;
                case 6: goto L_0x11be;
                case 7: goto L_0x11a5;
                case 8: goto L_0x0d7a;
                case 9: goto L_0x0d44;
                case 10: goto L_0x1178;
                case 11: goto L_0x1155;
                case 12: goto L_0x1131;
                case 13: goto L_0x1107;
                case 14: goto L_0x0d05;
                case 15: goto L_0x10dd;
                case 16: goto L_0x10af;
                case 17: goto L_0x1079;
                case 18: goto L_0x104f;
                case 19: goto L_0x0cdb;
                case 20: goto L_0x100c;
                case 21: goto L_0x0fe8;
                case 22: goto L_0x1291;
                case 23: goto L_0x0c8b;
                case 24: goto L_0x0fd4;
                case 25: goto L_0x0c60;
                case 26: goto L_0x0c38;
                case 27: goto L_0x0c10;
                case 28: goto L_0x0bc0;
                case 29: goto L_0x0fbc;
                case 30: goto L_0x0b45;
                case 31: goto L_0x0b19;
                case 32: goto L_0x0fb0;
                case 33: goto L_0x0a0d;
                case 34: goto L_0x09dd;
                case 35: goto L_0x09ad;
                case 36: goto L_0x098d;
                case 37: goto L_0x093f;
                case 38: goto L_0x0917;
                case 39: goto L_0x08fe;
                case 40: goto L_0x08e5;
                case 41: goto L_0x08af;
                case 42: goto L_0x07a0;
                case 43: goto L_0x074e;
                case 44: goto L_0x06e1;
                case 45: goto L_0x06bc;
                case 46: goto L_0x06a3;
                case 47: goto L_0x068a;
                case 48: goto L_0x0647;
                case 49: goto L_0x061b;
                case 50: goto L_0x05ef;
                case 51: goto L_0x05c8;
                case 52: goto L_0x0558;
                case 53: goto L_0x0514;
                case 54: goto L_0x04ca;
                case 55: goto L_0x0499;
                case 56: goto L_0x0473;
                case 57: goto L_0x044d;
                case 58: goto L_0x0427;
                case 59: goto L_0x03b3;
                case 60: goto L_0x039a;
                case 61: goto L_0x0f80;
                case 62: goto L_0x0f33;
                case 63: goto L_0x1280;
                case 64: goto L_0x126d;
                case 65: goto L_0x125a;
                case 66: goto L_0x1247;
                case 67: goto L_0x1234;
                case 68: goto L_0x0376;
                case 69: goto L_0x1221;
                case 70: goto L_0x0344;
                case 71: goto L_0x0324;
                case 72: goto L_0x0efd;
                case 73: goto L_0x0304;
                case 74: goto L_0x02e0;
                case 75: goto L_0x02bc;
                case 76: goto L_0x0eca;
                case 77: goto L_0x0e9e;
                case 78: goto L_0x0268;
                case 79: goto L_0x0232;
                case 80: goto L_0x0207;
                case 81: goto L_0x01e7;
                case 82: goto L_0x01c7;
                case 83: goto L_0x01a7;
                case 84: goto L_0x0185;
                case 85: goto L_0x00da;
                case 86: goto L_0x0e16;
                case 87: goto L_0x0134;
                case 88: goto L_0x1317;
                case 89: goto L_0x0033;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = -234202067(0xfffffffff20a5c2d, float:-2.7405034E30)
            int r1 = X.C14030oh.A03(r0)
            r0 = 263572790(0xfb5cd36, float:1.7927022E-29)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r14.A00
            X.1ae r2 = (X.AnonymousClass1ae) r2
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            X.C63813iO.A08(r0)
            com.instagram.igds.components.switchbutton.IgSwitch r2 = r2.A0C
            if (r2 == 0) goto L_0x1308
            r0 = 1
            r2.setChecked(r0)
            r0 = 823208213(0x31112915, float:2.112363E-9)
            X.C14030oh.A0A(r0, r3)
            r0 = 737447156(0x2bf48cf4, float:1.7376365E-12)
        L_0x002f:
            X.C14030oh.A0A(r0, r1)
            return
        L_0x0033:
            r0 = 374215048(0x164e1188, float:1.6646079E-25)
            int r1 = X.C14030oh.A03(r0)
            r0 = 656715012(0x2724ad04, float:2.2853364E-15)
            int r8 = X.C14030oh.A03(r0)
            java.lang.Object r10 = r14.A00
            X.1ae r10 = (X.AnonymousClass1ae) r10
            com.instagram.igds.components.switchbutton.IgSwitch r0 = r10.A0C
            if (r0 == 0) goto L_0x1308
            r9 = 1
            r0.setChecked(r9)
            X.0Ok r2 = X.C06810aP.A01
            X.0Oa r12 = r10.A0I
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r12)
            r2.A01(r0)
            r0 = 1056964608(0x3f000000, float:0.5)
            X.AnonymousClass1ae.A06(r10, r0)
            X.AnonymousClass1ae.A05(r10)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r12)
            X.C63823iP.A0A(r0)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r12)
            com.instagram.user.model.User r11 = r2.A01(r0)
            long r2 = java.lang.System.currentTimeMillis()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r6
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r12)
            long r4 = X.C63823iP.A02(r0, r2)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r12)
            boolean r0 = X.C63823iP.A0G(r0, r11, r2)
            if (r0 == 0) goto L_0x00d4
            long r6 = r6 * r4
        L_0x0089:
            java.util.Date r11 = new java.util.Date
            r11.<init>(r6)
            X.3iD r3 = X.C63733iD.A01()
            android.content.res.Resources r6 = X.AnonymousClass0wJ.A0B(r10)
            r2 = 2131833963(0x7f11346b, float:1.9301023E38)
            android.content.Context r0 = r10.requireContext()
            java.text.SimpleDateFormat r0 = X.C63823iP.A09(r0, r4)
            java.lang.String r0 = r0.format(r11)
            java.lang.String r0 = X.C18190wL.A0h(r6, r0, r2)
            r3.A0A = r0
            r3.A0I = r9
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r10)
            r0 = 2131833960(0x7f113468, float:1.9301017E38)
            java.lang.String r0 = X.C18190wL.A0g(r2, r0)
            r3.A0D = r0
            X.4D5 r0 = new X.4D5
            r0.<init>()
            r3.A07 = r0
            r3.A0C()
            X.KHr r0 = X.C38040KHr.A01
            X.C63733iD.A09(r0, r3)
            r0 = -2113601351(0xffffffff820500b9, float:-9.771504E-38)
            X.C14030oh.A0A(r0, r8)
            r0 = 1538129477(0x5badfe45, float:9.7949487E16)
            goto L_0x002f
        L_0x00d4:
            r2 = 86400(0x15180, double:4.26873E-319)
            long r2 = r2 + r4
            long r6 = r6 * r2
            goto L_0x0089
        L_0x00da:
            r0 = 1487330034(0x58a6daf2, float:1.46767435E15)
            int r1 = X.C14030oh.A03(r0)
            r0 = -1721577921(0xffffffff9962ce3f, float:-1.1725577E-23)
            int r6 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.CUH r0 = (X.CUH) r0
            com.instagram.service.session.UserSession r7 = r0.A04
            int r2 = X.C62953bC.A00(r7)
            r5 = 0
            X.C04220Ms.A0B(r7, r5)
            X.49q r0 = X.AnonymousClass3Zs.A03(r7)
            X.D2R r4 = X.D2R.A0v
            android.content.SharedPreferences r0 = r0.A01(r4)
            java.lang.String r3 = "invite_suggestions_last_viewed_count"
            int r0 = r0.getInt(r3, r5)
            if (r2 <= r0) goto L_0x012a
            int r2 = X.C62953bC.A00(r7)
            X.49q r0 = X.AnonymousClass3Zs.A03(r7)
            android.content.SharedPreferences r0 = r0.A01(r4)
            int r0 = r0.getInt(r3, r5)
            int r2 = r2 - r0
            if (r2 <= 0) goto L_0x012a
            r0 = 99
            if (r2 <= r0) goto L_0x012a
        L_0x011f:
            r0 = 415432008(0x18c2fd48, float:5.0403573E-24)
            X.C14030oh.A0A(r0, r6)
            r0 = 1262574147(0x4b415a43, float:1.2671555E7)
            goto L_0x002f
        L_0x012a:
            int r0 = X.C62953bC.A00(r7)
            if (r0 <= 0) goto L_0x011f
            X.C62953bC.A00(r7)
            goto L_0x011f
        L_0x0134:
            r0 = -919383172(0xffffffffc933537c, float:-734519.75)
            int r1 = X.C14030oh.A03(r0)
            r0 = 471505104(0x1c1a98d0, float:5.115183E-22)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r14.A00
            X.1ae r4 = (X.AnonymousClass1ae) r4
            r0 = 0
            X.AnonymousClass1ae.A08(r4, r0)
            X.3iD r3 = X.C63733iD.A01()
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r4)
            r0 = 2131833959(0x7f113467, float:1.9301015E38)
            java.lang.String r0 = r2.getString(r0)
            r3.A0A = r0
            r0 = 1
            r3.A0I = r0
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r4)
            r0 = 2131833960(0x7f113468, float:1.9301017E38)
            java.lang.String r0 = X.C18190wL.A0g(r2, r0)
            r3.A0D = r0
            X.4D5 r0 = new X.4D5
            r0.<init>()
            r3.A07 = r0
            r3.A0C()
            X.KHr r0 = X.C38040KHr.A01
            X.C63733iD.A09(r0, r3)
            r0 = -149235104(0xfffffffff71ada60, float:-3.1407925E33)
            X.C14030oh.A0A(r0, r5)
            r0 = 557050090(0x2133e8ea, float:6.095582E-19)
            goto L_0x002f
        L_0x0185:
            r0 = -528464227(0xffffffffe080469d, float:-7.394598E19)
            int r1 = X.C14030oh.A03(r0)
            r0 = -1073574583(0xffffffffc0028d49, float:-2.0398734)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.CUH r0 = (X.CUH) r0
            X.CW6 r0 = r0.A09
            r0.A09()
            r0 = 1069935700(0x3fc5ec54, float:1.5462747)
            X.C14030oh.A0A(r0, r2)
            r0 = -771660952(0xffffffffd2016368, float:-1.38929635E11)
            goto L_0x002f
        L_0x01a7:
            r0 = 900786204(0x35b0e81c, float:1.3180575E-6)
            int r1 = X.C14030oh.A03(r0)
            r0 = 920389247(0x36dc067f, float:6.557267E-6)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.1jp r0 = (X.C24681jp) r0
            r0.A00()
            r0 = -764083493(0xffffffffd27502db, float:-2.63078724E11)
            X.C14030oh.A0A(r0, r2)
            r0 = -654350468(0xffffffffd8ff677c, float:-2.24655942E15)
            goto L_0x002f
        L_0x01c7:
            r0 = 1315957704(0x4e6febc8, float:1.0063017E9)
            int r1 = X.C14030oh.A03(r0)
            r0 = -1379259926(0xffffffffadca29ea, float:-2.2983355E-11)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.1jp r0 = (X.C24681jp) r0
            r0.A00()
            r0 = -251940315(0xfffffffff0fbb225, float:-6.231688E29)
            X.C14030oh.A0A(r0, r2)
            r0 = 1200497883(0x478e24db, float:72777.71)
            goto L_0x002f
        L_0x01e7:
            r0 = -175363389(0xfffffffff58c2ac3, float:-3.5536566E32)
            int r1 = X.C14030oh.A03(r0)
            r0 = -1650335485(0xffffffff9da1e103, float:-4.2849E-21)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.1jp r0 = (X.C24681jp) r0
            r0.A00()
            r0 = -1290292427(0xffffffffb317b335, float:-3.5320415E-8)
            X.C14030oh.A0A(r0, r2)
            r0 = -188579151(0xfffffffff4c282b1, float:-1.2328568E32)
            goto L_0x002f
        L_0x0207:
            r0 = 454803372(0x1b1bbfac, float:1.2883232E-22)
            int r1 = X.C14030oh.A03(r0)
            r0 = -1113183059(0xffffffffbda62cad, float:-0.0811399)
            int r4 = X.C14030oh.A03(r0)
            X.05L r3 = X.C18230wP.A0O()
            java.lang.Object r2 = r14.A00
            com.instagram.urlhandlers.directgroupinvite.DirectGroupInviteHandlerActivity r2 = (com.instagram.urlhandlers.directgroupinvite.DirectGroupInviteHandlerActivity) r2
            android.content.Intent r0 = r2.getIntent()
            r3.A09(r2, r0)
            r2.finish()
            r0 = -2140286243(0xffffffff806dd2dd, float:-1.0085713E-38)
            X.C14030oh.A0A(r0, r4)
            r0 = -427811871(0xffffffffe6801be1, float:-3.024886E23)
            goto L_0x002f
        L_0x0232:
            r0 = 404716627(0x181f7c53, float:2.0613036E-24)
            int r1 = X.C14030oh.A03(r0)
            X.BBE r15 = (X.BBE) r15
            r0 = -1193734724(0xffffffffb8d90dbc, float:-1.03499246E-4)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r14.A00
            X.4Nt r2 = (X.C72364Nt) r2
            android.widget.ImageView r0 = r2.A00
            if (r0 == 0) goto L_0x0264
            X.39j r0 = r2.A01
            if (r0 == 0) goto L_0x0264
            int r0 = r15.A00
            if (r0 <= 0) goto L_0x0259
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C72364Nt.A00(r2, r0)
        L_0x0259:
            r0 = -2133491297(0xffffffff80d5819f, float:-1.960746E-38)
        L_0x025c:
            X.C14030oh.A0A(r0, r3)
            r0 = 1587185550(0x5e9a878e, float:5.5675124E18)
            goto L_0x002f
        L_0x0264:
            r0 = 771486045(0x2dfbf15d, float:2.8642583E-11)
            goto L_0x025c
        L_0x0268:
            r0 = 1342679229(0x5007a8bd, float:9.1039304E9)
            int r1 = X.C14030oh.A03(r0)
            X.46O r15 = (X.AnonymousClass46O) r15
            r0 = 1793149002(0x6ae1484a, float:1.3617484E26)
            int r6 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r7 = r14.A00
            X.49h r7 = (X.C696149h) r7
            boolean r2 = r15.A00
            if (r2 == 0) goto L_0x02a7
            com.instagram.service.session.UserSession r2 = r7.A08
            boolean r0 = X.C63803iN.A0F(r2)
            if (r0 == 0) goto L_0x02a3
            X.49c r5 = X.C49222r2.A00(r2)
            java.lang.String r4 = "upsell"
            r3 = 0
            r2 = 2
            com.facebook.redex.IDxListenerShape830S0100000_1_I2 r0 = new com.facebook.redex.IDxListenerShape830S0100000_1_I2
            r0.<init>(r7, r2)
            r5.A04(r0, r4, r3)
        L_0x0298:
            r0 = 1119005810(0x42b2ac72, float:89.33681)
            X.C14030oh.A0A(r0, r6)
            r0 = -1289577719(0xffffffffb3229b09, float:-3.7859568E-8)
            goto L_0x002f
        L_0x02a3:
            X.C696149h.A01(r7)
            goto L_0x0298
        L_0x02a7:
            X.3Et r0 = r7.A00
            if (r0 == 0) goto L_0x02ae
            r0.A00(r2)
        L_0x02ae:
            com.instagram.service.session.UserSession r0 = r7.A08
            X.KHq r3 = X.AnonymousClass3LY.A00(r0)
            java.lang.Class<X.46O> r2 = X.AnonymousClass46O.class
            X.4pY r0 = r7.A07
            r3.A02(r0, r2)
            goto L_0x0298
        L_0x02bc:
            r0 = 1430081695(0x553d509f, float:1.30096227E13)
            int r1 = X.C14030oh.A03(r0)
            r0 = -111434656(0xfffffffff95ba460, float:-7.1277933E34)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r14.A00
            X.1x1 r2 = (X.AnonymousClass1x1) r2
            java.util.List r0 = X.AnonymousClass1x1.A0C(r2)
            r2.setItems(r0)
            r0 = 817486586(0x30b9dafa, float:1.3522758E-9)
            X.C14030oh.A0A(r0, r3)
            r0 = 1817894136(0x6c5adcf8, float:1.0583573E27)
            goto L_0x002f
        L_0x02e0:
            r0 = -2060800842(0xffffffff852aacb6, float:-8.0250836E-36)
            int r1 = X.C14030oh.A03(r0)
            r0 = -1186850412(0xffffffffb9421994, float:-1.851081E-4)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r14.A00
            X.1x1 r2 = (X.AnonymousClass1x1) r2
            java.util.List r0 = X.AnonymousClass1x1.A0C(r2)
            r2.setItems(r0)
            r0 = -1058825738(0xffffffffc0e399f6, float:-7.112544)
            X.C14030oh.A0A(r0, r3)
            r0 = 1405688155(0x53c9195b, float:1.72742764E12)
            goto L_0x002f
        L_0x0304:
            r0 = -2008305962(0xffffffff884baed6, float:-6.129361E-34)
            int r1 = X.C14030oh.A03(r0)
            r0 = -1120919261(0xffffffffbd302123, float:-0.04300035)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.1x2 r0 = (X.AnonymousClass1x2) r0
            X.AnonymousClass1x2.A0D(r0)
            r0 = -1384145675(0xffffffffad7f9cf5, float:-1.4529923E-11)
            X.C14030oh.A0A(r0, r2)
            r0 = 1801530609(0x6b612cf1, float:2.7222054E26)
            goto L_0x002f
        L_0x0324:
            r0 = -921022656(0xffffffffc91a4f40, float:-632052.0)
            int r1 = X.C14030oh.A03(r0)
            r0 = -1150527068(0xffffffffbb6c59a4, float:-0.0036064172)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.1xU r0 = (X.C29201xU) r0
            X.C29201xU.A0B(r0)
            r0 = -1244071500(0xffffffffb5d8f9b4, float:-1.6165927E-6)
            X.C14030oh.A0A(r0, r2)
            r0 = -595309449(0xffffffffdc844c77, float:-2.97910167E17)
            goto L_0x002f
        L_0x0344:
            r0 = 809092374(0x3039c516, float:6.7582684E-10)
            int r1 = X.C14030oh.A03(r0)
            r0 = -1659664340(0xffffffff9d13882c, float:-1.9525687E-21)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.3Vj r0 = (X.C61783Vj) r0
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r0.A03
            java.lang.String r4 = "switch_back"
            r7 = 0
            java.lang.String r5 = "setting"
            java.lang.String r6 = "cancel"
            X.JrQ r3 = new X.JrQ
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.Be5(r3)
            r0 = -87629621(0xfffffffffac6e0cb, float:-5.1631706E35)
            X.C14030oh.A0A(r0, r2)
            r0 = -1126275187(0xffffffffbcde678d, float:-0.027148986)
            goto L_0x002f
        L_0x0376:
            r0 = -267919954(0xfffffffff007ddae, float:-1.6819388E29)
            int r1 = X.C14030oh.A03(r0)
            r0 = 656203745(0x271cdfe1, float:2.1770714E-15)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.3Y3 r0 = (X.AnonymousClass3Y3) r0
            X.Jmt r2 = r0.A00
            java.lang.String r0 = "reg_flow_extras_serialize_key"
            r2.A03(r0)
            r0 = 521956278(0x1f1c6bb6, float:3.312338E-20)
            X.C14030oh.A0A(r0, r3)
            r0 = 2136596674(0x7f59e0c2, float:2.8960948E38)
            goto L_0x002f
        L_0x039a:
            r0 = 1601413289(0x5f73a0a9, float:1.7555217E19)
            int r1 = X.C14030oh.A03(r0)
            r0 = -990716426(0xffffffffc4f2ddf6, float:-1942.9363)
            int r2 = X.C14030oh.A03(r0)
            r0 = 1919807226(0x726deefa, float:4.7127585E30)
            X.C14030oh.A0A(r0, r2)
            r0 = 1273964576(0x4bef2820, float:3.1346752E7)
            goto L_0x002f
        L_0x03b3:
            r0 = 104085845(0x6343955, float:3.3896358E-35)
            int r1 = X.C14030oh.A03(r0)
            r0 = -1633331765(0xffffffff9ea555cb, float:-1.7505538E-20)
            int r6 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.1jn r0 = (X.C24661jn) r0
            X.1cQ r7 = r0.A00
            if (r7 == 0) goto L_0x041c
            X.44X r2 = X.AnonymousClass44X.A00()
            X.0Oa r9 = r7.A06
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r9)
            java.lang.String r8 = "ig_android_growth_fx_access_fb_ig_find_fb_friends"
            boolean r0 = X.AnonymousClass44X.A01(r0, r2, r8)
            if (r0 == 0) goto L_0x041c
            X.0i6 r2 = X.AnonymousClass0wJ.A0U(r9)
            java.lang.String r0 = "find_friends_fb"
            X.C54122yw.A00(r2, r0)
            X.44X r2 = X.AnonymousClass44X.A00()
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r9)
            java.lang.String r0 = r2.A03(r0, r8)
            if (r0 == 0) goto L_0x130f
            X.0i6 r5 = X.AnonymousClass0wJ.A0U(r9)
            X.0ev r2 = X.C09140ev.A02
            android.content.Context r0 = r7.requireContext()
            java.lang.String r4 = r2.A05(r0)
            r3 = 0
            X.44X r2 = X.AnonymousClass44X.A00()
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r9)
            java.lang.String r2 = r2.A03(r0, r8)
            r0 = 1
            X.H8c r2 = X.AnonymousClass3WR.A02(r5, r4, r3, r2, r0)
            X.1h2 r0 = new X.1h2
            r0.<init>(r7)
            r2.A00 = r0
            r7.schedule(r2)
        L_0x041c:
            r0 = -1252596527(0xffffffffb556e4d1, float:-8.0054184E-7)
            X.C14030oh.A0A(r0, r6)
            r0 = -1311723672(0xffffffffb1d0af68, float:-6.073538E-9)
            goto L_0x002f
        L_0x0427:
            r0 = -1184028982(0xffffffffb96d26ca, float:-2.2616531E-4)
            int r1 = X.C14030oh.A03(r0)
            X.45N r15 = (X.AnonymousClass45N) r15
            r0 = 289777843(0x1145a8b3, float:1.5592544E-28)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r14.A00
            X.1ch r3 = (X.AnonymousClass1ch) r3
            java.lang.String r2 = r15.A01
            java.lang.Integer r0 = r15.A00
            r3.Cth(r2, r0)
            r0 = 790450899(0x2f1d52d3, float:1.4308492E-10)
            X.C14030oh.A0A(r0, r4)
            r0 = -1045598542(0xffffffffc1ad6eb2, float:-21.67905)
            goto L_0x002f
        L_0x044d:
            r0 = -385272303(0xffffffffe9093611, float:-1.0367385E25)
            int r1 = X.C14030oh.A03(r0)
            X.45N r15 = (X.AnonymousClass45N) r15
            r0 = 457566624(0x1b45e9a0, float:1.6370946E-22)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r14.A00
            X.1cl r3 = (X.AnonymousClass1cl) r3
            java.lang.String r2 = r15.A01
            java.lang.Integer r0 = r15.A00
            r3.Cth(r2, r0)
            r0 = -704554940(0xffffffffd6015844, float:-3.5554024E13)
            X.C14030oh.A0A(r0, r4)
            r0 = -1203145929(0xffffffffb8497337, float:-4.8029437E-5)
            goto L_0x002f
        L_0x0473:
            r0 = 1874062032(0x6fb3ead0, float:1.1136338E29)
            int r1 = X.C14030oh.A03(r0)
            X.45N r15 = (X.AnonymousClass45N) r15
            r0 = 1261377679(0x4b2f188f, float:1.1475087E7)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r14.A00
            X.1ck r3 = (X.AnonymousClass1ck) r3
            java.lang.String r2 = r15.A01
            java.lang.Integer r0 = r15.A00
            r3.Cth(r2, r0)
            r0 = 1395274179(0x532a31c3, float:7.309793E11)
            X.C14030oh.A0A(r0, r4)
            r0 = 574031764(0x22370794, float:2.4805137E-18)
            goto L_0x002f
        L_0x0499:
            r0 = -599560697(0xffffffffdc436e07, float:-2.20034387E17)
            int r1 = X.C14030oh.A03(r0)
            r0 = -1281987600(0xffffffffb3966bf0, float:-7.004553E-8)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r5 = r14.A00
            com.instagram.nux.fragment.OneTapLoginLandingFragment r5 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r5
            X.3HV r3 = r5.A02
            X.0bf r6 = r5.A03
            android.content.Context r4 = r5.getContext()
            android.content.Context r0 = r5.getContext()
            X.H8Q r7 = X.C18240wQ.A0O(r0, r5)
            r8 = 0
            r3.A00(r4, r5, r6, r7, r8)
            r0 = -1362078535(0xffffffffaed054b9, float:-9.473795E-11)
            X.C14030oh.A0A(r0, r2)
            r0 = -201040931(0xfffffffff4045bdd, float:-4.194619E31)
            goto L_0x002f
        L_0x04ca:
            r0 = -193523736(0xfffffffff4770fe8, float:-7.8297116E31)
            int r1 = X.C14030oh.A03(r0)
            X.45H r15 = (X.AnonymousClass45H) r15
            r0 = 835603920(0x31ce4dd0, float:6.0042353E-9)
            int r4 = X.C14030oh.A03(r0)
            X.44X r3 = X.AnonymousClass44X.A00()
            java.lang.Object r5 = r14.A00
            X.1ca r5 = (X.C23151ca) r5
            X.0bf r2 = r5.A0B
            java.lang.String r0 = "ig_android_growth_fx_access_fb_ig_autocomplete"
            boolean r3 = X.AnonymousClass44X.A01(r2, r3, r0)
            java.lang.String r2 = r5.A0C
            java.lang.String r0 = r15.A00
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 != 0) goto L_0x0509
            if (r3 == 0) goto L_0x0509
            r0 = 1
            r5.A0L = r0
            android.view.View r0 = r5.A01
            r3 = 0
            r0.setVisibility(r3)
            android.view.View r2 = r5.A00
            boolean r0 = r5.A0L
            if (r0 != 0) goto L_0x0506
            r3 = 4
        L_0x0506:
            r2.setVisibility(r3)
        L_0x0509:
            r0 = 1416753817(0x5471f299, float:4.15662893E12)
            X.C14030oh.A0A(r0, r4)
            r0 = 30225397(0x1cd33f5, float:7.537966E-38)
            goto L_0x002f
        L_0x0514:
            r0 = 966121726(0x3995d8fe, float:2.8581166E-4)
            int r1 = X.C14030oh.A03(r0)
            r0 = -1039311316(0xffffffffc20d5e2c, float:-35.341965)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r14.A00
            X.1ca r4 = (X.C23151ca) r4
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r4.A06
            X.0Oa r0 = r0.A00
            java.lang.Object r0 = X.C18180wK.A0d(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x054e
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r4.A06
            X.0Oa r0 = r0.A00
            java.lang.Object r0 = X.C18180wK.A0d(r0)
            java.lang.String r0 = (java.lang.String) r0
            X.C23151ca.A01(r4, r0)
        L_0x0543:
            r0 = 1003945068(0x3bd6fc6c, float:0.0065608528)
            X.C14030oh.A0A(r0, r5)
            r0 = -1245337950(0xffffffffb5c5a6a2, float:-1.472614E-6)
            goto L_0x002f
        L_0x054e:
            X.1jz r3 = r4.A09
            X.265 r2 = X.AnonymousClass265.A0t
            android.widget.TextView r0 = r4.A04
            r3.A09(r0, r4, r2)
            goto L_0x0543
        L_0x0558:
            r0 = -1239844332(0xffffffffb6197a14, float:-2.2869835E-6)
            int r1 = X.C14030oh.A03(r0)
            r0 = 1100508634(0x41986dda, float:19.053638)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r7 = r14.A00
            X.1ca r7 = (X.C23151ca) r7
            boolean r0 = r7.A0K
            if (r0 != 0) goto L_0x057f
            boolean r0 = r7.A0H
            if (r0 == 0) goto L_0x057f
            boolean r0 = r7.A0I
            if (r0 == 0) goto L_0x057f
            X.KHr r3 = X.C38040KHr.A01
            java.lang.Class<X.45H> r2 = X.AnonymousClass45H.class
            X.4pY r0 = r7.A0S
            r3.A03(r0, r2)
        L_0x057f:
            X.38b r2 = r7.A07
            X.0bf r8 = r7.A0B
            android.content.Context r6 = X.C18230wP.A0A(r7)
            X.3HV r5 = r2.A01
            X.H8Q r9 = X.C18240wQ.A0O(r6, r7)
            r0 = 3
            com.facebook.redex.IDxObjectShape796S0100000_1_I2 r10 = new com.facebook.redex.IDxObjectShape796S0100000_1_I2
            r10.<init>(r2, r0)
            r5.A00(r6, r7, r8, r9, r10)
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r7.A06
            X.0Oa r0 = r0.A00
            java.lang.Object r0 = X.C18180wK.A0d(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x05be
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r7.A06
            X.0Oa r0 = r0.A00
            java.lang.Object r0 = X.C18180wK.A0d(r0)
            java.lang.String r0 = (java.lang.String) r0
            X.C23151ca.A01(r7, r0)
        L_0x05b3:
            r0 = 777901779(0x2e5dd6d3, float:5.0440385E-11)
            X.C14030oh.A0A(r0, r4)
            r0 = -2061645323(0xffffffff851dc9f5, float:-7.419198E-36)
            goto L_0x002f
        L_0x05be:
            X.1jz r3 = r7.A09
            X.265 r2 = X.AnonymousClass265.A0t
            android.widget.TextView r0 = r7.A04
            r3.A09(r0, r7, r2)
            goto L_0x05b3
        L_0x05c8:
            r0 = 1829696843(0x6d0ef54b, float:2.7652133E27)
            int r1 = X.C14030oh.A03(r0)
            X.45Q r15 = (X.AnonymousClass45Q) r15
            r0 = 249597800(0xee08f68, float:5.535836E-30)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r14.A00
            X.1ca r2 = (X.C23151ca) r2
            java.lang.String r0 = r15.A01
            r2.A0D = r0
            java.lang.String r0 = r15.A02
            r2.A0E = r0
            r0 = -1689721429(0xffffffff9b48e5ab, float:-1.6617822E-22)
            X.C14030oh.A0A(r0, r3)
            r0 = -1164616135(0xffffffffba955e39, float:-0.0011395878)
            goto L_0x002f
        L_0x05ef:
            r0 = -166343963(0xfffffffff615cae5, float:-7.595385E32)
            int r1 = X.C14030oh.A03(r0)
            r0 = 206010955(0xc477a4b, float:1.5367204E-31)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r14.A00
            X.1bJ r2 = (X.AnonymousClass1bJ) r2
            boolean r0 = r2.isAdded()
            if (r0 == 0) goto L_0x0610
            boolean r0 = X.AnonymousClass1bJ.A03(r2)
            if (r0 != 0) goto L_0x0610
            X.AnonymousClass1bJ.A00(r2)
        L_0x0610:
            r0 = 1700207183(0x65571a4f, float:6.348713E22)
            X.C14030oh.A0A(r0, r3)
            r0 = 755046790(0x2d011986, float:7.338468E-12)
            goto L_0x002f
        L_0x061b:
            r0 = -1941706616(0xffffffff8c43e888, float:-1.5092228E-31)
            int r1 = X.C14030oh.A03(r0)
            r0 = -1141105540(0xffffffffbbfc1c7c, float:-0.0076938253)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r14.A00
            X.1bJ r2 = (X.AnonymousClass1bJ) r2
            boolean r0 = r2.isAdded()
            if (r0 == 0) goto L_0x063c
            boolean r0 = X.AnonymousClass1bJ.A03(r2)
            if (r0 != 0) goto L_0x063c
            X.AnonymousClass1bJ.A00(r2)
        L_0x063c:
            r0 = -1442346133(0xffffffffaa078b6b, float:-1.2038779E-13)
            X.C14030oh.A0A(r0, r3)
            r0 = -912797718(0xffffffffc997cfea, float:-1243645.2)
            goto L_0x002f
        L_0x0647:
            r0 = -1742481667(0xffffffff9823d6fd, float:-2.1175798E-24)
            int r1 = X.C14030oh.A03(r0)
            r0 = -1742488776(0xffffffff9823bb38, float:-2.1161778E-24)
            int r7 = X.C14030oh.A03(r0)
            java.lang.Object r6 = r14.A00
            X.1bJ r6 = (X.AnonymousClass1bJ) r6
            boolean r0 = X.AnonymousClass1bJ.A03(r6)
            if (r0 == 0) goto L_0x066a
            r0 = -1497487341(0xffffffffa6be2813, float:-1.3194761E-15)
        L_0x0662:
            X.C14030oh.A0A(r0, r7)
            r0 = 2048409138(0x7a183e32, float:1.9762265E35)
            goto L_0x002f
        L_0x066a:
            X.0bf r5 = r6.A08
            java.lang.String r4 = X.C18230wP.A0k(r6)
            X.0rQ r0 = r6.A04
            java.lang.String r3 = r0.BJN()
            r2 = 0
            r0 = 0
            X.H8c r2 = X.AnonymousClass3WR.A02(r5, r4, r3, r2, r0)
            X.1iB r0 = new X.1iB
            r0.<init>(r6)
            r2.A00 = r0
            r6.schedule(r2)
            r0 = 1887576477(0x7082219d, float:3.221895E29)
            goto L_0x0662
        L_0x068a:
            r0 = 464907993(0x1bb5eed9, float:3.009829E-22)
            int r1 = X.C14030oh.A03(r0)
            r0 = -787978541(0xffffffffd10866d3, float:-3.6615041E10)
            int r2 = X.AnonymousClass1cj.A00(r14, r0)
            r0 = 1285115089(0x4c994cd1, float:8.0373384E7)
            X.C14030oh.A0A(r0, r2)
            r0 = -517971072(0xffffffffe1206380, float:-1.8491555E20)
            goto L_0x002f
        L_0x06a3:
            r0 = 1822664690(0x6ca3a7f2, float:1.582784E27)
            int r1 = X.C14030oh.A03(r0)
            r0 = 1440071149(0x55d5bded, float:2.93764627E13)
            int r2 = X.AnonymousClass1cj.A00(r14, r0)
            r0 = 626254648(0x2553e338, float:1.8378317E-16)
            X.C14030oh.A0A(r0, r2)
            r0 = 136701914(0x825e7da, float:4.992542E-34)
            goto L_0x002f
        L_0x06bc:
            r0 = -1439055431(0xffffffffaa39c1b9, float:-1.6498512E-13)
            int r1 = X.C14030oh.A03(r0)
            r0 = -1465469535(0xffffffffa8a6b5a1, float:-1.8508471E-14)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r14.A00
            com.instagram.nux.activity.SignedOutFragmentActivity r4 = (com.instagram.nux.activity.SignedOutFragmentActivity) r4
            com.instagram.fx.access.sso.FxSsoViewModel r3 = r4.A02
            X.0bf r2 = r4.A04
            r0 = 0
            r3.A02(r4, r0, r2)
            r0 = 435746453(0x19f8f695, float:2.5742193E-23)
            X.C14030oh.A0A(r0, r5)
            r0 = 1960248712(0x74d70588, float:1.3628613E32)
            goto L_0x002f
        L_0x06e1:
            r0 = 1341355048(0x4ff37428, float:8.1689518E9)
            int r1 = X.C14030oh.A03(r0)
            X.45O r15 = (X.AnonymousClass45O) r15
            r0 = -792024350(0xffffffffd0caaae2, float:-2.72015729E10)
            int r7 = X.C14030oh.A03(r0)
            java.lang.Object r10 = r14.A00
            com.instagram.nux.activity.SignedOutFragmentActivity r10 = (com.instagram.nux.activity.SignedOutFragmentActivity) r10
            X.0bf r9 = r10.A04
            java.util.Locale r0 = X.C31103Gfm.A03()
            java.lang.String r11 = r0.getLanguage()
            X.19W r0 = r15.A01
            java.lang.String r8 = r0.A02
            X.AnonymousClass0wJ.A1N(r9, r11)
            r0 = 2
            X.C04220Ms.A0B(r8, r0)
            double r5 = X.C18200wM.A00()
            double r3 = X.AnonymousClass269.A00()
            X.0nS r2 = X.C13330nS.A02(r9)
            java.lang.String r0 = "language_changed"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r0)
            r0 = 2365(0x93d, float:3.314E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r0)
            X.C18210wN.A17(r2)
            X.AnonymousClass0wJ.A1B(r2, r5, r3)
            java.lang.String r0 = "from"
            r2.A0T(r0, r11)
            X.C18180wK.A1A(r2, r3)
            java.lang.String r0 = "to"
            r2.A0T(r0, r8)
            X.AnonymousClass269.A05(r2)
            X.C63683i7.A0A(r2, r9)
            X.0bf r0 = r10.A04
            X.7ek r0 = X.C18250wR.A0C(r0)
            monitor-enter(r0)
            monitor-exit(r0)
            r0 = 66890164(0x3fca9b4, float:1.4850191E-36)
            X.C14030oh.A0A(r0, r7)
            r0 = 1760913464(0x68f56838, float:9.271218E24)
            goto L_0x002f
        L_0x074e:
            r0 = -2002927588(0xffffffff889dc01c, float:-9.4942585E-34)
            int r1 = X.C14030oh.A03(r0)
            r0 = 200573519(0xbf4824f, float:9.418145E-32)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r5 = r14.A00
            X.1de r5 = (X.C23361de) r5
            com.instagram.service.session.UserSession r0 = r5.A03
            X.0BO r0 = r0.multipleAccountHelper
            X.0RL r2 = r0.A00
            r0 = 0
            java.util.List r0 = r2.A04(r0)
            java.util.ArrayList r2 = X.C18200wM.A0s(r0)
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x077c
            com.instagram.service.session.UserSession r0 = r5.A03
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r0)
            r2.remove(r0)
        L_0x077c:
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>(r2)
            r5.A05 = r3
            X.0y4 r2 = r5.A02
            if (r2 == 0) goto L_0x0795
            java.util.List r0 = r2.A05
            r0.clear()
            r0.addAll(r3)
            r0 = 216008795(0xce0085b, float:3.4517693E-31)
            X.C14020og.A00(r2, r0)
        L_0x0795:
            r0 = -890555992(0xffffffffcaeb31a8, float:-7706836.0)
            X.C14030oh.A0A(r0, r4)
            r0 = -1050030404(0xffffffffc169cebc, float:-14.612972)
            goto L_0x002f
        L_0x07a0:
            r0 = -125067060(0xfffffffff88ba0cc, float:-2.2655957E34)
            int r1 = X.C14030oh.A03(r0)
            X.E6C r15 = (X.E6C) r15
            r0 = -46429156(0xfffffffffd3b8c1c, float:-1.558082E37)
            int r6 = X.C14030oh.A03(r0)
            r12 = 0
            X.C04220Ms.A0B(r15, r12)
            com.instagram.pendingmedia.model.PendingMedia r8 = r15.A00
            java.lang.Object r7 = r14.A00
            X.ELw r7 = (X.C26573ELw) r7
            X.FeZ r0 = r8.A53
            X.FeZ r2 = X.C28933FeZ.CONFIGURED
            if (r0 != r2) goto L_0x0814
            X.FeZ r0 = r8.A1N
            if (r0 != r2) goto L_0x0814
            java.util.Set r5 = X.C26573ELw.A07
            java.lang.String r0 = r8.A2Y
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L_0x0814
            java.lang.String r2 = r8.A2Y
            java.lang.String r0 = X.C26573ELw.A06
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 == 0) goto L_0x0814
            X.C26573ELw.A00()
            X.BKU r0 = r8.A10
            X.C04220Ms.A06(r0)
            X.BKN r2 = r0.A0f
            X.9AD r0 = r2.A0l
            r4 = 1
            if (r0 == 0) goto L_0x082a
            X.9A9 r0 = r0.A09
            if (r0 == 0) goto L_0x082a
            java.lang.Boolean r0 = r0.A00
            boolean r0 = X.C18190wL.A1Z(r0, r4)
            if (r0 == 0) goto L_0x082a
            X.9AD r0 = r2.A0l
            if (r0 == 0) goto L_0x082a
            X.9A9 r0 = r0.A09
            if (r0 == 0) goto L_0x082a
            java.lang.Integer r0 = r0.A01
            if (r0 == 0) goto L_0x082a
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x082a
            com.instagram.service.session.UserSession r9 = r7.A04
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            r2 = 36321387371043577(0x810a1c00001af9, double:3.033129855711144E-306)
            boolean r0 = X.C63803iN.A0E(r0, r9, r2)
            if (r0 == 0) goto L_0x082a
        L_0x0814:
            com.instagram.service.session.UserSession r0 = r7.A04
            X.KHq r2 = X.AnonymousClass3LY.A00(r0)
            java.lang.Class<X.E6C> r0 = X.E6C.class
            r2.A02(r14, r0)
            r0 = -1312410480(0xffffffffb1c63490, float:-5.768534E-9)
            X.C14030oh.A0A(r0, r6)
            r0 = -811409888(0xffffffffcfa2de20, float:-5.4649324E9)
            goto L_0x002f
        L_0x082a:
            X.3iD r9 = X.C63733iD.A00()
            r0 = 5000(0x1388, float:7.006E-42)
            r9.A01 = r0
            android.content.Context r10 = r7.A00
            r2 = 2131833779(0x7f1133b3, float:1.930065E38)
            X.0Ok r0 = X.C06810aP.A01
            com.instagram.service.session.UserSession r11 = r7.A04
            java.lang.String r0 = X.C18200wM.A0k(r11, r0)
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r10, r0, r2)
            r9.A0A = r0
            boolean r0 = r8.A0w()
            if (r0 == 0) goto L_0x08a3
            java.util.List r0 = r8.A0R()
            java.lang.Object r0 = r0.get(r12)
            com.instagram.pendingmedia.model.PendingMedia r0 = (com.instagram.pendingmedia.model.PendingMedia) r0
            java.lang.String r0 = r0.A2X
            if (r0 == 0) goto L_0x08a3
            X.22b r0 = X.AnonymousClass22b.SQUARE
            r9.A0E(r0)
            java.util.List r0 = r8.A0R()
            java.lang.Object r0 = r0.get(r12)
            com.instagram.pendingmedia.model.PendingMedia r0 = (com.instagram.pendingmedia.model.PendingMedia) r0
            java.lang.String r0 = r0.A2X
        L_0x086a:
            android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromPath(r0)
            r9.A03 = r0
        L_0x0870:
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            r2 = 36318179031388349(0x810731000e10bd, double:3.031100888794231E-306)
            boolean r0 = X.C63803iN.A0E(r0, r11, r2)
            if (r0 == 0) goto L_0x0899
            r0 = 2131232536(0x7f080718, float:1.8081184E38)
            r9.A00 = r0
        L_0x0882:
            r2 = 6
            com.facebook.redex.IDxCBackShape137S0200000_1_I2 r0 = new com.facebook.redex.IDxCBackShape137S0200000_1_I2
            r0.<init>((int) r2, (java.lang.Object) r8, (java.lang.Object) r7)
            r9.A07 = r0
            r9.A0I = r4
            X.C63733iD.A0A(r9)
            java.lang.String r0 = r8.A2Y
            X.C04220Ms.A06(r0)
            r5.add(r0)
            goto L_0x0814
        L_0x0899:
            r0 = 2131833780(0x7f1133b4, float:1.9300652E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0k(r10, r0)
            r9.A0D = r0
            goto L_0x0882
        L_0x08a3:
            java.lang.String r0 = r8.A2X
            if (r0 == 0) goto L_0x0870
            X.22b r0 = X.AnonymousClass22b.SQUARE
            r9.A0E(r0)
            java.lang.String r0 = r8.A2X
            goto L_0x086a
        L_0x08af:
            r0 = -1231010997(0xffffffffb6a0434b, float:-4.7762055E-6)
            int r1 = X.C14030oh.A03(r0)
            X.45G r15 = (X.AnonymousClass45G) r15
            r0 = -244037858(0xfffffffff174471e, float:-1.2096051E30)
            int r5 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r4 = r14.A00
            X.1Yw r4 = (X.C22641Yw) r4
            com.facebook.quicklog.QuickPerformanceLogger r3 = r4.A05
            if (r3 != 0) goto L_0x08ce
            java.lang.String r0 = "qplLogger"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x08ce:
            r2 = 203167632(0xc1c1790, float:1.2024893E-31)
            java.lang.String r0 = "HELP_SHEET_CLICK"
            r3.markerPoint(r2, r0)
            java.lang.Integer r0 = r15.A00
            r4.A0D = r0
            r0 = 1775246068(0x69d01af4, float:3.1447982E25)
            X.C14030oh.A0A(r0, r5)
            r0 = -474479398(0xffffffffe3b804da, float:-6.789101E21)
            goto L_0x002f
        L_0x08e5:
            r0 = 1820666972(0x6c852c5c, float:1.2879729E27)
            int r1 = X.C14030oh.A03(r0)
            r0 = -589300397(0xffffffffdcdffd53, float:-5.04379622E17)
            int r2 = X.AnonymousClass1c9.A00(r14, r0)
            r0 = -480400042(0xffffffffe35dad56, float:-4.0892206E21)
            X.C14030oh.A0A(r0, r2)
            r0 = 985794060(0x3ac2060c, float:0.0014802827)
            goto L_0x002f
        L_0x08fe:
            r0 = 1971699627(0x7585bfab, float:3.3909325E32)
            int r1 = X.C14030oh.A03(r0)
            r0 = 174073557(0xa6026d5, float:1.0792511E-32)
            int r2 = X.AnonymousClass1c9.A00(r14, r0)
            r0 = -2140701121(0xffffffff80677e3f, float:-9.504345E-39)
            X.C14030oh.A0A(r0, r2)
            r0 = 1592971162(0x5ef2cf9a, float:8.7481862E18)
            goto L_0x002f
        L_0x0917:
            r0 = 600441261(0x23ca01ad, float:2.1901594E-17)
            int r1 = X.C14030oh.A03(r0)
            r0 = -879229344(0xffffffffcb980660, float:-1.9926208E7)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.IcN r0 = (X.C34640IcN) r0
            android.app.Activity r0 = r0.getRootActivity()
            X.E2V r0 = X.E2V.A03(r0)
            X.E2V.A0G(r0)
            r0 = 268526901(0x10016535, float:2.551873E-29)
            X.C14030oh.A0A(r0, r2)
            r0 = -1743125929(0xffffffff981a0257, float:-1.9905215E-24)
            goto L_0x002f
        L_0x093f:
            r0 = 1329395462(0x4f3cf706, float:3.17030554E9)
            int r1 = X.C14030oh.A03(r0)
            X.45F r15 = (X.AnonymousClass45F) r15
            r0 = -1749114488(0xffffffff97bea188, float:-1.2319238E-24)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r14.A00
            X.1qD r4 = (X.C26201qD) r4
            boolean r2 = r4.A02
            if (r2 == 0) goto L_0x0982
            boolean r0 = r15.A00
            if (r2 == r0) goto L_0x0982
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            X.Dsm r3 = X.C18190wL.A0W(r0)
            r0 = 2131824776(0x7f111088, float:1.928239E38)
            r3.A0L(r0)
            r0 = 2131824774(0x7f111086, float:1.9282385E38)
            r3.A0K(r0)
            r2 = 2131824775(0x7f111087, float:1.9282387E38)
            r0 = 71
            X.C18180wK.A1O(r3, r4, r0, r2)
            r2 = 2131823054(0x7f1109ce, float:1.9278897E38)
            r0 = 70
            X.C18180wK.A1N(r3, r4, r0, r2)
            X.AnonymousClass0wJ.A1K(r3)
        L_0x0982:
            r0 = -1114630405(0xffffffffbd9016fb, float:-0.07035633)
            X.C14030oh.A0A(r0, r5)
            r0 = -1679762247(0xffffffff9be0dcb9, float:-3.720033E-22)
            goto L_0x002f
        L_0x098d:
            r0 = -1095834488(0xffffffffbeaee488, float:-0.3415873)
            int r1 = X.C14030oh.A03(r0)
            r0 = -1047454833(0xffffffffc1911b8f, float:-18.138456)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.1cb r0 = (X.C23161cb) r0
            r0.A03()
            r0 = -2102454052(0xffffffff82af18dc, float:-2.5728208E-37)
            X.C14030oh.A0A(r0, r2)
            r0 = -949378856(0xffffffffc769a0d8, float:-59808.844)
            goto L_0x002f
        L_0x09ad:
            r0 = 1897334102(0x71170556, float:7.47819E29)
            int r1 = X.C14030oh.A03(r0)
            X.45L r15 = (X.AnonymousClass45L) r15
            r0 = -1626325485(0xffffffff9f103e13, float:-3.0544533E-20)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.1cb r0 = (X.C23161cb) r0
            r0.A03()
            X.KHr r4 = X.C38040KHr.A01
            java.lang.String r3 = r15.A01
            java.lang.Integer r2 = r15.A00
            X.45N r0 = new X.45N
            r0.<init>(r3, r2)
            r4.CWx(r0)
            r0 = 960545257(0x3940c1e9, float:1.8382784E-4)
            X.C14030oh.A0A(r0, r5)
            r0 = 522371414(0x1f22c156, float:3.4464758E-20)
            goto L_0x002f
        L_0x09dd:
            r0 = 394123429(0x177dd8a5, float:8.2022153E-25)
            int r1 = X.C14030oh.A03(r0)
            X.45P r15 = (X.AnonymousClass45P) r15
            r0 = 1243488179(0x4a1e1fb3, float:2590700.8)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.1cb r0 = (X.C23161cb) r0
            r0.A03()
            X.KHr r4 = X.C38040KHr.A01
            java.lang.String r3 = r15.A01
            java.lang.Integer r2 = r15.A00
            X.45N r0 = new X.45N
            r0.<init>(r3, r2)
            r4.CWx(r0)
            r0 = 453248480(0x1b0405e0, float:1.0920682E-22)
            X.C14030oh.A0A(r0, r5)
            r0 = -293129792(0xffffffffee8731c0, float:-2.092031E28)
            goto L_0x002f
        L_0x0a0d:
            r0 = -1614560249(0xffffffff9fc3c407, float:-8.291001E-20)
            int r1 = X.C14030oh.A03(r0)
            X.45U r15 = (X.AnonymousClass45U) r15
            r0 = 606903344(0x242c9c30, float:3.742885E-17)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r10 = r14.A00
            androidx.fragment.app.FragmentActivity r10 = (androidx.fragment.app.FragmentActivity) r10
            java.lang.String r5 = "last_user_restriction_sentry_block_event"
            android.content.SharedPreferences r7 = X.C08340dC.A01(r5)
            boolean r0 = r7.contains(r5)
            if (r0 == 0) goto L_0x0a4e
            com.google.gson.Gson r3 = new com.google.gson.Gson     // Catch:{ LWW -> 0x0a47 }
            r3.<init>()     // Catch:{ LWW -> 0x0a47 }
            java.lang.String r2 = X.C18250wR.A0W(r7, r5)     // Catch:{ LWW -> 0x0a47 }
            java.lang.Class<X.3VJ> r0 = X.AnonymousClass3VJ.class
            java.lang.Object r0 = r3.A06(r2, r0)     // Catch:{ LWW -> 0x0a47 }
            X.3VJ r6 = r15.A01     // Catch:{ LWW -> 0x0a47 }
            boolean r0 = r6.equals(r0)     // Catch:{ LWW -> 0x0a47 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0afb
            goto L_0x0a4e
        L_0x0a47:
            java.lang.String r2 = "FeedbackUtil"
            java.lang.String r0 = "Exception trying to deserialize FeedbackRequiredSerializable JSON"
            X.C10450iM.A03(r2, r0)
        L_0x0a4e:
            X.3VJ r6 = r15.A01
            boolean r0 = r6.A0C
            if (r0 == 0) goto L_0x0ab2
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x0ab2
            java.util.HashMap r3 = X.AnonymousClass0wJ.A0y()
            java.lang.String r2 = r15.A04
            java.lang.String r0 = "restriction_detail_use_case"
            r3.put(r0, r2)
            java.lang.String r2 = r15.A06
            java.lang.String r0 = "restriction_type"
            r3.put(r0, r2)
            java.lang.String r2 = r6.A02
            java.lang.String r0 = "enrollment_time"
            r3.put(r0, r2)
            java.lang.String r2 = r6.A04
            java.lang.String r0 = "expiration_time"
            r3.put(r0, r2)
            java.lang.String r2 = r6.A01
            java.lang.String r0 = "dialogue_type"
            r3.put(r0, r2)
            java.lang.String r2 = r15.A03
            java.lang.String r0 = "responsible_policy"
            r3.put(r0, r2)
            java.lang.String r2 = r15.A02
            java.lang.String r0 = "category"
            r3.put(r0, r2)
            java.lang.String r2 = r6.A03
            java.lang.String r0 = "error_code"
            r3.put(r0, r2)
            java.lang.String r2 = r15.A05
            java.lang.String r0 = "restriction_extra_data"
            r3.put(r0, r2)
            java.lang.String r2 = r6.A09
            java.lang.String r0 = "reasons_thrown"
            r3.put(r0, r2)
            X.0i6 r2 = r15.A00
            java.lang.String r0 = "com.instagram.sentry_block_dialogue_unification.screens.sentry_block_dialogue_unification"
            X.4A9 r2 = X.C63263h8.A00(r2, r0, r3)
            r0 = 4
            X.AnonymousClass4A9.A01(r2, r10, r15, r0)
            X.C31155GhB.A03(r2)
            goto L_0x0afb
        L_0x0ab2:
            boolean r0 = r15.A07
            if (r0 == 0) goto L_0x0af0
            X.0i6 r2 = r15.A00
            X.0m7 r0 = r10.getSupportFragmentManager()
            boolean r0 = r0.A15()
            if (r0 != 0) goto L_0x0afb
            X.3GW r0 = X.AnonymousClass3GW.A00
            X.49w r9 = r0.A00(r2)
            monitor-enter(r9)
            boolean r0 = r9.A02     // Catch:{ all -> 0x1314 }
            if (r0 != 0) goto L_0x0aee
            r0 = 1
            r9.A02 = r0     // Catch:{ all -> 0x1314 }
            java.util.HashMap r8 = X.AnonymousClass0wJ.A0y()     // Catch:{ all -> 0x1314 }
            java.lang.String r2 = "get_challenge"
            java.lang.String r0 = "true"
            r8.put(r2, r0)     // Catch:{ all -> 0x1314 }
            r0 = 2
            com.instagram.bloks.util.IDxACallbackShape31S0200000_1_I2 r3 = new com.instagram.bloks.util.IDxACallbackShape31S0200000_1_I2     // Catch:{ all -> 0x1314 }
            r3.<init>(r0, r10, r9)     // Catch:{ all -> 0x1314 }
            X.0i6 r2 = r9.A06     // Catch:{ all -> 0x1314 }
            java.lang.String r0 = "com.instagram.challenge.navigation.take_challenge"
            X.4A9 r0 = X.C63263h8.A00(r2, r0, r8)     // Catch:{ all -> 0x1314 }
            r0.A00 = r3     // Catch:{ all -> 0x1314 }
            X.C31155GhB.A03(r0)     // Catch:{ all -> 0x1314 }
        L_0x0aee:
            monitor-exit(r9)
            goto L_0x0afb
        L_0x0af0:
            X.0m7 r2 = r10.getSupportFragmentManager()
            android.os.Bundle r0 = X.C62463a4.A00(r15)
            X.C62463a4.A01(r0, r2)
        L_0x0afb:
            android.content.SharedPreferences$Editor r2 = r7.edit()     // Catch:{ MU3 -> 0x0b07 }
            java.lang.String r0 = X.C18220wO.A0p(r6)     // Catch:{ MU3 -> 0x0b07 }
            X.C18180wK.A0v(r2, r5, r0)     // Catch:{ MU3 -> 0x0b07 }
            goto L_0x0b0e
        L_0x0b07:
            java.lang.String r2 = "FeedbackUtil"
            java.lang.String r0 = "Exception trying to serialize FeedbackRequiredSerializable to JSON"
            X.C10450iM.A03(r2, r0)
        L_0x0b0e:
            r0 = -1180767477(0xffffffffb99eeb0b, float:-3.031123E-4)
            X.C14030oh.A0A(r0, r4)
            r0 = 2050816168(0x7a3cf8a8, float:2.4529879E35)
            goto L_0x002f
        L_0x0b19:
            r0 = -870066510(0xffffffffcc23d6b2, float:-4.294932E7)
            int r1 = X.C14030oh.A03(r0)
            X.E65 r15 = (X.E65) r15
            r0 = -1186408712(0xffffffffb948d6f8, float:-1.9153568E-4)
            int r3 = X.AnonymousClass0wJ.A00(r0, r15)
            com.instagram.model.venue.Venue r2 = r15.A00
            java.lang.Object r0 = r14.A00
            X.1Zl r0 = (X.C22781Zl) r0
            X.0Oa r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            X.10I r0 = (X.AnonymousClass10I) r0
            r0.A00(r2)
            r0 = -542610609(0xffffffffdfa86b4f, float:-2.427176E19)
            X.C14030oh.A0A(r0, r3)
            r0 = -905830453(0xffffffffca021fcb, float:-2131954.8)
            goto L_0x002f
        L_0x0b45:
            r0 = -2064789860(0xffffffff84edce9c, float:-5.5908173E-36)
            int r1 = X.C14030oh.A03(r0)
            r0 = -1811966720(0xffffffff93ff9500, float:-6.4517975E-27)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r9 = r14.A00
            X.1dj r9 = (X.C23391dj) r9
            X.4MA r0 = r9.A07
            if (r0 == 0) goto L_0x0bad
            com.instagram.service.session.UserSession r0 = r9.A05
            X.1tl r0 = X.AnonymousClass3WS.A01(r0)
            java.lang.String r2 = "feed"
            java.util.Set r0 = r0.A0H(r2)
            java.util.ArrayList r6 = X.C18200wM.A0s(r0)
            com.instagram.service.session.UserSession r0 = r9.A05
            X.1tl r0 = X.AnonymousClass3WS.A01(r0)
            boolean r8 = r0.A0R(r2)
            X.4MA r7 = r9.A07
            if (r8 == 0) goto L_0x0bb8
            android.content.res.Resources r4 = X.AnonymousClass0wJ.A0B(r9)
            r3 = 2131689684(0x7f0f00d4, float:1.900839E38)
            int r2 = r6.size()
            int r0 = r6.size()
            java.lang.Object[] r0 = X.C18210wN.A1X(r0)
            java.lang.String r0 = r4.getQuantityString(r3, r2, r0)
        L_0x0b90:
            r7.A05 = r0
            X.1fC r0 = r9.A0A
            r0.notifyDataSetChanged()
            if (r8 == 0) goto L_0x0bad
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0bad
            androidx.fragment.app.FragmentActivity r3 = r9.requireActivity()
            r2 = 21
            com.facebook.redex.IDxCListenerShape77S0200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape77S0200000_1_I2
            r0.<init>((int) r2, (java.lang.Object) r14, (java.lang.Object) r6)
            X.AnonymousClass3OS.A00(r3, r0)
        L_0x0bad:
            r0 = -1735333943(0xffffffff9890e7c9, float:-3.745717E-24)
            X.C14030oh.A0A(r0, r5)
            r0 = 195613661(0xba8d3dd, float:6.503002E-32)
            goto L_0x002f
        L_0x0bb8:
            r0 = 2131835595(0x7f113acb, float:1.9304333E38)
            java.lang.String r0 = r9.getString(r0)
            goto L_0x0b90
        L_0x0bc0:
            r0 = -1712216124(0xffffffff99f1a7c4, float:-2.4986576E-23)
            int r1 = X.C14030oh.A03(r0)
            X.46I r15 = (X.AnonymousClass46I) r15
            r0 = 1228976184(0x4940b038, float:789251.5)
            int r4 = X.C14030oh.A03(r0)
            java.util.Date r2 = r15.A00
            r5 = 0
            if (r2 == 0) goto L_0x0bfa
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r2 = r2.getTime()
            long r2 = r0.toSeconds(r2)
            int r0 = (int) r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.18N r3 = new X.18N
            r3.<init>(r0, r5)
            java.lang.Object r2 = r14.A00
            com.instagram.creation.fragment.FollowersShareFragment r2 = (com.instagram.creation.fragment.FollowersShareFragment) r2
            com.instagram.pendingmedia.model.PendingMedia r0 = r2.A0P
            r0.getClass()
            X.18N r0 = r0.A0l
            if (r0 != 0) goto L_0x0bf9
            r0 = 1
            r2.A0s = r0
        L_0x0bf9:
            r5 = r3
        L_0x0bfa:
            java.lang.Object r0 = r14.A00
            com.instagram.creation.fragment.FollowersShareFragment r0 = (com.instagram.creation.fragment.FollowersShareFragment) r0
            com.instagram.pendingmedia.model.PendingMedia r0 = r0.A0P
            r0.getClass()
            r0.A0l = r5
            r0 = -464462322(0xffffffffe450de0e, float:-1.5411694E22)
            X.C14030oh.A0A(r0, r4)
            r0 = 1022912590(0x3cf8684e, float:0.030323174)
            goto L_0x002f
        L_0x0c10:
            r0 = 1663828331(0x632c016b, float:3.1729422E21)
            int r1 = X.C14030oh.A03(r0)
            X.46K r15 = (X.AnonymousClass46K) r15
            r0 = 395389581(0x17912a8d, float:9.381147E-25)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            com.instagram.creation.fragment.FollowersShareFragment r0 = (com.instagram.creation.fragment.FollowersShareFragment) r0
            com.instagram.pendingmedia.model.PendingMedia r2 = r0.A0P
            r2.getClass()
            boolean r0 = r15.A00
            r2.A4l = r0
            r0 = 1895396071(0x70f972e7, float:6.176054E29)
            X.C14030oh.A0A(r0, r3)
            r0 = 1045050277(0x3e4a33a5, float:0.19746263)
            goto L_0x002f
        L_0x0c38:
            r0 = 745600467(0x2c70f5d3, float:3.4242511E-12)
            int r1 = X.C14030oh.A03(r0)
            X.46H r15 = (X.AnonymousClass46H) r15
            r0 = 1367028785(0x517b3431, float:6.7432026E10)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            com.instagram.creation.fragment.FollowersShareFragment r0 = (com.instagram.creation.fragment.FollowersShareFragment) r0
            com.instagram.pendingmedia.model.PendingMedia r2 = r0.A0P
            r2.getClass()
            boolean r0 = r15.A00
            r2.A4C = r0
            r0 = 1924998505(0x72bd2569, float:7.49285E30)
            X.C14030oh.A0A(r0, r3)
            r0 = 1650103634(0x625a9552, float:1.0080375E21)
            goto L_0x002f
        L_0x0c60:
            r0 = 1005637416(0x3bf0cf28, float:0.0073489137)
            int r1 = X.C14030oh.A03(r0)
            X.46J r15 = (X.AnonymousClass46J) r15
            r0 = -341173599(0xffffffffebaa1aa1, float:-4.112863E26)
            int r4 = X.C14030oh.A03(r0)
            X.2AI r3 = X.AnonymousClass2AI.A04
            java.lang.Object r0 = r14.A00
            com.instagram.creation.fragment.FollowersShareFragment r0 = (com.instagram.creation.fragment.FollowersShareFragment) r0
            com.instagram.pendingmedia.model.PendingMedia r2 = r0.A0P
            r2.getClass()
            boolean r0 = r15.A00
            r3.A05(r2, r0)
            r0 = -1372302927(0xffffffffae3451b1, float:-4.0999818E-11)
            X.C14030oh.A0A(r0, r4)
            r0 = -1850609299(0xffffffff91b1f16d, float:-2.8074466E-28)
            goto L_0x002f
        L_0x0c8b:
            r0 = 1452206290(0x568ee8d2, float:7.8565303E13)
            int r1 = X.C14030oh.A03(r0)
            r0 = 428631152(0x198c6470, float:1.4516227E-23)
            int r6 = X.C14030oh.A03(r0)
            java.lang.Object r8 = r14.A00
            X.FOg r8 = (X.C28493FOg) r8
            android.content.Context r7 = r8.requireContext()
            X.3zC r0 = r8.A03
            java.lang.String r5 = "shareToFBController"
            if (r0 == 0) goto L_0x132f
            boolean r4 = r0.A04
            X.0Oa r0 = r8.A0F
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            android.content.SharedPreferences r2 = X.C28161tl.A04(r0)
            java.lang.String r0 = "auto_cross_post_to_facebook_story"
            r3 = 0
            boolean r2 = r2.getBoolean(r0, r3)
            if (r4 == r2) goto L_0x0cd0
            X.3zC r0 = r8.A03
            if (r0 == 0) goto L_0x132f
            r0.A03()
            if (r2 == 0) goto L_0x0cd0
            r0 = 2131836200(0x7f113d28, float:1.930556E38)
            java.lang.String r2 = r7.getString(r0)
            r0 = 0
            X.C63813iO.A02(r7, r2, r0, r3)
        L_0x0cd0:
            r0 = 216425562(0xce6645a, float:3.5497508E-31)
            X.C14030oh.A0A(r0, r6)
            r0 = 1126629228(0x4326ff6c, float:166.99774)
            goto L_0x002f
        L_0x0cdb:
            r0 = -1834525448(0xffffffff92a75cf8, float:-1.05621E-27)
            int r1 = X.C14030oh.A03(r0)
            X.0PA r15 = (X.AnonymousClass0PA) r15
            r0 = -503040394(0xffffffffe2043676, float:-6.0972364E20)
            int r2 = X.C14030oh.A03(r0)
            java.lang.String r0 = r15.A01
            if (r0 != 0) goto L_0x0cfa
            java.lang.String r0 = r15.A00
            if (r0 != 0) goto L_0x0cfa
            java.lang.Object r0 = r14.A00
            com.instagram.challenge.activity.ChallengeActivity r0 = (com.instagram.challenge.activity.ChallengeActivity) r0
            r0.finish()
        L_0x0cfa:
            r0 = -244108546(0xfffffffff17332fe, float:-1.20426405E30)
            X.C14030oh.A0A(r0, r2)
            r0 = -1533670116(0xffffffffa4960d1c, float:-6.507434E-17)
            goto L_0x002f
        L_0x0d05:
            r0 = 254340360(0xf28ed08, float:8.32869E-30)
            int r1 = X.C14030oh.A03(r0)
            r0 = -1458119413(0xffffffffa916dd0b, float:-3.3498415E-14)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r14.A00
            X.1bf r3 = (X.C22951bf) r3
            com.instagram.service.session.UserSession r0 = r3.A01
            X.3V5 r2 = new X.3V5
            r2.<init>(r3, r0)
            java.lang.Integer r0 = X.AnonymousClass006.A0j
            r8 = 0
            r2.A01(r8, r0)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r3.A00
            if (r0 == 0) goto L_0x0d39
            java.lang.String r6 = "invite_story"
            java.lang.String r7 = r3.A02
            X.JrQ r5 = new X.JrQ
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.BcE(r5)
        L_0x0d39:
            r0 = 552187504(0x20e9b670, float:3.9592462E-19)
            X.C14030oh.A0A(r0, r4)
            r0 = -109050867(0xfffffffff980040d, float:-8.308702E34)
            goto L_0x002f
        L_0x0d44:
            r0 = -1324067556(0xffffffffb114551c, float:-2.1585214E-9)
            int r1 = X.C14030oh.A03(r0)
            X.46T r15 = (X.AnonymousClass46T) r15
            r0 = -802184664(0xffffffffd02fa228, float:-1.17865595E10)
            int r4 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r3 = r14.A00
            X.11L r3 = (X.AnonymousClass11L) r3
            X.BKU r0 = r15.A01
            int r2 = X.AnonymousClass11L.A00(r3, r0)
            if (r2 < 0) goto L_0x0d6f
            java.util.List r0 = r3.A03
            java.lang.Object r2 = r0.get(r2)
            X.13c r2 = (X.C200913c) r2
            if (r2 == 0) goto L_0x0d6f
            int r0 = r15.A00
            X.AnonymousClass11L.A01(r2, r3, r0)
        L_0x0d6f:
            r0 = 1302165347(0x4d9d7763, float:3.3023088E8)
            X.C14030oh.A0A(r0, r4)
            r0 = -1116828313(0xffffffffbd6e8d67, float:-0.05824032)
            goto L_0x002f
        L_0x0d7a:
            r0 = 1031291343(0x3d7841cf, float:0.060609635)
            int r1 = X.C14030oh.A03(r0)
            X.46G r15 = (X.AnonymousClass46G) r15
            r0 = -1958146154(0xffffffff8b490f96, float:-3.8722917E-32)
            int r4 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r3 = r14.A00
            X.11L r3 = (X.AnonymousClass11L) r3
            X.BKU r0 = r15.A00
            int r2 = X.AnonymousClass11L.A00(r3, r0)
            if (r2 < 0) goto L_0x0da7
            java.util.List r0 = r3.A02
            r0.remove(r2)
            r3.notifyItemRemoved(r2)
            java.util.List r0 = r3.A02
            int r0 = r0.size()
            r3.notifyItemRangeChanged(r2, r0)
        L_0x0da7:
            r0 = -1019094764(0xffffffffc341d914, float:-193.84796)
            X.C14030oh.A0A(r0, r4)
            r0 = -1491359006(0xffffffffa71baae2, float:-2.1603207E-15)
            goto L_0x002f
        L_0x0db2:
            r0 = -1004127920(0xffffffffc4263950, float:-664.8955)
            int r1 = X.C14030oh.A03(r0)
            X.45E r15 = (X.AnonymousClass45E) r15
            r0 = 1299043868(0x4d6dd61c, float:2.49389504E8)
            int r5 = X.C14030oh.A03(r0)
            java.lang.String r2 = r15.A00
            java.lang.Object r4 = r14.A00
            X.1cB r4 = (X.AnonymousClass1cB) r4
            com.instagram.service.session.UserSession r0 = r4.A03
            java.lang.String r0 = r0.getUserId()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0deb
            X.AnonymousClass1cB.A01(r4)
            X.1fJ r2 = r4.A00
            java.util.List r0 = r4.A04
            r2.A0A(r0)
            r0 = 0
            X.AnonymousClass1cB.A05(r4, r0)
            X.KHr r3 = X.C38040KHr.A01
            java.lang.Class<X.45E> r2 = X.AnonymousClass45E.class
            X.4pY r0 = r4.A02
            r3.A04(r0, r2)
        L_0x0deb:
            r0 = -761746103(0xffffffffd298ad49, float:-3.27871136E11)
            X.C14030oh.A0A(r0, r5)
            r0 = -1038357750(0xffffffffc21beb0a, float:-38.97953)
            goto L_0x002f
        L_0x0df6:
            r0 = -703052715(0xffffffffd6184455, float:-4.1854813E13)
            int r5 = X.C14030oh.A03(r0)
            r0 = 1990611219(0x76a65113, float:1.6866517E33)
            int r1 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            com.instagram.arp.profilepicture.repository.EditAvatarProfilePictureRepository r0 = (com.instagram.arp.profilepicture.repository.EditAvatarProfilePictureRepository) r0
            com.instagram.arp.profilepicture.repository.EditAvatarProfilePictureRepository.A01(r0)
            r0 = -1497712375(0xffffffffa6bab909, float:-1.2956497E-15)
            X.C14030oh.A0A(r0, r1)
            r0 = -1339579438(0xffffffffb027a3d2, float:-6.098705E-10)
            goto L_0x1371
        L_0x0e16:
            r0 = 2057799890(0x7aa788d2, float:4.349443E35)
            int r4 = X.C14030oh.A03(r0)
            X.46S r15 = (X.AnonymousClass46S) r15
            r0 = -206773852(0xfffffffff3ace1a4, float:-2.7394153E31)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r14.A00
            X.1dd r2 = (X.C23351dd) r2
            X.1fF r0 = r2.A01
            r0.A03()
            X.3DN r7 = r15.A00
            com.instagram.service.session.UserSession r1 = r2.A00
            android.app.Activity r0 = r2.getRootActivity()
            X.H8c r1 = X.AnonymousClass3RN.A00(r0, r1)
            r6 = 0
            X.1hE r0 = new X.1hE
            r0.<init>(r2)
            r1.A00 = r0
            r2.schedule(r1)
            android.content.Context r8 = r2.getContext()
            if (r8 == 0) goto L_0x0e93
            boolean r0 = r7.A0A
            if (r0 != 0) goto L_0x0e93
            java.lang.StringBuilder r5 = X.C18200wM.A0r()
            r2 = 2131830137(0x7f112579, float:1.9293263E38)
            java.lang.String r1 = r7.A07
            if (r1 != 0) goto L_0x0e5d
            java.lang.String r1 = ""
        L_0x0e5d:
            java.lang.String r0 = r7.A05
            if (r0 != 0) goto L_0x0e63
            java.lang.String r0 = ""
        L_0x0e63:
            java.lang.String r0 = X.C18220wO.A0h(r8, r1, r0, r2)
            r5.append(r0)
            java.lang.String r0 = "\n\n"
            r5.append(r0)
            r0 = 2131830138(0x7f11257a, float:1.9293265E38)
            X.C18210wN.A0u(r8, r5, r0)
            X.Dsm r2 = X.C18190wL.A0W(r8)
            r0 = 2131830140(0x7f11257c, float:1.9293269E38)
            r2.A0L(r0)
            r2.A0p(r5)
            r1 = 2131823209(0x7f110a69, float:1.9279211E38)
            r0 = 78
            X.C18190wL.A1R(r2, r14, r7, r0, r1)
            r0 = 2131830139(0x7f11257b, float:1.9293267E38)
            r2.A0O(r6, r0)
            X.AnonymousClass0wJ.A1K(r2)
        L_0x0e93:
            r0 = -1350856266(0xffffffffaf7b91b6, float:-2.2880084E-10)
            X.C14030oh.A0A(r0, r3)
            r0 = -1395487780(0xffffffffacd28bdc, float:-5.9840865E-12)
            goto L_0x11e7
        L_0x0e9e:
            r0 = -826549431(0xffffffffcebbdb49, float:-1.57585523E9)
            int r4 = X.C14030oh.A03(r0)
            r0 = 1935217864(0x735914c8, float:1.7198943E31)
            int r3 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.Object r2 = r14.A00
            X.1cQ r2 = (X.AnonymousClass1cQ) r2
            X.0pE r0 = r2.mLifecycleRegistry
            X.061 r1 = r0.A00
            X.061 r0 = X.AnonymousClass061.CREATED
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0ebf
            X.AnonymousClass1cQ.A01(r2)
        L_0x0ebf:
            r0 = 1178066948(0x4637e004, float:11768.004)
            X.C14030oh.A0A(r0, r3)
            r0 = 22249079(0x1537e77, float:3.8845313E-38)
            goto L_0x11e7
        L_0x0eca:
            r0 = -665418370(0xffffffffd856857e, float:-9.4347533E14)
            int r4 = X.C14030oh.A03(r0)
            r0 = -1940305240(0xffffffff8c594aa8, float:-1.6739538E-31)
            int r6 = X.C14030oh.A03(r0)
            java.lang.Object r5 = r14.A00
            X.49f r5 = (X.C695949f) r5
            com.instagram.service.session.UserSession r0 = r5.A01
            boolean r0 = X.C67343zO.A04(r0)
            if (r0 != 0) goto L_0x0ef2
            X.4qz r3 = r5.A03
            r2 = 0
            r0 = 18
            kotlin.coroutines.jvm.internal.KtSLambdaShape14S0101000_I2_11 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0101000_I2_11
            r1.<init>(r5, r2, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
        L_0x0ef2:
            r0 = -288557914(0xffffffffeeccf4a6, float:-3.1715352E28)
            X.C14030oh.A0A(r0, r6)
            r0 = -2081235780(0xffffffff83f2dcbc, float:-1.427416E-36)
            goto L_0x11e7
        L_0x0efd:
            r0 = -1455721542(0xffffffffa93b73ba, float:-4.1622718E-14)
            int r4 = X.C14030oh.A03(r0)
            X.45E r15 = (X.AnonymousClass45E) r15
            r0 = -509610213(0xffffffffe19ff71b, float:-3.6885477E20)
            int r3 = X.AnonymousClass0wJ.A00(r0, r15)
            java.lang.String r1 = r15.A00
            java.lang.Object r2 = r14.A00
            X.1x2 r2 = (X.AnonymousClass1x2) r2
            X.0Oa r0 = r2.A0L
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            boolean r0 = X.C18250wR.A1J(r0, r1)
            if (r0 == 0) goto L_0x0f28
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.A0I
            r0 = 1
            r1.set(r0)
            X.AnonymousClass1x2.A0D(r2)
        L_0x0f28:
            r0 = 182189530(0xadbfdda, float:2.1184421E-32)
            X.C14030oh.A0A(r0, r3)
            r0 = -1243583316(0xffffffffb5e06cac, float:-1.6720928E-6)
            goto L_0x11e7
        L_0x0f33:
            r0 = -2033333024(0xffffffff86cdcce0, float:-7.7413466E-35)
            int r4 = X.C14030oh.A03(r0)
            r0 = 981642245(0x3a82ac05, float:9.969479E-4)
            int r7 = X.C14030oh.A03(r0)
            X.44X r0 = X.AnonymousClass44X.A00()
            java.lang.Object r8 = r14.A00
            X.1jq r8 = (X.C24691jq) r8
            X.0bf r6 = r8.A06
            java.lang.String r5 = "ig_android_growth_FX_access_fbig_create_cp_claiming"
            java.lang.String r3 = r0.A03(r6, r5)
            X.IcN r0 = r8.A05
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0f75
            java.lang.String r0 = "autologin"
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x0f75
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x0f75
            if (r3 == 0) goto L_0x0f75
            X.1jz r2 = r8.A00
            X.44X r0 = X.AnonymousClass44X.A00()
            java.lang.String r1 = r0.A02(r6, r5)
            r0 = 1
            r2.A0C(r6, r1, r3, r0)
            r8.A02 = r0
        L_0x0f75:
            r0 = 609477488(0x2453e370, float:4.594598E-17)
            X.C14030oh.A0A(r0, r7)
            r0 = 1043468691(0x3e321193, float:0.17389517)
            goto L_0x11e7
        L_0x0f80:
            r0 = -1218621393(0xffffffffb75d502f, float:-1.3191296E-5)
            int r4 = X.C14030oh.A03(r0)
            X.45J r15 = (X.AnonymousClass45J) r15
            r0 = -1601928493(0xffffffffa08482d3, float:-2.2448242E-19)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            X.3Yf r1 = (X.C62313Yf) r1
            monitor-enter(r1)
            boolean r0 = r1.A07     // Catch:{ all -> 0x0fad }
            if (r0 == 0) goto L_0x0fa1
            X.4A5 r0 = new X.4A5     // Catch:{ all -> 0x0fad }
            r0.<init>(r1, r15)     // Catch:{ all -> 0x0fad }
            X.C31155GhB.A03(r0)     // Catch:{ all -> 0x0fad }
        L_0x0fa1:
            monitor-exit(r1)
            r0 = 1158426495(0x450c2f7f, float:2242.9685)
            X.C14030oh.A0A(r0, r2)
            r0 = 1794830504(0x6afaf0a8, float:1.5168396E26)
            goto L_0x11e7
        L_0x0fad:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0fb0:
            java.lang.Object r1 = r14.A00
            X.BEu r1 = (X.C19894BEu) r1
            X.45O r15 = (X.AnonymousClass45O) r15
            android.content.Context r0 = r15.A00
            r1.A0E(r0)
            return
        L_0x0fbc:
            java.lang.Object r1 = r14.A00
            X.1dj r1 = (X.C23391dj) r1
            X.46W r15 = (X.AnonymousClass46W) r15
            boolean r0 = r15.A02
            r1.A0L = r0
            java.util.List r0 = r15.A01
            r1.A0G = r0
            com.instagram.brandedcontent.model.BrandedContentGatingInfo r0 = r15.A00
            if (r0 == 0) goto L_0x0fd0
            r1.A01 = r0
        L_0x0fd0:
            X.C23391dj.A01(r1)
            return
        L_0x0fd4:
            java.lang.Object r1 = r14.A00
            com.instagram.creation.fragment.FollowersShareFragment r1 = (com.instagram.creation.fragment.FollowersShareFragment) r1
            com.instagram.service.session.UserSession r0 = r1.A0T
            X.KK7 r2 = X.KK7.A00(r0)
            androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
            java.lang.String r0 = "next"
            r2.A09(r1, r0)
            return
        L_0x0fe8:
            r0 = -975978622(0xffffffffc5d3bf82, float:-6775.9385)
            int r4 = X.C14030oh.A03(r0)
            r0 = 41392867(0x2779ae3, float:1.8191144E-37)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            X.1wb r1 = (X.AnonymousClass1wb) r1
            java.util.List r0 = X.AnonymousClass1wb.A0B(r1)
            r1.setItems(r0)
            r0 = 193491238(0xb887126, float:5.255554E-32)
            X.C14030oh.A0A(r0, r2)
            r0 = -1603105644(0xffffffffa0728c94, float:-2.0544711E-19)
            goto L_0x11e7
        L_0x100c:
            java.lang.Object r7 = r14.A00
            com.instagram.comments.fragment.CommentThreadFragment r7 = (com.instagram.comments.fragment.CommentThreadFragment) r7
            X.46L r15 = (X.AnonymousClass46L) r15
            int r6 = r15.A00
            X.3iD r5 = X.C63733iD.A01()
            r5.A0C()
            com.instagram.comments.controller.CommentComposerController r0 = r7.A0A
            int r0 = r0.A0I()
            r5.A02 = r0
            android.content.res.Resources r4 = X.AnonymousClass0wJ.A0B(r7)
            r3 = 2131689532(0x7f0f003c, float:1.9008082E38)
            r2 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1 = 0
            java.lang.String r0 = X.C18230wP.A0j(r4, r0, r3, r6)
            r5.A0A = r0
            r0 = 2131824712(0x7f111048, float:1.928226E38)
            java.lang.String r0 = r7.getString(r0)
            X.C04220Ms.A0B(r0, r1)
            r5.A0D = r0
            com.facebook.redex.IDxCBackShape392S0100000_1_I2 r0 = new com.facebook.redex.IDxCBackShape392S0100000_1_I2
            r0.<init>(r7, r1)
            r5.A07 = r0
            r5.A0I = r2
            X.C63733iD.A0A(r5)
            return
        L_0x104f:
            r0 = 916891570(0x36a6a7b2, float:4.966708E-6)
            int r4 = X.C14030oh.A03(r0)
            r0 = 1472758240(0x57c881e0, float:4.40920269E14)
            int r3 = X.C14030oh.A03(r0)
            X.3iD r2 = X.C63733iD.A01()
            java.lang.Object r1 = r14.A00
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r0 = 2131833174(0x7f113156, float:1.9299423E38)
            X.C63733iD.A08(r1, r2, r0)
            X.C63733iD.A0A(r2)
            r0 = -881472967(0xffffffffcb75ca39, float:-1.6108089E7)
            X.C14030oh.A0A(r0, r3)
            r0 = 2097033367(0x7cfe3097, float:1.05586314E37)
            goto L_0x11e7
        L_0x1079:
            r0 = 329113702(0x139de066, float:3.9853646E-27)
            int r4 = X.C14030oh.A03(r0)
            X.E6M r15 = (X.E6M) r15
            r0 = -1513004967(0xffffffffa5d16059, float:-3.6321008E-16)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r14.A00
            com.instagram.business.fragment.SuggestBusinessFragment r3 = (com.instagram.business.fragment.SuggestBusinessFragment) r3
            X.1fT r0 = com.instagram.business.fragment.SuggestBusinessFragment.A00(r3)
            r0.A00()
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = r15.A01
            java.lang.String r0 = "follow_business_id"
            r2.put(r0, r1)
            java.lang.String r0 = "follow_business"
            com.instagram.business.fragment.SuggestBusinessFragment.A02(r3, r0, r2)
            r0 = 253210210(0xf17ae62, float:7.47846E-30)
            X.C14030oh.A0A(r0, r5)
            r0 = 288442839(0x113149d7, float:1.3985592E-28)
            goto L_0x11e7
        L_0x10af:
            r0 = 748386002(0x2c9b76d2, float:4.4185567E-12)
            int r4 = X.C14030oh.A03(r0)
            X.46F r15 = (X.AnonymousClass46F) r15
            r0 = 561257837(0x21741d6d, float:8.270936E-19)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            com.instagram.business.fragment.OnboardingCheckListFragment r1 = (com.instagram.business.fragment.OnboardingCheckListFragment) r1
            r0 = 1
            r1.A0A = r0
            android.os.Handler r3 = r1.A00
            X.4R0 r2 = new X.4R0
            r2.<init>(r14, r15)
            r0 = 300(0x12c, double:1.48E-321)
            r3.postDelayed(r2, r0)
            r0 = 1416392467(0x546c6f13, float:4.06190319E12)
            X.C14030oh.A0A(r0, r5)
            r0 = -1418477206(0xffffffffab73c16a, float:-8.659936E-13)
            goto L_0x11e7
        L_0x10dd:
            r0 = 1542239264(0x5becb420, float:1.33252288E17)
            int r4 = X.C14030oh.A03(r0)
            r0 = -470241010(0xffffffffe3f8b10e, float:-9.1751013E21)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            X.1bz r1 = (X.C23141bz) r1
            com.instagram.service.session.UserSession r0 = r1.A05
            X.3V5 r2 = new X.3V5
            r2.<init>(r1, r0)
            java.lang.Integer r1 = X.AnonymousClass006.A15
            r0 = 0
            r2.A01(r0, r1)
            r0 = -1984259884(0xffffffff89ba98d4, float:-4.492159E-33)
            X.C14030oh.A0A(r0, r3)
            r0 = 1239566031(0x49e246cf, float:1853657.9)
            goto L_0x11e7
        L_0x1107:
            r0 = 1864310274(0x6f1f1e02, float:4.9244394E28)
            int r4 = X.C14030oh.A03(r0)
            r0 = 1658613916(0x62dc709c, float:2.033199E21)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            com.instagram.business.fragment.InviteFollowersV2Fragment r1 = (com.instagram.business.fragment.InviteFollowersV2Fragment) r1
            com.instagram.service.session.UserSession r0 = r1.A04
            X.3V5 r2 = new X.3V5
            r2.<init>(r1, r0)
            java.lang.Integer r1 = X.AnonymousClass006.A0Y
            r0 = 0
            r2.A01(r0, r1)
            r0 = 886477957(0x34d69485, float:3.9968668E-7)
            X.C14030oh.A0A(r0, r3)
            r0 = 1225553073(0x490c74b1, float:575307.06)
            goto L_0x11e7
        L_0x1131:
            r0 = -574889427(0xffffffffddbbe22d, float:-1.69230411E18)
            int r4 = X.C14030oh.A03(r0)
            r0 = 1229494813(0x49489a1d, float:821665.8)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.1cS r0 = (X.AnonymousClass1cS) r0
            com.instagram.business.ui.BusinessInfoSectionView r1 = r0.A03
            com.instagram.service.session.UserSession r0 = r0.A06
            r1.A05(r0)
            r0 = -2132646016(0xffffffff80e26780, float:-2.0791951E-38)
            X.C14030oh.A0A(r0, r2)
            r0 = -1297490855(0xffffffffb2a9dc59, float:-1.9774392E-8)
            goto L_0x11e7
        L_0x1155:
            r0 = -102499723(0xfffffffff9e3fa75, float:-1.4796641E35)
            int r4 = X.C14030oh.A03(r0)
            r0 = 980323375(0x3a6e8c2f, float:9.0998685E-4)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            X.1cT r0 = (X.AnonymousClass1cT) r0
            com.instagram.business.ui.BusinessInfoSectionView r1 = r0.A04
            com.instagram.service.session.UserSession r0 = r0.A07
            r1.A05(r0)
            r0 = -2089671645(0xffffffff83722423, float:-7.115889E-37)
            X.C14030oh.A0A(r0, r2)
            r0 = 1134376759(0x439d3737, float:314.43137)
            goto L_0x11e7
        L_0x1178:
            r0 = 739141885(0x2c0e68fd, float:2.0237694E-12)
            int r4 = X.C14030oh.A03(r0)
            r0 = -1738580936(0xffffffff985f5c38, float:-2.8868633E-24)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            X.1bg r1 = (X.C22961bg) r1
            X.0Oa r0 = r1.A0B
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.3V5 r2 = new X.3V5
            r2.<init>(r1, r0)
            java.lang.Integer r1 = X.AnonymousClass006.A02
            r0 = 0
            r2.A01(r0, r1)
            r0 = 2077142998(0x7bceafd6, float:2.146359E36)
            X.C14030oh.A0A(r0, r3)
            r0 = -539393110(0xffffffffdfd983aa, float:-3.1347116E19)
            goto L_0x11e7
        L_0x11a5:
            java.lang.Object r2 = r14.A00
            X.1lP r2 = (X.AnonymousClass1lP) r2
            java.lang.String r1 = "RageShakeSensorHelper"
            java.lang.String r0 = "enableOrDisableRageShakeListener start"
            X.AnonymousClass0LU.A0C(r1, r0)
            boolean r0 = X.AnonymousClass1lP.A00(r2)
            if (r0 == 0) goto L_0x11ba
            r2.A02()
            return
        L_0x11ba:
            r2.A03()
            return
        L_0x11be:
            r0 = -452158979(0xffffffffe50c99fd, float:-4.1498243E22)
            int r4 = X.C14030oh.A03(r0)
            r0 = -765882219(0xffffffffd2599095, float:-2.33608397E11)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            X.1c8 r1 = (X.AnonymousClass1c8) r1
            com.instagram.service.session.UserSession r0 = r1.A0F
            if (r0 == 0) goto L_0x11de
            r1.requireContext()
            java.lang.String r0 = "getArchivePendingUpload"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x11de:
            r0 = -104369464(0xfffffffff9c772c8, float:-1.2944939E35)
            X.C14030oh.A0A(r0, r2)
            r0 = -685117829(0xffffffffd729ee7b, float:-1.86841731E14)
        L_0x11e7:
            X.C14030oh.A0A(r0, r4)
            return
        L_0x11eb:
            r0 = -467101910(0xffffffffe428972a, float:-1.2439782E22)
            int r5 = X.C14030oh.A03(r0)
            r0 = -1476374633(0xffffffffa8004f97, float:-7.122686E-15)
            int r6 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r14.A00
            com.instagram.arp.profilepicture.repository.EditAvatarProfilePictureRepository r4 = (com.instagram.arp.profilepicture.repository.EditAvatarProfilePictureRepository) r4
            X.4wE r0 = r4.A0A
            X.5z3 r1 = X.AnonymousClass5z3.A00
            r0.CrC(r1)
            X.4wE r0 = r4.A0C
            r0.CrC(r1)
            X.4qz r3 = r4.A09
            r2 = 0
            r0 = 5
            kotlin.coroutines.jvm.internal.KtSLambdaShape4S0101000_I2_1 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape4S0101000_I2_1
            r1.<init>(r4, r2, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
            r0 = 730482053(0x2b8a4585, float:9.824785E-13)
            X.C14030oh.A0A(r0, r6)
            r0 = 666943146(0x27c0beaa, float:5.3497424E-15)
            goto L_0x1371
        L_0x1221:
            r0 = -1675073079(0xffffffff9c2869c9, float:-5.572326E-22)
            X.C14030oh.A03(r0)
            r0 = 390810217(0x174b4a69, float:6.5686756E-25)
            X.C14030oh.A03(r0)
            java.lang.String r0 = "getSuccess"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x1234:
            r0 = 1420403304(0x54a9a268, float:5.8285936E12)
            X.C14030oh.A03(r0)
            r0 = 712864232(0x2a7d71e8, float:2.2510433E-13)
            X.C14030oh.A03(r0)
            java.lang.String r0 = "setOnboardingCheckListState"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x1247:
            r0 = -567813766(0xffffffffde27d97a, float:-3.0237081E18)
            X.C14030oh.A03(r0)
            r0 = 237490612(0xe27d1b4, float:2.0685308E-30)
            X.C14030oh.A03(r0)
            java.lang.String r0 = "updateBadgeViewVisibility"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x125a:
            r0 = -321929561(0xffffffffeccfbea7, float:-2.0091838E27)
            X.C14030oh.A03(r0)
            r0 = -338615828(0xffffffffebd121ec, float:-5.0565138E26)
            X.C14030oh.A03(r0)
            java.lang.String r0 = "getGenericMegaphone"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x126d:
            r0 = 532915697(0x1fc3a5f1, float:8.286024E-20)
            X.C14030oh.A03(r0)
            r0 = -767272970(0xffffffffd24457f6, float:-2.10822332E11)
            X.C14030oh.A03(r0)
            java.lang.String r0 = "setTranslatedBiography"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x1280:
            java.lang.Object r0 = r14.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r0.requireContext()
            r0.requireActivity()
            java.lang.String r0 = "getDefaultMesssageSentConfirmationSnackBar"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x1291:
            r0 = -1544178029(0xffffffffa3f5b693, float:-2.6640276E-17)
            X.C14030oh.A03(r0)
            r0 = -320816034(0xffffffffece0bc5e, float:-2.1735114E27)
            X.C14030oh.A03(r0)
            r1 = 0
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.mainactivity.delegate.IgNavigator"
            X.C04220Ms.A0C(r1, r0)
            java.lang.String r0 = "scrollToTop"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x12aa:
            r0 = -2101827479(0xffffffff82b8a869, float:-2.7133033E-37)
            X.C14030oh.A03(r0)
            r0 = 656529472(0x2721d840, float:2.2460468E-15)
            X.C14030oh.A03(r0)
            java.lang.Object r1 = r14.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<com.facebook.CustomTabMainActivity> r0 = com.facebook.CustomTabMainActivity.class
            android.content.Intent r1 = X.C18250wR.A04(r1, r0)
            java.lang.String r0 = "CustomTabMainActivity.action_refresh"
            r1.setAction(r0)
            java.lang.String r0 = "getRedirectUrl"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x12cc:
            java.lang.Object r5 = r14.A00
            X.3Fo r5 = (X.AnonymousClass3Fo) r5
            X.46B r15 = (X.AnonymousClass46B) r15
            java.lang.Boolean r0 = r15.A00
            r4 = 0
            r5.A02 = r4
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 == 0) goto L_0x1305
            com.instagram.service.session.UserSession r0 = r5.A04
            X.AnonymousClass49X.A02(r0)
            r5.A01 = r1
        L_0x12e5:
            com.instagram.service.session.UserSession r3 = r5.A04
            X.2A2 r0 = X.AnonymousClass2A2.A03
            java.lang.String r2 = r0.toString()
            X.C04220Ms.A0B(r3, r4)
            X.C04220Ms.A0B(r2, r1)
            X.2AF r1 = X.AnonymousClass2AF.A0h
            r0 = 0
            X.C63003bJ.A00(r1, r3, r2, r0)
            X.KHq r2 = X.AnonymousClass3LY.A00(r3)
            java.lang.Class<X.46B> r1 = X.AnonymousClass46B.class
            X.4pY r0 = r5.A03
            r2.A02(r0, r1)
            return
        L_0x1305:
            r5.A00 = r1
            goto L_0x12e5
        L_0x1308:
            java.lang.String r0 = "quietModeToggle"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x130f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x1314:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x1317:
            r0 = -1453064737(0xffffffffa963fddf, float:-5.0624323E-14)
            int r5 = X.C14030oh.A03(r0)
            r0 = -58992796(0xfffffffffc7bd764, float:-5.2305406E36)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r3 = r14.A00
            X.1ae r3 = (X.AnonymousClass1ae) r3
            android.view.View r0 = r3.A03
            if (r0 != 0) goto L_0x1334
            java.lang.String r5 = "quietModeTurnOnAutomaticallyRow"
        L_0x132f:
            X.C04220Ms.A0E(r5)
            r0 = 0
            throw r0
        L_0x1334:
            float r2 = r0.getAlpha()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x1349
            com.instagram.igds.components.switchbutton.IgSwitch r0 = r3.A0C
            if (r0 != 0) goto L_0x1346
            java.lang.String r5 = "quietModeToggle"
            goto L_0x132f
        L_0x1346:
            r0.setChecked(r1)
        L_0x1349:
            r0 = 1596717943(0x5f2bfb77, float:1.239263E19)
            X.C14030oh.A0A(r0, r4)
            r0 = 1875787208(0x6fce3dc8, float:1.276572E29)
            goto L_0x1371
        L_0x1353:
            r0 = 95046337(0x5aa4ac1, float:1.6014183E-35)
            int r5 = X.C14030oh.A03(r0)
            r0 = 578941585(0x2281f291, float:3.5222347E-18)
            int r1 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r14.A00
            com.instagram.arp.profilepicture.repository.EditAvatarProfilePictureRepository r0 = (com.instagram.arp.profilepicture.repository.EditAvatarProfilePictureRepository) r0
            com.instagram.arp.profilepicture.repository.EditAvatarProfilePictureRepository.A01(r0)
            r0 = 1287082926(0x4cb753ae, float:9.611608E7)
            X.C14030oh.A0A(r0, r1)
            r0 = 1654376244(0x629bc734, float:1.4367997E21)
        L_0x1371:
            X.C14030oh.A0A(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxEListenerShape223S0100000_1_I2.onEvent(java.lang.Object):void");
    }

    public IDxEListenerShape223S0100000_1_I2(FollowersShareFragment followersShareFragment, int i) {
        this.A01 = i;
        if (24 - i != 0) {
            this.A00 = followersShareFragment;
        } else {
            this.A00 = followersShareFragment;
        }
    }

    public IDxEListenerShape223S0100000_1_I2(UserDetailFragment userDetailFragment, int i) {
        this.A01 = i;
        if (63 - i != 0) {
            this.A00 = userDetailFragment;
        } else {
            this.A00 = userDetailFragment;
        }
    }

    public IDxEListenerShape223S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
