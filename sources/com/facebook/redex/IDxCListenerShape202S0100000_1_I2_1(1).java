package com.facebook.redex;

import X.AnonymousClass137;
import X.AnonymousClass1wD;
import X.AnonymousClass3HD;
import X.AnonymousClass3T7;
import X.AnonymousClass3YG;
import X.C09830gl;
import X.C18210wN;
import X.C22891ay;
import X.C23151ca;
import X.C62693aX;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import ch.boye.httpclientandroidlib.HttpStatus;

public class IDxCListenerShape202S0100000_1_I2_1 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape202S0100000_1_I2_1(C22891ay r1, int i) {
        this.A01 = i;
        if (18 - i != 0) {
            this.A00 = r1;
        } else {
            this.A00 = r1;
        }
    }

    public static final void A00(View view, IDxCListenerShape202S0100000_1_I2_1 iDxCListenerShape202S0100000_1_I2_1) {
        Context context = view.getContext();
        C09830gl.A01(context, C18210wN.A0c(((AnonymousClass137) iDxCListenerShape202S0100000_1_I2_1.A00).A01), (String) null);
        C63813iO.A0A(context, 2131825599, 1);
    }

    public static final void A01(IDxCListenerShape202S0100000_1_I2_1 iDxCListenerShape202S0100000_1_I2_1) {
        TextView textView;
        int i;
        AnonymousClass137 r2 = (AnonymousClass137) iDxCListenerShape202S0100000_1_I2_1.A00;
        TextView textView2 = r2.A01;
        if (textView2.getVisibility() == 0) {
            textView2.setVisibility(8);
            textView = r2.A02;
            i = 2131825613;
        } else {
            textView2.setVisibility(0);
            textView = r2.A02;
            i = 2131825612;
        }
        textView.setText(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1016:0x3fc1, code lost:
        X.C14030oh.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1017:0x3fc4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1070:0x438e, code lost:
        r1.A03 = r0;
        r1.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1071:0x4393, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1082:0x4407, code lost:
        X.C14030oh.A0C(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1083:0x440a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1132:0x45aa, code lost:
        X.C14030oh.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1133:0x45ad, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1140:0x4609, code lost:
        X.C14030oh.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1141:0x460c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1190:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e9, code lost:
        r0 = "plugin";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x1c06, code lost:
        X.C04220Ms.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x1c0a, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
        X.C14030oh.A0C(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r23) {
        /*
            r22 = this;
            r3 = r22
            int r0 = r3.A01
            r2 = r23
            switch(r0) {
                case 0: goto L_0x20e7;
                case 1: goto L_0x20db;
                case 2: goto L_0x20cf;
                case 3: goto L_0x20c3;
                case 4: goto L_0x2097;
                case 5: goto L_0x205c;
                case 6: goto L_0x2028;
                case 7: goto L_0x4439;
                case 8: goto L_0x1f6b;
                case 9: goto L_0x1e8a;
                case 10: goto L_0x1e76;
                case 11: goto L_0x45ae;
                case 12: goto L_0x1e49;
                case 13: goto L_0x1d5f;
                case 14: goto L_0x1d30;
                case 15: goto L_0x1d18;
                case 16: goto L_0x1cea;
                case 17: goto L_0x1c62;
                case 18: goto L_0x440b;
                case 19: goto L_0x1c18;
                case 20: goto L_0x1be6;
                case 21: goto L_0x1b93;
                case 22: goto L_0x1b65;
                case 23: goto L_0x1b35;
                case 24: goto L_0x1af5;
                case 25: goto L_0x1a53;
                case 26: goto L_0x1a40;
                case 27: goto L_0x1a22;
                case 28: goto L_0x19f9;
                case 29: goto L_0x19c7;
                case 30: goto L_0x19ac;
                case 31: goto L_0x1943;
                case 32: goto L_0x1928;
                case 33: goto L_0x18aa;
                case 34: goto L_0x1891;
                case 35: goto L_0x1878;
                case 36: goto L_0x1852;
                case 37: goto L_0x180c;
                case 38: goto L_0x17e1;
                case 39: goto L_0x17ce;
                case 40: goto L_0x1776;
                case 41: goto L_0x1759;
                case 42: goto L_0x173c;
                case 43: goto L_0x16ec;
                case 44: goto L_0x1681;
                case 45: goto L_0x43fd;
                case 46: goto L_0x43f2;
                case 47: goto L_0x4702;
                case 48: goto L_0x46ed;
                case 49: goto L_0x1650;
                case 50: goto L_0x1637;
                case 51: goto L_0x161e;
                case 52: goto L_0x15c3;
                case 53: goto L_0x157e;
                case 54: goto L_0x155f;
                case 55: goto L_0x43da;
                case 56: goto L_0x1535;
                case 57: goto L_0x1524;
                case 58: goto L_0x1511;
                case 59: goto L_0x43d6;
                case 60: goto L_0x43d2;
                case 61: goto L_0x14bc;
                case 62: goto L_0x1491;
                case 63: goto L_0x1450;
                case 64: goto L_0x13fe;
                case 65: goto L_0x13eb;
                case 66: goto L_0x13d8;
                case 67: goto L_0x13a9;
                case 68: goto L_0x4394;
                case 69: goto L_0x1337;
                case 70: goto L_0x131a;
                case 71: goto L_0x4377;
                case 72: goto L_0x4361;
                case 73: goto L_0x4335;
                case 74: goto L_0x1305;
                case 75: goto L_0x12f9;
                case 76: goto L_0x12e5;
                case 77: goto L_0x12ab;
                case 78: goto L_0x1268;
                case 79: goto L_0x1243;
                case 80: goto L_0x121e;
                case 81: goto L_0x1202;
                case 82: goto L_0x11f6;
                case 83: goto L_0x11ea;
                case 84: goto L_0x4639;
                case 85: goto L_0x462b;
                case 86: goto L_0x11a6;
                case 87: goto L_0x119a;
                case 88: goto L_0x4313;
                case 89: goto L_0x115e;
                case 90: goto L_0x1146;
                case 91: goto L_0x112e;
                case 92: goto L_0x1116;
                case 93: goto L_0x10fe;
                case 94: goto L_0x10e6;
                case 95: goto L_0x10ce;
                case 96: goto L_0x109d;
                case 97: goto L_0x1068;
                case 98: goto L_0x42f9;
                case 99: goto L_0x42e3;
                case 100: goto L_0x42ca;
                case 101: goto L_0x428e;
                case 102: goto L_0x4275;
                case 103: goto L_0x00c8;
                case 104: goto L_0x425c;
                case 105: goto L_0x423a;
                case 106: goto L_0x41e1;
                case 107: goto L_0x4199;
                case 108: goto L_0x4171;
                case 109: goto L_0x412b;
                case 110: goto L_0x4112;
                case 111: goto L_0x40f9;
                case 112: goto L_0x40de;
                case 113: goto L_0x40c1;
                case 114: goto L_0x409f;
                case 115: goto L_0x4082;
                case 116: goto L_0x404a;
                case 117: goto L_0x00a7;
                case 118: goto L_0x103f;
                case 119: goto L_0x0fe6;
                case 120: goto L_0x0fa9;
                case 121: goto L_0x0f7e;
                case 122: goto L_0x0f53;
                case 123: goto L_0x0f2b;
                case 124: goto L_0x0efd;
                case 125: goto L_0x0ed6;
                case 126: goto L_0x0ea6;
                case 127: goto L_0x0e7b;
                case 128: goto L_0x0e53;
                case 129: goto L_0x0e28;
                case 130: goto L_0x0dfd;
                case 131: goto L_0x0dd2;
                case 132: goto L_0x0da7;
                case 133: goto L_0x4034;
                case 134: goto L_0x3ff6;
                case 135: goto L_0x3fe7;
                case 136: goto L_0x3fd0;
                case 137: goto L_0x0d85;
                case 138: goto L_0x0cf8;
                case 139: goto L_0x0cce;
                case 140: goto L_0x0ca1;
                case 141: goto L_0x3fa6;
                case 142: goto L_0x3f5d;
                case 143: goto L_0x3f31;
                case 144: goto L_0x3f05;
                case 145: goto L_0x3ed9;
                case 146: goto L_0x46ca;
                case 147: goto L_0x3eb4;
                case 148: goto L_0x46b7;
                case 149: goto L_0x3e8e;
                case 150: goto L_0x3e5c;
                case 151: goto L_0x0be6;
                case 152: goto L_0x3e2d;
                case 153: goto L_0x3dac;
                case 154: goto L_0x3d57;
                case 155: goto L_0x3d2f;
                case 156: goto L_0x3d0a;
                case 157: goto L_0x3ce0;
                case 158: goto L_0x469c;
                case 159: goto L_0x4691;
                case 160: goto L_0x3cca;
                case 161: goto L_0x3c93;
                case 162: goto L_0x3c57;
                case 163: goto L_0x3c1a;
                case 164: goto L_0x3bf6;
                case 165: goto L_0x3be9;
                case 166: goto L_0x3bdc;
                case 167: goto L_0x3b99;
                case 168: goto L_0x3b8c;
                case 169: goto L_0x3b5c;
                case 170: goto L_0x3b41;
                case 171: goto L_0x3b1c;
                case 172: goto L_0x0ba5;
                case 173: goto L_0x3aeb;
                case 174: goto L_0x0b4f;
                case 175: goto L_0x3ac3;
                case 176: goto L_0x3aa6;
                case 177: goto L_0x3a85;
                case 178: goto L_0x0ae7;
                case 179: goto L_0x3a59;
                case 180: goto L_0x3a32;
                case 181: goto L_0x39f3;
                case 182: goto L_0x39dd;
                case 183: goto L_0x39c0;
                case 184: goto L_0x39aa;
                case 185: goto L_0x3984;
                case 186: goto L_0x3945;
                case 187: goto L_0x3928;
                case 188: goto L_0x38fc;
                case 189: goto L_0x3892;
                case 190: goto L_0x3883;
                case 191: goto L_0x3863;
                case 192: goto L_0x3843;
                case 193: goto L_0x3825;
                case 194: goto L_0x3812;
                case 195: goto L_0x37ff;
                case 196: goto L_0x467d;
                case 197: goto L_0x0a8c;
                case 198: goto L_0x0a46;
                case 199: goto L_0x37d0;
                case 200: goto L_0x37a6;
                case 201: goto L_0x3777;
                case 202: goto L_0x375d;
                case 203: goto L_0x3743;
                case 204: goto L_0x3725;
                case 205: goto L_0x36f1;
                case 206: goto L_0x36bd;
                case 207: goto L_0x367f;
                case 208: goto L_0x0a14;
                case 209: goto L_0x366a;
                case 210: goto L_0x3639;
                case 211: goto L_0x35dc;
                case 212: goto L_0x35b6;
                case 213: goto L_0x3578;
                case 214: goto L_0x355c;
                case 215: goto L_0x3540;
                case 216: goto L_0x3525;
                case 217: goto L_0x34ea;
                case 218: goto L_0x34ac;
                case 219: goto L_0x3479;
                case 220: goto L_0x3450;
                case 221: goto L_0x3427;
                case 222: goto L_0x33fe;
                case 223: goto L_0x33d2;
                case 224: goto L_0x33c6;
                case 225: goto L_0x3380;
                case 226: goto L_0x09ca;
                case 227: goto L_0x3369;
                case 228: goto L_0x3355;
                case 229: goto L_0x004c;
                case 230: goto L_0x333e;
                case 231: goto L_0x3327;
                case 232: goto L_0x3314;
                case 233: goto L_0x32fc;
                case 234: goto L_0x32bd;
                case 235: goto L_0x0962;
                case 236: goto L_0x327b;
                case 237: goto L_0x324f;
                case 238: goto L_0x322f;
                case 239: goto L_0x3211;
                case 240: goto L_0x31e2;
                case 241: goto L_0x31c7;
                case 242: goto L_0x3195;
                case 243: goto L_0x316f;
                case 244: goto L_0x312b;
                case 245: goto L_0x3103;
                case 246: goto L_0x090f;
                case 247: goto L_0x08cf;
                case 248: goto L_0x30cd;
                case 249: goto L_0x30b1;
                case 250: goto L_0x3095;
                case 251: goto L_0x3080;
                case 252: goto L_0x3056;
                case 253: goto L_0x302c;
                case 254: goto L_0x2fda;
                case 255: goto L_0x2f9c;
                case 256: goto L_0x2f77;
                case 257: goto L_0x2f54;
                case 258: goto L_0x2f26;
                case 259: goto L_0x2f0c;
                case 260: goto L_0x0872;
                case 261: goto L_0x2e57;
                case 262: goto L_0x0830;
                case 263: goto L_0x2e2f;
                case 264: goto L_0x2e16;
                case 265: goto L_0x2dcb;
                case 266: goto L_0x2dbf;
                case 267: goto L_0x2db3;
                case 268: goto L_0x2da0;
                case 269: goto L_0x2d8d;
                case 270: goto L_0x2d7a;
                case 271: goto L_0x2d54;
                case 272: goto L_0x2d41;
                case 273: goto L_0x2d2e;
                case 274: goto L_0x2d26;
                case 275: goto L_0x2ced;
                case 276: goto L_0x2cbc;
                case 277: goto L_0x2c84;
                case 278: goto L_0x2c6f;
                case 279: goto L_0x2c45;
                case 280: goto L_0x2c13;
                case 281: goto L_0x2bea;
                case 282: goto L_0x07b5;
                case 283: goto L_0x06f6;
                case 284: goto L_0x06d1;
                case 285: goto L_0x0677;
                case 286: goto L_0x05cb;
                case 287: goto L_0x057e;
                case 288: goto L_0x2b9d;
                case 289: goto L_0x2b78;
                case 290: goto L_0x2b53;
                case 291: goto L_0x2b2e;
                case 292: goto L_0x2b09;
                case 293: goto L_0x0514;
                case 294: goto L_0x2ad2;
                case 295: goto L_0x2abf;
                case 296: goto L_0x2aac;
                case 297: goto L_0x2a99;
                case 298: goto L_0x2a86;
                case 299: goto L_0x2a7a;
                case 300: goto L_0x2a6e;
                case 301: goto L_0x2a54;
                case 302: goto L_0x2a48;
                case 303: goto L_0x2a11;
                case 304: goto L_0x2a05;
                case 305: goto L_0x29f9;
                case 306: goto L_0x29ed;
                case 307: goto L_0x29e1;
                case 308: goto L_0x29ce;
                case 309: goto L_0x29bb;
                case 310: goto L_0x29af;
                case 311: goto L_0x29a3;
                case 312: goto L_0x2997;
                case 313: goto L_0x298b;
                case 314: goto L_0x2934;
                case 315: goto L_0x28e6;
                case 316: goto L_0x2890;
                case 317: goto L_0x2853;
                case 318: goto L_0x04a0;
                case 319: goto L_0x2840;
                case 320: goto L_0x0477;
                case 321: goto L_0x042a;
                case 322: goto L_0x2809;
                case 323: goto L_0x27f0;
                case 324: goto L_0x27da;
                case 325: goto L_0x27ce;
                case 326: goto L_0x27c2;
                case 327: goto L_0x27ab;
                case 328: goto L_0x2794;
                case 329: goto L_0x278a;
                case 330: goto L_0x2777;
                case 331: goto L_0x038f;
                case 332: goto L_0x4465;
                case 333: goto L_0x2751;
                case 334: goto L_0x2745;
                case 335: goto L_0x272d;
                case 336: goto L_0x2721;
                case 337: goto L_0x2715;
                case 338: goto L_0x2709;
                case 339: goto L_0x26e5;
                case 340: goto L_0x0344;
                case 341: goto L_0x4647;
                case 342: goto L_0x26d9;
                case 343: goto L_0x26cd;
                case 344: goto L_0x268b;
                case 345: goto L_0x25d9;
                case 346: goto L_0x25a7;
                case 347: goto L_0x2573;
                case 348: goto L_0x2560;
                case 349: goto L_0x2554;
                case 350: goto L_0x2515;
                case 351: goto L_0x24fa;
                case 352: goto L_0x24ee;
                case 353: goto L_0x24e2;
                case 354: goto L_0x24d6;
                case 355: goto L_0x032d;
                case 356: goto L_0x02d6;
                case 357: goto L_0x0282;
                case 358: goto L_0x0276;
                case 359: goto L_0x024b;
                case 360: goto L_0x243d;
                case 361: goto L_0x0039;
                case 362: goto L_0x2374;
                case 363: goto L_0x2338;
                case 364: goto L_0x2303;
                case 365: goto L_0x22e3;
                case 366: goto L_0x22b4;
                case 367: goto L_0x2292;
                case 368: goto L_0x2270;
                case 369: goto L_0x01e1;
                case 370: goto L_0x2242;
                case 371: goto L_0x21c2;
                case 372: goto L_0x01b2;
                case 373: goto L_0x015b;
                case 374: goto L_0x00ed;
                case 375: goto L_0x222f;
                case 376: goto L_0x221c;
                case 377: goto L_0x2209;
                case 378: goto L_0x21f8;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = -1563703603(0xffffffffa2cbc6cd, float:-5.523375E-18)
            int r0 = X.C14030oh.A05(r0)
            android.content.Context r2 = r2.getContext()
            java.lang.Object r4 = r3.A00
            com.instagram.service.session.UserSession r4 = (com.instagram.service.session.UserSession) r4
            X.GVD r1 = X.C25745DrH.A00
            X.DrH r3 = r1.A02(r2)
            if (r3 == 0) goto L_0x0032
            com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            X.CRF r2 = new X.CRF
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass0wJ.A0E(r4)
            r2.setArguments(r1)
            r3.A07(r2)
        L_0x0032:
            r1 = -1668743661(0xffffffff9c88fe13, float:-9.065402E-22)
        L_0x0035:
            X.C14030oh.A0C(r1, r0)
        L_0x0038:
            return
        L_0x0039:
            r0 = 970508664(0x39d8c978, float:4.1348836E-4)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.1as r0 = (X.C22871as) r0
            androidx.fragment.app.FragmentActivity r0 = r0.A00
            if (r0 != 0) goto L_0x21f0
            java.lang.String r0 = "activity"
            goto L_0x1c06
        L_0x004c:
            r0 = 219379686(0xd1377e6, float:4.5442195E-31)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r7 = r3.A00
            X.1Yx r7 = (X.C22651Yx) r7
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x006c
            android.graphics.Bitmap r0 = r7.A00
            if (r0 == 0) goto L_0x006c
            boolean r0 = r7.A0D
            if (r0 != 0) goto L_0x006c
            r0 = 0
            X.C22651Yx.A06(r7, r0)
        L_0x0067:
            r0 = 838373911(0x31f89217, float:7.2343584E-9)
            goto L_0x45aa
        L_0x006c:
            X.0Oa r6 = r7.A0N
            X.0i6 r5 = X.AnonymousClass0wJ.A0U(r6)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r4 = com.instagram.modal.TransparentModalActivity.class
            android.os.Bundle r3 = r7.mArguments
            androidx.fragment.app.FragmentActivity r1 = r7.getActivity()
            java.lang.String r0 = "BIRTHDAY_SELFIE_CAMERA"
            X.3iT r1 = X.C63863iT.A06(r1, r3, r5, r4, r0)
            r0 = 7766(0x1e56, float:1.0882E-41)
            r1.A0J(r7, r0)
            X.3Eb r3 = r7.A09
            if (r3 != 0) goto L_0x008d
            java.lang.String r0 = "birthdayLogger"
            goto L_0x1c06
        L_0x008d:
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r6)
            long r7 = X.C18200wM.A0B(r0)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r6)
            long r9 = X.C18200wM.A0B(r0)
            java.lang.String r4 = "qp"
            java.lang.String r5 = "birthday_selfie_camera"
            java.lang.String r6 = "open"
            r3.A00(r4, r5, r6, r7, r9)
            goto L_0x0067
        L_0x00a7:
            java.lang.Object r0 = r3.A00
            X.3YG r0 = (X.AnonymousClass3YG) r0
            X.3RM r5 = X.AnonymousClass3RM.A00
            if (r5 == 0) goto L_0x00e9
            androidx.fragment.app.FragmentActivity r1 = r0.A01
            com.instagram.service.session.UserSession r4 = r0.A05
            X.0kW r2 = r0.A04
            X.LcG r3 = X.C40309LcG.A0n
            r6 = 0
            X.AnonymousClass0wJ.A1N(r1, r4)
            X.AnonymousClass0wJ.A1Q(r2, r3)
            r7 = r6
            r8 = r6
            X.3ad r0 = X.AnonymousClass3RM.A00(r1, r2, r3, r4, r5, r6, r7, r8)
            r0.A04()
            return
        L_0x00c8:
            java.lang.Object r2 = r3.A00
            X.3YG r2 = (X.AnonymousClass3YG) r2
            X.LcG r0 = X.C40309LcG.A0n
            java.lang.String r7 = r0.toString()
            androidx.fragment.app.FragmentActivity r4 = r2.A01
            com.instagram.service.session.UserSession r6 = r2.A05
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r4, r6)
            X.3E3 r3 = X.AnonymousClass3E3.A00
            if (r3 == 0) goto L_0x00e9
            X.0kW r5 = r2.A04
            r9 = 0
            r8 = r7
            r10 = r9
            androidx.fragment.app.Fragment r0 = r3.A00(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x438e
        L_0x00e9:
            java.lang.String r0 = "plugin"
            goto L_0x1c06
        L_0x00ed:
            r0 = 2044973579(0x79e3d20b, float:1.4786395E35)
            int r0 = X.C14030oh.A05(r0)
            X.C19335Aud.A00()
            java.lang.Object r1 = r3.A00
            X.Jqj r1 = (X.C37381Jqj) r1
            com.instagram.service.session.UserSession r3 = r1.A03
            X.1dm r2 = r1.A04
            android.content.Context r6 = r2.requireContext()
            r5 = 0
            android.os.Bundle r1 = X.C18180wK.A06()
            X.1Xo r4 = new X.1Xo
            r4.<init>()
            r4.setArguments(r1)
            X.Jj9 r3 = X.C18210wN.A0L(r3)
            r1 = 2131837494(0x7f114236, float:1.9308185E38)
            X.C18230wP.A10(r6, r3, r1)
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            if (r1 == 0) goto L_0x0143
            X.DrH r1 = X.C18220wO.A0b(r1)
            if (r1 == 0) goto L_0x0143
            X.Jqm r2 = X.C37383Jqm.A02(r1)
            if (r2 == 0) goto L_0x013f
            androidx.fragment.app.Fragment r1 = r1.A08()
            if (r1 == 0) goto L_0x0137
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            r1.A0L(r5)
        L_0x0137:
            r2.A09(r4, r3)
        L_0x013a:
            r1 = -464793024(0xffffffffe44bd240, float:-1.5039357E22)
            goto L_0x0035
        L_0x013f:
            X.C18200wM.A16(r6, r4, r3)
            goto L_0x013a
        L_0x0143:
            X.0on r3 = X.C10770iu.A00()
            r2 = 817892535(0x30c00cb7, float:1.3973452E-9)
            java.lang.String r1 = "Navigator"
            X.0oo r3 = r3.ABJ(r1, r2)
            java.lang.String r2 = "error"
            java.lang.String r1 = "Didn't find BottomSheetNavigator where one was expected."
            r3.A8U(r2, r1)
            r3.report()
            goto L_0x013a
        L_0x015b:
            r0 = -1692761422(0xffffffff9b1a82b2, float:-1.2780811E-22)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.3Bu r1 = (X.C57623Bu) r1
            java.lang.String r4 = "feed_composer"
            X.3St r3 = r1.A01
            if (r3 == 0) goto L_0x017c
            com.instagram.service.session.UserSession r2 = r1.A03
            X.IcN r1 = r1.A02
            X.7qT r1 = X.C18230wP.A0S(r1, r2)
            X.C33492Fx.A00(r1, r3)
        L_0x0177:
            r1 = -1975349103(0xffffffff8a429091, float:-9.36795E-33)
            goto L_0x0035
        L_0x017c:
            com.instagram.service.session.UserSession r7 = r1.A03
            X.IcN r3 = r1.A02
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "source_name"
            r2.put(r1, r4)
            r1 = 2131836068(0x7f113ca4, float:1.9305292E38)
            java.lang.String r6 = r3.getString(r1)
            java.lang.String r1 = "com.instagram.user_controlled_trigger_warnings.show_user_controlled_trigger_warning_page"
            X.7qT r5 = X.C18230wP.A0S(r3, r7)
            android.content.Context r4 = r3.requireContext()
            X.0wh r3 = X.C18330wh.A00(r4)
            X.C13950oZ.A00(r3)
            X.4A9 r2 = X.C63263h8.A00(r7, r1, r2)
            X.1eK r1 = new X.1eK
            r1.<init>(r4, r5, r3, r6)
            r2.A00 = r1
            X.8kf r1 = r5.A07
            r1.schedule(r2)
            goto L_0x0177
        L_0x01b2:
            r0 = -1302032630(0xffffffffb2648f0a, float:-1.330387E-8)
            int r0 = X.C14030oh.A05(r0)
            X.3UZ r1 = X.AnonymousClass3UZ.A02
            if (r1 == 0) goto L_0x01dc
            X.3IP r5 = r1.A00()
            java.lang.Integer r2 = X.AnonymousClass006.A0j
            java.lang.Object r4 = r3.A00
            com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment r4 = (com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment) r4
            com.instagram.service.session.UserSession r1 = r4.A02
            androidx.fragment.app.Fragment r3 = r5.A02(r1, r2)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            com.instagram.service.session.UserSession r1 = r4.A02
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r2, r1)
            r1.A03 = r3
            r1.A05()
        L_0x01dc:
            r1 = 570007090(0x21f99e32, float:1.691477E-18)
            goto L_0x0035
        L_0x01e1:
            r0 = -767015194(0xffffffffd24846e6, float:-2.15045734E11)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment r3 = (com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment) r3
            com.instagram.service.session.UserSession r4 = r3.A02
            X.24O r1 = r3.A03
            java.lang.String r10 = r1.A00
            r1 = 0
            X.C04220Ms.A0B(r4, r1)
            java.lang.Integer r5 = X.AnonymousClass006.A0D
            r6 = 0
            r7 = r6
            r8 = r6
            r9 = r6
            X.C63583hq.A03(r4, r5, r6, r7, r8, r9, r10)
            android.content.Context r4 = r3.getContext()
            if (r4 == 0) goto L_0x022f
            boolean r1 = X.C09650fs.A02(r4)
            if (r1 == 0) goto L_0x022f
            android.content.pm.PackageManager r3 = r4.getPackageManager()
            java.lang.String r2 = "com.instagram.barcelona"
            boolean r1 = X.C09650fs.A09(r3, r2)
            if (r1 != 0) goto L_0x0229
            java.lang.String r1 = "com.instagram.barcelona.debug"
            boolean r1 = X.C09650fs.A09(r3, r1)
            if (r1 != 0) goto L_0x0229
            java.lang.String r1 = "com.instagram.android"
            X.C09650fs.A01(r4, r2, r1)
        L_0x0224:
            r1 = -1497404262(0xffffffffa6bf6c9a, float:-1.3282724E-15)
            goto L_0x0035
        L_0x0229:
            java.lang.String r1 = "barcelona://settings"
            X.C37412JrW.A01(r4, r1)
            goto L_0x0224
        L_0x022f:
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            com.instagram.service.session.UserSession r1 = r3.A02
            X.Drz r2 = X.AnonymousClass0wJ.A0Q(r2, r1)
            X.C18190wL.A10()
            X.1x2 r1 = new X.1x2
            r1.<init>()
            r2.A03 = r1
            java.lang.String r1 = "fully_blocking_fragment_backstack"
            r2.A07 = r1
            r2.A05()
            goto L_0x0224
        L_0x024b:
            r0 = 866885935(0x33aba12f, float:7.992127E-8)
            int r0 = X.C14030oh.A05(r0)
            android.content.Intent r6 = X.C18230wP.A0B()
            java.lang.Object r5 = r3.A00
            X.1Zx r5 = (X.C22801Zx) r5
            java.util.GregorianCalendar r1 = r5.A00
            long r3 = X.C18210wN.A07(r1)
            int r2 = (int) r3
            java.lang.String r1 = "media_seconds"
            r6.putExtra(r1, r2)
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            r1 = -1
            r2.setResult(r1, r6)
            X.C18210wN.A14(r5)
            r1 = 1516570018(0x5a6505a2, float:1.61159908E16)
            goto L_0x0035
        L_0x0276:
            r0 = 1137383195(0x43cb171b, float:406.1805)
            int r0 = X.C18190wL.A05(r3, r0)
            r1 = -816179222(0xffffffffcf5a17ea, float:-3.65900032E9)
            goto L_0x0035
        L_0x0282:
            r0 = 463070069(0x1b99e375, float:2.5458717E-22)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r3.A00
            android.view.View r6 = (android.view.View) r6
            r5 = 10
            java.lang.String[] r4 = new java.lang.String[r5]
            r3 = 0
            r2 = 0
        L_0x0293:
            int r1 = r2 * 300
            int r1 = 3300 - r1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r4[r2] = r1
            int r2 = r2 + 1
            if (r2 < r5) goto L_0x0293
            java.lang.String r1 = "Disable Throttling"
            r4[r3] = r1
            android.content.Context r1 = r6.getContext()
            X.Dsm r3 = X.C18190wL.A0W(r1)
            r2 = 77
            com.facebook.redex.IDxCListenerShape77S0200000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape77S0200000_1_I2
            r1.<init>((int) r2, (java.lang.Object) r4, (java.lang.Object) r6)
            r3.A0d(r1, r4)
            java.lang.String r1 = "Set Bandwidth (Kbps)"
            r3.A0p(r1)
            X.C18200wM.A1O(r3)
            android.app.Dialog r3 = r3.A0G()
            android.view.Window r2 = r3.getWindow()
            if (r2 == 0) goto L_0x02ce
            r1 = 2038(0x7f6, float:2.856E-42)
            r2.setType(r1)
        L_0x02ce:
            X.C13950oZ.A00(r3)
            r1 = 1119584046(0x42bb7f2e, float:93.7484)
            goto L_0x0035
        L_0x02d6:
            r0 = 1679238055(0x641723a7, float:1.115211E22)
            int r0 = X.C14030oh.A05(r0)
            X.GVD r4 = X.C25745DrH.A00
            java.lang.Object r2 = r3.A00
            X.1Xs r2 = (X.AnonymousClass1Xs) r2
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            X.C18200wM.A12(r1, r4)
            X.342 r1 = r2.A00
            if (r1 != 0) goto L_0x02f2
            java.lang.String r0 = "delegate"
            goto L_0x1c06
        L_0x02f2:
            X.E70 r4 = r1.A00
            com.instagram.service.session.UserSession r1 = r4.A0Q
            X.495 r2 = X.AnonymousClass2O7.A00(r1)
            X.0kW r1 = r4.A0I
            java.lang.String r3 = X.C18230wP.A0n(r1)
            X.0nS r2 = r2.A00
            java.lang.String r1 = "ig_fan_club_subs_in_live_enable_clicked"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 1210(0x4ba, float:1.696E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r2, r1)
            X.C18230wP.A1H(r1, r3)
            r1.Bb4()
            r3 = 1
            r4.A0B = r3
            android.content.Context r2 = r4.A0G
            r1 = 2131828771(0x7f112023, float:1.9290492E38)
            java.lang.String r1 = r2.getString(r1)
            X.C63813iO.A0B(r2, r1)
            X.Fft r1 = X.C29004Fft.A0P
            X.E70.A01(r1, r4, r3)
            r1 = -582403662(0xffffffffdd4939b2, float:-9.0623851E17)
            goto L_0x0035
        L_0x032d:
            r0 = -346999043(0xffffffffeb5136fd, float:-2.5292517E26)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.48R r1 = (X.AnonymousClass48R) r1
            X.4qu r1 = r1.A04
            if (r1 == 0) goto L_0x033f
            r1.CHr()
        L_0x033f:
            r1 = 630698842(0x2597b35a, float:2.6315858E-16)
            goto L_0x0035
        L_0x0344:
            r0 = 2105735561(0x7d82f989, float:2.1761913E37)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.1jp r5 = (X.C24681jp) r5
            X.264 r2 = r5.A08
            if (r2 == 0) goto L_0x0360
            X.264 r1 = X.AnonymousClass264.A0J
            if (r2 != r1) goto L_0x0384
            com.instagram.service.session.UserSession r3 = r5.A07
            X.2A8 r2 = X.AnonymousClass2A8.A0G
            X.2A9 r1 = X.AnonymousClass2A9.A0H
        L_0x035d:
            X.C62383Zj.A01(r1, r2, r3)
        L_0x0360:
            androidx.fragment.app.Fragment r4 = r5.A01
            X.3Ej r3 = X.C35762Os.A00()
            com.instagram.service.session.UserSession r2 = r5.A07
            X.4sH r1 = r5.A09
            X.1q7 r3 = r3.A00(r4, r2, r1)
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = "IG_FB_DISCOVER_ACCOUNTS"
            java.lang.String r1 = X.C18190wL.A0r(r2, r1)
            boolean r1 = r3.A06(r1)
            if (r1 == 0) goto L_0x037f
            r5.A00()
        L_0x037f:
            r1 = 1225522680(0x490bfdf8, float:573407.5)
            goto L_0x0035
        L_0x0384:
            X.264 r1 = X.AnonymousClass264.A0C
            if (r2 != r1) goto L_0x0360
            com.instagram.service.session.UserSession r3 = r5.A07
            X.2A8 r2 = X.AnonymousClass2A8.A0G
            X.2A9 r1 = X.AnonymousClass2A9.A03
            goto L_0x035d
        L_0x038f:
            r0 = -636104183(0xffffffffda15d209, float:-1.05426769E16)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r3.A00
            X.0yP r6 = (X.C19000yP) r6
            boolean r1 = r6.A0B
            if (r1 == 0) goto L_0x03bd
            android.content.Context r1 = r6.getContext()
            X.Dsm r2 = X.C18190wL.A0W(r1)
            r1 = 2131835771(0x7f113b7b, float:1.930469E38)
            r2.A0L(r1)
            r1 = 2131835770(0x7f113b7a, float:1.9304688E38)
            r2.A0K(r1)
            X.C18180wK.A1M(r2)
            X.AnonymousClass0wJ.A1K(r2)
            r1 = -684165014(0xffffffffd738786a, float:-2.02827314E14)
            goto L_0x0035
        L_0x03bd:
            X.4qn r1 = r6.A04
            if (r1 == 0) goto L_0x0425
            java.lang.Object r5 = X.C18210wN.A0X(r2)
            X.2AI r5 = (X.AnonymousClass2AI) r5
            java.lang.Integer r1 = X.AnonymousClass006.A0e
            X.0rn r4 = X.C60493Pi.A00(r1)
            android.content.Context r2 = r6.getContext()
            com.instagram.service.session.UserSession r3 = r6.A0P
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r3)
            java.lang.String r2 = r5.A00(r2, r1)
            java.lang.String r1 = "name"
            r4.A0D(r1, r2)
            X.C18180wK.A1K(r4, r3)
            X.4s7 r2 = r6.A0R
            java.lang.String r1 = r5.A02
            r2.Bbj(r1)
            boolean r1 = r6.A0C
            if (r1 == 0) goto L_0x0418
            X.3Rx r3 = r6.A02
            if (r3 == 0) goto L_0x0418
            X.2AI r1 = X.AnonymousClass2AI.A04
            if (r5 != r1) goto L_0x0415
            java.lang.Integer r1 = X.AnonymousClass006.A01
        L_0x03f8:
            int r1 = r1.intValue()
            if (r1 == 0) goto L_0x040e
            r2 = 2131826948(0x7f111904, float:1.9286795E38)
            if (r1 == 0) goto L_0x0411
            r1 = 2131826927(0x7f1118ef, float:1.9286752E38)
        L_0x0406:
            X.C61103Rx.A00(r3, r2, r1)
            r1 = 327813627(0x138a09fb, float:3.484594E-27)
            goto L_0x0035
        L_0x040e:
            r2 = 2131826945(0x7f111901, float:1.9286789E38)
        L_0x0411:
            r1 = 2131826926(0x7f1118ee, float:1.928675E38)
            goto L_0x0406
        L_0x0415:
            java.lang.Integer r1 = X.AnonymousClass006.A00
            goto L_0x03f8
        L_0x0418:
            X.2AI r1 = X.AnonymousClass2AI.A04
            if (r5 != r1) goto L_0x041f
            X.C19000yP.A02(r6)
        L_0x041f:
            X.4qn r2 = r6.A04
            r1 = 0
            r2.Bkx(r5, r1)
        L_0x0425:
            r1 = 986217509(0x3ac87c25, float:0.0015295787)
            goto L_0x0035
        L_0x042a:
            r0 = 2013218228(0x77ff45b4, float:1.0355074E34)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.1dP r4 = (X.AnonymousClass1dP) r4
            X.0Oa r1 = r4.A02
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r1)
            X.1tl r2 = X.AnonymousClass3WS.A01(r1)
            boolean r1 = r4.A01
            android.content.SharedPreferences r2 = r2.A00
            if (r1 == 0) goto L_0x0474
            java.lang.String r3 = "invite_collaborators_nux_seen_count"
        L_0x0447:
            int r1 = X.C18190wL.A04(r2, r3)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            int r1 = r1 + 1
            X.AnonymousClass0wJ.A11(r2, r3, r1)
            X.GVD r2 = X.C25745DrH.A00
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            X.DrH r3 = r2.A01(r1)
            if (r3 == 0) goto L_0x046f
            r1 = 9
            com.facebook.redex.IDxListenerShape412S0100000_1_I2 r2 = new com.facebook.redex.IDxListenerShape412S0100000_1_I2
            r2.<init>(r4, r1)
            r1 = r3
            X.Ipf r1 = (X.C35189Ipf) r1
            r1.A0B = r2
            r3.A0C()
        L_0x046f:
            r1 = 14092999(0xd70ac7, float:1.9748498E-38)
            goto L_0x0035
        L_0x0474:
            java.lang.String r3 = "invite_collaborators_for_posts_nux_seen_count"
            goto L_0x0447
        L_0x0477:
            r0 = -1248191999(0xffffffffb59a1a01, float:-1.1481462E-6)
            int r0 = X.C14030oh.A05(r0)
            X.GVD r2 = X.C25745DrH.A00
            java.lang.Object r1 = r3.A00
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
            X.DrH r3 = r2.A01(r1)
            if (r3 == 0) goto L_0x049b
            X.4Lp r2 = new X.4Lp
            r2.<init>()
            r1 = r3
            X.Ipf r1 = (X.C35189Ipf) r1
            r1.A0B = r2
            r3.A0C()
        L_0x049b:
            r1 = 1142388829(0x4417785d, float:605.8807)
            goto L_0x0035
        L_0x04a0:
            r0 = 2067606502(0x7b3d2be6, float:9.822345E35)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.1XZ r4 = (X.AnonymousClass1XZ) r4
            java.lang.String r7 = r4.A03
            java.lang.String r8 = r4.A08
            java.lang.String r9 = r4.A07
            com.instagram.service.session.UserSession r5 = r4.A01
            java.lang.Integer r6 = X.AnonymousClass006.A01
            r10 = 0
            X.C50182sa.A00(r5, r6, r7, r8, r9, r10)
            r4.A06()
            X.JIh r1 = r4.A00     // Catch:{ IOException -> 0x4717 }
            java.lang.String r6 = X.C36536JaD.A00(r1)     // Catch:{ IOException -> 0x4717 }
            java.lang.String r5 = r4.A06     // Catch:{ IOException -> 0x4717 }
            java.lang.String r3 = r4.A03     // Catch:{ IOException -> 0x4717 }
            java.lang.String r2 = r4.A08     // Catch:{ IOException -> 0x4717 }
            java.lang.String r8 = r4.A07     // Catch:{ IOException -> 0x4717 }
            com.instagram.service.session.UserSession r7 = r4.A01     // Catch:{ IOException -> 0x4717 }
            X.AnonymousClass0wJ.A1N(r6, r5)     // Catch:{ IOException -> 0x4717 }
            X.AnonymousClass0wJ.A1Q(r3, r2)     // Catch:{ IOException -> 0x4717 }
            X.C18180wK.A1R(r8, r7)     // Catch:{ IOException -> 0x4717 }
            java.lang.String r1 = "ARG_SERIALIZED_MODEL_DATA"
            kotlin.Pair r6 = X.C18180wK.A0p(r1, r6)     // Catch:{ IOException -> 0x4717 }
            java.lang.String r1 = "ARG_OUTRO_TOAST_TEXT"
            kotlin.Pair r5 = X.C18180wK.A0p(r1, r5)     // Catch:{ IOException -> 0x4717 }
            java.lang.String r1 = "ARG_INTEGRATION_POINT_ID"
            kotlin.Pair r3 = X.C18180wK.A0p(r1, r3)     // Catch:{ IOException -> 0x4717 }
            java.lang.String r1 = "ARG_SURVEY_ID"
            kotlin.Pair r2 = X.C18180wK.A0p(r1, r2)     // Catch:{ IOException -> 0x4717 }
            java.lang.String r1 = "ARG_SESSION_BLOB"
            kotlin.Pair r1 = X.C18180wK.A0p(r1, r8)     // Catch:{ IOException -> 0x4717 }
            kotlin.Pair[] r1 = new kotlin.Pair[]{r6, r5, r3, r2, r1}     // Catch:{ IOException -> 0x4717 }
            android.os.Bundle r1 = X.C98316Fa.A00(r1)     // Catch:{ IOException -> 0x4717 }
            X.C05050Qq.A00(r1, r7)     // Catch:{ IOException -> 0x4717 }
            X.Ibf r3 = new X.Ibf     // Catch:{ IOException -> 0x4717 }
            r3.<init>()     // Catch:{ IOException -> 0x4717 }
            r3.setArguments(r1)     // Catch:{ IOException -> 0x4717 }
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()     // Catch:{ IOException -> 0x4717 }
            com.instagram.service.session.UserSession r1 = r4.A01     // Catch:{ IOException -> 0x4717 }
            X.AnonymousClass0wJ.A19(r3, r2, r1)     // Catch:{ IOException -> 0x4717 }
            r1 = -883078791(0xffffffffcb5d4979, float:-1.4502265E7)
            goto L_0x0035
        L_0x0514:
            r0 = 1918834038(0x725f1576, float:4.4186305E30)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r3.A00
            X.1YU r6 = (X.AnonymousClass1YU) r6
            X.36F r1 = r6.A01
            if (r1 == 0) goto L_0x0539
            X.49h r7 = r1.A00
            r1 = 1
            r7.A05 = r1
            com.instagram.service.session.UserSession r5 = r7.A08
            X.2A8 r4 = X.AnonymousClass2A8.A0G
            X.2A9 r3 = X.AnonymousClass2A9.A05
            X.29h r2 = X.C318729h.CAL_FLOW
            r1 = 0
            X.C62383Zj.A00(r2, r3, r4, r5, r1)
            X.29W r1 = X.AnonymousClass29W.ACCEPT
            X.C696149h.A00(r1, r7)
        L_0x0539:
            X.0Oa r5 = r6.A04
            X.0i6 r4 = X.AnonymousClass0wJ.A0U(r5)
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r1 = 36323814027829337(0x810c5100042059, double:3.034664483233821E-306)
            boolean r1 = X.C63803iN.A0E(r3, r4, r1)
            if (r1 == 0) goto L_0x056d
            r1 = 16
            com.facebook.redex.IDxAListenerShape459S0100000_1_I2 r3 = new com.facebook.redex.IDxAListenerShape459S0100000_1_I2
            r3.<init>(r6, r1)
            X.3Ej r2 = X.C35762Os.A00()
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r5)
            X.1q7 r2 = r2.A00(r6, r1, r3)
            X.264 r1 = X.AnonymousClass264.FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL
            java.lang.String r1 = r1.A00()
            r2.A06(r1)
        L_0x0568:
            r1 = -1228885216(0xffffffffb6c0b320, float:-5.742899E-6)
            goto L_0x0035
        L_0x056d:
            X.C18180wK.A13(r6)
            X.1jy r2 = r6.A00
            if (r2 != 0) goto L_0x0578
            java.lang.String r0 = "facebookConnectHelper"
            goto L_0x1c06
        L_0x0578:
            X.264 r1 = X.AnonymousClass264.FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL
            r2.A00(r1)
            goto L_0x0568
        L_0x057e:
            r0 = -1400283227(0xffffffffac895fa5, float:-3.904393E-12)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.1cQ r4 = (X.AnonymousClass1cQ) r4
            X.0Oa r6 = r4.A06
            X.0i6 r5 = X.AnonymousClass0wJ.A0U(r6)
            java.lang.String r3 = "find_friends_fb"
            android.app.Activity r2 = r4.getRootActivity()
            r1 = 0
            X.C54092yt.A00(r2, r1, r5, r3)
            X.0i6 r3 = X.AnonymousClass0wJ.A0U(r6)
            X.2A8 r2 = X.AnonymousClass2A8.A0G
            X.2A9 r1 = X.AnonymousClass2A9.A0G
            X.C62383Zj.A01(r1, r2, r3)
            X.0TJ r3 = X.AnonymousClass0TJ.A06
            r1 = 18307568682146928(0x410aa300001c70, double:1.8959353353650374E-307)
            boolean r1 = X.C63173fJ.A05(r3, r1)
            if (r1 != 0) goto L_0x05c8
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r1 = 18307568682278002(0x410aa300021c72, double:1.8959353354168447E-307)
            boolean r1 = X.C63173fJ.A05(r3, r1)
            if (r1 == 0) goto L_0x05c8
            X.264 r1 = X.AnonymousClass264.IG_FB_NUX_FIND_FRIENDS
        L_0x05c0:
            X.AnonymousClass1cQ.A00(r1, r4)
            r1 = 642757037(0x264fb1ad, float:7.205835E-16)
            goto L_0x0035
        L_0x05c8:
            X.264 r1 = X.AnonymousClass264.A0K
            goto L_0x05c0
        L_0x05cb:
            r0 = 1809791301(0x6bdf3945, float:5.397218E26)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r3.A00
            X.1xS r6 = (X.C29181xS) r6
            X.0Oa r9 = r6.A0A
            X.0i6 r4 = X.AnonymousClass0wJ.A0U(r9)
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r1 = 36313802458793669(0x810336000006c5, double:3.028333126662312E-306)
            boolean r1 = X.C63803iN.A0E(r3, r4, r1)
            r8 = 0
            if (r1 == 0) goto L_0x063f
            com.instagram.service.session.UserSession r3 = X.AnonymousClass0wJ.A0X(r9)
            java.lang.Class<X.3YL> r2 = X.AnonymousClass3YL.class
            r1 = 30
            java.lang.Object r1 = X.C18180wK.A0c(r3, r2, r1)
            X.3YL r1 = (X.AnonymousClass3YL) r1
            boolean r2 = r1.A0D
            X.Dsm r7 = X.AnonymousClass0wJ.A0V(r6)
            r1 = 2131837311(0x7f11417f, float:1.9307813E38)
            java.lang.String r1 = r6.getString(r1)
            r7.A02 = r1
            if (r2 == 0) goto L_0x0637
            r2 = 2131837313(0x7f114181, float:1.9307818E38)
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r9)
            java.lang.String r1 = X.C67363zQ.A04(r1)
            java.lang.String r1 = X.AnonymousClass0wJ.A0o(r6, r1, r2)
        L_0x0618:
            r7.A0p(r1)
            r1 = 2131823054(0x7f1109ce, float:1.9278897E38)
            r7.A0O(r8, r1)
            r2 = 2131837310(0x7f11417e, float:1.9307811E38)
            r1 = 164(0xa4, float:2.3E-43)
        L_0x0626:
            X.C18180wK.A1O(r7, r6, r1, r2)
            android.app.Dialog r1 = r7.A0G()
            r6.A00 = r1
            X.C13950oZ.A00(r1)
            r1 = -1750817460(0xffffffff97a4a54c, float:-1.0639978E-24)
            goto L_0x0035
        L_0x0637:
            r1 = 2131837312(0x7f114180, float:1.9307815E38)
            java.lang.String r1 = r6.getString(r1)
            goto L_0x0618
        L_0x063f:
            X.Dsm r7 = X.AnonymousClass0wJ.A0V(r6)
            r1 = 2131837309(0x7f11417d, float:1.930781E38)
            java.lang.String r5 = r6.getString(r1)
            X.2AI r4 = X.AnonymousClass2AI.A04
            android.content.Context r3 = r6.requireContext()
            X.0Ok r2 = X.C06810aP.A01
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r9)
            com.instagram.user.model.User r1 = r2.A01(r1)
            java.lang.String r1 = r4.A00(r3, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r5.getClass()
            java.lang.String r1 = java.lang.String.format(r8, r5, r1)
            r7.A02 = r1
            r1 = 2131823054(0x7f1109ce, float:1.9278897E38)
            r7.A0O(r8, r1)
            r2 = 2131837308(0x7f11417c, float:1.9307807E38)
            r1 = 165(0xa5, float:2.31E-43)
            goto L_0x0626
        L_0x0677:
            r0 = 1404113733(0x53b11345, float:1.521065E12)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r8 = r3.A00
            X.1Z1 r8 = (X.AnonymousClass1Z1) r8
            X.341 r1 = r8.A02
            if (r1 == 0) goto L_0x06ba
            boolean r9 = r8.A04
            X.E79 r4 = r1.A00
            X.GhF r3 = r4.A01
            X.HBy r1 = r3.A0q
            java.lang.Integer r2 = X.AnonymousClass006.A00
            X.3zC r1 = r1.A1O
            r1.A05(r2, r9)
            r1 = 0
            r4.A0e(r1, r1)
            com.instagram.service.session.UserSession r7 = r3.A1z
            X.2AC r6 = X.AnonymousClass2AC.IG_STORY_COMPOSER_YOUR_STORY_BUTTON
            X.2AD r5 = X.AnonymousClass2AD.A05
            X.29W r4 = X.AnonymousClass29W.ACCEPT
            X.14U r3 = X.AnonymousClass14U.A00()
            if (r9 == 0) goto L_0x06ce
            java.lang.String r2 = "is_sharing"
        L_0x06a9:
            java.lang.String r1 = "subvariant"
            r3.A0A(r1, r2)
            java.lang.Boolean r2 = X.C18180wK.A0Y()
            java.lang.String r1 = "is_account_linked"
            r3.A07(r1, r2)
            X.C49322rC.A00(r6, r4, r5, r3, r7)
        L_0x06ba:
            X.GVD r2 = X.C25745DrH.A00
            android.content.Context r1 = r8.getContext()
            X.DrH r1 = r2.A02(r1)
            if (r1 == 0) goto L_0x06c9
            r1.A0C()
        L_0x06c9:
            r1 = 628856346(0x257b961a, float:2.1821636E-16)
            goto L_0x0035
        L_0x06ce:
            java.lang.String r2 = "not_sharing"
            goto L_0x06a9
        L_0x06d1:
            r0 = -58359070(0xfffffffffc8582e2, float:-5.545841E36)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.1Z1 r3 = (X.AnonymousClass1Z1) r3
            boolean r1 = r3.A04
            r1 = r1 ^ 1
            r3.A04 = r1
            X.AnonymousClass1Z1.A01(r3)
            boolean r2 = r3.A04
            if (r2 == 0) goto L_0x06f3
            X.29d r1 = X.C318329d.ONE_TIME_ON
        L_0x06eb:
            X.AnonymousClass1Z1.A00(r1, r3, r2)
            r1 = -2044251305(0xffffffff86273357, float:-3.1446928E-35)
            goto L_0x0035
        L_0x06f3:
            X.29d r1 = X.C318329d.ONE_TIME_OFF
            goto L_0x06eb
        L_0x06f6:
            r0 = 1919274217(0x7265cce9, float:4.5516665E30)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.1aT r4 = (X.AnonymousClass1aT) r4
            X.0Oa r3 = r4.A0A
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r3)
            X.49g r1 = X.C62173Xp.A00(r1)
            X.C696049g.A00(r1)
            X.3CV r8 = r1.A02
            if (r8 == 0) goto L_0x07a9
            java.lang.String r6 = r8.A00
            java.lang.String r5 = "FB_USER"
            boolean r11 = r5.equals(r6)
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r3)
            java.lang.String r10 = r4.A02
            r7 = 0
            X.C04220Ms.A0B(r1, r7)
            X.0nS r2 = X.C13330nS.A02(r1)
            java.lang.String r1 = "ig_xposting_to_fb_destination_picker"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 1531(0x5fb, float:2.145E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r9 = X.C18180wK.A0I(r2, r1)
            java.lang.String r2 = "confirm_destination_and_share"
            java.lang.String r1 = "action_name"
            r9.A0T(r1, r2)
            java.lang.String r1 = "surface"
            java.lang.Boolean r2 = X.C18190wL.A0Z(r9, r1, r10, r11)
            java.lang.String r1 = "is_default_destination"
            r9.A0Q(r1, r2)
            r9.Bb4()
            java.lang.String r1 = r8.A00
            if (r1 == 0) goto L_0x0767
            boolean r1 = r1.equals(r5)
            r14 = 1
            if (r1 == 0) goto L_0x0786
            r4.A05 = r14
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r3)
            X.49e r3 = X.C60333Op.A00(r1)
            java.lang.String r2 = "destination_picker"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            r3.A02(r1, r2, r14, r14)
        L_0x0767:
            boolean r1 = r4.A03
            if (r1 != 0) goto L_0x0774
            java.lang.Integer r2 = X.AnonymousClass006.A00
            boolean r1 = r5.equals(r6)
            X.AnonymousClass1aT.A00(r4, r2, r1)
        L_0x0774:
            boolean r1 = r4.A03
            if (r1 == 0) goto L_0x0781
            r1 = 1
            X.AnonymousClass1aT.A01(r4, r1)
        L_0x077c:
            r1 = 2109861489(0x7dc1ee71, float:3.2222383E37)
            goto L_0x0035
        L_0x0781:
            r1 = 1
            X.AnonymousClass1aT.A02(r4, r1)
            goto L_0x077c
        L_0x0786:
            java.lang.String r12 = r8.A03
            if (r12 != 0) goto L_0x078c
            java.lang.String r12 = ""
        L_0x078c:
            java.lang.String r10 = r8.A01
            if (r10 == 0) goto L_0x0767
            java.lang.String r11 = r8.A02
            if (r11 == 0) goto L_0x0767
            r4.A05 = r14
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r3)
            X.49e r8 = X.C60333Op.A00(r1)
            java.lang.String r13 = "destination_picker"
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            r15 = r14
            r8.A01(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0767
        L_0x07a9:
            com.instagram.service.session.UserSession r3 = X.AnonymousClass0wJ.A0X(r3)
            java.lang.String r2 = "confirm_destination_and_share_without_saving_destination_to_server"
            java.lang.String r1 = r4.A02
            X.C60373Ot.A00(r3, r2, r1)
            goto L_0x0774
        L_0x07b5:
            r0 = 199222472(0xbdfe4c8, float:8.624071E-32)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.1aT r4 = (X.AnonymousClass1aT) r4
            boolean r1 = r4.A03
            if (r1 != 0) goto L_0x081e
            boolean r1 = r4.A07
            if (r1 == 0) goto L_0x0802
            X.3zH r3 = r4.A01
            if (r3 != 0) goto L_0x07f9
            X.0Oa r2 = r4.A0A
            com.instagram.service.session.UserSession r5 = X.AnonymousClass0wJ.A0X(r2)
            X.4tF r6 = r4.A09
            java.lang.Integer r7 = X.AnonymousClass006.A00
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r2)
            boolean r9 = X.C61453Tm.A00(r1)
            X.3zC r1 = r4.A00
            if (r1 != 0) goto L_0x07ed
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r2)
            r1 = 0
            X.3zC r1 = X.C60303Om.A01(r2, r1)
            r4.A00 = r1
        L_0x07ed:
            boolean r10 = r1.A06()
            X.3zH r3 = new X.3zH
            r8 = r7
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r4.A01 = r3
        L_0x07f9:
            r1 = 0
            r3.A06(r1)
        L_0x07fd:
            r1 = 875818389(0x3433ed95, float:1.6757106E-7)
            goto L_0x0035
        L_0x0802:
            X.0Oa r1 = r4.A0A
            com.instagram.service.session.UserSession r3 = X.AnonymousClass0wJ.A0X(r1)
            java.lang.String r2 = "dismiss_button_tapped"
            java.lang.String r1 = r4.A02
            X.C60373Ot.A00(r3, r2, r1)
            r1 = 1
            r4.A04 = r1
            boolean r1 = r4.A06
            if (r1 == 0) goto L_0x081a
            X.C18180wK.A13(r4)
            goto L_0x07fd
        L_0x081a:
            X.C18190wL.A1A(r4)
            goto L_0x07fd
        L_0x081e:
            X.0Oa r1 = r4.A0A
            com.instagram.service.session.UserSession r3 = X.AnonymousClass0wJ.A0X(r1)
            java.lang.String r2 = "turn_off_xposting_once"
            java.lang.String r1 = r4.A02
            X.C60373Ot.A00(r3, r2, r1)
            r1 = 0
            X.AnonymousClass1aT.A01(r4, r1)
            goto L_0x07fd
        L_0x0830:
            r0 = -1457063093(0xffffffffa926fb4b, float:-3.7077366E-14)
            int r0 = X.C14030oh.A05(r0)
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "com.instagram.portable.settings.help"
            X.3iE r7 = X.C63743iE.A02(r1, r2)
            java.lang.Object r1 = r3.A00
            X.3Hb r1 = (X.C58753Hb) r1
            com.instagram.base.activity.IgFragmentActivity r6 = r1.A03
            com.instagram.service.session.UserSession r5 = r1.A05
            com.instagram.bloks.hosting.IgBloksScreenConfig r4 = X.C18190wL.A0N(r5)
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r1 = 36322263544372493(0x810ae800001d0d, double:3.033683951252417E-306)
            boolean r2 = X.C63803iN.A0E(r3, r5, r1)
            r1 = 2131829091(0x7f112163, float:1.9291141E38)
            if (r2 == 0) goto L_0x0860
            r1 = 2131829111(0x7f112177, float:1.9291182E38)
        L_0x0860:
            X.C18210wN.A0s(r6, r4, r1)
            java.lang.Integer r1 = X.AnonymousClass006.A01
            r4.A0O = r1
            r1 = 1
            r4.A0h = r1
            r7.A0C(r6, r4)
            r1 = 1810966342(0x6bf12746, float:5.8307317E26)
            goto L_0x0035
        L_0x0872:
            r0 = 726172306(0x2b488292, float:7.1235476E-13)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r3.A00
            X.3Hb r6 = (X.C58753Hb) r6
            com.instagram.service.session.UserSession r5 = r6.A05
            X.0kW r3 = r6.A04
            java.lang.String r2 = "settings"
            java.lang.String r1 = "notifications_settings_entered"
            X.C62423Zt.A00(r3, r5, r2, r1)
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r1 = 36319725218698587(0x8108990000155b, double:3.032078703875222E-306)
            boolean r1 = X.C63803iN.A0E(r3, r5, r1)
            if (r1 == 0) goto L_0x08b0
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "com.igcarbon.settings.notifications"
            X.3iE r4 = X.C63743iE.A02(r1, r2)
            com.instagram.base.activity.IgFragmentActivity r3 = r6.A03
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.C18190wL.A0N(r5)
            r1 = 2131831918(0x7f112c6e, float:1.9296875E38)
            X.C63743iE.A09(r3, r2, r4, r1)
        L_0x08ab:
            r1 = -1154710236(0xffffffffbb2c8524, float:-0.0026324475)
            goto L_0x0035
        L_0x08b0:
            com.instagram.base.activity.IgFragmentActivity r1 = r6.A03
            X.Drz r5 = X.AnonymousClass0wJ.A0Q(r1, r5)
            X.C18190wL.A10()
            X.1xd r4 = new X.1xd
            r4.<init>()
            android.os.Bundle r3 = X.C18180wK.A06()
            r2 = 0
            java.lang.String r1 = "only_show_push"
            r3.putBoolean(r1, r2)
            r5.A0A(r3, r4)
            r5.A05()
            goto L_0x08ab
        L_0x08cf:
            r0 = 1785851715(0x6a71ef43, float:7.312025E25)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.3HD r5 = (X.AnonymousClass3HD) r5
            com.instagram.service.session.UserSession r4 = r5.A01
            java.lang.String r2 = "security"
            java.lang.String r1 = "login_activity_entered"
            X.C62423Zt.A03(r4, r2, r1)
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r1 = 36317307152109099(0x81066600000e2b, double:3.030549508827257E-306)
            boolean r1 = X.C63803iN.A0E(r3, r4, r1)
            if (r1 == 0) goto L_0x08fe
            X.1dm r3 = r5.A02
            java.lang.String r2 = "ig_login_activities_phase_1"
            java.lang.String r1 = "login_activities"
            X.C63013bK.A01(r3, r4, r2, r1)
        L_0x08f9:
            r1 = 1460162830(0x5708510e, float:1.49881709E14)
            goto L_0x0035
        L_0x08fe:
            androidx.fragment.app.FragmentActivity r1 = r5.A00
            X.Drz r2 = X.C18180wK.A0Q(r1, r4)
            X.1dd r1 = new X.1dd
            r1.<init>()
            r2.A03 = r1
            r2.A05()
            goto L_0x08f9
        L_0x090f:
            r0 = 890713953(0x35173761, float:5.633247E-7)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r3.A00
            X.3HD r6 = (X.AnonymousClass3HD) r6
            com.instagram.service.session.UserSession r4 = r6.A01
            java.lang.String r2 = "security"
            java.lang.String r1 = "two_factor_authentication_entered"
            X.C62423Zt.A03(r4, r2, r1)
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r1 = 36317302857141802(0x81066500000e2a, double:3.030546792672644E-306)
            boolean r1 = X.C63803iN.A0E(r3, r4, r1)
            if (r1 == 0) goto L_0x093e
            X.1dm r3 = r6.A02
            java.lang.String r2 = "ig_two_factor_phase_1"
            java.lang.String r1 = "two_factor"
            X.C63013bK.A01(r3, r4, r2, r1)
        L_0x0939:
            r1 = -1614975750(0xffffffff9fbd6cfa, float:-8.02249E-20)
            goto L_0x0035
        L_0x093e:
            X.C62423Zt.A02(r4)
            X.3Hi r3 = X.C62653aT.A01()
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            r1 = 0
            androidx.fragment.app.Fragment r5 = r3.A01(r2, r1, r1)
            androidx.fragment.app.FragmentActivity r1 = r6.A00
            X.Drz r4 = X.C18180wK.A0Q(r1, r4)
            r3 = 10
            r2 = 24
            r1 = 29
            java.lang.String r1 = X.AnonymousClass3QG.A00(r3, r2, r1)
            r4.A07 = r1
            X.C18180wK.A17(r5, r4)
            goto L_0x0939
        L_0x0962:
            r0 = -353434182(0xffffffffeaef05ba, float:-1.4448016E26)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.1Yp r4 = (X.C22571Yp) r4
            com.instagram.user.model.User r3 = r4.A01
            if (r3 == 0) goto L_0x09b8
            X.0Oa r1 = r4.A08
            X.0i6 r2 = X.AnonymousClass0wJ.A0U(r1)
            java.lang.String r6 = r3.getId()
            r1 = 1
            X.C04220Ms.A0B(r6, r1)
            r1 = 0
            X.C04220Ms.A0B(r2, r1)
            X.H1T r5 = X.C18180wK.A0P(r2)
            java.lang.String r3 = "stories/"
            java.lang.String r2 = "follow_versaries/"
            java.lang.String r1 = "follow_versaries_media/"
            X.C18250wR.A16(r5)
            r5.A04()
            java.lang.String r1 = X.C18240wQ.A0h(r3, r2, r1)
            r5.A0J(r1)
            java.lang.Class<X.1Qz> r2 = X.C21481Qz.class
            java.lang.Class<X.3K8> r1 = X.AnonymousClass3K8.class
            r5.A0B(r2, r1)
            java.lang.String r1 = "follower_id"
            X.H8c r3 = X.C18200wM.A0T(r5, r1, r6)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FollowVersariesResponse>>"
            X.C04220Ms.A0C(r3, r1)
            r2 = 40
            com.instagram.common.api.base.IDxACallbackShape114S0100000_4_I2 r1 = new com.instagram.common.api.base.IDxACallbackShape114S0100000_4_I2
            r1.<init>(r4, r2)
            r3.A00 = r1
            r4.schedule(r3)
        L_0x09b8:
            com.instagram.user.model.User r1 = r4.A01
            if (r1 == 0) goto L_0x09c5
            java.lang.String r2 = r1.getId()
            java.lang.String r1 = "share_memories"
            X.C22571Yp.A00(r4, r2, r1)
        L_0x09c5:
            r1 = -1706653498(0xffffffff9a4688c6, float:-4.1055925E-23)
            goto L_0x0035
        L_0x09ca:
            r0 = 1870218501(0x6f794505, float:7.7145207E28)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.1Yx r4 = (X.C22651Yx) r4
            android.graphics.Bitmap r1 = r4.A00
            if (r1 == 0) goto L_0x09fb
            boolean r1 = r4.A0D
            if (r1 == 0) goto L_0x09fb
            r1 = 2
            com.facebook.redex.IDxCallableShape271S0100000_1_I2 r2 = new com.facebook.redex.IDxCallableShape271S0100000_1_I2
            r2.<init>(r4, r1)
            r1 = 1726365662(0x66e63fde, float:5.436612E23)
            X.H8a r3 = new X.H8a
            r3.<init>(r2, r1)
            r2 = 3
            com.instagram.common.task.IDxCallbackShape128S0100000_1_I2 r1 = new com.instagram.common.task.IDxCallbackShape128S0100000_1_I2
            r1.<init>(r4, r2)
            r3.A00 = r1
            r4.schedule(r3)
        L_0x09f6:
            r1 = -72627657(0xfffffffffbabca37, float:-1.7839683E36)
            goto L_0x0035
        L_0x09fb:
            X.0Oa r1 = r4.A0O
            java.lang.Object r1 = r1.getValue()
            X.0zs r1 = (X.C19440zs) r1
            X.M5J r1 = r1.A01
            java.lang.Object r1 = r1.A08()
            X.250 r1 = (X.AnonymousClass250) r1
            if (r1 == 0) goto L_0x09f6
            int r2 = r1.A00
            r1 = 0
            X.C22651Yx.A04(r4, r1, r2)
            goto L_0x09f6
        L_0x0a14:
            java.lang.Object r2 = r3.A00
            X.1wJ r2 = (X.AnonymousClass1wJ) r2
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            if (r0 == 0) goto L_0x0038
            com.instagram.service.session.UserSession r0 = r2.A00
            X.C62423Zt.A02(r0)
            com.instagram.service.session.UserSession r1 = r2.A00
            java.lang.String r0 = "settings_single_payment_option"
            X.AnonymousClass3X0.A01(r0, r1)
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            com.instagram.service.session.UserSession r0 = r2.A00
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r1, r0)
            X.C18190wL.A10()
            X.Ipr r0 = new X.Ipr
            r0.<init>()
            r1.A03 = r0
            java.lang.String r0 = "PromotePaymentsInterstitialFragment.BACK_STACK_NAME"
            r1.A07 = r0
            r1.A05()
            return
        L_0x0a46:
            r0 = 429721836(0x199d08ec, float:1.6237023E-23)
            int r0 = X.C14030oh.A05(r0)
            java.util.HashMap r4 = X.AnonymousClass0wJ.A0y()
            java.lang.String r2 = "step"
            java.lang.String r1 = "0"
            r4.put(r2, r1)
            java.lang.Object r6 = r3.A00
            X.3aX r6 = (X.C62693aX) r6
            com.instagram.service.session.UserSession r5 = r6.A05
            android.content.SharedPreferences r3 = X.C28161tl.A04(r5)
            java.lang.String r2 = "limited_interactions_should_show_nux"
            r1 = 1
            boolean r1 = r3.getBoolean(r2, r1)
            if (r1 == 0) goto L_0x0a89
            java.lang.String r2 = "False"
        L_0x0a6d:
            java.lang.String r1 = "has_seen_nux_before"
            r4.put(r1, r2)
            java.lang.String r1 = "com.instagram.bullying.privacy.limits_entrypoint"
            X.3iE r4 = X.C63743iE.A02(r1, r4)
            androidx.fragment.app.FragmentActivity r3 = r6.A03
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.C18190wL.A0N(r5)
            r1 = 2131829643(0x7f11238b, float:1.929226E38)
            X.C63743iE.A09(r3, r2, r4, r1)
            r1 = 882150706(0x34948d32, float:2.766988E-7)
            goto L_0x0035
        L_0x0a89:
            java.lang.String r2 = "True"
            goto L_0x0a6d
        L_0x0a8c:
            r0 = -493186794(0xffffffffe29a9116, float:-1.4256266E21)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.3aX r5 = (X.C62693aX) r5
            com.instagram.service.session.UserSession r6 = r5.A05
            X.C62423Zt.A02(r6)
            android.content.SharedPreferences r2 = X.C28161tl.A04(r6)
            java.lang.String r1 = "nelson_nux_shown_count"
            r3 = 0
            int r2 = r2.getInt(r1, r3)
            r1 = 3
            if (r2 >= r1) goto L_0x0acd
            X.1XX r4 = new X.1XX
            r4.<init>()
            r4.A0B(r3)
            X.CTd r3 = r5.A04
            X.0m7 r1 = r3.mFragmentManager
            r2 = 0
            r4.A0A(r1, r2)
            java.lang.String r1 = "com.instagram.bullying.restrict_nux_action"
            X.4A9 r2 = X.C63263h8.A00(r6, r1, r2)
            r1 = 18
            X.AnonymousClass4A9.A01(r2, r4, r5, r1)
            r3.schedule(r2)
        L_0x0ac8:
            r1 = 922166875(0x36f7265b, float:7.365639E-6)
            goto L_0x0035
        L_0x0acd:
            androidx.fragment.app.FragmentActivity r2 = r5.A03
            com.instagram.service.session.UserSession r1 = r5.A05
            X.Drz r3 = X.C18180wK.A0Q(r2, r1)
            X.JXd r1 = X.C36480JXd.A02
            r1.A01()
            X.CTd r1 = r5.A04
            android.os.Bundle r2 = r1.mArguments
            com.instagram.wellbeing.restrict.fragment.RestrictHomeFragment r1 = new com.instagram.wellbeing.restrict.fragment.RestrictHomeFragment
            r1.<init>()
            X.C18180wK.A0x(r2, r1, r3)
            goto L_0x0ac8
        L_0x0ae7:
            r0 = -1624395652(0xffffffff9f2db07c, float:-3.678016E-20)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.394 r5 = (X.AnonymousClass394) r5
            com.instagram.service.session.UserSession r6 = r5.A01
            java.lang.String r2 = "email_and_sms_notifications_entered"
            X.C62423Zt.A02(r6)
            java.lang.String r1 = "settings"
            r7 = 0
            X.C62423Zt.A03(r6, r1, r2)
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r1 = 36319725218698587(0x8108990000155b, double:3.032078703875222E-306)
            boolean r1 = X.C63803iN.A0E(r4, r6, r1)
            if (r1 == 0) goto L_0x0b28
            X.4Vz r2 = new X.4Vz
            r2.<init>(r3)
            java.lang.String r1 = "com.igcarbon.settings.notifications_section"
            X.3iE r4 = X.C63743iE.A02(r1, r2)
            android.app.Activity r3 = r5.A00
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.C18190wL.A0N(r6)
            r1 = 2131826745(0x7f111839, float:1.9286383E38)
            X.C63743iE.A09(r3, r2, r4, r1)
        L_0x0b23:
            r1 = 921368039(0x36eaf5e7, float:7.0023702E-6)
            goto L_0x0035
        L_0x0b28:
            X.3hJ r1 = X.C63343hJ.getInstance()
            X.L5O r3 = r1.getPerformanceLogger(r6)
            java.lang.Integer r2 = X.AnonymousClass006.A01
            java.lang.String r1 = "email_sms_notification_settings"
            r3.Cur(r2, r7, r1)
            X.4Ja r3 = X.C63343hJ.A01(r6)
            java.lang.String r1 = "IgEmailSmsSettingsRoute"
            r3.CpK(r1)
            android.app.Activity r2 = r5.A00
            r1 = 2131826745(0x7f111839, float:1.9286383E38)
            java.lang.String r1 = r2.getString(r1)
            r3.A07 = r1
            r3.BaN(r2)
            goto L_0x0b23
        L_0x0b4f:
            r0 = -1367954216(0xffffffffae76acd8, float:-5.608744E-11)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r3.A00
            X.1wE r6 = (X.AnonymousClass1wE) r6
            X.0Oa r5 = r6.A01
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r5)
            X.49L r1 = X.AnonymousClass2MV.A00(r1)
            boolean r1 = r1.A02()
            if (r1 == 0) goto L_0x0b85
            androidx.fragment.app.FragmentActivity r2 = r6.requireActivity()
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r5)
            X.Drz r2 = X.C18180wK.A0Q(r2, r1)
            X.1wU r1 = new X.1wU
            r1.<init>()
            r2.A03 = r1
            r2.A05()
        L_0x0b80:
            r1 = -145701201(0xfffffffff750c6af, float:-4.2344825E33)
            goto L_0x0035
        L_0x0b85:
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "com.instagram.portable_settings.privacy.end_to_end_encryption"
            X.3iE r4 = X.C63743iE.A02(r1, r2)
            androidx.fragment.app.FragmentActivity r3 = r6.requireActivity()
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r5)
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.C18190wL.A0N(r1)
            r1 = 2131835352(0x7f1139d8, float:1.930384E38)
            X.C18230wP.A1A(r6, r2, r1)
            r4.A0C(r3, r2)
            goto L_0x0b80
        L_0x0ba5:
            r0 = -811020279(0xffffffffcfa8d009, float:-5.6644122E9)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.1wE r5 = (X.AnonymousClass1wE) r5
            X.C18190wL.A10()
            com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment r4 = new com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment
            r4.<init>()
            android.os.Bundle r3 = r4.mArguments
            if (r3 != 0) goto L_0x0bc0
            android.os.Bundle r3 = X.C18180wK.A06()
        L_0x0bc0:
            java.lang.String r2 = "entry_point"
            java.lang.String r1 = "ig_settings"
            r3.putString(r2, r1)
            X.282 r2 = X.AnonymousClass282.PRIVACY_SETTINGS
            java.lang.String r1 = "reachability_settings_upsell"
            r3.putSerializable(r1, r2)
            androidx.fragment.app.FragmentActivity r2 = X.C18210wN.A0F(r3, r4, r5)
            X.0Oa r1 = r5.A01
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r1)
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r2, r1)
            r1.A03 = r4
            r1.A05()
            r1 = 1169634351(0x45b7342f, float:5862.523)
            goto L_0x0035
        L_0x0be6:
            r0 = -862215542(0xffffffffcc9ba28a, float:-8.159752E7)
            int r0 = X.C14030oh.A05(r0)
            r1 = 13784(0x35d8, float:1.9315E-41)
            X.5zh r5 = new X.5zh
            r5.<init>(r1)
            java.lang.String r4 = "CASD_BUSINESS_LINK_MANAGEMENT"
            r2 = 45
            android.util.SparseArray r1 = r5.A04
            r1.put(r2, r4)
            java.lang.String r8 = "entry_point"
            java.lang.String r1 = "ig_professional_settings"
            kotlin.Pair r2 = X.C18180wK.A0p(r8, r1)
            java.lang.String r7 = "link_flow_source"
            java.lang.String r1 = "instagram"
            kotlin.Pair r1 = X.C18180wK.A0p(r7, r1)
            java.util.HashMap r2 = X.AnonymousClass4WJ.A08(r2, r1)
            java.lang.String r1 = "com.bloks.www.casd_bl.business_link_management"
            X.3iE r6 = X.C63743iE.A02(r1, r2)
            r5.A0V()
            r6.A03 = r5
            java.lang.Object r2 = r3.A00
            X.3z5 r2 = (X.C67193z5) r2
            X.CTd r1 = r2.A02
            android.content.Context r5 = r1.getContext()
            com.instagram.service.session.UserSession r4 = r2.A04
            com.instagram.bloks.hosting.IgBloksScreenConfig r3 = X.C18190wL.A0N(r4)
            com.instagram.base.activity.BaseFragmentActivity r2 = r2.A01
            if (r2 == 0) goto L_0x0c9f
            r1 = 2131830241(0x7f1125e1, float:1.9293474E38)
            java.lang.String r1 = r2.getString(r1)
        L_0x0c37:
            r3.A0S = r1
            r6.A0E(r5, r3)
            r1 = 19
            kotlin.jvm.internal.KtLambdaShape115S0100000_I2_95 r2 = new kotlin.jvm.internal.KtLambdaShape115S0100000_I2_95
            r2.<init>(r4, r1)
            java.lang.Class<X.3Ap> r1 = X.C57323Ap.class
            java.lang.Object r1 = r4.A01(r1, r2)
            X.3Ap r1 = (X.C57323Ap) r1
            X.27Z r13 = X.AnonymousClass27Z.UI
            X.27a r11 = X.AnonymousClass27a.BLM_LANDING_PAGE
            X.29y r12 = X.C320429y.A02
            X.27Y r10 = X.AnonymousClass27Y.BLM_ENTRY_POINT
            X.27c r9 = X.AnonymousClass27c.IG_BLM
            X.29z r6 = X.C320529z.A02
            X.27d r5 = X.AnonymousClass27d.INSTAGRAM
            X.27b r4 = X.AnonymousClass27b.CASD_BL_BIZ_LINK_MGMT
            X.0nS r2 = r1.A00
            java.lang.String r1 = "bizlinking_disclosure_events"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 93
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r2, r1)
            X.149 r2 = new X.149
            r2.<init>()
            java.lang.String r1 = "event_type"
            r2.A04(r13, r1)
            java.lang.String r1 = "event_name"
            r2.A04(r12, r1)
            java.lang.String r1 = "flow_type"
            r2.A04(r11, r1)
            java.lang.String r1 = "event_location"
            r2.A04(r10, r1)
            java.lang.String r1 = "event_data"
            r3.A0P(r2, r1)
            java.lang.String r1 = "disclosure_type"
            r3.A0O(r9, r1)
            r3.A0O(r6, r8)
            r3.A0O(r5, r7)
            java.lang.String r1 = "product_type"
            r3.A0O(r4, r1)
            r3.Bb4()
            r1 = 1182659283(0x467df2d3, float:16252.706)
            goto L_0x0035
        L_0x0c9f:
            r1 = 0
            goto L_0x0c37
        L_0x0ca1:
            r0 = 1665240913(0x63418f51, float:3.5705486E21)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.3z5 r2 = (X.C67193z5) r2
            com.instagram.base.activity.BaseFragmentActivity r1 = r2.A01
            com.instagram.service.session.UserSession r6 = r2.A04
            X.Drz r5 = X.AnonymousClass0wJ.A0Q(r1, r6)
            X.C24182DCb.A00()
            com.instagram.monetization.impl.MonetizationFragmentFactoryImpl r4 = new com.instagram.monetization.impl.MonetizationFragmentFactoryImpl
            r4.<init>()
            com.instagram.api.schemas.UserMonetizationProductType r3 = com.instagram.api.schemas.UserMonetizationProductType.UNRECOGNIZED
            r2 = 0
            r1 = 0
            androidx.fragment.app.Fragment r1 = r4.A00(r3, r6, r2, r1)
            r5.A03 = r1
            r5.A05()
            r1 = -1090465207(0xffffffffbf00d249, float:-0.5032087)
            goto L_0x0035
        L_0x0cce:
            r0 = 1294114758(0x4d229fc6, float:1.70523744E8)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.3z5 r1 = (X.C67193z5) r1
            com.instagram.service.session.UserSession r2 = r1.A04
            X.C62423Zt.A02(r2)
            com.instagram.base.activity.BaseFragmentActivity r1 = r1.A01
            X.Drz r2 = X.AnonymousClass0wJ.A0Q(r1, r2)
            X.C24016D5r.A00()
            X.DsG r1 = new X.DsG
            r1.<init>()
            androidx.fragment.app.Fragment r1 = r1.A06()
            X.C67193z5.A00(r1, r2)
            r1 = -488392681(0xffffffffe2e3b817, float:-2.100338E21)
            goto L_0x0035
        L_0x0cf8:
            java.lang.Object r3 = r3.A00
            X.3Vj r3 = (X.C61783Vj) r3
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0038
            com.instagram.service.session.UserSession r2 = r3.A07
            X.C62423Zt.A02(r2)
            X.C34502Ju.A00()
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r3.A03
            java.lang.String r5 = "switch_back"
            r8 = 0
            java.lang.String r6 = "setting"
            java.lang.String r7 = "switch_back_button"
            X.JrQ r4 = new X.JrQ
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.Be5(r4)
            androidx.fragment.app.FragmentActivity r0 = r3.A01
            X.Dsm r6 = X.C18190wL.A0W(r0)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r2)
            X.266 r1 = r0.A0g()
            X.266 r0 = X.AnonymousClass266.A05
            boolean r0 = X.C18180wK.A1Z(r1, r0)
            r7 = 2131836494(0x7f113e4e, float:1.9306156E38)
            r5 = 2131838168(0x7f1144d8, float:1.9309552E38)
            if (r0 == 0) goto L_0x0d3c
            r5 = 2131838167(0x7f1144d7, float:1.930955E38)
        L_0x0d3c:
            r4 = 2131836496(0x7f113e50, float:1.930616E38)
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            r0 = 36312827501216962(0x810253000004c2, double:3.027716559564963E-306)
            X.0e5 r1 = X.AnonymousClass0e5.A00(r0)
            r0 = 1
            java.lang.Object r0 = X.C67333zN.A00(r2, r1, r0)
            X.C04220Ms.A06(r0)
            boolean r2 = X.AnonymousClass0wJ.A1X(r0)
            if (r2 == 0) goto L_0x0d63
            r7 = 2131836516(0x7f113e64, float:1.93062E38)
            r5 = 2131836489(0x7f113e49, float:1.9306146E38)
            r4 = 2131836515(0x7f113e63, float:1.9306199E38)
        L_0x0d63:
            r6.A0L(r7)
            r6.A0K(r5)
            r0 = 151(0x97, float:2.12E-43)
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r1 = X.C18220wO.A0O(r3, r0)
            if (r2 == 0) goto L_0x0d82
            X.25l r0 = X.AnonymousClass25l.RED_BOLD
        L_0x0d73:
            r6.A0T(r1, r0, r4)
            r1 = 2131823054(0x7f1109ce, float:1.9278897E38)
            r0 = 152(0x98, float:2.13E-43)
            X.C18180wK.A1N(r6, r3, r0, r1)
            X.AnonymousClass0wJ.A1K(r6)
            return
        L_0x0d82:
            X.25l r0 = X.AnonymousClass25l.BLUE_BOLD
            goto L_0x0d73
        L_0x0d85:
            r0 = 1732019479(0x673c8517, float:8.9026E23)
            int r0 = X.C14030oh.A05(r0)
            X.3DW r2 = X.AnonymousClass30L.A00
            java.lang.Object r1 = r3.A00
            X.3G2 r1 = (X.AnonymousClass3G2) r1
            com.instagram.service.session.UserSession r5 = r1.A04
            android.app.Activity r3 = r1.A01
            X.Evg r4 = r1.A03
            java.lang.String r6 = "ig_settings"
            java.lang.String r7 = "ig_settings_item"
            r8 = 0
            r10 = 0
            r9 = r8
            r2.A00(r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 2070013982(0x7b61e81e, float:1.1729747E36)
            goto L_0x0035
        L_0x0da7:
            r0 = -331926433(0xffffffffec37345f, float:-8.8592296E26)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.393 r3 = (X.AnonymousClass393) r3
            com.instagram.service.session.UserSession r5 = r3.A01
            X.C62423Zt.A02(r5)
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "com.instagram.privacy.activity_center.reels_media_screen"
            X.3iE r4 = X.C63743iE.A02(r1, r2)
            androidx.fragment.app.FragmentActivity r3 = r3.A00
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.C18190wL.A0N(r5)
            r1 = 2131830267(0x7f1125fb, float:1.9293527E38)
            X.C63743iE.A08(r3, r2, r4, r1)
            r1 = -1043531388(0xffffffffc1ccf984, float:-25.621834)
            goto L_0x0035
        L_0x0dd2:
            r0 = 1140081646(0x43f443ee, float:488.5307)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.393 r3 = (X.AnonymousClass393) r3
            com.instagram.service.session.UserSession r5 = r3.A01
            X.C62423Zt.A02(r5)
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "com.instagram.privacy.activity_center.feed_media_screen"
            X.3iE r4 = X.C63743iE.A02(r1, r2)
            androidx.fragment.app.FragmentActivity r3 = r3.A00
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.C18190wL.A0N(r5)
            r1 = 2131830262(0x7f1125f6, float:1.9293516E38)
            X.C63743iE.A08(r3, r2, r4, r1)
            r1 = 2035113057(0x794d5c61, float:6.664341E34)
            goto L_0x0035
        L_0x0dfd:
            r0 = -18807016(0xfffffffffee10718, float:-1.4955657E38)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.393 r3 = (X.AnonymousClass393) r3
            com.instagram.service.session.UserSession r5 = r3.A01
            X.C62423Zt.A02(r5)
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "com.instagram.privacy.activity_center.liked_media_screen"
            X.3iE r4 = X.C63743iE.A02(r1, r2)
            androidx.fragment.app.FragmentActivity r3 = r3.A00
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.C18190wL.A0N(r5)
            r1 = 2131830257(0x7f1125f1, float:1.9293506E38)
            X.C63743iE.A08(r3, r2, r4, r1)
            r1 = -490064013(0xffffffffe2ca3773, float:-1.8651189E21)
            goto L_0x0035
        L_0x0e28:
            r0 = 1477101896(0x580ac948, float:6.103884E14)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.393 r3 = (X.AnonymousClass393) r3
            com.instagram.service.session.UserSession r5 = r3.A01
            X.C62423Zt.A02(r5)
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "com.instagram.privacy.activity_center.comments_screen"
            X.3iE r4 = X.C63743iE.A02(r1, r2)
            androidx.fragment.app.FragmentActivity r3 = r3.A00
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.C18190wL.A0N(r5)
            r1 = 2131830240(0x7f1125e0, float:1.9293472E38)
            X.C63743iE.A08(r3, r2, r4, r1)
            r1 = 511944340(0x1e83a694, float:1.393906E-20)
            goto L_0x0035
        L_0x0e53:
            r0 = 1901447088(0x7155c7b0, float:1.0585874E30)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.393 r1 = (X.AnonymousClass393) r1
            com.instagram.service.session.UserSession r2 = r1.A01
            X.C62423Zt.A02(r2)
            androidx.fragment.app.FragmentActivity r1 = r1.A00
            X.Drz r2 = X.AnonymousClass0wJ.A0Q(r1, r2)
            X.C18190wL.A10()
            X.1uw r1 = new X.1uw
            r1.<init>()
            r2.A03 = r1
            r2.A05()
            r1 = 1672821380(0x63b53a84, float:6.6861543E21)
            goto L_0x0035
        L_0x0e7b:
            r0 = -1107799267(0xffffffffbdf8531d, float:-0.121252276)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.393 r3 = (X.AnonymousClass393) r3
            com.instagram.service.session.UserSession r5 = r3.A01
            X.C62423Zt.A02(r5)
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "com.instagram.privacy.activity_center.account_history_screen"
            X.3iE r4 = X.C63743iE.A02(r1, r2)
            androidx.fragment.app.FragmentActivity r3 = r3.A00
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.C18190wL.A0N(r5)
            r1 = 2131820843(0x7f11012b, float:1.9274412E38)
            X.C63743iE.A08(r3, r2, r4, r1)
            r1 = -735891774(0xffffffffd4232ec2, float:-2.80345654E12)
            goto L_0x0035
        L_0x0ea6:
            r0 = 430587299(0x19aa3da3, float:1.7602483E-23)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.393 r1 = (X.AnonymousClass393) r1
            com.instagram.service.session.UserSession r2 = r1.A01
            X.C62423Zt.A02(r2)
            android.os.Bundle r4 = X.C18180wK.A06()
            androidx.fragment.app.FragmentActivity r1 = r1.A00
            X.Drz r3 = X.C18180wK.A0Q(r1, r2)
            X.6om r1 = X.C111986om.A01
            X.6vI r2 = r1.A00()
            java.lang.String r1 = "settings_recent_searches"
            androidx.fragment.app.Fragment r1 = r2.A01(r4, r1)
            r3.A03 = r1
            r3.A05()
            r1 = 720615852(0x2af3b9ac, float:4.3294307E-13)
            goto L_0x0035
        L_0x0ed6:
            r0 = -786606526(0xffffffffd11d5642, float:-4.2234814E10)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.393 r1 = (X.AnonymousClass393) r1
            com.instagram.service.session.UserSession r4 = r1.A01
            X.C62423Zt.A02(r4)
            androidx.fragment.app.FragmentActivity r1 = r1.A00
            X.Drz r3 = X.C18180wK.A0Q(r1, r4)
            X.25Q r2 = X.AnonymousClass25Q.SEARCH_SETTINGS
            r1 = 1
            androidx.fragment.app.Fragment r1 = X.AnonymousClass2Q9.A00(r2, r4, r1)
            r3.A03 = r1
            r3.A05()
            r1 = -1270661851(0xffffffffb4433d25, float:-1.8183034E-7)
            goto L_0x0035
        L_0x0efd:
            r0 = 74503328(0x470d4a0, float:2.8309497E-36)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.393 r1 = (X.AnonymousClass393) r1
            com.instagram.service.session.UserSession r4 = r1.A01
            X.C62423Zt.A02(r4)
            X.3UZ r2 = X.AnonymousClass3UZ.A02
            if (r2 == 0) goto L_0x0f26
            androidx.fragment.app.FragmentActivity r1 = r1.A00
            X.Drz r3 = X.C18180wK.A0Q(r1, r4)
            X.3IP r2 = r2.A00()
            java.lang.Integer r1 = X.AnonymousClass006.A01
            androidx.fragment.app.Fragment r1 = r2.A02(r4, r1)
            r3.A03 = r1
            r3.A05()
        L_0x0f26:
            r1 = 1435278528(0x558c9cc0, float:1.9325608E13)
            goto L_0x0035
        L_0x0f2b:
            r0 = 887408900(0x34e4c904, float:4.2614568E-7)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r3.A00
            X.393 r6 = (X.AnonymousClass393) r6
            com.instagram.service.session.UserSession r5 = r6.A01
            X.C62423Zt.A02(r5)
            android.os.Bundle r4 = X.C18180wK.A06()
            java.lang.String r2 = "is_in_archive_home"
            r1 = 1
            r4.putBoolean(r2, r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r2 = r6.A00
            java.lang.String r1 = "archive_home"
            X.C63863iT.A09(r2, r4, r5, r3, r1)
            r1 = 323059834(0x1341807a, float:2.4423369E-27)
            goto L_0x0035
        L_0x0f53:
            r0 = 1868121645(0x6f59462d, float:6.7243084E28)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.393 r3 = (X.AnonymousClass393) r3
            com.instagram.service.session.UserSession r5 = r3.A01
            X.C62423Zt.A02(r5)
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "com.instagram.privacy.media_deletion.deleted_media_screen"
            X.3iE r4 = X.C63743iE.A02(r1, r2)
            androidx.fragment.app.FragmentActivity r3 = r3.A00
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.C18190wL.A0N(r5)
            r1 = 2131830265(0x7f1125f9, float:1.9293522E38)
            X.C63743iE.A08(r3, r2, r4, r1)
            r1 = -1629171486(0xffffffff9ee4d0e2, float:-2.4226831E-20)
            goto L_0x0035
        L_0x0f7e:
            r0 = 665232958(0x27a6a63e, float:4.6254496E-15)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.393 r3 = (X.AnonymousClass393) r3
            com.instagram.service.session.UserSession r5 = r3.A01
            X.C62423Zt.A02(r5)
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "com.instagram.privacy.activity_center.igtv_media_screen"
            X.3iE r4 = X.C63743iE.A02(r1, r2)
            androidx.fragment.app.FragmentActivity r3 = r3.A00
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.C18190wL.A0N(r5)
            r1 = 2131830272(0x7f112600, float:1.9293537E38)
            X.C63743iE.A08(r3, r2, r4, r1)
            r1 = -683766767(0xffffffffd73e8c11, float:-2.0950879E14)
            goto L_0x0035
        L_0x0fa9:
            r0 = 1606532117(0x5fc1bc15, float:2.7920112E19)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.1Yc r4 = (X.C22441Yc) r4
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.0Oa r3 = r4.A0A
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r3)
            X.Drz r2 = X.AnonymousClass0wJ.A0Q(r2, r1)
            X.Dpo r1 = X.C25667Dpo.A02
            X.Dmu r5 = r1.A01()
            com.instagram.service.session.UserSession r6 = X.AnonymousClass0wJ.A0X(r3)
            r7 = 0
            r9 = 1
            r8 = r7
            r10 = r9
            r11 = r7
            androidx.fragment.app.Fragment r1 = r5.A02(r6, r7, r8, r9, r10, r11)
            r2.A03 = r1
            r2.A05()
            X.4qa r1 = r4.A01
            if (r1 == 0) goto L_0x0fe1
            r1.AIA()
        L_0x0fe1:
            r1 = 411291834(0x1883d0ba, float:3.4073466E-24)
            goto L_0x0035
        L_0x0fe6:
            r0 = 2123780098(0x7e965002, float:9.989981E37)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.1Yc r4 = (X.C22441Yc) r4
            X.0Oa r1 = r4.A09
            java.lang.Object r2 = X.C18190wL.A0f(r1)
            X.0nS r2 = (X.C13330nS) r2
            java.lang.String r1 = "follow_request_entrypoint_tapped"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 657(0x291, float:9.2E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r1)
            java.lang.String r1 = "privacy_switch_bottom_sheet"
            X.C18230wP.A1H(r2, r1)
            r2.Bb4()
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.0Oa r3 = r4.A0A
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r3)
            X.Drz r2 = X.AnonymousClass0wJ.A0Q(r2, r1)
            X.Dpo r1 = X.C25667Dpo.A02
            X.Dmu r5 = r1.A01()
            com.instagram.service.session.UserSession r6 = X.AnonymousClass0wJ.A0X(r3)
            r7 = 0
            r9 = 1
            r8 = r7
            r10 = r9
            r11 = r9
            androidx.fragment.app.Fragment r1 = r5.A02(r6, r7, r8, r9, r10, r11)
            r2.A03 = r1
            r2.A05()
            X.4qa r1 = r4.A01
            if (r1 == 0) goto L_0x103a
            r1.AIA()
        L_0x103a:
            r1 = 134421121(0x8031a81, float:3.9452534E-34)
            goto L_0x0035
        L_0x103f:
            r0 = 998326553(0x3b814119, float:0.003944528)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.3YG r1 = (X.AnonymousClass3YG) r1
            androidx.fragment.app.FragmentActivity r2 = r1.A01
            com.instagram.service.session.UserSession r1 = r1.A05
            X.Drz r2 = X.AnonymousClass0wJ.A0Q(r2, r1)
            X.C24016D5r.A00()
            X.DsG r1 = new X.DsG
            r1.<init>()
            androidx.fragment.app.Fragment r1 = r1.A06()
            r2.A03 = r1
            r2.A05()
            r1 = -172526504(0xfffffffff5b77458, float:-4.6511233E32)
            goto L_0x0035
        L_0x1068:
            r0 = 731538719(0x2b9a651f, float:1.0970425E-12)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.3FX r5 = (X.AnonymousClass3FX) r5
            com.instagram.service.session.UserSession r4 = r5.A01
            X.C62423Zt.A02(r4)
            java.lang.String r3 = "accessibility"
            java.lang.String r2 = "color_filter_settings_entered"
            r1 = 0
            X.C62423Zt.A01(r1, r4, r3, r2, r1)
            androidx.fragment.app.FragmentActivity r1 = r5.A00
            X.Drz r3 = X.AnonymousClass0wJ.A0Q(r1, r4)
            X.C18190wL.A10()
            X.1wC r2 = new X.1wC
            r2.<init>()
            android.os.Bundle r1 = X.C18180wK.A06()
            X.C05050Qq.A00(r1, r4)
            X.C18180wK.A0x(r1, r2, r3)
            r1 = 2017438123(0x783fa9ab, float:1.5549531E34)
            goto L_0x0035
        L_0x109d:
            r0 = 1193413520(0x47220b90, float:41483.562)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.3FX r3 = (X.AnonymousClass3FX) r3
            com.instagram.service.session.UserSession r5 = r3.A01
            X.C62423Zt.A02(r5)
            java.lang.String r4 = "accessibility"
            java.lang.String r2 = "video_subtitles_settings_entered"
            r1 = 0
            X.C62423Zt.A01(r1, r5, r4, r2, r1)
            androidx.fragment.app.FragmentActivity r1 = r3.A00
            X.Drz r3 = X.AnonymousClass0wJ.A0Q(r1, r5)
            X.C18190wL.A10()
            r2 = 1
            r1 = 0
            X.1wn r1 = X.C29141wn.A0B(r5, r4, r1, r2, r1)
            r3.A03 = r1
            r3.A05()
            r1 = -1310019590(0xffffffffb1eaaffa, float:-6.8303025E-9)
            goto L_0x0035
        L_0x10ce:
            r0 = -409062270(0xffffffffe79e3482, float:-1.494205E24)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.3TE r2 = (X.AnonymousClass3TE) r2
            X.4Vv r1 = new X.4Vv
            r1.<init>(r3)
            X.AnonymousClass3TE.A00(r2, r1)
            r1 = 1447601234(0x5648a452, float:5.5152019E13)
            goto L_0x0035
        L_0x10e6:
            r0 = 1751652726(0x68681976, float:4.3842348E24)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.3TE r2 = (X.AnonymousClass3TE) r2
            X.4Vu r1 = new X.4Vu
            r1.<init>(r3)
            X.AnonymousClass3TE.A00(r2, r1)
            r1 = -2051765976(0xffffffff85b48928, float:-1.6977502E-35)
            goto L_0x0035
        L_0x10fe:
            r0 = -1374119690(0xffffffffae1898f6, float:-3.4696655E-11)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.3TE r2 = (X.AnonymousClass3TE) r2
            X.4Vt r1 = new X.4Vt
            r1.<init>(r3)
            X.AnonymousClass3TE.A00(r2, r1)
            r1 = -616691666(0xffffffffdb3e082e, float:-5.3489239E16)
            goto L_0x0035
        L_0x1116:
            r0 = 343714266(0x147ca9da, float:1.2756246E-26)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.3TE r2 = (X.AnonymousClass3TE) r2
            X.4Vs r1 = new X.4Vs
            r1.<init>(r3)
            X.AnonymousClass3TE.A00(r2, r1)
            r1 = 1434086951(0x557a6e27, float:1.7209438E13)
            goto L_0x0035
        L_0x112e:
            r0 = 1188043525(0x46d01b05, float:26637.51)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.3TE r2 = (X.AnonymousClass3TE) r2
            X.4Vr r1 = new X.4Vr
            r1.<init>(r3)
            X.AnonymousClass3TE.A00(r2, r1)
            r1 = -1547540039(0xffffffffa3c269b9, float:-2.1078297E-17)
            goto L_0x0035
        L_0x1146:
            r0 = -424562966(0xffffffffe6b1aeea, float:-4.1954273E23)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.3TE r2 = (X.AnonymousClass3TE) r2
            X.4Vq r1 = new X.4Vq
            r1.<init>(r3)
            X.AnonymousClass3TE.A00(r2, r1)
            r1 = 1592879777(0x5ef16aa1, float:8.6979468E18)
            goto L_0x0035
        L_0x115e:
            r0 = 2055635479(0x7a868217, float:3.4920316E35)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.1dA r3 = (X.AnonymousClass1dA) r3
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()
            if (r2 == 0) goto L_0x1195
            X.0bf r1 = r3.A02
            X.Drz r4 = X.C18180wK.A0Q(r2, r1)
            X.C63463hW.A01()
            com.instagram.registration.model.RegFlowExtras r3 = r3.A00
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r1 = "RegFlowExtras.EXTRA_KEY"
            r2.putParcelable(r1, r3)
            java.lang.String r1 = "IgSessionManager.LOGGED_OUT_TOKEN"
            X.C18190wL.A13(r2, r1)
            X.1cj r1 = new X.1cj
            r1.<init>()
            r1.setArguments(r2)
            r4.A03 = r1
            r4.A05()
        L_0x1195:
            r1 = 1487771878(0x58ad98e6, float:1.52697764E15)
            goto L_0x0035
        L_0x119a:
            r0 = -1595351080(0xffffffffa0e8dfd8, float:-3.9450456E-19)
            int r0 = X.C18180wK.A02(r3, r0)
            r1 = 960376711(0x393e2f87, float:1.8137517E-4)
            goto L_0x0035
        L_0x11a6:
            r0 = 126284321(0x786f221, float:2.030439E-34)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r3.A00
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            X.Dsm r5 = X.AnonymousClass0wJ.A0V(r6)
            r1 = 2131835160(0x7f113918, float:1.930345E38)
            r5.A0L(r1)
            r1 = 2131835159(0x7f113917, float:1.9303449E38)
            r5.A0K(r1)
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r6)
            r1 = 2131824870(0x7f1110e6, float:1.928258E38)
            java.lang.String r4 = r2.getString(r1)
            r1 = 39
            com.facebook.redex.IDxCListenerShape219S0100000_3_I2 r3 = new com.facebook.redex.IDxCListenerShape219S0100000_3_I2
            r3.<init>((java.lang.Object) r6, (int) r1)
            X.25l r2 = X.AnonymousClass25l.RED_BOLD
            r1 = 1
            r5.A0Y(r3, r2, r4, r1)
            X.C18200wM.A1P(r5)
            r5.A0q(r1)
            r5.A0r(r1)
            X.AnonymousClass0wJ.A1K(r5)
            r1 = -1223931974(0xffffffffb70c47ba, float:-8.36135E-6)
            goto L_0x0035
        L_0x11ea:
            r0 = -324760028(0xffffffffeca48e24, float:-1.5914806E27)
            int r0 = X.C18200wM.A04(r3, r0)
            r1 = 2076052397(0x7bbe0bad, float:1.9735464E36)
            goto L_0x0035
        L_0x11f6:
            r0 = -1811885937(0xffffffff9400d08f, float:-6.5034795E-27)
            int r0 = X.C18200wM.A04(r3, r0)
            r1 = -249304801(0xfffffffff123e91f, float:-8.116461E29)
            goto L_0x0035
        L_0x1202:
            r0 = -1711698734(0xffffffff99f98cd2, float:-2.5802873E-23)
            int r0 = X.C18200wM.A01(r0, r2)
            java.lang.Object r4 = r3.A00
            X.1wA r4 = (X.AnonymousClass1wA) r4
            X.3EX r3 = r4.A05
            X.29m r1 = X.C319229m.REPORT_ANYWAY
            r3.A00(r1)
            android.view.View$OnClickListener r1 = r4.A0E
            r1.onClick(r2)
            r1 = -877152003(0xffffffffcbb7b8fd, float:-2.408089E7)
            goto L_0x0035
        L_0x121e:
            r0 = -452166808(0xffffffffe50c7b68, float:-4.1462984E22)
            int r0 = X.C14030oh.A05(r0)
            X.0t2 r1 = X.C16420t2.A00()
            X.059 r4 = r1.A09()
            java.lang.Object r3 = r3.A00
            X.1wg r3 = (X.AnonymousClass1wg) r3
            java.lang.String r1 = r3.A01
            android.content.Intent r2 = X.C18190wL.A0B(r1)
            android.content.Context r1 = r3.requireContext()
            r4.A09(r1, r2)
            r1 = -1210707537(0xffffffffb7d611af, float:-2.5519023E-5)
            goto L_0x0035
        L_0x1243:
            r0 = -1428286581(0xffffffffaade138b, float:-3.9448682E-13)
            int r0 = X.C14030oh.A05(r0)
            X.0t2 r1 = X.C16420t2.A00()
            X.059 r4 = r1.A09()
            java.lang.Object r3 = r3.A00
            X.1wg r3 = (X.AnonymousClass1wg) r3
            java.lang.String r1 = r3.A02
            android.content.Intent r2 = X.C18190wL.A0B(r1)
            android.content.Context r1 = r3.requireContext()
            r4.A09(r1, r2)
            r1 = -623056738(0xffffffffdadce89e, float:-3.10901301E16)
            goto L_0x0035
        L_0x1268:
            r0 = -1770011800(0xffffffff967fc368, float:-2.0660395E-25)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.1wg r1 = (X.AnonymousClass1wg) r1
            android.content.Context r2 = r1.requireContext()
            X.0Oa r1 = r1.A03
            X.0i6 r4 = X.AnonymousClass0wJ.A0U(r1)
            r1 = 1
            X.C04220Ms.A0B(r4, r1)
            android.content.Context r3 = r2.getApplicationContext()
            r1 = 12
            kotlin.jvm.internal.KtLambdaShape33S0200000_I2_17 r2 = new kotlin.jvm.internal.KtLambdaShape33S0200000_I2_17
            r2.<init>(r1, r3, r4)
            java.lang.Class<X.3D2> r1 = X.AnonymousClass3D2.class
            java.lang.Object r1 = r4.A01(r1, r2)
            X.3D2 r1 = (X.AnonymousClass3D2) r1
            r5 = 0
            android.content.SharedPreferences r1 = r1.A00
            android.content.SharedPreferences$Editor r4 = r1.edit()
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 + r5
            java.lang.String r1 = "snooze_expiration_lockout_manager"
            X.AnonymousClass0wJ.A12(r4, r1, r2)
            r1 = 1569883872(0x5d9286e0, float:1.31979658E18)
            goto L_0x0035
        L_0x12ab:
            r0 = 1294982325(0x4d2fdcb5, float:1.84404816E8)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.1wg r1 = (X.AnonymousClass1wg) r1
            androidx.fragment.app.FragmentActivity r3 = r1.getActivity()
            X.0Oa r2 = r1.A03
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r2)
            X.Drz r4 = X.C18180wK.A0Q(r3, r1)
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r2)
            r3 = 0
            X.C04220Ms.A0B(r1, r3)
            android.os.Bundle r2 = X.C18180wK.A06()
            X.C18180wK.A0w(r2, r1)
            java.lang.String r1 = "com.instagram.release.lockout.disable_back_press"
            r2.putBoolean(r1, r3)
            X.1bC r1 = new X.1bC
            r1.<init>()
            X.C18180wK.A0x(r2, r1, r4)
            r1 = 817723567(0x30bd78af, float:1.378586E-9)
            goto L_0x0035
        L_0x12e5:
            r0 = -1921317707(0xffffffff8d7b04b5, float:-7.7351012E-31)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.1jv r2 = (X.C24721jv) r2
            r1 = 0
            r2.A03(r1)
            r1 = -421242991(0xffffffffe6e45791, float:-5.3915744E23)
            goto L_0x0035
        L_0x12f9:
            r0 = -2013945734(0xffffffff87f5a07a, float:-3.6957822E-34)
            int r0 = X.C18180wK.A02(r3, r0)
            r1 = 1205251273(0x47d6acc9, float:109913.57)
            goto L_0x0035
        L_0x1305:
            r0 = 558423472(0x2148ddb0, float:6.8056037E-19)
            int r0 = X.C14030oh.A05(r0)
            X.GVD r2 = X.C25745DrH.A00
            java.lang.Object r1 = r3.A00
            android.app.Activity r1 = (android.app.Activity) r1
            X.C18200wM.A12(r1, r2)
            r1 = -1673018422(0xffffffff9c47c3ca, float:-6.609663E-22)
            goto L_0x0035
        L_0x131a:
            r0 = 2111595641(0x7ddc6479, float:3.661898E37)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            com.instagram.reels.dashboard.fragment.ReelDashboardFragment r1 = (com.instagram.reels.dashboard.fragment.ReelDashboardFragment) r1
            androidx.fragment.app.FragmentActivity r2 = r1.getActivity()
            com.instagram.service.session.UserSession r1 = r1.A0A
            X.Drz r1 = X.C18180wK.A0Q(r2, r1)
            X.C61423Tj.A00(r1)
            r1 = 748912435(0x2ca37f33, float:4.6468606E-12)
            goto L_0x0035
        L_0x1337:
            r0 = -1062852304(0xffffffffc0a62930, float:-5.192528)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.1Ya r2 = (X.C22421Ya) r2
            android.content.Context r5 = r2.getContext()
            if (r5 == 0) goto L_0x13a4
            java.lang.String r1 = r2.A01
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x13a4
            com.instagram.service.session.UserSession r4 = r2.A00
            java.lang.String r3 = r2.A01
            java.lang.String r6 = r2.A02
            r7 = 1
            java.lang.String r1 = X.AnonymousClass309.A00
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r1, (java.lang.Object) r6)
            android.net.Uri$Builder r2 = X.C18220wO.A0E(r1)
            java.lang.String r1 = "required_logged_user_id"
            android.net.Uri$Builder r3 = r2.appendQueryParameter(r1, r3)
            java.lang.String r2 = java.lang.String.valueOf(r7)
            java.lang.String r1 = "should_switch_account"
            android.net.Uri r3 = X.C18220wO.A0F(r3, r1, r2)
            java.lang.String r1 = "android.intent.action.VIEW"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r1, r3)
            java.lang.String r1 = "com.facebook.orca"
            r2.setPackage(r1)
            java.lang.String r1 = "should_skip_null_state"
            r2.putExtra(r1, r7)
            boolean r1 = X.C10650ih.A0A(r5, r2)
            if (r1 != 0) goto L_0x13a4
            java.lang.String r2 = "https://www.messenger.com/"
            java.lang.String r1 = "t/%s"
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r1, (java.lang.Object) r6)
            java.lang.String r2 = X.AnonymousClass00U.A0L(r2, r1)
            android.app.Activity r5 = (android.app.Activity) r5
            X.9wF r1 = X.C171209wF.A14
            X.Jpy r2 = X.C18230wP.A0Y(r5, r4, r1, r2)
            java.lang.String r1 = "MessengerAppDeeplinkingCreator"
            r2.A07(r1)
            r2.A04()
        L_0x13a4:
            r1 = 336566939(0x140f9a9b, float:7.2501456E-27)
            goto L_0x0035
        L_0x13a9:
            r0 = 493096879(0x1d640faf, float:3.0183657E-21)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.1d8 r5 = (X.AnonymousClass1d8) r5
            java.lang.String r1 = r5.A00
            if (r1 == 0) goto L_0x13d3
            X.3Yi r3 = X.C62333Yi.A01()
            android.content.Context r4 = r2.getContext()
            java.lang.String r1 = r5.A00
            android.net.Uri r1 = X.C15430rJ.A01(r1)
            android.content.Intent r3 = r3.A04(r4, r1)
            r2 = 1
            java.lang.String r1 = "com.instagram.url.extra.SHOULD_RETURN_TO_SENDING_ACTIVITY"
            r3.putExtra(r1, r2)
            X.C10650ih.A02(r4, r3)
        L_0x13d3:
            r1 = -1370854758(0xffffffffae4a6a9a, float:-4.6024164E-11)
            goto L_0x0035
        L_0x13d8:
            r0 = 939724560(0x38030f10, float:3.1246862E-5)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r1.onBackPressed()
            r1 = -682731901(0xffffffffd74e5683, float:-2.2687096E14)
            goto L_0x0035
        L_0x13eb:
            r0 = 1772446421(0x69a562d5, float:2.4992435E25)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.Jqm r1 = (X.C37383Jqm) r1
            r1.A06()
            r1 = -1843020850(0xffffffff9225bbce, float:-5.2296307E-28)
            goto L_0x0035
        L_0x13fe:
            r0 = -1853451676(0xffffffff91869264, float:-2.1231692E-28)
            int r0 = X.C14030oh.A05(r0)
            android.os.Bundle r6 = X.C18180wK.A06()
            X.9zz r2 = X.C171799zz.A1v
            r1 = 172(0xac, float:2.41E-43)
            java.lang.String r1 = X.C28174Ezk.A00(r1)
            r6.putSerializable(r1, r2)
            java.lang.Object r7 = r3.A00
            X.1d7 r7 = (X.AnonymousClass1d7) r7
            X.0Oa r5 = r7.A02
            X.0i6 r4 = X.AnonymousClass0wJ.A0U(r5)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r3 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r2 = r7.getActivity()
            java.lang.String r1 = "attribution_quick_camera_fragment"
            X.3iT r2 = X.C63863iT.A06(r2, r6, r4, r3, r1)
            X.C63863iT.A0E(r2)
            r1 = 60571(0xec9b, float:8.4878E-41)
            r2.A0J(r7, r1)
            com.instagram.service.session.UserSession r9 = X.AnonymousClass0wJ.A0X(r5)
            java.lang.String r10 = r7.getModuleName()
            java.lang.String r12 = r7.A00
            if (r12 != 0) goto L_0x1443
            java.lang.String r0 = "sourceMediaId"
            goto L_0x1c06
        L_0x1443:
            java.lang.String r13 = "supersync"
            r8 = 0
            java.lang.String r11 = "camera_format_try_it"
            X.C18553AhT.A01(r7, r8, r9, r10, r11, r12, r13)
            r1 = 1963688285(0x750b815d, float:1.76844E32)
            goto L_0x0035
        L_0x1450:
            r0 = 1733102193(0x674d0a71, float:9.6827774E23)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.1ZL r2 = (X.AnonymousClass1ZL) r2
            android.content.Context r7 = r2.getContext()
            android.widget.EditText r1 = r2.A00
            java.lang.String r6 = X.AnonymousClass0wJ.A0n(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto L_0x1476
            r1 = 2131825607(0x7f1113c7, float:1.9284075E38)
        L_0x146e:
            X.C63813iO.A00(r7, r1)
        L_0x1471:
            r1 = -346688419(0xffffffffeb55f45d, float:-2.5865517E26)
            goto L_0x0035
        L_0x1476:
            X.3IR r5 = X.AnonymousClass3IR.A00
            if (r5 == 0) goto L_0x1471
            androidx.fragment.app.FragmentActivity r4 = r2.getActivity()
            r4.getClass()
            com.instagram.service.session.UserSession r3 = r2.A02
            java.util.Map r2 = r2.A03
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r2)
            r5.A01(r4, r3, r6, r1)
            r1 = 2131825619(0x7f1113d3, float:1.92841E38)
            goto L_0x146e
        L_0x1491:
            r0 = 787040790(0x2ee94a16, float:1.06087736E-10)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.1ZL r2 = (X.AnonymousClass1ZL) r2
            java.util.Map r3 = r2.A03
            r3.clear()
            boolean r1 = r3.isEmpty()
            android.widget.TextView r2 = r2.A01
            if (r1 == 0) goto L_0x14b4
            r1 = 2131825620(0x7f1113d4, float:1.9284101E38)
            r2.setText(r1)
        L_0x14af:
            r1 = 142841176(0x8839558, float:7.919386E-34)
            goto L_0x0035
        L_0x14b4:
            java.lang.String r1 = r3.toString()
            r2.setText(r1)
            goto L_0x14af
        L_0x14bc:
            r0 = -2095407697(0xffffffff831a9daf, float:-4.5437544E-37)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r7 = r3.A00
            androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7
            android.view.LayoutInflater r2 = r7.getLayoutInflater()
            r1 = 2131496417(0x7f0c0de1, float:1.8616398E38)
            android.view.View r4 = X.C18240wQ.A0E(r2, r1)
            r1 = 2131297015(0x7f0902f7, float:1.8211963E38)
            android.view.View r6 = r4.findViewById(r1)
            r1 = 2131297016(0x7f0902f8, float:1.8211965E38)
            android.view.View r5 = r4.findViewById(r1)
            android.content.Context r1 = r7.getContext()
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r1)
            r1 = 2131825591(0x7f1113b7, float:1.9284042E38)
            java.lang.String r1 = r7.getString(r1)
            android.app.AlertDialog$Builder r1 = r2.setMessage(r1)
            android.app.AlertDialog$Builder r4 = r1.setView(r4)
            r1 = 2131826219(0x7f11162b, float:1.9285316E38)
            java.lang.String r2 = r7.getString(r1)
            r1 = 37
            com.facebook.redex.IDxCListenerShape48S0300000_1_I2 r1 = X.C18250wR.A0E(r3, r6, r5, r1)
            android.app.AlertDialog$Builder r1 = r4.setPositiveButton(r2, r1)
            r1.show()
            r1 = 499937762(0x1dcc71e2, float:5.4116102E-21)
            goto L_0x0035
        L_0x1511:
            r0 = 1740916254(0x67c4461e, float:1.8537545E24)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.1dZ r1 = (X.AnonymousClass1dZ) r1
            r1.A0L()
            r1 = -2042437069(0xffffffff8642e233, float:-3.665353E-35)
            goto L_0x0035
        L_0x1524:
            r0 = 1536436192(0x5b9427e0, float:8.3404279E16)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.AnonymousClass3Z9.A01(r1)
            r1 = -1650606384(0xffffffff9d9dbed0, float:-4.175485E-21)
            goto L_0x0035
        L_0x1535:
            r0 = 1847204008(0x6e1a18a8, float:1.1922625E28)
            int r0 = X.C14030oh.A05(r0)
            X.GVD r4 = X.C25745DrH.A00
            java.lang.Object r2 = r3.A00
            X.1YO r2 = (X.AnonymousClass1YO) r2
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            X.C18200wM.A12(r1, r4)
            X.3Aa r2 = r2.A00
            if (r2 == 0) goto L_0x155a
            X.Djx r1 = r2.A01
            androidx.fragment.app.FragmentActivity r4 = r2.A00
            com.instagram.service.session.UserSession r3 = r1.A01
            com.instagram.user.model.User r2 = r2.A02
            X.D1z r1 = X.C23937D1z.MISINFORMATION
            X.C25337Djx.A00(r4, r3, r2, r1)
        L_0x155a:
            r1 = 207194724(0xc598a64, float:1.6758717E-31)
            goto L_0x0035
        L_0x155f:
            java.lang.Object r3 = r3.A00
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            if (r0 == 0) goto L_0x0038
            android.os.Bundle r2 = r3.requireArguments()
            java.lang.Integer r1 = X.AnonymousClass006.A0N
            com.instagram.service.session.UserSession r0 = X.C18180wK.A0V(r2)
            X.AnonymousClass3ZJ.A02(r2, r0, r1)
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            r0.onBackPressed()
            return
        L_0x157e:
            r0 = -883273654(0xffffffffcb5a504a, float:-1.4307402E7)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r2 = (com.instagram.profile.edit.fragment.CompleteYourProfileFragment) r2
            boolean r1 = r2.A07
            if (r1 == 0) goto L_0x15bc
            android.content.Context r2 = r2.getContext()
            r1 = 137(0x89, float:1.92E-43)
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r4 = X.C18220wO.A0O(r3, r1)
            X.Dsm r3 = X.C18190wL.A0W(r2)
            r1 = 2131837357(0x7f1141ad, float:1.9307907E38)
            r3.A0L(r1)
            r1 = 2131837356(0x7f1141ac, float:1.9307905E38)
            r3.A0K(r1)
            r2 = 2131831740(0x7f112bbc, float:1.9296514E38)
            r1 = 0
            r3.A0O(r1, r2)
            r1 = 2131838153(0x7f1144c9, float:1.9309521E38)
            r3.A0P(r4, r1)
            X.AnonymousClass0wJ.A1K(r3)
        L_0x15b7:
            r1 = -431395074(0xffffffffe6496efe, float:-2.3781078E23)
            goto L_0x0035
        L_0x15bc:
            r1 = 1
            r2.A09 = r1
            X.C18180wK.A12(r2)
            goto L_0x15b7
        L_0x15c3:
            r0 = -273348276(0xffffffffefb5094c, float:-1.1205605E29)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r5 = (com.instagram.profile.edit.fragment.CompleteYourProfileFragment) r5
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r5.A01
            if (r1 == 0) goto L_0x15e5
            java.lang.String r7 = "profile_completion"
            r10 = 0
            java.lang.String r8 = r5.A06
            java.lang.String r9 = "continue"
            X.JrQ r6 = new X.JrQ
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r1.Be5(r6)
        L_0x15e5:
            com.instagram.user.model.User r1 = r5.A05
            boolean r1 = r1.A34()
            if (r1 == 0) goto L_0x1606
            r1 = 2131821016(0x7f1101d8, float:1.9274763E38)
            java.lang.String r4 = r5.getString(r1)
            android.content.Context r3 = r5.getContext()
            r2 = 0
            java.lang.String r1 = "add_profile_photo_error"
            X.C63813iO.A02(r3, r4, r1, r2)
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment.A03(r5, r4)
        L_0x1601:
            r1 = -1329787321(0xffffffffb0bd0e47, float:-1.3755618E-9)
            goto L_0x0035
        L_0x1606:
            com.instagram.profile.edit.controller.EditProfileFieldsController r1 = r5.A03
            r1.A09()
            com.instagram.service.session.UserSession r4 = r5.A04
            X.3DU r3 = r5.A02
            java.lang.String r2 = X.C18240wQ.A0d(r5)
            r1 = 0
            X.H8c r2 = X.C63503hc.A05(r3, r4, r2, r1)
            r1 = 117(0x75, float:1.64E-43)
            X.C63873iU.A0C(r5, r2, r1)
            goto L_0x1601
        L_0x161e:
            r0 = 586124179(0x22ef8b93, float:6.492886E-18)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r1 = (com.instagram.profile.edit.fragment.CompleteYourProfileFragment) r1
            X.4Aj r2 = r1.A00
            android.content.Context r1 = r1.getContext()
            r2.A08(r1)
            r1 = -1856673321(0xffffffff915569d7, float:-1.6835352E-28)
            goto L_0x0035
        L_0x1637:
            r0 = 1417374518(0x547b6b36, float:4.31934197E12)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r1 = (com.instagram.profile.edit.fragment.CompleteYourProfileFragment) r1
            X.4Aj r2 = r1.A00
            android.content.Context r1 = r1.getContext()
            r2.A08(r1)
            r1 = -1308388320(0xffffffffb2039420, float:-7.658883E-9)
            goto L_0x0035
        L_0x1650:
            r0 = 2106278202(0x7d8b413a, float:2.313767E37)
            int r0 = X.C14030oh.A05(r0)
            java.lang.String r2 = "com.instagram.equity.pronouns.edit_pronouns.screen"
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            X.3iE r5 = X.C63743iE.A02(r2, r1)
            java.lang.Object r2 = r3.A00
            com.instagram.profile.edit.controller.EditProfileFieldsController r2 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r2
            androidx.fragment.app.FragmentActivity r4 = r2.A03()
            com.instagram.service.session.UserSession r1 = r2.A06
            com.instagram.bloks.hosting.IgBloksScreenConfig r3 = X.C18190wL.A0N(r1)
            androidx.fragment.app.FragmentActivity r2 = r2.A03()
            r1 = 2131833804(0x7f1133cc, float:1.93007E38)
            X.C18210wN.A0s(r2, r3, r1)
            r5.A0C(r4, r3)
            r1 = 977287067(0x3a40379b, float:7.3325046E-4)
            goto L_0x0035
        L_0x1681:
            r0 = -1216080604(0xffffffffb7841524, float:-1.574547E-5)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.1a7 r5 = (X.AnonymousClass1a7) r5
            androidx.fragment.app.FragmentActivity r2 = r5.getActivity()
            X.0Oa r4 = r5.A01
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r4)
            X.Drz r7 = X.C18180wK.A0Q(r2, r1)
            r3 = 1
            r7.A0D = r3
            X.3Ek r1 = X.AnonymousClass2S8.A00()
            r1.A00()
            X.0Oa r2 = r5.A02
            java.lang.Object r1 = r2.getValue()
            X.10J r1 = (X.AnonymousClass10J) r1
            java.lang.String r6 = r1.A02
            X.0i6 r5 = X.AnonymousClass0wJ.A0U(r4)
            java.lang.Object r1 = r2.getValue()
            X.10J r1 = (X.AnonymousClass10J) r1
            com.instagram.api.schemas.IGRevShareProductType r4 = r1.A00
            X.0TJ r3 = X.C18250wR.A0D(r5, r3)
            r1 = 36319914198570501(0x8108c500141605, double:3.032198215507181E-306)
            boolean r1 = X.C63803iN.A0E(r3, r5, r1)
            if (r1 == 0) goto L_0x16e6
            X.1ZT r3 = new X.1ZT
            r3.<init>()
        L_0x16ce:
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r1 = "ARGUMENT_PRODUCT_ELIGIBILITY"
            r2.putString(r1, r6)
            java.lang.String r1 = "ARGUMENT_PRODUCT_TYPE"
            r2.putParcelable(r1, r4)
            X.C18180wK.A0x(r2, r3, r7)
            r1 = -868363512(0xffffffffcc3dd308, float:-4.9761312E7)
            goto L_0x0035
        L_0x16e6:
            X.1ZU r3 = new X.1ZU
            r3.<init>()
            goto L_0x16ce
        L_0x16ec:
            r0 = -1612297652(0xffffffff9fe64a4c, float:-9.75317E-20)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.1a7 r3 = (X.AnonymousClass1a7) r3
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()
            X.0Oa r1 = r3.A01
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r1)
            X.Drz r6 = X.C18180wK.A0Q(r2, r1)
            r1 = 1
            r6.A0D = r1
            X.3Ek r1 = X.AnonymousClass2S8.A00()
            r1.A00()
            X.0Oa r2 = r3.A02
            java.lang.Object r1 = r2.getValue()
            X.10J r1 = (X.AnonymousClass10J) r1
            java.lang.String r5 = r1.A02
            java.lang.Object r1 = r2.getValue()
            X.10J r1 = (X.AnonymousClass10J) r1
            com.instagram.api.schemas.IGRevShareProductType r4 = r1.A00
            X.CRz r3 = new X.CRz
            r3.<init>()
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r1 = "ARGUMENT_PRODUCT_ELIGIBILITY"
            r2.putString(r1, r5)
            java.lang.String r1 = "ARGUMENT_PRODUCT_TYPE"
            r2.putParcelable(r1, r4)
            X.C18180wK.A0x(r2, r3, r6)
            r1 = 1713957140(0x6628e914, float:1.9941428E23)
            goto L_0x0035
        L_0x173c:
            r0 = -1827919819(0xffffffff930c2835, float:-1.7690308E-27)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.1ZU r1 = (X.AnonymousClass1ZU) r1
            X.0Oa r1 = r1.A02
            java.lang.Object r2 = r1.getValue()
            X.10M r2 = (X.AnonymousClass10M) r2
            X.1tj r1 = X.C28141tj.A00
            r2.A00(r1)
            r1 = -1673206544(0xffffffff9c44e4f0, float:-6.5146855E-22)
            goto L_0x0035
        L_0x1759:
            r0 = -1827471931(0xffffffff9312fdc5, float:-1.8552909E-27)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.1ZT r1 = (X.AnonymousClass1ZT) r1
            X.0Oa r1 = r1.A02
            java.lang.Object r2 = r1.getValue()
            X.10M r2 = (X.AnonymousClass10M) r2
            X.1tj r1 = X.C28141tj.A00
            r2.A00(r1)
            r1 = -376411701(0xffffffffe99069cb, float:-2.1823114E25)
            goto L_0x0035
        L_0x1776:
            r0 = 566343181(0x21c1b60d, float:1.3126377E-18)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.1rq r3 = (X.C27041rq) r3
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            com.instagram.service.session.UserSession r1 = r3.A09()
            X.Drz r6 = X.C18180wK.A0Q(r2, r1)
            r1 = 1
            r6.A0D = r1
            X.3Ek r1 = X.AnonymousClass2S8.A00()
            r1.A00()
            X.0Oa r2 = r3.A00
            java.lang.Object r1 = r2.getValue()
            X.CA6 r1 = (X.CA6) r1
            com.instagram.api.schemas.UserMonetizationProductType r1 = r1.A01
            java.lang.String r5 = r1.A00
            java.lang.Object r1 = r2.getValue()
            X.CA6 r1 = (X.CA6) r1
            X.4wG r1 = r1.A09
            java.lang.Object r1 = r1.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2020000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2020000_I2) r1
            java.lang.String r4 = r1.A00
            X.1ZG r3 = new X.1ZG
            r3.<init>()
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r1 = "ARGUMENT_PRODUCT_TYPE"
            r2.putString(r1, r5)
            java.lang.String r1 = "ARGUMENT_PRODUCT_ELIGIBILITY"
            r2.putString(r1, r4)
            X.C18180wK.A0x(r2, r3, r6)
            r1 = -515307381(0xffffffffe149088b, float:-2.317757E20)
            goto L_0x0035
        L_0x17ce:
            r0 = 1823341579(0x6cadfc0b, float:1.6826752E27)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.C18190wL.A19(r1)
            r1 = 1635602942(0x617d51fe, float:2.920584E20)
            goto L_0x0035
        L_0x17e1:
            r0 = -342829045(0xffffffffeb90d80b, float:-3.502111E26)
            int r0 = X.C14030oh.A05(r0)
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "com.instagram.pro_home.monetization_platform.support.monetization_help_screen"
            X.3iE r4 = X.C63743iE.A02(r1, r2)
            java.lang.Object r1 = r3.A00
            X.1ZG r1 = (X.AnonymousClass1ZG) r1
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            X.0Oa r1 = r1.A01
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r1)
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r1)
            r4.A0C(r2, r1)
            r1 = 1735616419(0x677367a3, float:1.1494468E24)
            goto L_0x0035
        L_0x180c:
            r0 = 1011800154(0x3c4ed85a, float:0.012624824)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r7 = r3.A00
            X.1ZG r7 = (X.AnonymousClass1ZG) r7
            androidx.fragment.app.FragmentActivity r3 = r7.getActivity()
            X.0Oa r2 = r7.A01
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r2)
            X.Drz r6 = X.C18180wK.A0Q(r3, r1)
            X.C24182DCb.A00()
            com.instagram.monetization.impl.MonetizationFragmentFactoryImpl r5 = new com.instagram.monetization.impl.MonetizationFragmentFactoryImpl
            r5.<init>()
            com.instagram.service.session.UserSession r4 = X.AnonymousClass0wJ.A0X(r2)
            X.0Oa r2 = r7.A02
            java.lang.Object r1 = r2.getValue()
            X.100 r1 = (X.AnonymousClass100) r1
            com.instagram.api.schemas.UserMonetizationProductType r3 = r1.A01
            java.lang.Object r1 = r2.getValue()
            X.100 r1 = (X.AnonymousClass100) r1
            java.lang.String r2 = r1.A02
            r1 = 0
            androidx.fragment.app.Fragment r1 = r5.A00(r3, r4, r2, r1)
            r6.A03 = r1
            r6.A05()
            r1 = -268484266(0xffffffffefff4156, float:-1.5799533E29)
            goto L_0x0035
        L_0x1852:
            r0 = -57232211(0xfffffffffc96b4ad, float:-6.2600726E36)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.1bQ r1 = (X.AnonymousClass1bQ) r1
            X.0Oa r1 = r1.A02
            X.3ak r5 = X.C18200wM.A0N(r1)
            X.4qz r4 = X.AnonymousClass3J5.A00(r5)
            r3 = 0
            r1 = 33
            kotlin.coroutines.jvm.internal.KtSLambdaShape21S0201000_I2_7 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape21S0201000_I2_7
            r2.<init>(r5, r3, r1)
            r1 = 3
            X.C25237DiI.A00(r3, r3, r2, r4, r1)
            r1 = 1965137264(0x75219d70, float:2.0487134E32)
            goto L_0x0035
        L_0x1878:
            r0 = -57388867(0xfffffffffc9450bd, float:-6.16078E36)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.1jr r4 = (X.C24701jr) r4
            java.lang.Integer r3 = r4.A02
            X.0i6 r2 = r4.A06
            java.lang.Integer r1 = X.AnonymousClass006.A00
            r4.A00(r2, r3, r1)
            r1 = 1260968409(0x4b28d9d9, float:1.1065817E7)
            goto L_0x0035
        L_0x1891:
            r0 = 74291565(0x46d996d, float:2.7929666E-36)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.1jr r4 = (X.C24701jr) r4
            java.lang.Integer r3 = r4.A02
            X.0i6 r2 = r4.A06
            java.lang.Integer r1 = X.AnonymousClass006.A01
            r4.A00(r2, r3, r1)
            r1 = -891370934(0xffffffffcadec24a, float:-7299365.0)
            goto L_0x0035
        L_0x18aa:
            r0 = 851471340(0x32c06bec, float:2.2400819E-8)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r3.A00
            X.3GG r6 = (X.AnonymousClass3GG) r6
            X.0i6 r7 = r6.A09
            r5 = 0
            X.C04220Ms.A0B(r7, r5)
            X.0nS r2 = X.C13330nS.A02(r7)
            java.lang.String r1 = "country_code_buttontapped"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 470(0x1d6, float:6.59E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r8 = X.C18180wK.A0I(r2, r1)
            boolean r1 = X.AnonymousClass0wJ.A1U(r8)
            if (r1 == 0) goto L_0x1903
            double r1 = X.C18200wM.A00()
            double r3 = X.AnonymousClass269.A00()
            X.AnonymousClass0wJ.A1A(r8, r1, r3)
            java.lang.String r1 = "phone"
            X.C18210wN.A19(r8, r1)
            X.C18180wK.A19(r8)
            X.AnonymousClass269.A08(r8, r1)
            java.lang.String r2 = "PHONE"
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r2 = X.C18190wL.A0r(r1, r2)
            java.lang.String r1 = "contact_point_type"
            r8.A0T(r1, r2)
            X.C18180wK.A1A(r8, r3)
            X.C63683i7.A09(r8, r7)
            r2 = 0
            java.lang.String r1 = "actor_id"
            r8.A0S(r1, r2)
            r8.Bb4()
        L_0x1903:
            X.1XY r1 = new X.1XY
            r1.<init>()
            r6.A01 = r1
            android.os.Bundle r1 = X.C18180wK.A06()
            X.C05050Qq.A00(r1, r7)
            X.1XY r2 = r6.A01
            r2.setArguments(r1)
            X.IcN r1 = r6.A08
            r2.setTargetFragment(r1, r5)
            X.1XY r3 = r6.A01
            X.0m7 r2 = r1.mFragmentManager
            r1 = 0
            r3.A0A(r2, r1)
            r1 = -220123641(0xfffffffff2e12e07, float:-8.9202907E30)
            goto L_0x0035
        L_0x1928:
            r0 = -1157525236(0xffffffffbb01910c, float:-0.0019770293)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.3GG r1 = (X.AnonymousClass3GG) r1
            android.widget.AutoCompleteTextView r1 = r1.A05
            X.C18250wR.A0t(r1)
            r1.requestFocus()
            X.C09860go.A0K(r1)
            r1 = 1105482737(0x41e453f1, float:28.540987)
            goto L_0x0035
        L_0x1943:
            r0 = -564984261(0xffffffffde53063b, float:-3.80147652E18)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r7 = r3.A00
            X.1jq r7 = (X.C24691jq) r7
            X.0bf r10 = r7.A06
            java.util.Locale r1 = X.C31103Gfm.A03()
            java.lang.String r9 = r1.getLanguage()
            X.265 r1 = r7.A07
            java.lang.String r8 = r1.A01
            X.AnonymousClass0wJ.A1N(r10, r9)
            r1 = 2
            X.C04220Ms.A0B(r8, r1)
            double r5 = X.C18200wM.A00()
            double r3 = X.AnonymousClass269.A00()
            X.0nS r2 = X.C13330nS.A02(r10)
            java.lang.String r1 = "language_selector_clicked"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 2366(0x93e, float:3.315E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r1)
            X.AnonymousClass0wJ.A1B(r2, r5, r3)
            X.AnonymousClass269.A06(r2, r3)
            X.C18180wK.A19(r2)
            java.lang.String r1 = "from_lang"
            r2.A0T(r1, r9)
            X.C18190wL.A1I(r2, r8)
            X.C63683i7.A07(r2)
            X.C63683i7.A0A(r2, r10)
            X.1XW r3 = new X.1XW
            r3.<init>()
            r7.A01 = r3
            X.IcN r2 = r7.A05
            r1 = 0
            r3.setTargetFragment(r2, r1)
            X.1XW r3 = r7.A01
            X.0m7 r2 = r2.mFragmentManager
            r1 = 0
            r3.A0A(r2, r1)
            r1 = -185484597(0xfffffffff4f1bacb, float:-1.5321437E32)
            goto L_0x0035
        L_0x19ac:
            r0 = 560350470(0x21664506, float:7.8018383E-19)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.3Cp r1 = (X.C57823Cp) r1
            android.widget.AutoCompleteTextView r1 = r1.A04
            X.C18250wR.A0t(r1)
            r1.requestFocus()
            X.C09860go.A0K(r1)
            r1 = 997483522(0x3b746402, float:0.0037291055)
            goto L_0x0035
        L_0x19c7:
            r0 = 690608824(0x2929dab8, float:3.7715247E-14)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.1ch r3 = (X.AnonymousClass1ch) r3
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()
            X.0bf r1 = r3.A01
            X.Drz r4 = X.C63463hW.A00(r2, r1)
            com.instagram.registration.model.RegFlowExtras r3 = r3.A00
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r1 = "RegFlowExtras.EXTRA_KEY"
            r2.putParcelable(r1, r3)
            java.lang.String r1 = "IgSessionManager.LOGGED_OUT_TOKEN"
            X.C18190wL.A13(r2, r1)
            X.1ck r1 = new X.1ck
            r1.<init>()
            X.C18180wK.A0x(r2, r1, r4)
            r1 = -1656160540(0xffffffff9d48fee4, float:-2.6601555E-21)
            goto L_0x0035
        L_0x19f9:
            r0 = -249359604(0xfffffffff123130c, float:-8.075053E29)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.1bG r3 = (X.AnonymousClass1bG) r3
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            android.os.Bundle r2 = X.C18190wL.A0C(r1)
            if (r2 == 0) goto L_0x1a1e
            java.lang.String r1 = "caa_registration_redirection_to_native"
            boolean r1 = r2.containsKey(r1)
            if (r1 == 0) goto L_0x1a1e
            X.C18190wL.A1A(r3)
        L_0x1a19:
            r1 = 1265866377(0x4b739689, float:1.5963785E7)
            goto L_0x0035
        L_0x1a1e:
            X.AnonymousClass1bG.A00(r3)
            goto L_0x1a19
        L_0x1a22:
            r0 = -556814171(0xffffffffdecfb0a5, float:-7.4828215E18)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            androidx.fragment.app.FragmentActivity r2 = X.C18240wQ.A0I(r1)
            boolean r1 = r2 instanceof X.C82844qM
            if (r1 == 0) goto L_0x1a3b
            X.4qM r2 = (X.C82844qM) r2
            if (r2 == 0) goto L_0x1a3b
            r1 = 0
            r2.Ben(r1)
        L_0x1a3b:
            r1 = -567117793(0xffffffffde32781f, float:-3.21501571E18)
            goto L_0x0035
        L_0x1a40:
            r0 = -397259526(0xffffffffe8524cfa, float:-3.9724677E24)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.1cp r1 = (X.C23241cp) r1
            X.C23241cp.A00(r1)
            r1 = 1701818170(0x656faf3a, float:7.074237E22)
            goto L_0x0035
        L_0x1a53:
            r0 = 1283595895(0x4c821e77, float:6.8219832E7)
            int r0 = X.C14030oh.A05(r0)
            X.269 r1 = X.AnonymousClass269.ChooseBusinessSignUp
            java.lang.Object r4 = r3.A00
            X.1b5 r4 = (X.AnonymousClass1b5) r4
            X.0i6 r3 = r4.A01
            java.lang.String r2 = r1.A01
            r8 = 0
            X.265 r1 = X.AnonymousClass265.A1O
            X.3Vg r1 = X.C63313hF.A02(r3, r8, r1, r2)
            r1.A01()
            X.0i6 r7 = r4.A01
            java.lang.String r2 = "sign_up_with_biz_option"
            java.lang.String r6 = r4.A04
            java.lang.String r5 = "sign_up_as_business"
            java.lang.Integer r1 = X.AnonymousClass006.A0N
            X.0rn r3 = X.C34512Jv.A00(r1)
            X.C18250wR.A19(r3, r2)
            java.lang.String r2 = "entry_point"
            r3.A0D(r2, r6)
            java.lang.String r6 = "fb_user_id"
            r3.A0D(r6, r8)
            java.lang.String r1 = "component"
            r3.A0D(r1, r5)
            if (r7 == 0) goto L_0x4724
            X.C18180wK.A1K(r3, r7)
            X.C62883b4.A01()
            android.content.Intent r3 = X.C18210wN.A08(r4)
            android.os.Bundle r5 = X.C18180wK.A06()
            X.0i6 r1 = r4.A01
            X.C18180wK.A0w(r5, r1)
            java.lang.String r1 = r4.A04
            r5.putString(r2, r1)
            r2 = 7
            java.lang.String r1 = "business_account_flow"
            r5.putInt(r1, r2)
            java.lang.String r2 = "sign_up_suma_entry"
            r1 = 1
            r5.putBoolean(r2, r1)
            java.lang.String r2 = r4.A06
            java.lang.String r1 = "suma_sign_up_page_name"
            r5.putString(r1, r2)
            java.lang.String r2 = r4.A05
            java.lang.String r1 = "target_page_id"
            r5.putString(r1, r2)
            android.os.Bundle r2 = r4.requireArguments()
            java.lang.String r1 = "lined_fb_user_id"
            java.lang.String r1 = r2.getString(r1)
            r5.putString(r6, r1)
            android.os.Bundle r2 = r4.requireArguments()
            java.lang.String r1 = "cached_fb_access_token"
            java.lang.String r2 = r2.getString(r1)
            java.lang.String r1 = "fb_access_token"
            r5.putString(r1, r2)
            r3.putExtras(r5)
            boolean r1 = r4.isAdded()
            if (r1 == 0) goto L_0x1af0
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            if (r1 == 0) goto L_0x1af0
            X.C10650ih.A02(r1, r3)
        L_0x1af0:
            r1 = -1846001183(0xffffffff91f841e1, float:-3.9168102E-28)
            goto L_0x0035
        L_0x1af5:
            r0 = -299509276(0xffffffffee25d9e4, float:-1.283211E28)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r8 = r3.A00
            X.1b5 r8 = (X.AnonymousClass1b5) r8
            X.0i6 r1 = r8.A01
            java.lang.String r7 = "sign_up_with_biz_option"
            X.C54082ys.A00(r1, r7)
            X.0i6 r6 = r8.A01
            java.lang.String r5 = r8.A04
            java.lang.String r4 = "sign_up_as_personal"
            r3 = 0
            java.lang.Integer r1 = X.AnonymousClass006.A0N
            X.0rn r2 = X.C34512Jv.A00(r1)
            X.C18250wR.A19(r2, r7)
            java.lang.String r1 = "entry_point"
            r2.A0D(r1, r5)
            java.lang.String r1 = "fb_user_id"
            r2.A0D(r1, r3)
            java.lang.String r1 = "component"
            r2.A0D(r1, r4)
            if (r6 == 0) goto L_0x4729
            X.C18180wK.A1K(r2, r6)
            X.3HN r1 = r8.A03
            r1.A01()
            r1 = -358593988(0xffffffffeaa04a3c, float:-9.688935E25)
            goto L_0x0035
        L_0x1b35:
            r0 = 483418971(0x1cd0635b, float:1.3789968E-21)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.1Yq r4 = (X.C22581Yq) r4
            com.instagram.service.session.UserSession r3 = r4.A01
            if (r3 == 0) goto L_0x472e
            java.lang.Integer r2 = r4.A03
            r1 = 2
            X.C04220Ms.A0B(r2, r1)
            java.lang.Integer r1 = X.AnonymousClass006.A0N
            X.C54172z1.A00(r3, r1, r2)
            X.0m7 r2 = X.C18250wR.A0B(r4)
            int r1 = r2.A0I()
            if (r1 <= 0) goto L_0x1b61
            r2.A0d()
        L_0x1b5c:
            r1 = 55793047(0x3535597, float:6.210558E-37)
            goto L_0x0035
        L_0x1b61:
            X.C18180wK.A12(r4)
            goto L_0x1b5c
        L_0x1b65:
            r0 = 564788708(0x21a9fde4, float:1.151909E-18)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.1Yq r4 = (X.C22581Yq) r4
            com.instagram.service.session.UserSession r3 = r4.A01
            if (r3 == 0) goto L_0x4733
            java.lang.Integer r2 = r4.A03
            r1 = 2
            X.C04220Ms.A0B(r2, r1)
            java.lang.Integer r1 = X.AnonymousClass006.A0Y
            X.C54172z1.A00(r3, r1, r2)
            X.4Aj r2 = r4.A00
            if (r2 != 0) goto L_0x1b87
            java.lang.String r0 = "updateAvatarHelper"
            goto L_0x1c06
        L_0x1b87:
            android.content.Context r1 = r4.requireContext()
            r2.A08(r1)
            r1 = 175072665(0xa6f6599, float:1.152654E-32)
            goto L_0x0035
        L_0x1b93:
            r0 = 868036218(0x33bd2e7a, float:8.8094524E-8)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.1Yq r4 = (X.C22581Yq) r4
            boolean r1 = r4.A05
            com.instagram.service.session.UserSession r3 = r4.A01
            if (r1 == 0) goto L_0x1bd1
            if (r3 == 0) goto L_0x473c
            java.lang.String r2 = "lightweight_connections"
            r1 = 0
            X.C62713aZ.A01(r3, r2)
            com.instagram.service.session.UserSession r3 = r4.A01
            if (r3 == 0) goto L_0x4738
            java.lang.Integer r2 = r4.A03
            r1 = 2
            X.C04220Ms.A0B(r2, r1)
            java.lang.Integer r1 = X.AnonymousClass006.A0C
        L_0x1bb8:
            X.C54172z1.A00(r3, r1, r2)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            boolean r1 = r2 instanceof X.C82844qM
            if (r1 == 0) goto L_0x1bcc
            X.4qM r2 = (X.C82844qM) r2
            if (r2 == 0) goto L_0x1bcc
            boolean r1 = r4.A05
            r2.Ben(r1)
        L_0x1bcc:
            r1 = 1370777823(0x51b468df, float:9.6856695E10)
            goto L_0x0035
        L_0x1bd1:
            if (r3 == 0) goto L_0x4745
            java.lang.String r2 = "lightweight_connections"
            r1 = 0
            X.AnonymousClass3XC.A00(r3, r1, r2)
            com.instagram.service.session.UserSession r3 = r4.A01
            if (r3 == 0) goto L_0x4741
            java.lang.Integer r2 = r4.A03
            r1 = 2
            X.C04220Ms.A0B(r2, r1)
            java.lang.Integer r1 = X.AnonymousClass006.A0N
            goto L_0x1bb8
        L_0x1be6:
            r0 = -6967268(0xffffffffff95b01c, float:NaN)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.1Yq r4 = (X.C22581Yq) r4
            com.instagram.service.session.UserSession r3 = r4.A01
            if (r3 == 0) goto L_0x474a
            java.lang.Integer r2 = r4.A03
            r1 = 2
            X.C04220Ms.A0B(r2, r1)
            java.lang.Integer r1 = X.AnonymousClass006.A01
            X.C54172z1.A00(r3, r1, r2)
            com.instagram.user.model.User r1 = r4.A02
            if (r1 != 0) goto L_0x1c0b
            java.lang.String r0 = "user"
        L_0x1c06:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x1c0b:
            java.lang.String r2 = r1.BK7()
            r1 = 0
            X.C36612Rz.A00(r4, r2, r1)
            r1 = -1007605346(0xffffffffc3f1299e, float:-482.32513)
            goto L_0x0035
        L_0x1c18:
            r0 = -454321902(0xffffffffe4eb9912, float:-3.4768118E22)
            int r0 = X.C14030oh.A05(r0)
            X.3aZ r4 = X.C62713aZ.A00
            java.lang.Object r3 = r3.A00
            X.1ay r3 = (X.C22891ay) r3
            com.instagram.service.session.UserSession r2 = r3.A04
            java.lang.String r1 = "nux_one_tap_upsell"
            r4.A03(r2, r1)
            com.instagram.service.session.UserSession r1 = r3.A04
            X.3hk r2 = X.C63533hk.A02(r1)
            com.instagram.service.session.UserSession r1 = r3.A04
            java.lang.String r6 = r1.getUserId()
            java.lang.Integer r5 = X.AnonymousClass006.A0Y
            com.instagram.service.session.UserSession r4 = r3.A04
            r7 = 1
            r2.A0B(r3, r4, r5, r6, r7)
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()
            boolean r1 = r2 instanceof X.C82844qM
            if (r1 == 0) goto L_0x1c54
            X.4qM r2 = (X.C82844qM) r2
            if (r2 == 0) goto L_0x1c54
            r2.Ben(r7)
        L_0x1c4f:
            r1 = 1948303525(0x7420c0a5, float:5.0944506E31)
            goto L_0x0035
        L_0x1c54:
            X.4td r1 = r3.A02
            if (r1 == 0) goto L_0x1c5c
            X.C18230wP.A1P(r1)
            goto L_0x1c4f
        L_0x1c5c:
            X.3yq r1 = r3.A03
            r1.A00()
            goto L_0x1c4f
        L_0x1c62:
            r0 = -1425683906(0xffffffffab05ca3e, float:-4.753176E-13)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            com.instagram.nux.fragment.OneTapLoginLandingFragment r4 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r4
            X.0bf r2 = r4.A03
            java.lang.String r1 = "sso"
            X.C54312zF.A00(r2, r1)
            android.os.Bundle r3 = r4.mArguments
            java.lang.String r1 = X.AnonymousClass2S3.A00(r3)
            if (r1 == 0) goto L_0x1c98
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()
            X.0bf r1 = r4.A03
            X.Drz r2 = X.C63463hW.A00(r2, r1)
            java.lang.String r1 = "IgSessionManager.LOGGED_OUT_TOKEN"
            X.C18190wL.A13(r3, r1)
            X.1b5 r1 = new X.1b5
            r1.<init>()
        L_0x1c90:
            X.C18180wK.A0x(r3, r1, r2)
        L_0x1c93:
            r1 = 1257688663(0x4af6ce57, float:8087339.5)
            goto L_0x0035
        L_0x1c98:
            X.0bf r1 = r4.A03
            boolean r1 = X.AnonymousClass3WW.A02(r1)
            if (r1 == 0) goto L_0x1cda
            X.3VH r1 = X.AnonymousClass3VH.A00()
            java.lang.Integer r1 = r1.A05
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            if (r1 == r2) goto L_0x1cc4
            X.3YV r1 = X.AnonymousClass3YV.A00()
            java.lang.Integer r1 = r1.A01()
            if (r1 == r2) goto L_0x1cc4
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()
            X.0bf r1 = r4.A03
            X.Drz r2 = X.C18180wK.A0Q(r2, r1)
            X.1cm r1 = new X.1cm
            r1.<init>()
            goto L_0x1c90
        L_0x1cc4:
            X.C63463hW.A03()
            java.lang.String r1 = "IgSessionManager.LOGGED_OUT_TOKEN"
            X.C18190wL.A13(r3, r1)
            X.1bG r2 = new X.1bG
            r2.<init>()
            r2.setArguments(r3)
            X.0m7 r1 = r4.mFragmentManager
            X.C18200wM.A1G(r2, r1)
            goto L_0x1c93
        L_0x1cda:
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()
            X.0bf r1 = r4.A03
            X.Drz r2 = X.C63463hW.A00(r2, r1)
            X.1bJ r1 = new X.1bJ
            r1.<init>()
            goto L_0x1c90
        L_0x1cea:
            r0 = -713959399(0xffffffffd571d819, float:-1.66194022E13)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            com.instagram.nux.fragment.OneTapLoginLandingFragment r4 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r4
            X.0bf r3 = r4.A03
            java.lang.String r2 = "sso"
            r1 = 0
            X.C04220Ms.A0B(r3, r1)
            r1 = 0
            X.C54302zE.A00(r3, r1, r2)
            X.C63463hW.A03()
            android.os.Bundle r1 = r4.mArguments
            X.1ca r3 = X.C18250wR.A0O(r1)
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()
            X.0bf r1 = r4.A03
            X.AnonymousClass0wJ.A19(r3, r2, r1)
            r1 = -1333726525(0xffffffffb080f2c3, float:-9.382223E-10)
            goto L_0x0035
        L_0x1d18:
            r0 = -1624570811(0xffffffff9f2b0445, float:-3.621419E-20)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.1cg r1 = (X.C23201cg) r1
            r2 = 0
            r1.A0G = r2
            X.1jv r1 = r1.A08
            r1.A03(r2)
            r1 = 484924242(0x1ce75b52, float:1.5309903E-21)
            goto L_0x0035
        L_0x1d30:
            r0 = -291068306(0xffffffffeea6a66e, float:-2.5787856E28)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.1cg r5 = (X.C23201cg) r5
            android.content.Context r2 = r5.getContext()
            java.lang.String r1 = "https://help.instagram.com/227486307449481"
            java.lang.String r1 = X.AnonymousClass3W8.A01(r2, r1)
            android.content.Context r4 = r5.getContext()
            X.0bf r3 = r5.A09
            X.JhV r2 = new X.JhV
            r2.<init>((java.lang.String) r1)
            r1 = 2131829574(0x7f112346, float:1.929212E38)
            java.lang.String r1 = r5.getString(r1)
            X.C18210wN.A0t(r4, r3, r2, r1)
            r1 = 2043580060(0x79ce8e9c, float:1.340632E35)
            goto L_0x0035
        L_0x1d5f:
            r0 = -1924635783(0xffffffff8d486379, float:-6.1749494E-31)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r3.A00
            X.1aS r6 = (X.AnonymousClass1aS) r6
            X.1fM r5 = r6.A01
            r5.getClass()
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.util.List r1 = r5.A07
            java.util.Iterator r3 = r1.iterator()
        L_0x1d79:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x1d8f
            java.lang.Object r2 = r3.next()
            java.util.Set r1 = r5.A03
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x1d79
            r4.add(r2)
            goto L_0x1d79
        L_0x1d8f:
            java.util.ArrayList r12 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r4.iterator()
        L_0x1d97:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x1da1
            X.C72144Mm.A00(r12, r2)
            goto L_0x1d97
        L_0x1da1:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x1dbd
            X.1fM r1 = r6.A01
            java.util.List r1 = r1.A06
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)
            java.lang.Object r1 = X.C18240wQ.A0b(r1)
            X.4Mm r1 = (X.C72144Mm) r1
            r6.A03(r1)
        L_0x1db8:
            r1 = 2054631852(0x7a7731ac, float:3.208762E35)
            goto L_0x0035
        L_0x1dbd:
            int r4 = r4.size()
            r3 = 1
            X.0bf r1 = r6.A02
            X.0nS r2 = X.C13330nS.A01(r6, r1)
            if (r4 <= r3) goto L_0x1e40
            java.lang.String r1 = "click_multiple_account_log_in"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 161(0xa1, float:2.26E-43)
        L_0x1dd2:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r2, r1)
            java.lang.String r1 = "log_in"
            X.1o2 r1 = X.AnonymousClass1o2.A01(r1)
            java.lang.String r1 = r1.A04()
            X.C18250wR.A0y(r3, r1)
            X.265 r11 = X.AnonymousClass265.A0v
            java.lang.String r1 = "multiple_users_recover"
            X.C18190wL.A1I(r3, r1)
            java.lang.String r2 = X.C63683i7.A00()
            java.lang.String r1 = "app_device_id"
            r3.A0T(r1, r2)
            X.0bf r1 = r6.A02
            X.C63683i7.A06(r3, r1)
            r3.Bb4()
            android.content.Context r5 = r6.requireContext()
            X.0bf r1 = r6.A02
            java.lang.String r2 = r6.A03
            java.lang.String r4 = r6.A04
            X.H1T r3 = X.AnonymousClass0wJ.A0N(r1)
            java.lang.String r1 = "accounts/account_recovery_nonce_login/"
            r3.A0J(r1)
            java.lang.String r1 = X.C09140ev.A00(r5)
            X.C63213h0.A04(r3, r1)
            java.lang.String r1 = "login_nonce"
            r3.A0O(r1, r2)
            java.lang.String r1 = ","
            java.lang.String r2 = android.text.TextUtils.join(r1, r12)
            java.lang.String r1 = "user_ids"
            r3.A0O(r1, r2)
            java.lang.String r1 = "recovery_handle_type"
            r3.A0O(r1, r4)
            X.H8c r1 = X.C18180wK.A0S(r3)
            X.0bf r10 = r6.A02
            X.4Dh r8 = r6.A00
            X.1r2 r5 = new X.1r2
            r7 = r6
            r9 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r1.A00 = r5
            r6.schedule(r1)
            goto L_0x1db8
        L_0x1e40:
            java.lang.String r1 = "click_single_account_log_in"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 163(0xa3, float:2.28E-43)
            goto L_0x1dd2
        L_0x1e49:
            r0 = 516300343(0x1ec61e37, float:2.0976562E-20)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            java.lang.String r1 = "https://help.instagram.com/"
            java.lang.String r1 = X.AnonymousClass3W8.A01(r2, r1)
            android.net.Uri r2 = X.C15430rJ.A01(r1)
            boolean r1 = r3.isAdded()
            if (r1 == 0) goto L_0x1e71
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            if (r1 == 0) goto L_0x1e71
            X.C10650ih.A06(r1, r2)
        L_0x1e71:
            r1 = -1627503609(0xffffffff9efe4407, float:-2.6921432E-20)
            goto L_0x0035
        L_0x1e76:
            r0 = 722777323(0x2b14b4eb, float:5.2831237E-13)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.1ca r2 = (X.C23151ca) r2
            r1 = 0
            X.C23151ca.A02(r2, r1)
            r1 = 691752458(0x293b4e0a, float:4.159003E-14)
            goto L_0x0035
        L_0x1e8a:
            r0 = 1023879710(0x3d072a1e, float:0.03299915)
            int r0 = X.C14030oh.A05(r0)
            X.44X r4 = X.AnonymousClass44X.A00()
            java.lang.Object r2 = r3.A00
            X.1ca r2 = (X.C23151ca) r2
            X.0bf r1 = r2.A0B
            java.lang.String r5 = "ig_android_growth_fx_access_fb_ig_sso"
            boolean r6 = X.AnonymousClass44X.A01(r1, r4, r5)
            X.0bf r7 = r2.A0B
            java.lang.String r4 = "continue_with_fb_button_tapped"
            r13 = 0
            X.265 r3 = X.AnonymousClass265.A0t
            X.25r r1 = X.C313625r.A03
            X.3Vg r3 = X.C63313hF.A02(r7, r1, r3, r4)
            java.lang.String r1 = "has_facebook_session"
            r3.A04(r1, r6)
            boolean r1 = r2.A0I
            X.C61763Vg.A00(r3, r1)
            X.3U6 r4 = X.AnonymousClass3U6.A00
            X.0bf r3 = r2.A0B
            java.lang.String r1 = "login"
            r4.A00(r3, r1)
            com.instagram.fx.access.sso.FxSsoViewModel r1 = r2.A06
            X.0Oa r1 = r1.A02
            java.lang.Object r1 = X.C18180wK.A0d(r1)
            if (r1 == 0) goto L_0x1ef7
            com.instagram.fx.access.sso.FxSsoViewModel r1 = r2.A06
            X.0Oa r1 = r1.A02
            java.lang.Object r1 = X.C18180wK.A0d(r1)
            java.util.List r1 = (java.util.List) r1
            int r3 = r1.size()
            r1 = 1
            if (r3 <= r1) goto L_0x1ef7
            androidx.fragment.app.FragmentActivity r3 = r2.requireActivity()
            X.0bf r1 = r2.A0B
            X.Drz r3 = X.C63463hW.A00(r3, r1)
            android.os.Bundle r2 = r2.requireArguments()
            X.1al r1 = new X.1al
            r1.<init>()
            X.C18180wK.A0x(r2, r1, r3)
        L_0x1ef2:
            r1 = -1227189222(0xffffffffb6da941a, float:-6.5141476E-6)
            goto L_0x0035
        L_0x1ef7:
            java.lang.String r4 = "login_continue_button"
            if (r6 == 0) goto L_0x1f27
            X.1jz r6 = r2.A09
            X.0bf r9 = r2.A0B
            X.44X r3 = X.AnonymousClass44X.A00()
            X.0bf r1 = r2.A0B
            java.lang.String r10 = r3.A02(r1, r5)
            X.44X r3 = X.AnonymousClass44X.A00()
            X.0bf r1 = r2.A0B
            java.lang.String r11 = r3.A03(r1, r5)
            com.instagram.fx.access.sso.FxSsoViewModel r1 = r2.A06
            java.lang.String r12 = r1.A01()
            android.widget.TextView r1 = r2.A05
            X.5rY r7 = X.C18220wO.A0R(r1)
            X.5rY r8 = X.C18220wO.A0R(r4)
            r6.A0A(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x1ef2
        L_0x1f27:
            X.47l r3 = X.AnonymousClass47l.A03
            X.0bf r1 = r2.A0B
            boolean r1 = r3.A00(r1)
            if (r1 == 0) goto L_0x1f63
            X.0bf r1 = r2.A0B
            boolean r1 = X.C63693i8.A08(r1)
            if (r1 == 0) goto L_0x1f60
            r11 = 0
        L_0x1f3a:
            X.0bf r1 = r2.A0B
            boolean r1 = X.C63693i8.A08(r1)
            if (r1 != 0) goto L_0x1ef2
            java.lang.String r10 = X.AnonymousClass47l.A00
            if (r10 == 0) goto L_0x1ef2
            if (r11 == 0) goto L_0x1ef2
            X.1jz r6 = r2.A09
            X.0bf r9 = r2.A0B
            com.instagram.fx.access.sso.FxSsoViewModel r1 = r2.A06
            java.lang.String r12 = r1.A01()
            android.widget.TextView r1 = r2.A05
            X.5rY r7 = X.C18220wO.A0R(r1)
            X.5rY r8 = X.C18220wO.A0R(r4)
            r6.A0A(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x1ef2
        L_0x1f60:
            java.lang.String r11 = X.AnonymousClass47l.A02
            goto L_0x1f3a
        L_0x1f63:
            X.1jz r2 = r2.A09
            X.264 r1 = X.AnonymousClass264.A0H
            r2.A0D(r1)
            goto L_0x1ef2
        L_0x1f6b:
            r0 = 813608145(0x307eacd1, float:9.265025E-10)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.1ca r5 = (X.C23151ca) r5
            X.0bf r2 = r5.A0B
            java.lang.String r1 = "login"
            X.C54312zF.A00(r2, r1)
            androidx.fragment.app.FragmentActivity r3 = r5.getActivity()
            if (r3 == 0) goto L_0x1f8c
            android.view.Window r2 = r3.getWindow()
            r1 = 8192(0x2000, float:1.14794E-41)
            r2.clearFlags(r1)
        L_0x1f8c:
            boolean r1 = r3 instanceof X.C84654td
            if (r1 == 0) goto L_0x1fb8
            androidx.fragment.app.FragmentActivity r2 = r5.getActivity()
            X.0bf r1 = r5.A0B
            X.Drz r3 = X.C18180wK.A0Q(r2, r1)
            X.C63463hW.A01()
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r2 = "IgSessionManager.LOGGED_OUT_TOKEN"
            X.C18190wL.A13(r1, r2)
            X.1cj r2 = new X.1cj
            r2.<init>()
        L_0x1fab:
            r2.setArguments(r1)
            r3.A03 = r2
            r3.A05()
        L_0x1fb3:
            r1 = -519244291(0xffffffffe10cf5fd, float:-1.6251684E20)
            goto L_0x0035
        L_0x1fb8:
            X.0bf r1 = r5.A0B
            boolean r1 = X.AnonymousClass3WW.A02(r1)
            if (r1 == 0) goto L_0x1ffe
            X.3VH r1 = X.AnonymousClass3VH.A00()
            java.lang.Integer r1 = r1.A05
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            if (r1 == r2) goto L_0x1fe6
            X.3YV r1 = X.AnonymousClass3YV.A00()
            java.lang.Integer r1 = r1.A01()
            if (r1 == r2) goto L_0x1fe6
            androidx.fragment.app.FragmentActivity r2 = r5.getActivity()
            X.0bf r1 = r5.A0B
            X.Drz r3 = X.C18180wK.A0Q(r2, r1)
            android.os.Bundle r1 = r5.mArguments
            X.1cm r2 = new X.1cm
            r2.<init>()
            goto L_0x1fab
        L_0x1fe6:
            X.C63463hW.A03()
            android.os.Bundle r3 = r5.mArguments
            java.lang.String r1 = "IgSessionManager.LOGGED_OUT_TOKEN"
            X.C18190wL.A13(r3, r1)
            X.1bG r2 = new X.1bG
            r2.<init>()
            r2.setArguments(r3)
            X.0m7 r1 = r5.mFragmentManager
            X.C18200wM.A1G(r2, r1)
            goto L_0x1fb3
        L_0x1ffe:
            X.255 r1 = X.C63443hU.A00()
            boolean r1 = X.AnonymousClass0wJ.A1W(r1)
            if (r1 == 0) goto L_0x2022
            boolean r1 = r5.A0L
            if (r1 == 0) goto L_0x2022
            X.0m7 r4 = r5.mFragmentManager
            X.C63463hW.A03()
            android.os.Bundle r1 = r5.mArguments
            X.1bJ r3 = new X.1bJ
            r3.<init>()
            r3.setArguments(r1)
            java.lang.String r2 = "android.nux.FacebookLandingFragment"
            r1 = 0
            X.C63553hn.A07(r3, r4, r1, r2)
            goto L_0x1fb3
        L_0x2022:
            X.3HN r1 = r5.A08
            r1.A01()
            goto L_0x1fb3
        L_0x2028:
            r0 = 115624203(0x6e4490b, float:8.5871395E-35)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.9Ne r4 = (X.AnonymousClass9Ne) r4
            X.0Oa r1 = r4.A06
            X.0i6 r3 = X.AnonymousClass0wJ.A0U(r1)
            java.lang.String r2 = "nux_interest_picker"
            r1 = 0
            X.C04220Ms.A0B(r3, r1)
            X.C62713aZ.A01(r3, r2)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            boolean r1 = r2 instanceof X.C82844qM
            if (r1 == 0) goto L_0x2057
            X.4qM r2 = (X.C82844qM) r2
            if (r2 == 0) goto L_0x2057
            int r1 = r4.A00
            boolean r1 = X.C18180wK.A1X(r1)
            r2.Ben(r1)
        L_0x2057:
            r1 = 226813788(0xd84e75c, float:8.190826E-31)
            goto L_0x0035
        L_0x205c:
            r0 = 497251443(0x1da37473, float:4.3266146E-21)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.1dk r5 = (X.C23401dk) r5
            androidx.fragment.app.FragmentActivity r2 = r5.getActivity()
            if (r2 == 0) goto L_0x2092
            boolean r1 = r2 instanceof X.C82844qM
            if (r1 == 0) goto L_0x2079
            X.4qM r2 = (X.C82844qM) r2
            if (r2 == 0) goto L_0x2079
            r1 = 1
            r2.Ben(r1)
        L_0x2079:
            com.instagram.service.session.UserSession r4 = r5.A06
            java.lang.String r3 = "follow_from_logged_in_accounts_done_tapped"
            r2 = 0
            X.265 r1 = X.AnonymousClass265.A1H
            X.3Vg r3 = X.C63313hF.A02(r4, r2, r1, r3)
            java.util.Set r1 = r5.A0H
            int r2 = r1.size()
            java.lang.String r1 = "follow_users_count"
            r3.A02(r1, r2)
            r3.A01()
        L_0x2092:
            r1 = 785116453(0x2ecbed25, float:9.2734966E-11)
            goto L_0x0035
        L_0x2097:
            r0 = 2023686853(0x789f02c5, float:2.580098E34)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.1dk r3 = (X.C23401dk) r3
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()
            if (r2 == 0) goto L_0x20be
            boolean r1 = r2 instanceof X.C82844qM
            if (r1 == 0) goto L_0x20b4
            X.4qM r2 = (X.C82844qM) r2
            if (r2 == 0) goto L_0x20b4
            r1 = 0
            r2.Ben(r1)
        L_0x20b4:
            com.instagram.service.session.UserSession r4 = r3.A06
            java.lang.String r3 = "follow_from_logged_in_accounts_skip_tapped"
            r2 = 0
            X.265 r1 = X.AnonymousClass265.A1H
            X.C63313hF.A04(r4, r2, r1, r3)
        L_0x20be:
            r1 = 1503945522(0x59a46332, float:5.7838703E15)
            goto L_0x0035
        L_0x20c3:
            r0 = 2144181423(0x7fcd9caf, float:NaN)
            int r0 = X.C18190wL.A05(r3, r0)
            r1 = 367843970(0x15ecda82, float:9.5664385E-26)
            goto L_0x0035
        L_0x20cf:
            r0 = 1146051783(0x444f5cc7, float:829.44965)
            int r0 = X.C18190wL.A05(r3, r0)
            r1 = -1272177892(0xffffffffb42c1b1c, float:-1.602861E-7)
            goto L_0x0035
        L_0x20db:
            r0 = 1067577766(0x3fa1f1a6, float:1.265187)
            int r0 = X.C18190wL.A05(r3, r0)
            r1 = 1282933818(0x4c78043a, float:6.501604E7)
            goto L_0x0035
        L_0x20e7:
            r0 = -237440549(0xfffffffff1d8f1db, float:-2.1485167E30)
            int r0 = X.C14030oh.A05(r0)
            X.44X r4 = X.AnonymousClass44X.A00()
            java.lang.Object r2 = r3.A00
            X.1bJ r2 = (X.AnonymousClass1bJ) r2
            X.0bf r1 = r2.A08
            java.lang.String r5 = "ig_android_growth_fx_access_fb_ig_sso"
            boolean r6 = X.AnonymousClass44X.A01(r1, r4, r5)
            X.0bf r7 = r2.A08
            java.lang.String r4 = "continue_with_fb_button_tapped"
            r13 = 0
            X.265 r3 = X.AnonymousClass265.A0r
            X.25r r1 = X.C313625r.A03
            X.3Vg r3 = X.C63313hF.A02(r7, r1, r3, r4)
            java.lang.String r1 = "has_facebook_session"
            r3.A04(r1, r6)
            boolean r1 = r2.A09
            X.C61763Vg.A00(r3, r1)
            X.3U6 r4 = X.AnonymousClass3U6.A00
            X.0bf r3 = r2.A08
            java.lang.String r1 = "landing"
            r4.A00(r3, r1)
            com.instagram.fx.access.sso.FxSsoViewModel r1 = r2.A05
            X.0Oa r1 = r1.A02
            java.lang.Object r1 = X.C18180wK.A0d(r1)
            if (r1 == 0) goto L_0x2154
            com.instagram.fx.access.sso.FxSsoViewModel r1 = r2.A05
            X.0Oa r1 = r1.A02
            java.lang.Object r1 = X.C18180wK.A0d(r1)
            java.util.List r1 = (java.util.List) r1
            int r3 = r1.size()
            r1 = 1
            if (r3 <= r1) goto L_0x2154
            androidx.fragment.app.FragmentActivity r3 = r2.requireActivity()
            X.0bf r1 = r2.A08
            X.Drz r3 = X.C63463hW.A00(r3, r1)
            android.os.Bundle r2 = r2.requireArguments()
            X.1al r1 = new X.1al
            r1.<init>()
            X.C18180wK.A0x(r2, r1, r3)
        L_0x214f:
            r1 = -1531340161(0xffffffffa4b99a7f, float:-8.049269E-17)
            goto L_0x0035
        L_0x2154:
            java.lang.String r4 = "sign_up_continue_button"
            if (r6 == 0) goto L_0x2180
            X.1jz r6 = r2.A07
            X.0bf r9 = r2.A08
            X.44X r3 = X.AnonymousClass44X.A00()
            X.0bf r1 = r2.A08
            java.lang.String r10 = r3.A02(r1, r5)
            X.44X r3 = X.AnonymousClass44X.A00()
            X.0bf r1 = r2.A08
            java.lang.String r11 = r3.A03(r1, r5)
            com.instagram.fx.access.sso.FxSsoViewModel r1 = r2.A05
            java.lang.String r12 = r1.A01()
            X.5rZ r7 = X.AnonymousClass5rZ.A00
            X.5rY r8 = X.C18220wO.A0R(r4)
            r6.A0A(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x214f
        L_0x2180:
            X.47l r3 = X.AnonymousClass47l.A03
            X.0bf r1 = r2.A08
            boolean r1 = r3.A00(r1)
            if (r1 == 0) goto L_0x21ba
            X.0bf r1 = r2.A08
            boolean r1 = X.C63693i8.A08(r1)
            if (r1 == 0) goto L_0x21b7
            r10 = 0
        L_0x2193:
            X.0bf r1 = r2.A08
            boolean r1 = X.C63693i8.A08(r1)
            if (r1 == 0) goto L_0x21b4
            r11 = 0
        L_0x219c:
            if (r10 == 0) goto L_0x214f
            if (r11 == 0) goto L_0x214f
            X.1jz r6 = r2.A07
            X.0bf r9 = r2.A08
            com.instagram.fx.access.sso.FxSsoViewModel r1 = r2.A05
            java.lang.String r12 = r1.A01()
            X.5rZ r7 = X.AnonymousClass5rZ.A00
            X.5rY r8 = X.C18220wO.A0R(r4)
            r6.A0A(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x214f
        L_0x21b4:
            java.lang.String r11 = X.AnonymousClass47l.A02
            goto L_0x219c
        L_0x21b7:
            java.lang.String r10 = X.AnonymousClass47l.A00
            goto L_0x2193
        L_0x21ba:
            X.1jz r2 = r2.A07
            X.264 r1 = X.AnonymousClass264.A0c
            r2.A0D(r1)
            goto L_0x214f
        L_0x21c2:
            r0 = 399795402(0x17d464ca, float:1.3725622E-24)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment r1 = (com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment) r1
            com.instagram.service.session.UserSession r5 = r1.A02
            X.24O r0 = r1.A03
            java.lang.String r11 = r0.A00
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            java.lang.Integer r6 = X.AnonymousClass006.A0B
            r7 = 0
            r8 = r7
            r9 = r7
            r10 = r7
            X.C63583hq.A03(r5, r6, r7, r8, r9, r10, r11)
            android.content.Context r2 = r1.requireContext()
            com.instagram.service.session.UserSession r1 = r1.A02
            java.lang.String r0 = "https://help.instagram.com/414934160431303?ref=bsa"
            X.AnonymousClass2S2.A00(r2, r0, r1)
            r0 = 1409324413(0x5400957d, float:2.20905524E12)
            goto L_0x4609
        L_0x21f0:
            r0.onBackPressed()
            r0 = 635734691(0x25e48aa3, float:3.964564E-16)
            goto L_0x4609
        L_0x21f8:
            r0 = -428028289(0xffffffffe67cce7f, float:-2.9846138E23)
            int r1 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.C18250wR.A1C(r0)
            r0 = 479678469(0x1c975005, float:1.0013026E-21)
            goto L_0x4407
        L_0x2209:
            r0 = -1447865983(0xffffffffa9b35181, float:-7.9633355E-14)
            int r1 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            android.view.View r0 = (android.view.View) r0
            r0.performClick()
            r0 = 1262779796(0x4b447d94, float:1.2877204E7)
            goto L_0x4407
        L_0x221c:
            r0 = -511982252(0xffffffffe17bc554, float:-2.9027198E20)
            int r1 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            android.view.View r0 = (android.view.View) r0
            r0.performClick()
            r0 = 1072835428(0x3ff22b64, float:1.8919492)
            goto L_0x4407
        L_0x222f:
            r0 = 990315085(0x3b07024d, float:0.0020600737)
            int r1 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            android.view.View r0 = (android.view.View) r0
            r0.performClick()
            r0 = 1740317430(0x67bb22f6, float:1.7674549E24)
            goto L_0x4407
        L_0x2242:
            r0 = -895203074(0xffffffffcaa448fe, float:-5383295.0)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment r2 = (com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment) r2
            com.instagram.service.session.UserSession r1 = r2.A02
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass006.A0S
            X.C63583hq.A01(r1, r0)
            com.instagram.service.session.UserSession r0 = r2.A02
            X.49j r0 = X.C696349j.A03(r0)
            r0.A0L()
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            r0.getClass()
            r0.finish()
            r0 = -1122103916(0xffffffffbd1e0d94, float:-0.038587168)
            goto L_0x4609
        L_0x2270:
            r0 = -1423445113(0xffffffffab27f387, float:-5.966828E-13)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment r2 = (com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment) r2
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            com.instagram.service.session.UserSession r0 = r2.A02
            X.C63433hT.A04(r1, r0)
            com.instagram.service.session.UserSession r0 = r2.A02
            X.49j r0 = X.C696349j.A03(r0)
            r0.A0J()
            r0 = 927272220(0x37450d1c, float:1.1745167E-5)
            goto L_0x4609
        L_0x2292:
            r0 = 1999409131(0x772c8feb, float:3.4999768E33)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.1wD r2 = (X.AnonymousClass1wD) r2
            X.0Oa r0 = r2.A00
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r0)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass006.A0W
            X.C63583hq.A01(r1, r0)
            X.C18180wK.A12(r2)
            r0 = -242009522(0xfffffffff1933a4e, float:-1.458073E30)
            goto L_0x4609
        L_0x22b4:
            r0 = 1085979149(0x40baba0d, float:5.8352113)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.1wD r2 = (X.AnonymousClass1wD) r2
            X.0Oa r3 = r2.A00
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r3)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass006.A0V
            X.C63583hq.A01(r1, r0)
            X.C18180wK.A12(r2)
            android.content.Context r2 = r2.requireContext()
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r3)
            java.lang.String r0 = "https://www.facebook.com/help/instagram/750317295927782/?cms_platform=android-app&helpref=platform_switcher"
            X.AnonymousClass2S2.A00(r2, r0, r1)
            r0 = 456312912(0x1b32c850, float:1.4788539E-22)
            goto L_0x4609
        L_0x22e3:
            r0 = -1284086497(0xffffffffb376651f, float:-5.7368307E-8)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.Ica r1 = (X.C34650Ica) r1
            java.lang.String r0 = "community_guidelines"
            X.C34650Ica.A05(r1, r0)
            android.content.Context r2 = X.C18230wP.A0A(r1)
            com.instagram.service.session.UserSession r1 = r1.A03
            java.lang.String r0 = "https://help.instagram.com/477434105621119"
            X.C63373hN.A05(r2, r1, r0)
            r0 = 1565848779(0x5d54f4cb, float:9.5906956E17)
            goto L_0x4609
        L_0x2303:
            r0 = 1029576192(0x3d5e1600, float:0.0542202)
            int r1 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.Ica r5 = (X.C34650Ica) r5
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            com.instagram.service.session.UserSession r7 = r5.A03
            r4 = 0
            r0 = 2
            X.C04220Ms.A0B(r7, r0)
            java.lang.String r0 = "support_inbox_detail_fragment"
            java.util.Map r13 = X.C54372zL.A00(r0)
            java.lang.Integer r10 = X.AnonymousClass006.A01
            java.lang.String r11 = "com.bloks.www.ig.ixt.triggers.screen.support_inbox"
            X.1yz r8 = new X.1yz
            r8.<init>()
            X.3ad r2 = new X.3ad
            r6 = r4
            r9 = r4
            r12 = r4
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2.A04()
            r0 = 1759640075(0x68e1fa0b, float:8.5371595E24)
            goto L_0x4407
        L_0x2338:
            r0 = 1139373446(0x43e97586, float:466.91815)
            int r5 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.1as r4 = (X.C22871as) r4
            X.0Oa r0 = r4.A09
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r0)
            java.lang.String r1 = "igwb"
            java.lang.String r0 = "secondary_button_did_tapped"
            r3 = 0
            X.C62423Zt.A01(r4, r2, r1, r0, r3)
            X.3FY r2 = r4.A01
            if (r2 != 0) goto L_0x2359
            X.C18240wQ.A0p()
            throw r3
        L_0x2359:
            java.util.Map r1 = X.C22871as.A00(r4)
            java.lang.String r0 = "cancel"
            r2.A00(r0, r1)
            androidx.fragment.app.FragmentActivity r0 = r4.A00
            if (r0 != 0) goto L_0x236c
            java.lang.String r0 = "activity"
            X.C04220Ms.A0E(r0)
            throw r3
        L_0x236c:
            r0.onBackPressed()
            r0 = 1716844622(0x6654f84e, float:2.5143053E23)
            goto L_0x3fc1
        L_0x2374:
            r0 = 764262412(0x2d8db80c, float:1.6111577E-11)
            int r5 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r3.A00
            X.1as r6 = (X.C22871as) r6
            X.0Oa r9 = r6.A09
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r9)
            java.lang.String r1 = "igwb"
            java.lang.String r0 = "primary_button_did_tapped"
            r4 = 0
            X.C62423Zt.A01(r6, r2, r1, r0, r4)
            X.3FY r2 = r6.A01
            if (r2 != 0) goto L_0x2395
            X.C18240wQ.A0p()
            throw r4
        L_0x2395:
            java.util.Map r1 = X.C22871as.A00(r6)
            java.lang.String r0 = "save_settings"
            r2.A00(r0, r1)
            boolean r0 = r6.A07
            java.lang.String r7 = "config_value"
            r8 = 1
            if (r0 == 0) goto L_0x23d2
            android.content.Context r10 = r6.requireContext()
            X.06E r3 = X.AnonymousClass06E.A00(r6)
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r9)
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r0)
            java.lang.String r0 = "accounts/set_comment_filter/"
            r2.A0J(r0)
            java.lang.Class<X.4vo> r1 = X.C85814vo.class
            java.lang.Class<X.3Za> r0 = X.AnonymousClass3Za.class
            r2.A0C(r1, r0, r8)
            boolean r0 = r6.A05
            r2.A0K(r7, r0)
            X.H8c r1 = X.C18190wL.A0Q(r2)
            r0 = 182(0xb6, float:2.55E-43)
            X.C63873iU.A0E(r1, r6, r0)
            X.C31155GhB.A01(r10, r3, r1)
        L_0x23d2:
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x240a
            com.instagram.service.session.UserSession r3 = X.AnonymousClass0wJ.A0X(r9)
            X.C04220Ms.A0B(r3, r8)
            X.Jil r2 = new X.Jil
            r2.<init>(r4)
            X.4cq r1 = X.C75804cq.A00
            java.lang.Class<X.3Ew> r0 = X.C58303Ew.class
            r3.A01(r0, r1)
            boolean r0 = X.AnonymousClass3WI.A02(r3)
            if (r0 == 0) goto L_0x240f
            java.lang.Boolean r0 = X.C35402Nh.A00(r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x240f
            boolean r1 = r6.A04
            X.4Bu r0 = new X.4Bu
            r0.<init>(r6)
            X.AnonymousClass3WI.A01(r2, r3, r0, r1)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r3)
            X.C18230wP.A1K(r3, r0, r1)
        L_0x240a:
            r0 = -201815754(0xfffffffff3f88936, float:-3.9382098E31)
            goto L_0x3fc1
        L_0x240f:
            android.content.Context r4 = r6.requireContext()
            X.06E r3 = X.AnonymousClass06E.A00(r6)
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r9)
            X.H1T r2 = X.AnonymousClass0wJ.A0O(r0)
            java.lang.String r0 = "accounts/set_hide_message_requests_global/"
            r2.A0J(r0)
            java.lang.Class<X.4vo> r1 = X.C85814vo.class
            java.lang.Class<X.3Za> r0 = X.AnonymousClass3Za.class
            r2.A0C(r1, r0, r8)
            boolean r0 = r6.A04
            r2.A0K(r7, r0)
            X.H8c r1 = X.C18190wL.A0Q(r2)
            r0 = 183(0xb7, float:2.56E-43)
            X.C63873iU.A0E(r1, r6, r0)
            X.C31155GhB.A01(r4, r3, r1)
            goto L_0x240a
        L_0x243d:
            java.lang.Object r2 = r3.A00
            X.1dG r2 = (X.AnonymousClass1dG) r2
            X.22x r0 = r2.A04
            int r0 = r0.ordinal()
            java.lang.String r6 = "click"
            java.lang.String r5 = "restrict_account_button"
            switch(r0) {
                case 0: goto L_0x24ce;
                case 1: goto L_0x24c1;
                case 2: goto L_0x24b4;
                case 3: goto L_0x24ac;
                case 4: goto L_0x2478;
                case 5: goto L_0x2480;
                case 6: goto L_0x244e;
                case 7: goto L_0x2470;
                default: goto L_0x244e;
            }
        L_0x244e:
            java.lang.String r1 = "restrict_error"
            java.lang.String r0 = "Unrecognized entry point for Restrict bottom sheet"
            X.C10450iM.A03(r1, r0)
        L_0x2455:
            X.JXd r3 = X.C36480JXd.A02
            android.content.Context r4 = r2.requireContext()
            X.06E r5 = X.AnonymousClass06E.A00(r2)
            com.instagram.service.session.UserSession r6 = r2.A03
            java.lang.String r8 = r2.A07
            java.lang.String r9 = "restrict_half_sheet"
            java.lang.String r10 = r2.A06
            X.4NF r7 = new X.4NF
            r7.<init>(r2)
            r3.A04(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x2470:
            X.0nS r1 = r2.A01
            java.lang.String r0 = r2.A07
            X.C63773iK.A08(r1, r6, r5, r0)
            goto L_0x2455
        L_0x2478:
            X.0nS r1 = r2.A01
            java.lang.String r0 = r2.A07
            X.C63773iK.A0A(r1, r6, r5, r0)
            goto L_0x2455
        L_0x2480:
            X.0nS r1 = r2.A01
            java.lang.String r4 = r2.A07
            java.lang.String r0 = "ig_wellbeing_restrict_profile_flow_action"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1525(0x5f5, float:2.137E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            X.C18210wN.A1A(r3, r6)
            X.C18190wL.A1I(r3, r5)
            java.lang.String r1 = "profile_following_sheet"
            java.lang.String r0 = "entrypoint"
            r3.A0T(r0, r1)
            java.lang.Long r1 = X.C63773iK.A00(r4)
            if (r1 == 0) goto L_0x24a8
            java.lang.String r0 = "actor_ig_userid"
            r3.A0S(r0, r1)
        L_0x24a8:
            r3.Bb4()
            goto L_0x2455
        L_0x24ac:
            X.0nS r1 = r2.A01
            java.lang.String r0 = r2.A07
            X.C63773iK.A09(r1, r6, r5, r0)
            goto L_0x2455
        L_0x24b4:
            X.0nS r3 = r2.A01
            java.lang.String r1 = r2.A07
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            r0 = 0
            X.C63773iK.A02(r3, r0, r5, r1)
            goto L_0x2455
        L_0x24c1:
            X.0nS r3 = r2.A01
            java.lang.String r1 = r2.A07
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            r0 = 0
            X.C63773iK.A04(r3, r0, r6, r5, r1)
            goto L_0x2455
        L_0x24ce:
            X.0nS r1 = r2.A01
            java.lang.String r0 = r2.A07
            X.C63773iK.A07(r1, r0)
            goto L_0x2455
        L_0x24d6:
            r0 = 1292164924(0x4d04df3c, float:1.393264E8)
            int r4 = X.C18180wK.A02(r3, r0)
            r0 = 894194465(0x354c5321, float:7.611689E-7)
            goto L_0x4609
        L_0x24e2:
            r0 = 263565704(0xfb5b188, float:1.791636E-29)
            int r4 = X.C18180wK.A02(r3, r0)
            r0 = -1324329745(0xffffffffb11054ef, float:-2.1003037E-9)
            goto L_0x4609
        L_0x24ee:
            r0 = -2119828815(0xffffffff81a5fab1, float:-6.097115E-38)
            int r4 = X.C18180wK.A02(r3, r0)
            r0 = -584487(0xfffffffffff714d9, float:NaN)
            goto L_0x4609
        L_0x24fa:
            r0 = -1346055925(0xffffffffafc4d10b, float:-3.5800726E-10)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.4Aa r2 = (X.AnonymousClass4Aa) r2
            X.252 r1 = X.AnonymousClass252.A07
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            r2.A00 = r1
            X.AnonymousClass4Aa.A00(r2)
            r0 = 435704055(0x19f850f7, float:2.56753E-23)
            goto L_0x4609
        L_0x2515:
            r0 = -629546902(0xffffffffda79e06a, float:-1.75835038E16)
            int r4 = X.C14030oh.A05(r0)
            X.1Yu r6 = new X.1Yu
            r6.<init>()
            android.os.Bundle r5 = X.C18180wK.A06()
            java.lang.Object r3 = r3.A00
            X.4Aa r3 = (X.AnonymousClass4Aa) r3
            com.instagram.service.session.UserSession r2 = r3.A06
            com.instagram.monetization.repository.MonetizationRepository r0 = X.AnonymousClass2RN.A00(r2)
            boolean r1 = r0.A05
            java.lang.String r0 = "ARG_IS_FAN_CLUB_ELIGIBLE"
            r5.putBoolean(r0, r1)
            X.252 r0 = r3.A00
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "ARG_INITIAL_AUDIENCE_MODE"
            r5.putString(r0, r1)
            java.lang.String r1 = "ARG_IS_FOR_SCHEDULING_LIVE"
            r0 = 1
            r5.putBoolean(r1, r0)
            r6.setArguments(r5)
            r6.A09 = r3
            androidx.fragment.app.FragmentActivity r0 = r3.A05
            X.AnonymousClass0wJ.A19(r6, r0, r2)
            r0 = 1828535095(0x6cfd3b37, float:2.449103E27)
            goto L_0x4609
        L_0x2554:
            r0 = 1868234886(0x6f5b0086, float:6.777785E28)
            int r4 = X.C18180wK.A02(r3, r0)
            r0 = -1402827580(0xffffffffac628cc4, float:-3.2194672E-12)
            goto L_0x4609
        L_0x2560:
            r0 = -937358057(0xffffffffc8210d17, float:-164916.36)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.C18190wL.A1A(r0)
            r0 = 1255345172(0x4ad30c14, float:6915594.0)
            goto L_0x4609
        L_0x2573:
            r0 = -150253038(0xfffffffff70b5212, float:-2.8257572E33)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.1ZV r3 = (X.AnonymousClass1ZV) r3
            X.0Oa r0 = r3.A02
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.Jj9 r1 = X.C18210wN.A0L(r0)
            r0 = 2131837589(0x7f114295, float:1.9308377E38)
            X.Jqm r2 = X.C18230wP.A0X(r3, r1, r0)
            android.content.Context r1 = r3.requireContext()
            X.DaE r0 = X.C24270DFm.A00()
            r0.A00()
            X.1Xn r0 = new X.1Xn
            r0.<init>()
            X.C37383Jqm.A00(r1, r0, r2)
            r0 = 319315646(0x13085ebe, float:1.7212325E-27)
            goto L_0x4609
        L_0x25a7:
            java.lang.Object r4 = r3.A00
            X.CUV r4 = (X.CUV) r4
            com.instagram.service.session.UserSession r0 = r4.A09
            X.Jj9 r2 = X.C18210wN.A0L(r0)
            android.content.Context r1 = r4.requireContext()
            r0 = 2131837967(0x7f11440f, float:1.9309144E38)
            X.C18230wP.A10(r1, r2, r0)
            r0 = 1
            r2.A0c = r0
            X.Jqm r3 = r2.A00()
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            com.instagram.service.session.UserSession r1 = r4.A09
            X.BKU r0 = r4.A05
            r0.getClass()
            X.BKN r0 = r0.A0f
            java.lang.String r0 = r0.A4Y
            X.1Xr r0 = X.C50562tC.A00(r1, r0)
            X.C37383Jqm.A00(r2, r0, r3)
            return
        L_0x25d9:
            java.lang.Object r6 = r3.A00
            X.CUV r6 = (X.CUV) r6
            com.instagram.service.session.UserSession r3 = r6.A09
            java.lang.String r5 = r6.A0E
            int r0 = r6.A02
            long r1 = (long) r0
            r12 = 0
            int r4 = X.C18200wM.A02(r12, r3, r5)
            X.0nS r3 = X.C13330nS.A01(r6, r3)
            java.lang.String r0 = "instagram_clips_share_to_facebook_upsell_tap"
            X.0A2 r3 = X.AnonymousClass0wJ.A0M(r3, r0)
            r0 = 1751(0x6d7, float:2.454E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r3, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x2607
            X.9zy r0 = X.C171789zy.A11
            X.C18220wO.A1E(r0, r3)
            X.C18180wK.A1D(r3, r6, r5, r1)
        L_0x2607:
            com.instagram.service.session.UserSession r3 = r6.A09
            java.lang.String r5 = r6.A0E
            int r0 = r6.A02
            long r1 = (long) r0
            X.C04220Ms.A0B(r3, r12)
            X.C04220Ms.A0B(r5, r4)
            X.0nS r3 = X.C13330nS.A01(r6, r3)
            java.lang.String r0 = "instagram_clips_share_to_facebook_upsell_impression"
            X.0A2 r3 = X.AnonymousClass0wJ.A0M(r3, r0)
            r0 = 1750(0x6d6, float:2.452E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r3, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x2632
            X.9zy r0 = X.C171789zy.A10
            X.C18220wO.A1E(r0, r3)
            X.C18180wK.A1D(r3, r6, r5, r1)
        L_0x2632:
            X.C18180wK.A12(r6)
            X.AnonymousClass3LM.A01()
            androidx.fragment.app.FragmentActivity r5 = r6.requireActivity()
            com.instagram.service.session.UserSession r7 = r6.A09
            java.lang.String r10 = r6.A0E
            int r11 = r6.A02
            X.C18180wK.A1P(r7, r4, r10)
            X.D2u r16 = X.C23949D2u.OTHER
            X.2AC r14 = X.AnonymousClass2AC.A0I
            X.2AD r15 = X.AnonymousClass2AD.A0F
            java.lang.String r18 = r6.getModuleName()
            r0 = 0
            X.3TG r8 = new X.3TG
            r13 = r8
            r17 = r0
            r19 = r0
            r20 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            X.3Z9 r9 = X.C63783iL.A02(r5, r0, r7, r8)
            com.facebook.redex.IDxCListenerShape0S1501000_1_I2 r4 = new com.facebook.redex.IDxCListenerShape0S1501000_1_I2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r9.A01 = r4
            r12 = 1
            com.facebook.redex.IDxCListenerShape0S1501000_1_I2 r4 = new com.facebook.redex.IDxCListenerShape0S1501000_1_I2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r9.A02 = r4
            X.C63783iL.A0B(r6, r7, r8)
            android.content.Context r2 = r6.requireContext()
            com.instagram.service.session.UserSession r0 = r9.A04
            X.Jj9 r0 = X.C18210wN.A0L(r0)
            X.Jqm r1 = r0.A00()
            X.1b2 r0 = X.AnonymousClass3Z9.A00(r9)
            X.Jqm r0 = X.C37383Jqm.A00(r2, r0, r1)
            r9.A03 = r0
            return
        L_0x268b:
            r0 = 1143384114(0x4426a832, float:666.62805)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.CUH r5 = (X.CUH) r5
            com.instagram.ui.widget.typeahead.TypeaheadHeader r0 = r5.A05
            r0.A01()
            X.1dX r3 = new X.1dX
            r3.<init>()
            android.os.Bundle r2 = X.C18180wK.A06()
            X.23p r1 = r5.A0B
            java.lang.String r0 = "FollowListSortingOptionsFragment.SortingType"
            r2.putSerializable(r0, r1)
            com.instagram.service.session.UserSession r0 = r5.A04
            java.lang.String r0 = r0.token
            X.C18190wL.A13(r2, r0)
            r3.setArguments(r2)
            r3.A00 = r5
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            r0.getClass()
            X.DrH r0 = X.C18220wO.A0b(r0)
            r0.getClass()
            r0.A07(r3)
            r0 = -519936343(0xffffffffe10266a9, float:-1.5034214E20)
            goto L_0x4609
        L_0x26cd:
            r0 = 1125533922(0x431648e2, float:150.2847)
            int r4 = X.C18200wM.A04(r3, r0)
            r0 = -1123968359(0xffffffffbd019a99, float:-0.031641576)
            goto L_0x4609
        L_0x26d9:
            r0 = 421885509(0x19257645, float:8.5541844E-24)
            int r4 = X.C18180wK.A02(r3, r0)
            r0 = 1903653383(0x71777207, float:1.2252904E30)
            goto L_0x4609
        L_0x26e5:
            r0 = -1136947171(0xffffffffbc3b901d, float:-0.0114479335)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.1hJ r0 = (X.AnonymousClass1hJ) r0
            com.instagram.urlhandlers.media.ShortUrlReelLoadingFragment r3 = r0.A01
            java.lang.String r2 = r0.A00
            com.instagram.service.session.UserSession r0 = r3.A00
            X.H8c r1 = X.C50412sx.A00(r0, r2)
            X.1hJ r0 = new X.1hJ
            r0.<init>(r3, r2)
            r1.A00 = r0
            r3.schedule(r1)
            r0 = 1517112529(0x5a6d4cd1, float:1.66985075E16)
            goto L_0x4609
        L_0x2709:
            r0 = 24770985(0x179f9a9, float:4.59132E-38)
            int r4 = X.C18200wM.A04(r3, r0)
            r0 = 1672348148(0x63ae01f4, float:6.4197484E21)
            goto L_0x4609
        L_0x2715:
            r0 = 1319096681(0x4e9fd169, float:1.34065062E9)
            int r4 = X.C18180wK.A02(r3, r0)
            r0 = -1207777183(0xffffffffb802c861, float:-3.1181033E-5)
            goto L_0x4609
        L_0x2721:
            r0 = -2001191988(0xffffffff88b83bcc, float:-1.1088155E-33)
            int r4 = X.C18180wK.A02(r3, r0)
            r0 = 1192584265(0x47156449, float:38244.285)
            goto L_0x4609
        L_0x272d:
            r0 = 459080376(0x1b5d02b8, float:1.828157E-22)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.1dM r1 = (X.AnonymousClass1dM) r1
            java.util.Set r0 = r1.A0H
            r0.clear()
            X.AnonymousClass1dM.A00(r1)
            r0 = 1841525648(0x6dc37390, float:7.5611604E27)
            goto L_0x4609
        L_0x2745:
            r0 = -432983410(0xffffffffe631328e, float:-2.0919786E23)
            int r4 = X.C18180wK.A02(r3, r0)
            r0 = 431533085(0x19b8ac1d, float:1.909467E-23)
            goto L_0x4609
        L_0x2751:
            r0 = -1401449979(0xffffffffac779205, float:-3.5181868E-12)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.4AC r2 = (X.AnonymousClass4AC) r2
            com.instagram.common.ui.base.IgLinearLayout r1 = r2.A02
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r2.A04 = r0
            com.instagram.common.ui.base.IgEditText r0 = r2.A01
            android.text.Editable r0 = r0.getText()
            r0.clear()
            r0 = 2
            r2.A00 = r0
            r0 = 2013199733(0x77fefd75, float:1.0343626E34)
            goto L_0x4609
        L_0x2777:
            r0 = -105439402(0xfffffffff9b71f56, float:-1.1885324E35)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.0yu r0 = (X.C19060yu) r0
            r0.toggle()
            r0 = -1336554324(0xffffffffb055ccac, float:-7.7779805E-10)
            goto L_0x4609
        L_0x278a:
            java.lang.Object r0 = r3.A00
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r0 = (com.instagram.ui.widget.editphonenumber.EditPhoneNumberView) r0
            android.widget.EditText r0 = r0.A01
            X.C18250wR.A0t(r0)
            return
        L_0x2794:
            r0 = 1817569484(0x6c55e8cc, float:1.0344022E27)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.4MD r0 = (X.AnonymousClass4MD) r0
            android.content.Context r1 = r0.A00
            java.lang.String r0 = "Clicked dismiss button!"
            X.C63813iO.A0B(r1, r0)
            r0 = -437256837(0xffffffffe5effd7b, float:-1.41665185E23)
            goto L_0x4609
        L_0x27ab:
            r0 = -565102468(0xffffffffde51387c, float:-3.76898402E18)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.4MD r0 = (X.AnonymousClass4MD) r0
            android.content.Context r1 = r0.A00
            java.lang.String r0 = "Clicked Card!"
            X.C63813iO.A0B(r1, r0)
            r0 = -490083369(0xffffffffe2c9ebd7, float:-1.8623948E21)
            goto L_0x4609
        L_0x27c2:
            r0 = -1873572203(0xffffffff90538e95, float:-4.1722254E-29)
            int r1 = X.C14030oh.A05(r0)
            r0 = -532963579(0xffffffffe03b9f05, float:-5.407812E19)
            goto L_0x4407
        L_0x27ce:
            r0 = -1247756569(0xffffffffb5a0bee7, float:-1.1976489E-6)
            int r4 = X.C18200wM.A04(r3, r0)
            r0 = 1130723391(0x4365783f, float:229.46971)
            goto L_0x4609
        L_0x27da:
            r0 = 767369777(0x2dbd2231, float:2.1501996E-11)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.0yI r0 = (X.C18960yI) r0
            androidx.constraintlayout.widget.ConstraintLayout r1 = r0.A04
            r0 = 0
            r1.setImportantForAccessibility(r0)
            r0 = -1392734120(0xffffffffacfc9058, float:-7.178296E-12)
            goto L_0x4609
        L_0x27f0:
            r0 = -1342397109(0xffffffffaffca54b, float:-4.595598E-10)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.12S r0 = (X.AnonymousClass12S) r0
            com.instagram.igds.components.textcell.IgdsListCell r1 = r0.A00
            boolean r0 = r1.A0E
            r0 = r0 ^ 1
            r1.setChecked(r0)
            r0 = 575347680(0x224b1be0, float:2.7526387E-18)
            goto L_0x4609
        L_0x2809:
            r0 = 1490343850(0x58d4d7aa, float:1.87218188E15)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.9Na r3 = (X.C156349Na) r3
            X.0Oa r0 = r3.A05
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.Jj9 r2 = X.C18210wN.A0L(r0)
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r3)
            r0 = 2131836925(0x7f113ffd, float:1.930703E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0O = r0
            X.Jqm r2 = r2.A00()
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.1xf r0 = new X.1xf
            r0.<init>()
            X.C37383Jqm.A00(r1, r0, r2)
            r0 = 243321598(0xe80cafe, float:3.174991E-30)
            goto L_0x4609
        L_0x2840:
            r0 = -535933083(0xffffffffe00e4f65, float:-4.1018104E19)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.1bY r0 = (X.AnonymousClass1bY) r0
            X.C18190wL.A1A(r0)
            r0 = 837221475(0x31e6fc63, float:6.722574E-9)
            goto L_0x4609
        L_0x2853:
            r0 = -23171997(0xfffffffffe9e6c63, float:-1.052904E38)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.1XZ r2 = (X.AnonymousClass1XZ) r2
            java.lang.String r7 = r2.A03
            java.lang.String r8 = r2.A08
            java.lang.String r9 = r2.A07
            com.instagram.service.session.UserSession r5 = r2.A01
            java.util.ArrayList r10 = X.AnonymousClass0wJ.A0v()
            java.lang.String r1 = "dismiss_intro"
            X.3SU r0 = new X.3SU
            r0.<init>(r1)
            r10.add(r0)
            java.lang.Integer r6 = X.AnonymousClass006.A0j
            X.C50182sa.A00(r5, r6, r7, r8, r9, r10)
            r2.A06()
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            if (r1 == 0) goto L_0x288b
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x288b
            r1.finish()
        L_0x288b:
            r0 = -1242489092(0xffffffffb5f11efc, float:-1.7964917E-6)
            goto L_0x4609
        L_0x2890:
            r0 = 1202509011(0x47acd4d3, float:88489.65)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r7 = r3.A00
            X.Jrf r7 = (X.C37418Jrf) r7
            android.app.Activity r5 = r7.A02
            r6 = 0
            r2 = 0
            com.instagram.igds.components.headline.IgdsHeadline r3 = new com.instagram.igds.components.headline.IgdsHeadline
            r3.<init>(r5, r6, r2, r2)
            r1 = 1
            r3.A05 = r1
            r0 = 2131838081(0x7f114481, float:1.9309375E38)
            java.lang.String r0 = r5.getString(r0)
            r3.setHeadline((java.lang.CharSequence) r0)
            r0 = 2131838082(0x7f114482, float:1.9309377E38)
            java.lang.String r0 = r5.getString(r0)
            r3.setBody(r0, r6)
            r0 = 2131233260(0x7f0809ec, float:1.8082652E38)
            r3.A08(r0, r2)
            com.instagram.service.session.UserSession r0 = r7.A04
            X.3Iu r2 = new X.3Iu
            r2.<init>(r0)
            com.facebook.redex.IDxObjectShape174S0000000_1_I2 r0 = new com.facebook.redex.IDxObjectShape174S0000000_1_I2
            r0.<init>(r1)
            r2.A02 = r0
            r2.A00 = r3
            r1 = 2131838083(0x7f114483, float:1.930938E38)
            X.3tO r0 = X.C65523tO.A00
            r2.A03(r0, r1)
            X.3ag r0 = new X.3ag
            r0.<init>(r2)
            r0.A02(r5)
            r0 = -1004360067(0xffffffffc422ae7d, float:-650.7264)
            goto L_0x4609
        L_0x28e6:
            r0 = 1751486133(0x68658eb5, float:4.3362176E24)
            int r5 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r3.A00
            X.1cw r6 = (X.C23301cw) r6
            boolean r0 = r6.A03
            if (r0 != 0) goto L_0x292f
            X.GVD r1 = X.C25745DrH.A00
            android.content.Context r0 = r6.getContext()
            X.DrH r4 = r1.A02(r0)
            r0 = 1
            r6.A03 = r0
            com.instagram.service.session.UserSession r2 = r6.A00
            java.lang.String r1 = "userSession"
            r0 = 0
            if (r2 != 0) goto L_0x290d
            X.C04220Ms.A0E(r1)
            throw r0
        L_0x290d:
            X.7qT r3 = X.C130667qT.A02(r6, r2, r0)
            com.instagram.service.session.UserSession r2 = r6.A00
            if (r2 != 0) goto L_0x2919
            X.C04220Ms.A0E(r1)
            throw r0
        L_0x2919:
            java.lang.String r1 = "referer"
            java.lang.String r0 = "political_ad_info_sheet"
            java.util.Map r1 = java.util.Collections.singletonMap(r1, r0)
            java.lang.String r0 = "com.instagram.sensitive_topics.sensitive_topics.ad_topic_preferences_in_context_view"
            X.4A9 r1 = X.C63263h8.A00(r2, r0, r1)
            r0 = 11
            X.AnonymousClass4A9.A02(r1, r4, r3, r6, r0)
            r6.schedule(r1)
        L_0x292f:
            r0 = 1489496423(0x58c7e967, float:1.75844215E15)
            goto L_0x3fc1
        L_0x2934:
            r0 = -1439649648(0xffffffffaa30b090, float:-1.5693198E-13)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r3.A00
            X.1d0 r6 = (X.AnonymousClass1d0) r6
            X.K9R r3 = X.K9R.A00
            X.IVw r2 = new X.IVw
            r2.<init>(r3)
            java.lang.String r1 = "entrypoint"
            java.lang.String r0 = "app_settings"
            r2.A04(r1, r0)
            java.lang.String r1 = "node_identifier"
            java.lang.String r0 = "ad_topics"
            r2.A04(r1, r0)
            X.IVw r0 = X.C18180wK.A0M(r3, r2)
            X.MV6 r5 = new X.MV6
            r5.<init>(r0)
            com.instagram.service.session.UserSession r1 = r6.A03
            java.lang.String r2 = "userSession"
            r0 = 0
            if (r1 != 0) goto L_0x2968
            X.C04220Ms.A0E(r2)
            throw r0
        L_0x2968:
            X.7qT r3 = X.C130667qT.A02(r6, r1, r0)
            com.instagram.service.session.UserSession r1 = r6.A03
            if (r1 != 0) goto L_0x2974
            X.C04220Ms.A0E(r2)
            throw r0
        L_0x2974:
            java.lang.String r0 = "com.bloks.www.fx.settings.individual_setting.async"
            X.4A9 r2 = X.C63263h8.A00(r1, r0, r5)
            r1 = 11
            com.instagram.bloks.util.IDxACallbackShape103S0100000_1_I2 r0 = new com.instagram.bloks.util.IDxACallbackShape103S0100000_1_I2
            r0.<init>((X.C130667qT) r3, (int) r1)
            r2.A00 = r0
            r6.schedule(r2)
            r0 = 300621609(0x11eb1f29, float:3.7095666E-28)
            goto L_0x4609
        L_0x298b:
            r0 = -469202583(0xffffffffe4088969, float:-1.0074635E22)
            int r4 = X.C18200wM.A04(r3, r0)
            r0 = -1124040740(0xffffffffbd007fdc, float:-0.031371936)
            goto L_0x4609
        L_0x2997:
            r0 = 598173497(0x23a76739, float:1.8149893E-17)
            int r4 = X.C18200wM.A04(r3, r0)
            r0 = -846310271(0xffffffffcd8e5481, float:-2.9848784E8)
            goto L_0x4609
        L_0x29a3:
            r0 = 461169109(0x1b7ce1d5, float:2.0917922E-22)
            int r4 = X.C18200wM.A04(r3, r0)
            r0 = -1169251423(0xffffffffba4ea3a1, float:-7.882659E-4)
            goto L_0x4609
        L_0x29af:
            r0 = 1914892358(0x7222f046, float:3.2273308E30)
            int r4 = X.C18200wM.A04(r3, r0)
            r0 = 984000870(0x3aa6a966, float:0.001271528)
            goto L_0x4609
        L_0x29bb:
            r0 = -191460851(0xfffffffff4968a0d, float:-9.541559E31)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.0YY r0 = (X.AnonymousClass0YY) r0
            r0.invoke(r2)
            r0 = -1378566525(0xffffffffadd4be83, float:-2.4186214E-11)
            goto L_0x4609
        L_0x29ce:
            r0 = 1740398776(0x67bc60b8, float:1.7791781E24)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.0YY r0 = (X.AnonymousClass0YY) r0
            r0.invoke(r2)
            r0 = 1109308084(0x421eb2b4, float:39.674515)
            goto L_0x4609
        L_0x29e1:
            r0 = 1903965981(0x717c371d, float:1.2489096E30)
            int r4 = X.C18180wK.A02(r3, r0)
            r0 = -1660226893(0xffffffff9d0af2b3, float:-1.838962E-21)
            goto L_0x4609
        L_0x29ed:
            r0 = -528105623(0xffffffffe085bf69, float:-7.71003E19)
            int r4 = X.C18180wK.A02(r3, r0)
            r0 = -582763867(0xffffffffdd43baa5, float:-8.8148541E17)
            goto L_0x4609
        L_0x29f9:
            r0 = -1445594174(0xffffffffa9d5fbc2, float:-9.502773E-14)
            int r4 = X.C18180wK.A02(r3, r0)
            r0 = -47698582(0xfffffffffd282d6a, float:-1.3971632E37)
            goto L_0x4609
        L_0x2a05:
            r0 = 459984288(0x1b6acda0, float:1.9422467E-22)
            int r4 = X.C18180wK.A02(r3, r0)
            r0 = -1821415631(0xffffffff936f6731, float:-3.0216918E-27)
            goto L_0x4609
        L_0x2a11:
            r0 = -2026210582(0xffffffff873a7aea, float:-1.4029206E-34)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.9Pn r2 = (X.C156829Pn) r2
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            if (r1 == 0) goto L_0x2a2d
            boolean r0 = r2.A0C
            if (r0 == 0) goto L_0x2a44
            r0 = -1
            r1.setResult(r0)
            r1.finish()
        L_0x2a2d:
            X.0RG r0 = X.AnonymousClass0RA.A0C
            com.instagram.service.session.UserSession r0 = X.C18180wK.A0W(r2, r0)
            X.KHq r1 = X.AnonymousClass3LY.A00(r0)
            X.465 r0 = new X.465
            r0.<init>()
            r1.CWx(r0)
            r0 = 939244211(0x37fbbab3, float:3.000847E-5)
            goto L_0x4609
        L_0x2a44:
            r1.onBackPressed()
            goto L_0x2a2d
        L_0x2a48:
            r0 = 1667068758(0x635d7356, float:4.0850413E21)
            int r4 = X.C18180wK.A02(r3, r0)
            r0 = -1766108122(0xffffffff96bb5426, float:-3.0264585E-25)
            goto L_0x4609
        L_0x2a54:
            r0 = 1687441893(0x649451e5, float:2.1888154E22)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            r0.getClass()
            r0.onBackPressed()
            r0 = -660442189(0xffffffffd8a273b3, float:-1.42894246E15)
            goto L_0x4609
        L_0x2a6e:
            r0 = -630636766(0xffffffffda693f22, float:-1.64132712E16)
            int r4 = X.C18200wM.A04(r3, r0)
            r0 = 643718600(0x265e5dc8, float:7.714882E-16)
            goto L_0x4609
        L_0x2a7a:
            r0 = -1913320263(0xffffffff8df50cb9, float:-1.5102354E-30)
            int r4 = X.C18200wM.A04(r3, r0)
            r0 = 1157807685(0x4502be45, float:2091.8918)
            goto L_0x4609
        L_0x2a86:
            r0 = -1970963723(0xffffffff8a857af5, float:-1.2853685E-32)
            int r4 = X.C18200wM.A01(r0, r2)
            java.lang.Object r0 = r3.A00
            X.1Yy r0 = (X.C22661Yy) r0
            X.C22661Yy.A07(r0)
            r0 = 79961383(0x4c41d27, float:4.610615E-36)
            goto L_0x4609
        L_0x2a99:
            r0 = -146741123(0xfffffffff740e87d, float:-3.9126423E33)
            int r4 = X.C18200wM.A01(r0, r2)
            java.lang.Object r0 = r3.A00
            X.1Yy r0 = (X.C22661Yy) r0
            X.C22661Yy.A06(r0)
            r0 = -35944772(0xfffffffffddb86bc, float:-3.6475064E37)
            goto L_0x4609
        L_0x2aac:
            r0 = 1043765030(0x3e369726, float:0.17831096)
            int r4 = X.C18200wM.A01(r0, r2)
            java.lang.Object r0 = r3.A00
            X.1Yy r0 = (X.C22661Yy) r0
            X.C22661Yy.A07(r0)
            r0 = 463142292(0x1b9afd94, float:2.5641034E-22)
            goto L_0x4609
        L_0x2abf:
            r0 = 493787678(0x1d6e9a1e, float:3.1578714E-21)
            int r4 = X.C18200wM.A01(r0, r2)
            java.lang.Object r0 = r3.A00
            X.1Yy r0 = (X.C22661Yy) r0
            X.C22661Yy.A06(r0)
            r0 = -1195252833(0xffffffffb8c1e39f, float:-9.245355E-5)
            goto L_0x4609
        L_0x2ad2:
            r0 = 1502649059(0x59909ae3, float:5.087837E15)
            int r6 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.1YU r0 = (X.AnonymousClass1YU) r0
            X.C18180wK.A13(r0)
            X.36F r0 = r0.A01
            if (r0 == 0) goto L_0x2b02
            X.49h r5 = r0.A00
            r0 = 1
            r5.A05 = r0
            X.3Et r1 = r5.A00
            if (r1 == 0) goto L_0x2af1
            r0 = 0
            r1.A00(r0)
        L_0x2af1:
            com.instagram.service.session.UserSession r4 = r5.A08
            X.2A8 r3 = X.AnonymousClass2A8.A0H
            X.2A9 r2 = X.AnonymousClass2A9.A05
            X.29h r1 = X.C318729h.CAL_FLOW
            r0 = 0
            X.C62383Zj.A00(r1, r2, r3, r4, r0)
            X.29W r0 = X.AnonymousClass29W.DECLINE
            X.C696149h.A00(r0, r5)
        L_0x2b02:
            r0 = -618938465(0xffffffffdb1bbf9f, float:-4.3839311E16)
            X.C14030oh.A0C(r0, r6)
            return
        L_0x2b09:
            r0 = 896667649(0x35721001, float:9.0175314E-7)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.1v5 r2 = (X.AnonymousClass1v5) r2
            X.GVD r1 = X.C25745DrH.A00
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            X.C18200wM.A12(r0, r1)
            X.4s5 r0 = r2.A03
            if (r0 == 0) goto L_0x2b24
            r0.Bnw()
        L_0x2b24:
            X.29W r0 = X.AnonymousClass29W.DECLINE
            X.AnonymousClass1v5.A01(r0, r2)
            r0 = -1675714534(0xffffffff9c1ea01a, float:-5.248474E-22)
            goto L_0x4609
        L_0x2b2e:
            r0 = 172064825(0xa418039, float:9.316728E-33)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.1v5 r2 = (X.AnonymousClass1v5) r2
            X.GVD r1 = X.C25745DrH.A00
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            X.C18200wM.A12(r0, r1)
            X.4s5 r0 = r2.A03
            if (r0 == 0) goto L_0x2b49
            r0.Brc()
        L_0x2b49:
            X.29W r0 = X.AnonymousClass29W.ACCEPT
            X.AnonymousClass1v5.A01(r0, r2)
            r0 = 376100521(0x166ad6a9, float:1.8970104E-25)
            goto L_0x4609
        L_0x2b53:
            r0 = 787800081(0x2ef4e011, float:1.11356376E-10)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.1v6 r2 = (X.AnonymousClass1v6) r2
            X.GVD r1 = X.C25745DrH.A00
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            X.C18200wM.A12(r0, r1)
            X.4s5 r0 = r2.A03
            if (r0 == 0) goto L_0x2b6e
            r0.Bnw()
        L_0x2b6e:
            X.29W r0 = X.AnonymousClass29W.DECLINE
            X.AnonymousClass1v6.A00(r0, r2)
            r0 = -989943987(0xffffffffc4fea74d, float:-2037.2281)
            goto L_0x4609
        L_0x2b78:
            r0 = -490593217(0xffffffffe2c2243f, float:-1.7906401E21)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.1v6 r2 = (X.AnonymousClass1v6) r2
            X.GVD r1 = X.C25745DrH.A00
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            X.C18200wM.A12(r0, r1)
            X.4s5 r0 = r2.A03
            if (r0 == 0) goto L_0x2b93
            r0.Brc()
        L_0x2b93:
            X.29W r0 = X.AnonymousClass29W.ACCEPT
            X.AnonymousClass1v6.A00(r0, r2)
            r0 = 708941480(0x2a4196a8, float:1.7194113E-13)
            goto L_0x4609
        L_0x2b9d:
            r0 = 289824012(0x11465d0c, float:1.5648118E-28)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.1cQ r5 = (X.AnonymousClass1cQ) r5
            X.0Oa r0 = r5.A06
            X.0i6 r2 = X.AnonymousClass0wJ.A0U(r0)
            java.lang.String r1 = "find_friends_fb"
            r0 = 0
            X.AnonymousClass3XC.A00(r2, r0, r1)
            r3 = 2131827599(0x7f111b8f, float:1.9288115E38)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 18311661786178962(0x410e5c00032592, double:1.897553145034703E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)
            if (r0 == 0) goto L_0x2bc7
            r3 = 2131827495(0x7f111b27, float:1.9287904E38)
        L_0x2bc7:
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
            X.Dsm r2 = X.C18190wL.A0W(r0)
            r0 = 2131833803(0x7f1133cb, float:1.9300698E38)
            r2.A0K(r0)
            r0 = 166(0xa6, float:2.33E-43)
            X.C18180wK.A1O(r2, r5, r0, r3)
            r1 = 2131835995(0x7f113c5b, float:1.9305144E38)
            r0 = 167(0xa7, float:2.34E-43)
            X.C18180wK.A1N(r2, r5, r0, r1)
            X.AnonymousClass0wJ.A1K(r2)
            r0 = -974700959(0xffffffffc5e73e61, float:-7399.7974)
            goto L_0x4609
        L_0x2bea:
            r0 = -502216275(0xffffffffe210c9ad, float:-6.6771585E20)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r3.A00
            X.1x1 r6 = (X.AnonymousClass1x1) r6
            X.0Oa r0 = r6.A04
            X.0i6 r5 = X.AnonymousClass0wJ.A0U(r0)
            X.264 r0 = X.AnonymousClass1x1.A0B(r6)
            java.lang.String r3 = r0.A00()
            java.lang.String r2 = "facebook_cross_posting_settings_clicked"
            r1 = 0
            r0 = 1
            X.C35772Ot.A00(r5, r2, r3, r1, r0)
            r0 = 0
            X.AnonymousClass1x1.A0D(r6, r0)
            r0 = 1384228840(0x5281a7e8, float:2.7843389E11)
            goto L_0x4609
        L_0x2c13:
            r0 = 364332301(0x15b7450d, float:7.4022054E-26)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.1ir r0 = (X.C24471ir) r0
            com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment r3 = r0.A0D
            r0 = 13
            com.facebook.redex.IDxAListenerShape459S0100000_1_I2 r2 = new com.facebook.redex.IDxAListenerShape459S0100000_1_I2
            r2.<init>(r3, r0)
            X.3Ej r1 = X.C35762Os.A00()
            X.0Oa r0 = r3.A04
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.1q7 r2 = r1.A00(r3, r0, r2)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = "IG_INTEROP_REACHABILITY_SETTINGS"
            java.lang.String r0 = X.C18190wL.A0r(r1, r0)
            r2.A06(r0)
            r0 = 31292044(0x1dd7a8c, float:8.1358425E-38)
            goto L_0x4609
        L_0x2c45:
            r0 = 111838871(0x6aa8697, float:6.4144655E-35)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.1ir r0 = (X.C24471ir) r0
            com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment r0 = r0.A0D
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0Oa r0 = r0.A04
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.Drz r1 = X.C18180wK.A0Q(r1, r0)
            X.1we r0 = new X.1we
            r0.<init>()
            r1.A03 = r0
            r1.A05()
            r0 = 1920140304(0x72730410, float:4.8134252E30)
            goto L_0x4609
        L_0x2c6f:
            r0 = 194763756(0xb9bdbec, float:6.003473E-32)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.1ir r1 = (X.C24471ir) r1
            java.lang.String r0 = "group_message_setting"
            r1.A02(r0)
            r0 = -1338753576(0xffffffffb0343dd8, float:-6.5571504E-10)
            goto L_0x4609
        L_0x2c84:
            r0 = -1758147578(0xffffffff9734cc06, float:-5.841865E-25)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.1wO r0 = (X.AnonymousClass1wO) r0
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.0Oa r1 = r0.A01
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r1)
            X.Drz r3 = X.AnonymousClass0wJ.A0Q(r2, r0)
            X.C18190wL.A10()
            X.0i6 r2 = X.AnonymousClass0wJ.A0U(r1)
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            X.1Ze r1 = new X.1Ze
            r1.<init>()
            android.os.Bundle r0 = X.C18180wK.A06()
            X.C05050Qq.A00(r0, r2)
            X.C18180wK.A0x(r0, r1, r3)
            r0 = 1829170517(0x6d06ed55, float:2.6098693E27)
            goto L_0x4609
        L_0x2cbc:
            r0 = 1523438761(0x5acdd4a9, float:2.89680963E16)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.1wO r0 = (X.AnonymousClass1wO) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0Oa r3 = r0.A01
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r3)
            X.Drz r2 = X.AnonymousClass0wJ.A0Q(r1, r0)
            X.6om r0 = X.C111986om.A01
            X.6vI r1 = r0.A00()
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r3)
            androidx.fragment.app.Fragment r0 = r1.A02(r0)
            r2.A03 = r0
            r2.A05()
            r0 = -1698875981(0xffffffff9abd35b3, float:-7.8255324E-23)
            goto L_0x4609
        L_0x2ced:
            r0 = 200515814(0xbf3a0e6, float:9.384229E-32)
            int r4 = X.C14030oh.A05(r0)
            android.os.Bundle r5 = X.C18180wK.A06()
            java.lang.Object r2 = r3.A00
            X.1wN r2 = (X.AnonymousClass1wN) r2
            com.instagram.service.session.UserSession r0 = r2.A00
            java.lang.String r0 = r0.token
            X.C18190wL.A13(r5, r0)
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            com.instagram.service.session.UserSession r0 = r2.A00
            X.Drz r1 = X.C18180wK.A0Q(r1, r0)
            X.C18190wL.A10()
            X.1wK r0 = new X.1wK
            r0.<init>()
            r0.setArguments(r5)
            r1.A03 = r0
            r0 = 0
            r1.A0C(r2, r0)
            r1.A05()
            r0 = -1770669372(0xffffffff9675bac4, float:-1.9849875E-25)
            goto L_0x4609
        L_0x2d26:
            java.lang.Object r0 = r3.A00
            X.1uw r0 = (X.C28761uw) r0
            X.C28761uw.A01(r0)
            return
        L_0x2d2e:
            r0 = -1337302542(0xffffffffb04a61f2, float:-7.362636E-10)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.1bK r0 = (X.AnonymousClass1bK) r0
            r0.onBackPressed()
            r0 = -1957691613(0xffffffff8b4fff23, float:-4.0058693E-32)
            goto L_0x4609
        L_0x2d41:
            r0 = 968032877(0x39b3026d, float:3.4143348E-4)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.1uv r0 = (X.C28751uv) r0
            X.C28751uv.A00(r0)
            r0 = 684620026(0x28ce78fa, float:2.292306E-14)
            goto L_0x4609
        L_0x2d54:
            r0 = -1903688895(0xffffffff8e880341, float:-3.352972E-30)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.1uv r5 = (X.C28751uv) r5
            com.instagram.service.session.UserSession r0 = r5.A04
            X.H8c r3 = X.C63883iV.A0F(r0)
            android.content.Context r2 = r5.getContext()
            X.0m7 r1 = r5.mFragmentManager
            X.1sV r0 = new X.1sV
            r0.<init>(r2, r1)
            r3.A00 = r0
            r5.schedule(r3)
            r0 = 1464345764(0x574824a4, float:2.20059696E14)
            goto L_0x4609
        L_0x2d7a:
            r0 = 1069551444(0x3fc00f54, float:1.5004678)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.1bK r0 = (X.AnonymousClass1bK) r0
            r0.onBackPressed()
            r0 = 1685461866(0x64761b6a, float:1.8159498E22)
            goto L_0x4609
        L_0x2d8d:
            r0 = 922061595(0x36f58b1b, float:7.317763E-6)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.1bK r0 = (X.AnonymousClass1bK) r0
            r0.onBackPressed()
            r0 = 933705605(0x37a73785, float:1.9933805E-5)
            goto L_0x4609
        L_0x2da0:
            r0 = 1401988980(0x5390a774, float:1.24256938E12)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.1ur r0 = (X.C28711ur) r0
            X.C28711ur.A01(r0)
            r0 = 963216032(0x396982a0, float:2.2269273E-4)
            goto L_0x4609
        L_0x2db3:
            r0 = -1225467196(0xffffffffb6f4dac4, float:-7.2972343E-6)
            int r1 = X.C18190wL.A05(r3, r0)
            r0 = -850983299(0xffffffffcd47067d, float:-2.086932E8)
            goto L_0x4407
        L_0x2dbf:
            r0 = -1526675809(0xffffffffa500c69f, float:-1.1169526E-16)
            int r1 = X.C18190wL.A05(r3, r0)
            r0 = -815805637(0xffffffffcf5fcb3b, float:-3.75463808E9)
            goto L_0x4407
        L_0x2dcb:
            r0 = 94305318(0x59efc26, float:1.4950873E-35)
            int r4 = X.C14030oh.A05(r0)
            X.C18190wL.A10()
            java.lang.Object r5 = r3.A00
            X.1wi r5 = (X.C29091wi) r5
            java.lang.String r1 = r5.A01
            android.os.Bundle r0 = X.C18180wK.A06()
            X.C18210wN.A0x(r0, r1)
            X.1ur r3 = new X.1ur
            r3.<init>()
            androidx.fragment.app.FragmentActivity r2 = X.C18210wN.A0F(r0, r3, r5)
            X.0Oa r1 = r5.A02
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r1)
            X.Drz r0 = X.AnonymousClass0wJ.A0Q(r2, r0)
            r0.A03 = r3
            r0.A05()
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r1)
            X.0nS r1 = X.C13330nS.A01(r5, r0)
            java.lang.String r0 = "call_settings_specific_people_tapped"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 122(0x7a, float:1.71E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            r0.Bb4()
            r0 = 1214862707(0x48695573, float:238933.8)
            goto L_0x4609
        L_0x2e16:
            r0 = 499562655(0x1dc6b89f, float:5.2601057E-21)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3Hb r0 = (X.C58753Hb) r0
            com.instagram.base.activity.IgFragmentActivity r2 = r0.A03
            X.0m7 r1 = r0.A02
            com.instagram.service.session.UserSession r0 = r0.A05
            com.instagram.debug.devoptions.api.DeveloperOptionsLauncher.loadAndLaunchDeveloperOptions(r2, r1, r2, r0)
            r0 = 1616088083(0x60538c13, float:6.097432E19)
            goto L_0x4609
        L_0x2e2f:
            r0 = 1767826446(0x695ee40e, float:1.6841156E25)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3Hb r0 = (X.C58753Hb) r0
            com.instagram.service.session.UserSession r1 = r0.A05
            X.C62423Zt.A02(r1)
            com.instagram.base.activity.IgFragmentActivity r0 = r0.A03
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r0, r1)
            X.C18190wL.A10()
            X.1wI r0 = new X.1wI
            r0.<init>()
            r1.A03 = r0
            r1.A05()
            r0 = 1491882064(0x58ec5050, float:2.07863747E15)
            goto L_0x4609
        L_0x2e57:
            r0 = 388916182(0x172e63d6, float:5.6348443E-25)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r10 = r3.A00
            X.3Hb r10 = (X.C58753Hb) r10
            com.instagram.service.session.UserSession r9 = r10.A05
            X.0kW r2 = r10.A04
            java.lang.String r1 = "settings"
            java.lang.String r0 = "privacy_settings_entered"
            r8 = 0
            X.C62423Zt.A01(r2, r9, r1, r0, r8)
            X.C62423Zt.A02(r9)
            X.0Oa r3 = r10.A08
            java.lang.Object r1 = X.C18190wL.A0f(r3)
            X.09x r1 = (X.C021209x) r1
            java.lang.String r5 = r9.getUserId()
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            X.JlQ r14 = X.C103066Xr.A00
            X.Je6 r0 = r14.A02
            java.lang.String r0 = r0.A00
            java.lang.String r13 = "nav_chain"
            r2.put(r13, r0)
            java.lang.String r0 = "ig_wellbeing_tag_controls_settings_flow"
            X.0nS r1 = (X.C13330nS) r1
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1528(0x5f8, float:2.141E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            java.lang.Long r0 = X.AnonymousClass0wJ.A0d(r5)
            java.lang.String r11 = "actor_ig_userid"
            r1.A0S(r11, r0)
            java.lang.String r7 = "impression"
            java.lang.String r6 = "action"
            r1.A0T(r6, r7)
            java.lang.String r0 = "tag_settings_cell"
            java.lang.String r5 = "step"
            r1.A0T(r5, r0)
            r1.A1h(r2)
            r1.Bb4()
            java.lang.Object r1 = X.C18190wL.A0f(r3)
            X.09x r1 = (X.C021209x) r1
            java.lang.String r12 = r9.getUserId()
            java.lang.String r3 = "mention_settings_cell"
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            X.Je6 r0 = r14.A02
            java.lang.String r0 = r0.A00
            r2.put(r13, r0)
            java.lang.String r0 = "ig_wellbeing_mention_controls_settings_flow"
            X.0nS r1 = (X.C13330nS) r1
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1518(0x5ee, float:2.127E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r1.A0S(r11, r0)
            r1.A0T(r6, r7)
            r1.A0T(r5, r3)
            java.lang.String r0 = "allow_mentions_from"
            r1.A0T(r0, r8)
            r1.A1h(r2)
            r1.Bb4()
            com.instagram.base.activity.IgFragmentActivity r0 = r10.A03
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r0, r9)
            X.C18190wL.A10()
            X.1wV r0 = new X.1wV
            r0.<init>()
            r1.A03 = r0
            r1.A05()
            r0 = 1520087954(0x5a9ab392, float:2.1772293E16)
            goto L_0x4609
        L_0x2f0c:
            r0 = -1286949199(0xffffffffb34ab6b1, float:-4.7197947E-8)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3Hb r0 = (X.C58753Hb) r0
            com.instagram.service.session.UserSession r1 = r0.A05
            X.C62423Zt.A02(r1)
            com.instagram.base.activity.IgFragmentActivity r0 = r0.A03
            X.C33452Ft.A00(r0, r1)
            r0 = -605834286(0xffffffffdbe3b3d2, float:-1.28185068E17)
            goto L_0x4609
        L_0x2f26:
            r0 = -621500557(0xffffffffdaf4a773, float:-3.44320033E16)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.3Hb r5 = (X.C58753Hb) r5
            com.instagram.service.session.UserSession r3 = r5.A05
            X.0kW r2 = r5.A04
            java.lang.String r1 = "settings"
            java.lang.String r0 = "follow_and_invite_settings_entered"
            X.C62423Zt.A00(r2, r3, r1, r0)
            com.instagram.base.activity.IgFragmentActivity r0 = r5.A03
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r0, r3)
            X.C18190wL.A10()
            X.1wH r0 = new X.1wH
            r0.<init>()
            r1.A03 = r0
            r1.A05()
            r0 = -549733787(0xffffffffdf3bba65, float:-1.3527235E19)
            goto L_0x4609
        L_0x2f54:
            r0 = 1950969357(0x74496e0d, float:6.383568E31)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.3Hb r5 = (X.C58753Hb) r5
            com.instagram.service.session.UserSession r3 = r5.A05
            X.0kW r2 = r5.A04
            java.lang.String r1 = "settings"
            java.lang.String r0 = "suggested_content_settings_entered"
            X.C62423Zt.A00(r2, r3, r1, r0)
            com.instagram.base.activity.IgFragmentActivity r2 = r5.A03
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            r0 = 0
            X.AnonymousClass3MY.A01(r2, r3, r1, r0)
            r0 = -2037674672(0xffffffff868b8d50, float:-5.249363E-35)
            goto L_0x4609
        L_0x2f77:
            r0 = -787215699(0xffffffffd1140aad, float:-3.9739642E10)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3Hb r0 = (X.C58753Hb) r0
            com.instagram.base.activity.IgFragmentActivity r1 = r0.A03
            com.instagram.service.session.UserSession r0 = r0.A05
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r1, r0)
            X.C18190wL.A10()
            X.1wL r0 = new X.1wL
            r0.<init>()
            r1.A03 = r0
            r1.A05()
            r0 = 1726758231(0x66ec3d57, float:5.57805E23)
            goto L_0x4609
        L_0x2f9c:
            r0 = 1436343069(0x559cdb1d, float:2.15581123E13)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r3.A00
            X.3Hb r6 = (X.C58753Hb) r6
            com.instagram.service.session.UserSession r5 = r6.A05
            X.C62423Zt.A02(r5)
            android.content.Context r0 = r6.A01
            X.3Yd r0 = X.C62293Yd.A00(r0)
            boolean r0 = r0.A01()
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_managed"
            r2.put(r0, r1)
            java.lang.String r0 = "com.instagram.settings.about"
            X.3iE r3 = X.C63743iE.A02(r0, r2)
            com.instagram.base.activity.IgFragmentActivity r2 = r6.A03
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r5)
            r0 = 2131820787(0x7f1100f3, float:1.9274299E38)
            X.C63743iE.A09(r2, r1, r3, r0)
            r0 = -2111494467(0xffffffff822526bd, float:-1.2133403E-37)
            goto L_0x4609
        L_0x2fda:
            r0 = -175809250(0xfffffffff5855d1e, float:-3.3811725E32)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.3DA r3 = (X.AnonymousClass3DA) r3
            com.instagram.service.session.UserSession r4 = r3.A04
            X.0kW r1 = r3.A02
            java.lang.String r0 = "options_logout_tapped"
            X.0rn r0 = X.C15730rn.A00(r1, r0)
            X.C18180wK.A1K(r0, r4)
            X.0Oa r3 = r3.A06
            java.lang.Object r0 = r3.getValue()
            X.3iC r0 = (X.C63723iC) r0
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x301c
            r9 = 0
            java.util.UUID r0 = X.C03480Iw.A00()
            java.lang.String r1 = X.C18190wL.A0n(r0)
            X.0et r0 = X.C18190wL.A0X()
            r0.A0F(r1)
            java.lang.String r5 = "logout_button_clicked"
            java.lang.String r6 = "login_logout"
            java.lang.String r7 = "logout"
            java.lang.String r8 = "home_page"
            r10 = r9
            X.AnonymousClass3LL.A00(r4, r5, r6, r7, r8, r9, r10)
        L_0x301c:
            java.lang.Object r1 = r3.getValue()
            X.3iC r1 = (X.C63723iC) r1
            java.lang.Integer r0 = X.AnonymousClass006.A00
            r1.A0C(r0)
            r0 = 1409820300(0x5408268c, float:2.33904905E12)
            goto L_0x45aa
        L_0x302c:
            r0 = 61255340(0x3a6aeac, float:9.796706E-37)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.3DA r3 = (X.AnonymousClass3DA) r3
            com.instagram.service.session.UserSession r2 = r3.A04
            X.0kW r1 = r3.A02
            java.lang.String r0 = "options_logout_account_family_tapped"
            X.0rn r0 = X.C15730rn.A00(r1, r0)
            X.C18180wK.A1K(r0, r2)
            X.0Oa r0 = r3.A06
            java.lang.Object r1 = r0.getValue()
            X.3iC r1 = (X.C63723iC) r1
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r1.A0C(r0)
            r0 = -113921450(0xfffffffff935b256, float:-5.8963926E34)
            goto L_0x4609
        L_0x3056:
            r0 = -1034830784(0xffffffffc251bc40, float:-52.433838)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.3DA r3 = (X.AnonymousClass3DA) r3
            com.instagram.service.session.UserSession r2 = r3.A04
            X.0kW r1 = r3.A02
            java.lang.String r0 = "options_logout_account_family_tapped"
            X.0rn r0 = X.C15730rn.A00(r1, r0)
            X.C18180wK.A1K(r0, r2)
            X.0Oa r0 = r3.A06
            java.lang.Object r1 = r0.getValue()
            X.3iC r1 = (X.C63723iC) r1
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r1.A0C(r0)
            r0 = 1715692134(0x66436266, float:2.3066915E23)
            goto L_0x4609
        L_0x3080:
            r0 = -752603058(0xffffffffd324304e, float:-7.0518505E11)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3DA r0 = (X.AnonymousClass3DA) r0
            com.instagram.service.session.UserSession r0 = r0.A04
            X.AnonymousClass49X.A02(r0)
            r0 = -2001476677(0xffffffff88b3e3bb, float:-1.082671E-33)
            goto L_0x4609
        L_0x3095:
            r0 = -1253446272(0xffffffffb549ed80, float:-7.5223943E-7)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3DA r0 = (X.AnonymousClass3DA) r0
            com.instagram.service.session.UserSession r5 = r0.A04
            androidx.fragment.app.FragmentActivity r3 = r0.A00
            X.22H r2 = X.AnonymousClass22H.MAIN_ACCOUNT
            X.0kW r1 = r0.A02
            r0 = 0
            X.C49102qq.A00(r3, r2, r1, r5, r0)
            r0 = -1693649476(0xffffffff9b0cf5bc, float:-1.165993E-22)
            goto L_0x4609
        L_0x30b1:
            r0 = 786882690(0x2ee6e082, float:1.049907E-10)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3DA r0 = (X.AnonymousClass3DA) r0
            com.instagram.service.session.UserSession r5 = r0.A04
            androidx.fragment.app.FragmentActivity r3 = r0.A00
            X.22H r2 = X.AnonymousClass22H.CHILD_ACCOUNT
            X.0kW r1 = r0.A02
            r0 = 0
            X.C49102qq.A00(r3, r2, r1, r5, r0)
            r0 = 1779945480(0x6a17d008, float:4.588255E25)
            goto L_0x4609
        L_0x30cd:
            r0 = 1916969557(0x7242a255, float:3.8551257E30)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.3HD r2 = (X.AnonymousClass3HD) r2
            com.instagram.service.session.UserSession r5 = r2.A01
            java.lang.String r1 = "security"
            java.lang.String r0 = "emails_sent_list_entered"
            X.C62423Zt.A03(r5, r1, r0)
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "com.instagram.account_security.screens.email_sent_list"
            X.3iE r3 = X.C63743iE.A02(r0, r1)
            androidx.fragment.app.FragmentActivity r2 = r2.A00
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r5)
            r0 = 0
            r1.A0i = r0
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r1.A0O = r0
            r0 = 2131826739(0x7f111833, float:1.928637E38)
            X.C63743iE.A08(r2, r1, r3, r0)
            r0 = -591119107(0xffffffffdcc43cfd, float:-4.41889222E17)
            goto L_0x4609
        L_0x3103:
            r0 = 95013899(0x5a9cc0b, float:1.5967637E-35)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3HD r0 = (X.AnonymousClass3HD) r0
            com.instagram.service.session.UserSession r1 = r0.A01
            X.C62423Zt.A02(r1)
            androidx.fragment.app.FragmentActivity r0 = r0.A00
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r0, r1)
            X.C63463hW.A03()
            X.1xX r0 = new X.1xX
            r0.<init>()
            r1.A03 = r0
            r1.A05()
            r0 = -1869277545(0xffffffff90951697, float:-5.880494E-29)
            goto L_0x4609
        L_0x312b:
            r0 = -2054557478(0xffffffff8589f0da, float:-1.2971893E-35)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r7 = r3.A00
            X.3HD r7 = (X.AnonymousClass3HD) r7
            com.instagram.service.session.UserSession r6 = r7.A01
            java.lang.String r1 = "security"
            java.lang.String r0 = "password_setting_entered"
            r5 = 0
            X.C62423Zt.A03(r6, r1, r0)
            X.C62423Zt.A02(r6)
            X.3F8 r0 = new X.3F8
            r0.<init>(r6)
            java.lang.String r3 = "password_change"
            r2 = 857808781(0x33211f8d, float:3.751443E-8)
            X.01V r1 = r0.A00
            r1.markerStart(r2)
            java.lang.String r0 = "node_identifier"
            r1.markerAnnotate((int) r2, (java.lang.String) r0, (java.lang.String) r3)
            androidx.fragment.app.FragmentActivity r0 = r7.A00
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r0, r6)
            X.3Vf r0 = X.C63463hW.A01()
            androidx.fragment.app.Fragment r0 = r0.A04(r6, r5)
            r1.A03 = r0
            r1.A05()
            r0 = -732623120(0xffffffffd4550ef0, float:-3.66031457E12)
            goto L_0x4609
        L_0x316f:
            r0 = -533851693(0xffffffffe02e11d3, float:-5.0172154E19)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.3HD r1 = (X.AnonymousClass3HD) r1
            com.instagram.service.session.UserSession r0 = r1.A01
            X.H8c r3 = X.C63883iV.A0F(r0)
            androidx.fragment.app.FragmentActivity r2 = r1.A00
            X.1dm r0 = r1.A02
            X.0m7 r1 = r0.mFragmentManager
            X.1sV r0 = new X.1sV
            r0.<init>(r2, r1)
            r3.A00 = r0
            X.C31155GhB.A03(r3)
            r0 = -122957813(0xfffffffff8abd00b, float:-2.78782E34)
            goto L_0x4609
        L_0x3195:
            r0 = 1881740870(0x70291646, float:2.0931957E29)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.3HD r2 = (X.AnonymousClass3HD) r2
            com.instagram.service.session.UserSession r1 = r2.A01
            X.C62423Zt.A02(r1)
            androidx.fragment.app.FragmentActivity r0 = r2.A00
            X.Drz r3 = X.C63463hW.A00(r0, r1)
            X.1dm r2 = r2.A02
            android.os.Bundle r0 = X.AnonymousClass0wJ.A0E(r1)
            X.1av r1 = new X.1av
            r1.<init>()
            r1.setArguments(r0)
            r0 = 0
            r1.setTargetFragment(r2, r0)
            r3.A03 = r1
            r3.A05()
            r0 = -576617186(0xffffffffdda1851e, float:-1.45484272E18)
            goto L_0x4609
        L_0x31c7:
            r0 = 1311857626(0x4e315bda, float:7.438967E8)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3HD r0 = (X.AnonymousClass3HD) r0
            X.1dm r3 = r0.A02
            com.instagram.service.session.UserSession r2 = r0.A01
            java.lang.String r1 = "ig_change_password_phase_1"
            java.lang.String r0 = "password_change"
            X.C63013bK.A01(r3, r2, r1, r0)
            r0 = 98598553(0x5e07e99, float:2.1111363E-35)
            goto L_0x4609
        L_0x31e2:
            r0 = 320605810(0x131c0e72, float:1.969709E-27)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r3.A00
            X.3HD r2 = (X.AnonymousClass3HD) r2
            com.instagram.service.session.UserSession r5 = r2.A01
            java.lang.String r1 = "security"
            java.lang.String r0 = "app_and_websites_entered"
            X.C62423Zt.A03(r5, r1, r0)
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "com.instagram.platformapi.platform_authorized_applications.list"
            X.3iE r3 = X.C63743iE.A02(r0, r1)
            androidx.fragment.app.FragmentActivity r2 = r2.A00
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r5)
            r0 = 2131821453(0x7f11038d, float:1.927565E38)
            X.C63743iE.A09(r2, r1, r3, r0)
            r0 = -69850975(0xfffffffffbd628a1, float:-2.2239512E36)
            goto L_0x4609
        L_0x3211:
            java.lang.Object r1 = r3.A00
            X.3HD r1 = (X.AnonymousClass3HD) r1
            com.instagram.service.session.UserSession r3 = r1.A01
            X.24F r0 = X.AnonymousClass24F.PROACTIVE
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.H8c r2 = X.C54472zV.A00(r3, r0)
            androidx.fragment.app.FragmentActivity r1 = r1.A00
            X.0m7 r0 = r1.getSupportFragmentManager()
            com.instagram.base.activity.IgFragmentActivity r1 = (com.instagram.base.activity.IgFragmentActivity) r1
            X.C28591uf.A00(r0, r1, r2, r3)
            return
        L_0x322f:
            r0 = 414613913(0x18b68199, float:4.7176758E-24)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.3ak r5 = (X.C62793ak) r5
            X.4qz r3 = X.AnonymousClass3J5.A00(r5)
            r2 = 0
            r0 = 16
            kotlin.coroutines.jvm.internal.KtSLambdaShape14S0101000_I2_11 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0101000_I2_11
            r1.<init>(r5, r2, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
            r0 = -1099294225(0xffffffffbe7a19ef, float:-0.24423955)
            goto L_0x4609
        L_0x324f:
            r0 = -37994888(0xfffffffffdbc3e78, float:-3.1277402E37)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.104 r5 = (X.AnonymousClass104) r5
            X.1oS r1 = r5.A00
            java.lang.String r0 = "SETTINGS_PAGE_ENTRYPOINT_CLICK"
            r1.A02(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A00
            r1.A01(r0)
            X.4qz r3 = X.AnonymousClass3J5.A00(r5)
            r2 = 0
            r0 = 15
            kotlin.coroutines.jvm.internal.KtSLambdaShape14S0101000_I2_11 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape14S0101000_I2_11
            r1.<init>(r5, r2, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
            r0 = 179305333(0xaaffb75, float:1.6946475E-32)
            goto L_0x4609
        L_0x327b:
            r0 = 552213688(0x20ea1cb8, float:3.9660146E-19)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.1Yp r5 = (X.C22571Yp) r5
            X.0Oa r3 = r5.A08
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r3)
            X.Dnj r2 = X.AnonymousClass6VR.A00(r0)
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "USER_ID_ARGUMENT"
            java.lang.String r0 = r1.getString(r0)
            com.instagram.user.model.User r0 = r2.A03(r0)
            if (r0 == 0) goto L_0x32ab
            r5.requireActivity()
            r3.getValue()
            X.C18240wQ.A0o()
            r0 = 0
            throw r0
        L_0x32ab:
            com.instagram.user.model.User r0 = r5.A01
            if (r0 == 0) goto L_0x32b8
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "send_confetti"
            X.C22571Yp.A00(r5, r1, r0)
        L_0x32b8:
            r0 = -1551253702(0xffffffffa389bf3a, float:-1.4934557E-17)
            goto L_0x4609
        L_0x32bd:
            r0 = 2109247899(0x7db8919b, float:3.0666747E37)
            int r5 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r3.A00
            X.1Yp r6 = (X.C22571Yp) r6
            X.0Oa r0 = r6.A08
            X.0i6 r4 = X.AnonymousClass0wJ.A0U(r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            r0 = 2131822312(0x7f1106e8, float:1.9277392E38)
            java.lang.String r1 = r6.getString(r0)
            java.lang.String r0 = "BIRTHDAY_NOTIFICATION_TITLE_ARGUMENT"
            android.os.Bundle r2 = X.C18180wK.A09(r0, r1)
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            java.lang.String r0 = "birthday_notification"
            X.3iT r0 = X.C63863iT.A04(r1, r2, r4, r3, r0)
            X.C63863iT.A0D(r6, r0)
            com.instagram.user.model.User r0 = r6.A01
            if (r0 == 0) goto L_0x32f7
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "notif_setting"
            X.C22571Yp.A00(r6, r1, r0)
        L_0x32f7:
            r0 = 1661412895(0x6307261f, float:2.4930574E21)
            goto L_0x3fc1
        L_0x32fc:
            r0 = 160457454(0x99062ee, float:3.4759772E-33)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.1x6 r1 = (X.AnonymousClass1x6) r1
            java.lang.String r0 = r1.A01
            X.AnonymousClass1x6.A0D(r1, r0)
            X.C18180wK.A12(r1)
            r0 = 1360481457(0x51174cb1, float:4.0614171E10)
            goto L_0x45aa
        L_0x3314:
            r0 = -1214257175(0xffffffffb79fe7e9, float:-1.9062269E-5)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.C18190wL.A1A(r0)
            r0 = -1627496130(0xffffffff9efe613e, float:-2.6933515E-20)
            goto L_0x45aa
        L_0x3327:
            r0 = 1963857869(0x750e17cd, float:1.8012424E32)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            androidx.fragment.app.FragmentActivity r0 = X.C18240wQ.A0I(r0)
            X.00F r0 = r0.mOnBackPressedDispatcher
            r0.A02()
            r0 = -975386000(0xffffffffc5dcca70, float:-7065.3047)
            goto L_0x45aa
        L_0x333e:
            r0 = -162137713(0xfffffffff655f98f, float:-1.0849813E33)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            androidx.fragment.app.FragmentActivity r0 = X.C18240wQ.A0I(r0)
            X.00F r0 = r0.mOnBackPressedDispatcher
            r0.A02()
            r0 = 768841750(0x2dd39816, float:2.4055462E-11)
            goto L_0x45aa
        L_0x3355:
            r0 = -771162969(0xffffffffd208fca7, float:-1.47088589E11)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.1Yx r1 = (X.C22651Yx) r1
            r0 = 1
            X.C22651Yx.A06(r1, r0)
            r0 = 1936681408(0x736f69c0, float:1.8968259E31)
            goto L_0x45aa
        L_0x3369:
            r0 = -1287772389(0xffffffffb33e271b, float:-4.427339E-8)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            androidx.fragment.app.FragmentActivity r0 = X.C18240wQ.A0I(r0)
            X.00F r0 = r0.mOnBackPressedDispatcher
            r0.A02()
            r0 = -1069877403(0xffffffffc03af765, float:-2.9213498)
            goto L_0x45aa
        L_0x3380:
            r0 = -98048564(0xfffffffffa27e5cc, float:-2.179436E35)
            int r1 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.111 r0 = (X.AnonymousClass111) r0
            X.1Yx r3 = r0.A00
            X.433 r2 = r3.A03
            r8 = 0
            if (r2 != 0) goto L_0x3398
            java.lang.String r0 = "closeFriendsController"
        L_0x3394:
            X.C04220Ms.A0E(r0)
            throw r8
        L_0x3398:
            X.24t r4 = X.C312224t.BIRTHDAY_EFFECTS_SETTINGS
            r5 = 2002(0x7d2, float:2.805E-42)
            r6 = 0
            r7 = r6
            r2.A00(r3, r4, r5, r6, r7)
            X.3Eb r5 = r3.A09
            if (r5 != 0) goto L_0x33a8
            java.lang.String r0 = "birthdayLogger"
            goto L_0x3394
        L_0x33a8:
            X.0Oa r2 = r3.A0N
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r2)
            long r9 = X.C18200wM.A0B(r0)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r2)
            long r11 = X.C18200wM.A0B(r0)
            java.lang.String r6 = "qp"
            java.lang.String r7 = "close_friend_list"
            r5.A00(r6, r7, r8, r9, r11)
            r0 = -1763822691(0xffffffff96de339d, float:-3.5898607E-25)
            goto L_0x4407
        L_0x33c6:
            r0 = -52202799(0xfffffffffce372d1, float:-9.447841E36)
            int r2 = X.C18180wK.A02(r3, r0)
            r0 = 444138843(0x1a79055b, float:5.149632E-23)
            goto L_0x45aa
        L_0x33d2:
            r0 = -218153113(0xfffffffff2ff3f67, float:-1.0111402E31)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.1cP r4 = (X.AnonymousClass1cP) r4
            boolean r0 = r4 instanceof X.C28731ut
            if (r0 == 0) goto L_0x33f9
            X.1ut r4 = (X.C28731ut) r4
            X.4Ky r6 = new X.4Ky
            r6.<init>(r4)
            com.instagram.service.session.UserSession r5 = r4.A03
            java.lang.Integer r7 = X.AnonymousClass006.A0C
            java.lang.Integer r8 = X.AnonymousClass006.A01
            r9 = 0
            X.3zH r3 = new X.3zH
            r10 = r9
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0 = 0
            r3.A06(r0)
        L_0x33f9:
            r0 = 19171972(0x1248a84, float:3.0221423E-38)
            goto L_0x45aa
        L_0x33fe:
            r0 = 2086153112(0x7c582b98, float:4.4896812E36)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.4Jz r4 = (X.C71734Jz) r4
            r3 = 0
            r4.A01 = r3
            android.view.View r1 = r4.A02
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.igds.components.search.InlineSearchBox r1 = r4.A03
            java.lang.String r0 = ""
            r1.A07(r0, r3)
            r1.A02()
            X.1fV r0 = r4.A05
            r0.A01()
            r0 = -552379688(0xffffffffdf135ad8, float:-1.0618037E19)
            goto L_0x45aa
        L_0x3427:
            r0 = -1497266259(0xffffffffa6c187ad, float:-1.342884E-15)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.1xq r5 = (X.C29361xq) r5
            android.content.Context r1 = r5.A04
            r0 = 2131836814(0x7f113f8e, float:1.9306805E38)
            java.lang.String r4 = r1.getString(r0)
            X.3F6 r0 = r5.A00
            X.3Y7 r0 = r0.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.4KZ r0 = new X.4KZ
            r0.<init>(r3)
            X.C29361xq.A01(r0, r5, r4, r1)
            r0 = 341576024(0x145c0958, float:1.1109004E-26)
            goto L_0x45aa
        L_0x3450:
            r0 = -1230459795(0xffffffffb6a8ac6d, float:-5.026863E-6)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.1xq r5 = (X.C29361xq) r5
            android.content.Context r1 = r5.A04
            r0 = 2131836813(0x7f113f8d, float:1.9306803E38)
            java.lang.String r4 = r1.getString(r0)
            X.3F6 r0 = r5.A00
            X.3Y7 r0 = r0.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.4KY r0 = new X.4KY
            r0.<init>(r3)
            X.C29361xq.A01(r0, r5, r4, r1)
            r0 = 993763420(0x3b3ba05c, float:0.0028629517)
            goto L_0x45aa
        L_0x3479:
            r0 = 1857585290(0x6eb8808a, float:2.8550318E28)
            int r2 = X.C14030oh.A05(r0)
            java.lang.String r1 = "com.instagram.shopping.screens.shop_linking_seller"
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()
            X.3iE r5 = X.C63743iE.A02(r1, r0)
            java.lang.Object r4 = r3.A00
            X.3T7 r4 = (X.AnonymousClass3T7) r4
            com.instagram.service.session.UserSession r1 = r4.A02
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = X.C18190wL.A0N(r1)
            X.1c8 r3 = X.C62853b1.A02(r0, r5)
            androidx.fragment.app.FragmentActivity r0 = r4.A01
            X.Drz r1 = X.C18180wK.A0Q(r0, r1)
            r1.A03 = r3
            java.lang.String r0 = "shopping_business_settings"
            r1.A07 = r0
            r1.A05()
            r0 = 322433837(0x1337f32d, float:2.3217742E-27)
            goto L_0x45aa
        L_0x34ac:
            r0 = 673722374(0x28283006, float:9.336287E-15)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3T7 r0 = (X.AnonymousClass3T7) r0
            com.instagram.service.session.UserSession r8 = r0.A02
            java.lang.String r7 = "shopping_business_settings"
            androidx.fragment.app.FragmentActivity r1 = r0.A01
            java.lang.String r6 = "PRODUCT_TAG_OPTIONS"
            X.C25274Div.A00()
            java.lang.String r5 = X.C18180wK.A0e()
            X.C04220Ms.A06(r5)
            X.Drz r4 = X.AnonymousClass0wJ.A0Q(r1, r8)
            X.Axa r0 = X.C19513Axa.A00
            r0.A0P()
            r0 = 2131835879(0x7f113be7, float:1.930491E38)
            java.lang.String r3 = X.AnonymousClass0wJ.A0k(r1, r0)
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            X.C18210wN.A1N(r6, r5, r7, r1)
            java.lang.String r0 = "com.instagram.shopping.screens.product_tags_options"
            X.C62853b1.A04(r4, r8, r0, r3, r1)
            r0 = -1981423380(0xffffffff89e5e0ec, float:-5.534126E-33)
            goto L_0x45aa
        L_0x34ea:
            r0 = 1195574780(0x474305fc, float:49925.984)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.3T7 r4 = (X.AnonymousClass3T7) r4
            X.3Ea r3 = r4.A04
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            r0 = 0
            r3.A00(r1, r0)
            com.instagram.service.session.UserSession r1 = r4.A02
            X.C62423Zt.A02(r1)
            androidx.fragment.app.FragmentActivity r0 = r4.A01
            X.Drz r5 = X.C18180wK.A0Q(r0, r1)
            X.Axa r0 = X.C19513Axa.A00
            r0.A0P()
            java.lang.String r4 = "shopping_business_settings"
            X.9Oj r3 = new X.9Oj
            r3.<init>()
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "prior_module_name"
            r1.putString(r0, r4)
            X.C18180wK.A0x(r1, r3, r5)
            r0 = 938250175(0x37ec8fbf, float:2.820033E-5)
            goto L_0x45aa
        L_0x3525:
            r0 = 865565080(0x33977998, float:7.053603E-8)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3T7 r0 = (X.AnonymousClass3T7) r0
            com.instagram.service.session.UserSession r4 = r0.A02
            java.lang.String r3 = "shopping_business_settings"
            androidx.fragment.app.FragmentActivity r1 = r0.A01
            java.lang.String r0 = "CHECKOUT_UPSELL_SHOPPING_SETTINGS"
            X.AnonymousClass3ib.A0H(r1, r4, r0, r3)
            r0 = -12795071(0xffffffffff3cc341, float:-2.5090868E38)
            goto L_0x45aa
        L_0x3540:
            r0 = 224020959(0xd5a49df, float:6.7265356E-31)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3T7 r0 = (X.AnonymousClass3T7) r0
            com.instagram.service.session.UserSession r5 = r0.A02
            java.lang.String r4 = "shopping_business_settings"
            androidx.fragment.app.FragmentActivity r3 = r0.A01
            java.lang.String r1 = "CHECKOUT_DEFERRED_PAYOUT_SHOPPING_SETTINGS"
            r0 = 1
            X.AnonymousClass3ib.A0M(r3, r5, r1, r4, r0)
            r0 = 1153442601(0x44c02329, float:1537.0988)
            goto L_0x45aa
        L_0x355c:
            r0 = -2147408922(0xffffffff800123e6, float:-1.04713E-40)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3T7 r0 = (X.AnonymousClass3T7) r0
            com.instagram.service.session.UserSession r5 = r0.A02
            java.lang.String r4 = "shopping_business_settings"
            androidx.fragment.app.FragmentActivity r3 = r0.A01
            java.lang.String r1 = "CHECKOUT_SETUP_SHOPPING_SETTINGS"
            r0 = 0
            X.AnonymousClass3ib.A0M(r3, r5, r1, r4, r0)
            r0 = 2020353008(0x786c23f0, float:1.9157984E34)
            goto L_0x45aa
        L_0x3578:
            r0 = 547884709(0x20a80ea5, float:2.8469998E-19)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3T7 r0 = (X.AnonymousClass3T7) r0
            com.instagram.service.session.UserSession r8 = r0.A02
            java.lang.String r7 = "shopping_business_settings"
            androidx.fragment.app.FragmentActivity r1 = r0.A01
            java.lang.String r6 = "DOMAIN_CHANGE_SHOPPING_SETTINGS"
            X.C25274Div.A00()
            java.lang.String r5 = X.C18180wK.A0e()
            X.C04220Ms.A06(r5)
            X.Drz r4 = X.AnonymousClass0wJ.A0Q(r1, r8)
            X.Axa r0 = X.C19513Axa.A00
            r0.A0P()
            r0 = 2131835882(0x7f113bea, float:1.9304915E38)
            java.lang.String r3 = X.AnonymousClass0wJ.A0k(r1, r0)
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            X.C18210wN.A1N(r6, r5, r7, r1)
            java.lang.String r0 = "com.instagram.shopping.screens.domain_change"
            X.C62853b1.A04(r4, r8, r0, r3, r1)
            r0 = -843096159(0xffffffffcdbf5fa1, float:-4.01339424E8)
            goto L_0x45aa
        L_0x35b6:
            r0 = -257976004(0xfffffffff09f993c, float:-3.9514692E29)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.3T7 r5 = (X.AnonymousClass3T7) r5
            X.3Ea r3 = r5.A04
            java.lang.Integer r1 = X.AnonymousClass006.A00
            r0 = 0
            r3.A00(r1, r0)
            com.instagram.service.session.UserSession r4 = r5.A02
            X.C62423Zt.A02(r4)
            java.lang.String r3 = "shopping_business_settings"
            androidx.fragment.app.FragmentActivity r1 = r5.A01
            java.lang.String r0 = "POLICY_MIGRATION_SHOPPING_SETTINGS"
            X.AnonymousClass3ib.A0I(r1, r4, r0, r3)
            r0 = 1006893167(0x3c03f86f, float:0.008054837)
            goto L_0x45aa
        L_0x35dc:
            java.lang.Object r0 = r3.A00
            X.3T7 r0 = (X.AnonymousClass3T7) r0
            com.instagram.service.session.UserSession r7 = r0.A02
            java.lang.String r8 = "shopping_business_settings"
            androidx.fragment.app.FragmentActivity r2 = r0.A01
            java.lang.String r6 = "SHOP_INVENTORY_SHOPPING_SETTINGS"
            X.C25274Div.A00()
            java.lang.String r1 = X.C18180wK.A0e()
            X.C04220Ms.A06(r1)
            java.lang.String r5 = "1"
            X.Drz r4 = X.AnonymousClass0wJ.A0Q(r2, r7)
            X.Axa r0 = X.C19513Axa.A00
            r0.A0P()
            r0 = 2131835873(0x7f113be1, float:1.9304897E38)
            java.lang.String r3 = X.AnonymousClass0wJ.A0k(r2, r0)
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "prior_module"
            r2.put(r0, r8)
            java.lang.String r0 = "entry_point"
            r2.put(r0, r6)
            X.C25274Div.A00()
            java.lang.String r0 = "waterfall_id"
            r2.put(r0, r1)
            java.lang.String r1 = "default"
            java.lang.String r0 = "presentation_style"
            r2.put(r0, r1)
            java.lang.String r0 = "com.bloks.www.bloks.commerce.shop.inventory.settings"
            X.3iE r1 = X.C63743iE.A02(r0, r2)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = X.C18190wL.A0N(r7)
            r0.A0S = r3
            X.1c8 r0 = X.C62853b1.A02(r0, r1)
            r4.A03 = r0
            r4.A07 = r5
            r4.A05()
            return
        L_0x3639:
            java.lang.Object r3 = r3.A00
            X.3T7 r3 = (X.AnonymousClass3T7) r3
            X.3Ea r2 = r3.A04
            java.lang.Integer r1 = X.AnonymousClass006.A0N
            r0 = 0
            r2.A00(r1, r0)
            X.Axa r4 = X.C19513Axa.A00
            androidx.fragment.app.FragmentActivity r1 = r3.A01
            com.instagram.service.session.UserSession r0 = r3.A02
            java.lang.String r3 = "shopping_business_settings"
            X.9oK r4 = (X.C166839oK) r4
            X.Drz r2 = X.C18180wK.A0Q(r1, r0)
            X.9oJ r0 = r4.A00
            r0.A0P()
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "prior_module"
            r1.putString(r0, r3)
            X.9ON r0 = new X.9ON
            r0.<init>()
            X.C18180wK.A0x(r1, r0, r2)
            return
        L_0x366a:
            r0 = 1117288170(0x429876ea, float:76.232254)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            android.content.Context r0 = X.C18240wQ.A0C(r0)
            X.C63853iS.A0B(r0)
            r0 = 1122409233(0x42e69b11, float:115.302864)
            goto L_0x45aa
        L_0x367f:
            r0 = 1598801671(0x5f4bc707, float:1.4683713E19)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r7 = r3.A00
            X.3aX r7 = (X.C62693aX) r7
            com.instagram.service.session.UserSession r6 = r7.A05
            java.lang.String r1 = "privacy"
            java.lang.String r0 = "reels_remix_entered"
            X.C62423Zt.A03(r6, r1, r0)
            X.C62693aX.A01(r7)
            java.util.HashMap r3 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "from_privacy_settings_entrypoint"
            java.lang.String r0 = "true"
            r3.put(r1, r0)
            java.lang.String r0 = "com.instagram.privacy.setting_defaults.reels_remix_settings"
            X.3iE r5 = X.C63743iE.A02(r0, r3)
            androidx.fragment.app.FragmentActivity r4 = r7.A03
            com.instagram.bloks.hosting.IgBloksScreenConfig r3 = X.C18190wL.A0N(r6)
            X.CTd r1 = r7.A04
            r0 = 2131823368(0x7f110b08, float:1.9279534E38)
            X.C18230wP.A1A(r1, r3, r0)
            r5.A0C(r4, r3)
            r0 = -1076890332(0xffffffffbfcff524, float:-1.6246686)
            goto L_0x45aa
        L_0x36bd:
            r0 = 1028820211(0x3d528cf3, float:0.05140395)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r3.A00
            X.3aX r6 = (X.C62693aX) r6
            com.instagram.service.session.UserSession r3 = r6.A05
            java.lang.String r1 = "privacy"
            java.lang.String r0 = "sharing_entered"
            X.C62423Zt.A03(r3, r1, r0)
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "com.instagram.portable_settings.privacy.sharing_settings"
            X.3iE r5 = X.C63743iE.A02(r0, r1)
            androidx.fragment.app.FragmentActivity r4 = r6.A03
            com.instagram.bloks.hosting.IgBloksScreenConfig r3 = X.C18190wL.A0N(r3)
            X.CTd r1 = r6.A04
            r0 = 2131834310(0x7f1135c6, float:1.9301727E38)
            X.C18230wP.A1A(r1, r3, r0)
            r5.A0C(r4, r3)
            r0 = 1123157620(0x42f20674, float:121.0126)
            goto L_0x45aa
        L_0x36f1:
            r0 = 1160400196(0x452a4d44, float:2724.829)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r3.A00
            X.3aX r6 = (X.C62693aX) r6
            com.instagram.service.session.UserSession r3 = r6.A05
            java.lang.String r1 = "privacy"
            java.lang.String r0 = "live_entered"
            X.C62423Zt.A03(r3, r1, r0)
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "com.instagram.portable_settings.privacy.live_settings"
            X.3iE r5 = X.C63743iE.A02(r0, r1)
            androidx.fragment.app.FragmentActivity r4 = r6.A03
            com.instagram.bloks.hosting.IgBloksScreenConfig r3 = X.C18190wL.A0N(r3)
            X.CTd r1 = r6.A04
            r0 = 2131829932(0x7f1124ac, float:1.9292847E38)
            X.C18230wP.A1A(r1, r3, r0)
            r5.A0C(r4, r3)
            r0 = -2042074311(0xffffffff86486b39, float:-3.7694594E-35)
            goto L_0x45aa
        L_0x3725:
            r0 = 405389675(0x1829c16b, float:2.194039E-24)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3aX r0 = (X.C62693aX) r0
            com.instagram.service.session.UserSession r1 = r0.A05
            X.C62423Zt.A02(r1)
            androidx.fragment.app.FragmentActivity r0 = r0.A03
            X.Drz r0 = X.AnonymousClass0wJ.A0Q(r0, r1)
            X.C61423Tj.A00(r0)
            r0 = -1781410818(0xffffffff95d1d3fe, float:-8.474889E-26)
            goto L_0x45aa
        L_0x3743:
            r0 = -883586002(0xffffffffcb558c2e, float:-1.3995054E7)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3aX r0 = (X.C62693aX) r0
            com.instagram.service.session.UserSession r1 = r0.A05
            X.C62423Zt.A02(r1)
            androidx.fragment.app.FragmentActivity r0 = r0.A03
            X.C63183gx.A03(r0, r1)
            r0 = -179746710(0xfffffffff549486a, float:-2.5515635E32)
            goto L_0x45aa
        L_0x375d:
            r0 = 986295325(0x3ac9ac1d, float:0.0015386377)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3aX r0 = (X.C62693aX) r0
            com.instagram.service.session.UserSession r1 = r0.A05
            X.C62423Zt.A02(r1)
            androidx.fragment.app.FragmentActivity r0 = r0.A03
            X.C63183gx.A03(r0, r1)
            r0 = -589700408(0xffffffffdcd9e2c8, float:-4.90635349E17)
            goto L_0x45aa
        L_0x3777:
            r0 = 1599428688(0x5f555850, float:1.5373125E19)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.3aX r3 = (X.C62693aX) r3
            com.instagram.service.session.UserSession r5 = r3.A05
            X.C62423Zt.A02(r5)
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "com.instagram.growth.screens.muted_users"
            X.3iE r4 = X.C63743iE.A02(r0, r1)
            androidx.fragment.app.FragmentActivity r3 = r3.A03
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r5)
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r1.A0O = r0
            r0 = 2131831618(0x7f112b42, float:1.9296267E38)
            X.C63743iE.A08(r3, r1, r4, r0)
            r0 = -47872003(0xfffffffffd2587fd, float:-1.3751794E37)
            goto L_0x45aa
        L_0x37a6:
            r0 = 1786976354(0x6a831862, float:7.924221E25)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.3aX r4 = (X.C62693aX) r4
            com.instagram.service.session.UserSession r3 = r4.A05
            X.C62423Zt.A02(r3)
            X.36t r0 = X.C50452t1.A00()
            X.ExX r0 = r0.A00
            androidx.fragment.app.Fragment r1 = r0.BhZ(r3)
            androidx.fragment.app.FragmentActivity r0 = r4.A03
            X.Drz r0 = X.AnonymousClass0wJ.A0Q(r0, r3)
            r0.A03 = r1
            r0.A05()
            r0 = -1483389576(0xffffffffa7954578, float:-4.1431126E-15)
            goto L_0x45aa
        L_0x37d0:
            r0 = -109698113(0xfffffffff97623bf, float:-7.987688E34)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.3aX r3 = (X.C62693aX) r3
            com.instagram.service.session.UserSession r5 = r3.A05
            java.lang.String r1 = "privacy"
            java.lang.String r0 = "app_and_websites_entered"
            X.C62423Zt.A03(r5, r1, r0)
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "com.instagram.platformapi.platform_authorized_applications.list"
            X.3iE r4 = X.C63743iE.A02(r0, r1)
            androidx.fragment.app.FragmentActivity r3 = r3.A03
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r5)
            r0 = 2131821453(0x7f11038d, float:1.927565E38)
            X.C63743iE.A09(r3, r1, r4, r0)
            r0 = 722750187(0x2b144aeb, float:5.268413E-13)
            goto L_0x45aa
        L_0x37ff:
            r0 = 716410187(0x2ab38d4b, float:3.189483E-13)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3aX r0 = (X.C62693aX) r0
            X.C62693aX.A02(r0)
            r0 = -781047145(0xffffffffd1722a97, float:-6.5006039E10)
            goto L_0x45aa
        L_0x3812:
            r0 = 1061865086(0x3f4ac67e, float:0.79209125)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3aX r0 = (X.C62693aX) r0
            X.C62693aX.A02(r0)
            r0 = -693781786(0xffffffffd6a5bae6, float:-9.1111071E13)
            goto L_0x45aa
        L_0x3825:
            r0 = -1162734180(0xffffffffbab2159c, float:-0.0013586762)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3aX r0 = (X.C62693aX) r0
            com.instagram.service.session.UserSession r3 = r0.A05
            X.C62423Zt.A02(r3)
            X.AhH r1 = X.C36052Pv.A00()
            androidx.fragment.app.FragmentActivity r0 = r0.A03
            r1.A07(r0, r3)
            r0 = -2004790170(0xffffffff88815466, float:-7.783747E-34)
            goto L_0x45aa
        L_0x3843:
            java.lang.Object r2 = r3.A00
            X.3aX r2 = (X.C62693aX) r2
            com.instagram.service.session.UserSession r4 = r2.A05
            X.C62423Zt.A02(r4)
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "com.instagram.privacy.data_permissions.face_and_hands_effects"
            X.3iE r3 = X.C63743iE.A02(r0, r1)
            androidx.fragment.app.FragmentActivity r2 = r2.A03
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r4)
            r0 = 2131835540(0x7f113a94, float:1.9304221E38)
            X.C63743iE.A09(r2, r1, r3, r0)
            return
        L_0x3863:
            java.lang.Object r2 = r3.A00
            X.3aX r2 = (X.C62693aX) r2
            com.instagram.service.session.UserSession r4 = r2.A05
            X.C62423Zt.A02(r4)
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "com.instagram.privacy.data_permissions.cookies"
            X.3iE r3 = X.C63743iE.A02(r0, r1)
            androidx.fragment.app.FragmentActivity r2 = r2.A03
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r4)
            r0 = 2131835539(0x7f113a93, float:1.930422E38)
            X.C63743iE.A09(r2, r1, r3, r0)
            return
        L_0x3883:
            java.lang.Object r0 = r3.A00
            X.3aX r0 = (X.C62693aX) r0
            com.instagram.service.session.UserSession r1 = r0.A05
            X.C62423Zt.A02(r1)
            androidx.fragment.app.FragmentActivity r0 = r0.A03
            X.C54522za.A00(r0, r1)
            return
        L_0x3892:
            java.lang.Object r3 = r3.A00
            X.3aX r3 = (X.C62693aX) r3
            com.instagram.service.session.UserSession r4 = r3.A05
            r5 = 0
            X.0TJ r2 = X.C18250wR.A0D(r4, r5)
            r0 = 36599769971625158(0x82074c00050cc6, double:3.209180133275694E-306)
            int r1 = X.C63803iN.A01(r2, r4, r0)
            if (r1 == 0) goto L_0x38df
            boolean r0 = X.C35392Ng.A00(r4)
            if (r0 == 0) goto L_0x38df
            android.content.SharedPreferences r0 = X.C28161tl.A04(r4)
            java.lang.String r2 = "hidden_word_settings_info_nux_shown_count"
            int r0 = r0.getInt(r2, r5)
            if (r0 >= r1) goto L_0x38df
            android.content.SharedPreferences r0 = X.C28161tl.A04(r4)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            int r0 = r0.getInt(r2, r5)
            int r0 = r0 + 1
            X.AnonymousClass0wJ.A11(r1, r2, r0)
            androidx.fragment.app.FragmentActivity r0 = r3.A03
            X.Drz r3 = X.AnonymousClass0wJ.A0Q(r0, r4)
            X.C35372Ne.A00()
            X.1bb r0 = new X.1bb
            r0.<init>()
        L_0x38d9:
            r3.A03 = r0
            r3.A05()
            return
        L_0x38df:
            java.lang.String r1 = "privacy"
            java.lang.String r0 = "hidden_words_entered"
            X.C62423Zt.A03(r4, r1, r0)
            X.C62423Zt.A02(r4)
            androidx.fragment.app.FragmentActivity r2 = r3.A03
            X.Drz r3 = X.AnonymousClass0wJ.A0Q(r2, r4)
            X.36r r0 = X.C35372Ne.A00()
            X.3Dh r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass006.A01
            androidx.fragment.app.Fragment r0 = r1.A00(r2, r4, r0)
            goto L_0x38d9
        L_0x38fc:
            java.lang.Object r5 = r3.A00
            X.3aX r5 = (X.C62693aX) r5
            com.instagram.service.session.UserSession r2 = r5.A05
            java.lang.String r1 = "privacy"
            java.lang.String r0 = "end_to_end_encryption_entered"
            X.C62423Zt.A03(r2, r1, r0)
            X.C62423Zt.A02(r2)
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "com.instagram.portable_settings.privacy.end_to_end_encryption"
            X.3iE r4 = X.C63743iE.A02(r0, r1)
            androidx.fragment.app.FragmentActivity r3 = r5.A03
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.C18190wL.A0N(r2)
            X.CTd r1 = r5.A04
            r0 = 2131835352(0x7f1139d8, float:1.930384E38)
            X.C18230wP.A1A(r1, r2, r0)
            r4.A0C(r3, r2)
            return
        L_0x3928:
            java.lang.Object r3 = r3.A00
            X.3aX r3 = (X.C62693aX) r3
            com.instagram.service.session.UserSession r2 = r3.A05
            java.lang.String r1 = "privacy"
            java.lang.String r0 = "end_to_end_encryption_entered"
            X.C62423Zt.A03(r2, r1, r0)
            X.C62423Zt.A02(r2)
            androidx.fragment.app.FragmentActivity r0 = r3.A03
            X.Drz r1 = X.C18180wK.A0Q(r0, r2)
            X.1wU r0 = new X.1wU
            r0.<init>()
            goto L_0x438e
        L_0x3945:
            java.lang.Object r5 = r3.A00
            X.3aX r5 = (X.C62693aX) r5
            com.instagram.service.session.UserSession r4 = r5.A05
            java.lang.String r1 = "privacy"
            java.lang.String r0 = "messages_entered"
            X.C62423Zt.A03(r4, r1, r0)
            X.C62423Zt.A02(r4)
            X.C18190wL.A10()
            com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment r3 = new com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment
            r3.<init>()
            X.CTd r0 = r5.A04
            android.os.Bundle r2 = r0.mArguments
            if (r2 != 0) goto L_0x3967
            android.os.Bundle r2 = X.C18180wK.A06()
        L_0x3967:
            java.lang.String r1 = "entry_point"
            java.lang.String r0 = "ig_settings"
            r2.putString(r1, r0)
            X.282 r1 = X.AnonymousClass282.PRIVACY_SETTINGS
            java.lang.String r0 = "reachability_settings_upsell"
            r2.putSerializable(r0, r1)
            r3.setArguments(r2)
            androidx.fragment.app.FragmentActivity r0 = r5.A03
            X.Drz r0 = X.AnonymousClass0wJ.A0Q(r0, r4)
            r0.A03 = r3
            r0.A05()
            return
        L_0x3984:
            java.lang.Object r3 = r3.A00
            X.3aX r3 = (X.C62693aX) r3
            X.C18190wL.A10()
            java.lang.String r1 = "call_settings"
            android.os.Bundle r0 = X.C18180wK.A06()
            X.C18210wN.A0x(r0, r1)
            X.1wi r2 = new X.1wi
            r2.<init>()
            r2.setArguments(r0)
            androidx.fragment.app.FragmentActivity r1 = r3.A03
            com.instagram.service.session.UserSession r0 = r3.A05
            X.Drz r0 = X.AnonymousClass0wJ.A0Q(r1, r0)
            r0.A03 = r2
            r0.A05()
            return
        L_0x39aa:
            java.lang.Object r0 = r3.A00
            X.3aX r0 = (X.C62693aX) r0
            androidx.fragment.app.FragmentActivity r1 = r0.A03
            com.instagram.service.session.UserSession r0 = r0.A05
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r1, r0)
            X.C18190wL.A10()
            X.1wX r0 = new X.1wX
            r0.<init>()
            goto L_0x438e
        L_0x39c0:
            java.lang.Object r4 = r3.A00
            X.3aX r4 = (X.C62693aX) r4
            java.lang.String r1 = "com.instagram.topics.preferences.interest_topics_settings"
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()
            X.3iE r3 = X.C63743iE.A02(r1, r0)
            androidx.fragment.app.FragmentActivity r2 = r4.A03
            com.instagram.service.session.UserSession r0 = r4.A05
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r0)
            r0 = 2131829144(0x7f112198, float:1.9291249E38)
            X.C63743iE.A09(r2, r1, r3, r0)
            return
        L_0x39dd:
            java.lang.Object r3 = r3.A00
            X.3aX r3 = (X.C62693aX) r3
            com.instagram.service.session.UserSession r2 = r3.A05
            java.lang.String r1 = "activity_status_entered"
            X.C62423Zt.A02(r2)
            java.lang.String r0 = "privacy"
            X.C62423Zt.A03(r2, r0, r1)
            androidx.fragment.app.FragmentActivity r0 = r3.A03
            X.C63493hb.A02(r0, r2)
            return
        L_0x39f3:
            r0 = 777553380(0x2e5885e4, float:4.9231633E-11)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r3.A00
            X.3Hd r6 = (X.C58773Hd) r6
            com.instagram.service.session.UserSession r5 = r6.A05
            X.C62423Zt.A02(r5)
            X.3hJ r0 = X.C63343hJ.getInstance()
            X.L5O r4 = r0.getPerformanceLogger(r5)
            java.lang.Integer r3 = X.AnonymousClass006.A01
            java.lang.String r1 = "email_sms_notification_settings"
            r0 = 0
            r4.Cur(r3, r0, r1)
            X.4Ja r3 = X.C63343hJ.A01(r5)
            java.lang.String r0 = "IgEmailSmsSettingsRoute"
            r3.CpK(r0)
            android.app.Activity r1 = r6.A01
            r0 = 2131826745(0x7f111839, float:1.9286383E38)
            java.lang.String r0 = r1.getString(r0)
            r3.A07 = r0
            r0 = 1
            r3.A08 = r0
            r3.BaN(r1)
            r0 = 831497491(0x318fa513, float:4.1806145E-9)
            goto L_0x45aa
        L_0x3a32:
            r0 = 237134561(0xe2262e1, float:2.001565E-30)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.394 r0 = (X.AnonymousClass394) r0
            com.instagram.service.session.UserSession r4 = r0.A01
            X.C62423Zt.A02(r4)
            android.app.Activity r3 = r0.A00
            r0 = 2131830433(0x7f1126a1, float:1.9293863E38)
            java.lang.String r1 = r3.getString(r0)
            r0 = 86
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            X.C63493hb.A04(r3, r4, r0, r1)
            r0 = -1563510204(0xffffffffa2ceba44, float:-5.603363E-18)
            goto L_0x45aa
        L_0x3a59:
            r0 = 1697052299(0x6526f68b, float:4.9278797E22)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.394 r1 = (X.AnonymousClass394) r1
            com.instagram.service.session.UserSession r0 = r1.A01
            X.C62423Zt.A02(r0)
            X.4Ja r3 = X.C63343hJ.A01(r0)
            java.lang.String r0 = "IgFacebookNotificationSettingsRoute"
            r3.CpK(r0)
            android.app.Activity r1 = r1.A00
            r0 = 2131827001(0x7f111939, float:1.9286902E38)
            java.lang.String r0 = r1.getString(r0)
            r3.A07 = r0
            r3.BaN(r1)
            r0 = -988171886(0xffffffffc519b192, float:-2459.0981)
            goto L_0x45aa
        L_0x3a85:
            r0 = -1431820666(0xffffffffaaa82686, float:-2.9869526E-13)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.394 r4 = (X.AnonymousClass394) r4
            com.instagram.service.session.UserSession r3 = r4.A01
            java.lang.String r1 = "push_notifications_entered"
            X.C62423Zt.A02(r3)
            java.lang.String r0 = "settings"
            X.C62423Zt.A03(r3, r0, r1)
            android.app.Activity r0 = r4.A00
            X.C63493hb.A03(r0, r3)
            r0 = -543824216(0xffffffffdf95e6a8, float:-2.160301E19)
            goto L_0x45aa
        L_0x3aa6:
            r0 = 1470910406(0x57ac4fc6, float:3.78917249E14)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.1wE r0 = (X.AnonymousClass1wE) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0Oa r0 = r0.A01
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.C63493hb.A02(r1, r0)
            r0 = 1569111462(0x5d86bda6, float:1.21363736E18)
            goto L_0x45aa
        L_0x3ac3:
            r0 = 466050122(0x1bc75c4a, float:3.298143E-22)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.1wE r0 = (X.AnonymousClass1wE) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0Oa r0 = r0.A01
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.Drz r1 = X.C18180wK.A0Q(r1, r0)
            X.1we r0 = new X.1we
            r0.<init>()
            r1.A03 = r0
            r1.A05()
            r0 = -482425340(0xffffffffe33ec604, float:-3.51915E21)
            goto L_0x45aa
        L_0x3aeb:
            r0 = -644771697(0xffffffffd991908f, float:-5.1216019E15)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.1wE r5 = (X.AnonymousClass1wE) r5
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "com.instagram.portable_settings.story_replies"
            X.3iE r4 = X.C63743iE.A02(r0, r1)
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            X.0Oa r0 = r5.A01
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r0)
            r0 = 2131836275(0x7f113d73, float:1.9305712E38)
            X.C18230wP.A1A(r5, r1, r0)
            r4.A0C(r3, r1)
            r0 = -272441469(0xffffffffefc2df83, float:-1.206206E29)
            goto L_0x45aa
        L_0x3b1c:
            r0 = 1833812714(0x6d4dc2ea, float:3.980004E27)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3Bk r0 = (X.C57533Bk) r0
            androidx.fragment.app.FragmentActivity r1 = r0.A01
            com.instagram.service.session.UserSession r0 = r0.A03
            X.Drz r1 = X.C18180wK.A0Q(r1, r0)
            X.C18190wL.A10()
            com.instagram.debug.whoptions.WhitehatOptionsFragment r0 = new com.instagram.debug.whoptions.WhitehatOptionsFragment
            r0.<init>()
            r1.A03 = r0
            r1.A05()
            r0 = -395880972(0xffffffffe86755f4, float:-4.3698089E24)
            goto L_0x45aa
        L_0x3b41:
            r0 = -1002524176(0xffffffffc43eb1f0, float:-762.7803)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3Bk r0 = (X.C57533Bk) r0
            android.content.Context r4 = r0.A00
            X.0m7 r3 = r0.A02
            androidx.fragment.app.FragmentActivity r1 = r0.A01
            com.instagram.service.session.UserSession r0 = r0.A03
            com.instagram.debug.devoptions.api.DeveloperOptionsLauncher.loadAndLaunchDeveloperOptions(r4, r3, r1, r0)
            r0 = 1691086608(0x64cbef10, float:3.0095323E22)
            goto L_0x45aa
        L_0x3b5c:
            java.lang.Object r0 = r3.A00
            X.3Ug r0 = (X.C61573Ug) r0
            com.instagram.service.session.UserSession r5 = r0.A01
            X.C62423Zt.A02(r5)
            X.1dm r3 = r0.A02
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            r2 = 0
            X.AnonymousClass0wJ.A1O(r1, r5)
            java.lang.String r0 = X.C18230wP.A0n(r3)
            java.util.Map r11 = X.C54372zL.A00(r0)
            java.lang.Integer r8 = X.AnonymousClass006.A01
            java.lang.String r9 = "com.bloks.www.ig.ixt.triggers.screen.support_inbox"
            X.1yz r6 = new X.1yz
            r6.<init>()
            X.3ad r0 = new X.3ad
            r4 = r2
            r7 = r2
            r10 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0.A04()
            return
        L_0x3b8c:
            java.lang.Object r1 = r3.A00
            X.3Ug r1 = (X.C61573Ug) r1
            X.4Vx r0 = new X.4Vx
            r0.<init>(r1)
            X.C61573Ug.A00(r1, r0)
            return
        L_0x3b99:
            java.lang.Object r4 = r3.A00
            X.3Ug r4 = (X.C61573Ug) r4
            com.instagram.service.session.UserSession r3 = r4.A01
            X.0ik r0 = new X.0ik
            r0.<init>(r3)
            java.lang.String r2 = "data_control"
            r0.A02 = r2
            X.0nS r1 = r0.A00()
            java.lang.String r0 = "instagram_privacy_and_security_help_entry"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1965(0x7ad, float:2.754E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x3bc4
            X.C18240wQ.A15(r1, r2)
            r1.Bb4()
        L_0x3bc4:
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "com.instagram.portable.settings.help.privacy_and_security"
            X.3iE r2 = X.C63743iE.A02(r0, r1)
            X.1dm r0 = r4.A02
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = X.C18190wL.A0N(r3)
            r2.A0C(r1, r0)
            return
        L_0x3bdc:
            java.lang.Object r1 = r3.A00
            X.3Ug r1 = (X.C61573Ug) r1
            X.4Vw r0 = new X.4Vw
            r0.<init>(r1)
            X.C61573Ug.A00(r1, r0)
            return
        L_0x3be9:
            java.lang.Object r1 = r3.A00
            X.3Ug r1 = (X.C61573Ug) r1
            X.4Vy r0 = new X.4Vy
            r0.<init>(r1)
            X.C61573Ug.A00(r1, r0)
            return
        L_0x3bf6:
            r0 = -663863857(0xffffffffd86e3dcf, float:-1.04779693E15)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.3Va r5 = (X.C61713Va) r5
            com.instagram.service.session.UserSession r4 = r5.A04
            X.C62423Zt.A02(r4)
            androidx.fragment.app.Fragment r3 = r5.A01
            java.lang.Integer r1 = X.AnonymousClass006.A0u
            X.0kW r0 = r5.A03
            X.AnonymousClass3h4.A02(r3, r0, r4, r1)
            java.lang.String r1 = "follow_contacts"
            r0 = 0
            X.C61713Va.A00(r5, r0, r1)
            r0 = 1979666082(0x75ff4ea2, float:6.4728055E32)
            goto L_0x45aa
        L_0x3c1a:
            r0 = 1238030015(0x49cad6bf, float:1661655.9)
            int r2 = X.C14030oh.A05(r0)
            java.lang.String r7 = "self_profile"
            java.lang.String r6 = "follow_accounts_you_know_oc"
            r5 = 1
            X.1dk r4 = new X.1dk
            r4.<init>()
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "ARG_ENTRY_POINT"
            r1.putString(r0, r7)
            java.lang.String r0 = "ARG_FROM_PRO_ONBOARDING_CHECKLIST"
            r1.putBoolean(r0, r5)
            java.lang.String r0 = "ARG_MODULE_NAME"
            r1.putString(r0, r6)
            r4.setArguments(r1)
            java.lang.Object r3 = r3.A00
            X.3Va r3 = (X.C61713Va) r3
            androidx.fragment.app.FragmentActivity r1 = r3.A02
            com.instagram.service.session.UserSession r0 = r3.A04
            X.AnonymousClass0wJ.A19(r4, r1, r0)
            java.lang.String r1 = "suma_followings"
            r0 = 0
            X.C61713Va.A00(r3, r0, r1)
            r0 = -1400257634(0xffffffffac89c39e, float:-3.915492E-12)
            goto L_0x45aa
        L_0x3c57:
            r0 = 47375570(0x2d2e4d2, float:3.0988063E-37)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r3.A00
            X.3Va r5 = (X.C61713Va) r5
            com.instagram.service.session.UserSession r4 = r5.A04
            X.C62423Zt.A02(r4)
            X.0kW r0 = r5.A03
            X.0nS r1 = X.C13330nS.A01(r0, r4)
            java.lang.String r0 = "options_invite_tapped"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2465(0x9a1, float:3.454E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            java.lang.String r3 = "system_share_sheet"
            java.lang.String r0 = "invite_flow"
            r1.A0T(r0, r3)
            r1.Bb4()
            androidx.fragment.app.Fragment r1 = r5.A01
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            X.AnonymousClass3PW.A01(r1, r4, r0)
            r0 = 0
            X.C61713Va.A00(r5, r0, r3)
            r0 = -1144347566(0xffffffffbbcaa452, float:-0.0061841393)
            goto L_0x45aa
        L_0x3c93:
            r0 = -1275109(0xffffffffffec8b1b, float:NaN)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.3Va r4 = (X.C61713Va) r4
            com.instagram.service.session.UserSession r3 = r4.A04
            X.C62423Zt.A02(r3)
            X.0kW r0 = r4.A03
            X.0nS r1 = X.C13330nS.A01(r0, r3)
            java.lang.String r0 = "options_whatsapp_invite_tapped"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2466(0x9a2, float:3.456E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            r0.Bb4()
            androidx.fragment.app.Fragment r1 = r4.A01
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
            X.AnonymousClass3PW.A01(r1, r3, r0)
            java.lang.String r1 = "whatsapp"
            r0 = 0
            X.C61713Va.A00(r4, r0, r1)
            r0 = -1901894290(0xffffffff8ea3656e, float:-4.0280276E-30)
            goto L_0x45aa
        L_0x3cca:
            r0 = 393667260(0x1776e2bc, float:7.9773066E-25)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r3.A00
            X.3Va r3 = (X.C61713Va) r3
            java.lang.String r1 = "direct_message"
            r0 = 0
            X.C61713Va.A00(r3, r0, r1)
            r0 = 1523122236(0x5ac9003c, float:2.8288364E16)
            goto L_0x45aa
        L_0x3ce0:
            r0 = -1237198057(0xffffffffb641db17, float:-2.8886768E-6)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3z5 r0 = (X.C67193z5) r0
            com.instagram.base.activity.BaseFragmentActivity r1 = r0.A01
            com.instagram.service.session.UserSession r0 = r0.A04
            X.Drz r4 = X.AnonymousClass0wJ.A0Q(r1, r0)
            X.DaE r0 = X.C24270DFm.A00()
            X.DcE r3 = r0.A00()
            java.lang.String r1 = "SETTINGS"
            r0 = 0
            androidx.fragment.app.Fragment r0 = r3.A01(r1, r0)
            X.C67193z5.A00(r0, r4)
            r0 = -114368547(0xfffffffff92edfdd, float:-5.675001E34)
            goto L_0x45aa
        L_0x3d0a:
            r0 = 1388168532(0x52bdc554, float:4.07529718E11)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3z5 r0 = (X.C67193z5) r0
            com.instagram.base.activity.BaseFragmentActivity r1 = r0.A01
            com.instagram.service.session.UserSession r0 = r0.A04
            X.Drz r3 = X.AnonymousClass0wJ.A0Q(r1, r0)
            X.3Hg r1 = X.AnonymousClass3WJ.A00()
            java.lang.String r0 = "SETTINGS"
            androidx.fragment.app.Fragment r0 = r1.A02(r0)
            X.C67193z5.A00(r0, r3)
            r0 = -742914830(0xffffffffd3b804f2, float:-1.5807139E12)
            goto L_0x45aa
        L_0x3d2f:
            r0 = -1883519624(0xffffffff8fbbc578, float:-1.8515686E-29)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3z5 r0 = (X.C67193z5) r0
            com.instagram.service.session.UserSession r3 = r0.A04
            X.C62423Zt.A02(r3)
            X.C18190wL.A10()
            X.1wp r1 = new X.1wp
            r1.<init>()
            com.instagram.base.activity.BaseFragmentActivity r0 = r0.A01
            X.Drz r0 = X.AnonymousClass0wJ.A0Q(r0, r3)
            r0.A03 = r1
            r0.A05()
            r0 = -1967755064(0xffffffff8ab670c8, float:-1.7568386E-32)
            goto L_0x45aa
        L_0x3d57:
            r0 = 857388987(0x331ab7bb, float:3.602302E-8)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3z5 r0 = (X.C67193z5) r0
            com.instagram.service.session.UserSession r8 = r0.A04
            java.lang.String r7 = r0.A08
            com.instagram.base.activity.BaseFragmentActivity r3 = r0.A01
            if (r3 == 0) goto L_0x3da1
            java.lang.String r6 = "setting"
            X.C25274Div.A00()
            java.lang.String r1 = X.C18180wK.A0e()
            X.C04220Ms.A06(r1)
            X.Drz r5 = X.AnonymousClass0wJ.A0Q(r3, r8)
            X.Axa r0 = X.C19513Axa.A00
            r0.A0P()
            r0 = 2131835810(0x7f113ba2, float:1.930477E38)
            java.lang.String r4 = X.AnonymousClass0wJ.A0k(r3, r0)
            r0 = 0
            java.util.HashMap r3 = X.AnonymousClass0wJ.A0y()
            X.C18210wN.A1N(r6, r1, r7, r3)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_child_view"
            r3.put(r0, r1)
            java.lang.String r0 = "com.instagram.shopping.screens.seller_feature_disabled"
            X.C62853b1.A04(r5, r8, r0, r4, r3)
            r0 = 1302830726(0x4da79e86, float:3.51523008E8)
            goto L_0x45aa
        L_0x3da1:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0b()
            r0 = 360252827(0x1579059b, float:5.028957E-26)
            X.C14030oh.A0C(r0, r2)
            throw r1
        L_0x3dac:
            r0 = 2073078127(0x7b90a96f, float:1.5022545E36)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3z5 r0 = (X.C67193z5) r0
            com.instagram.service.session.UserSession r7 = r0.A04
            java.lang.String r10 = r0.A08
            com.instagram.base.activity.BaseFragmentActivity r1 = r0.A01
            if (r1 == 0) goto L_0x3e22
            java.lang.String r9 = "setting"
            X.C25274Div.A00()
            java.lang.String r8 = X.C18180wK.A0e()
            X.C04220Ms.A06(r8)
            X.Drz r4 = X.AnonymousClass0wJ.A0Q(r1, r7)
            X.Axa r0 = X.C19513Axa.A00
            r0.A0P()
            r0 = 2131835810(0x7f113ba2, float:1.930477E38)
            java.lang.String r6 = X.AnonymousClass0wJ.A0k(r1, r0)
            r5 = 0
            java.util.HashMap r3 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = ""
            java.lang.String r0 = "entry_point"
            r3.put(r0, r9)
            java.lang.String r0 = "waterfall_id"
            r3.put(r0, r8)
            if (r10 != 0) goto L_0x3def
            r10 = r1
        L_0x3def:
            java.lang.String r0 = "prior_module"
            r3.put(r0, r10)
            java.lang.String r1 = "default"
            java.lang.String r0 = "presentation_style"
            r3.put(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "is_child_view"
            r3.put(r0, r1)
            java.lang.String r0 = "com.instagram.shopping.screens.revoke"
            X.3iE r1 = X.C63743iE.A02(r0, r3)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = X.C18190wL.A0N(r7)
            r0.A0S = r6
            X.1c8 r0 = X.C62853b1.A02(r0, r1)
            r4.A03 = r0
            java.lang.String r0 = "1"
            r4.A07 = r0
            r4.A05()
            r0 = -577715281(0xffffffffdd90c3af, float:-1.3039217E18)
            goto L_0x45aa
        L_0x3e22:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0b()
            r0 = 1352196461(0x5098e16d, float:2.05192827E10)
            X.C14030oh.A0C(r0, r2)
            throw r1
        L_0x3e2d:
            r0 = 1507865250(0x59e032a2, float:7.8882583E15)
            int r7 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r3.A00
            X.3z5 r6 = (X.C67193z5) r6
            com.instagram.service.session.UserSession r2 = r6.A04
            X.CTd r5 = r6.A02
            r1 = 0
            X.7qT r4 = X.C130667qT.A02(r5, r2, r1)
            java.lang.String r0 = "com.instagram.shopping.screens.age_gate_selection_load_screen"
            X.4A9 r3 = X.C63263h8.A00(r2, r0, r1)
            r2 = 16
            r1 = 42
            com.instagram.bloks.util.IDxACallbackShape31S0200000_1_I2 r0 = new com.instagram.bloks.util.IDxACallbackShape31S0200000_1_I2
            r0.<init>(r2, r1, r4, r6)
            r3.A00 = r0
            r5.schedule(r3)
            r0 = -42514423(0xfffffffffd774809, float:-2.0543334E37)
            X.C14030oh.A0C(r0, r7)
            return
        L_0x3e5c:
            r0 = 1237229057(0x49be9e01, float:1561536.1)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.3z5 r1 = (X.C67193z5) r1
            com.instagram.base.activity.BaseFragmentActivity r0 = r1.A01
            if (r0 == 0) goto L_0x3e83
            com.instagram.service.session.UserSession r3 = r1.A04
            X.Drz r2 = X.AnonymousClass0wJ.A0Q(r0, r3)
            java.lang.String r1 = "com.instagram.shopping.screens.shop_linking_creator"
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()
            X.1c8 r0 = X.C62853b1.A03(r3, r1, r0)
            X.C67193z5.A00(r0, r2)
            r0 = -1004867170(0xffffffffc41af19e, float:-619.77527)
            goto L_0x4609
        L_0x3e83:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0b()
            r0 = -36868635(0xfffffffffdcd6de5, float:-3.4132793E37)
            X.C14030oh.A0C(r0, r4)
            throw r1
        L_0x3e8e:
            r0 = 1892900440(0x70d35e58, float:5.2332313E29)
            int r5 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.3z5 r1 = (X.C67193z5) r1
            com.instagram.base.activity.BaseFragmentActivity r0 = r1.A01
            com.instagram.service.session.UserSession r4 = r1.A04
            X.Drz r3 = X.AnonymousClass0wJ.A0Q(r0, r4)
            X.3Ve r2 = X.C122117Ki.A06()
            java.lang.String r1 = "SETTINGS"
            r0 = 0
            androidx.fragment.app.Fragment r0 = r2.A04(r4, r1, r0, r0)
            X.C67193z5.A00(r0, r3)
            r0 = -2137403173(0xffffffff8099d0db, float:-1.4125754E-38)
            goto L_0x3fc1
        L_0x3eb4:
            r0 = -2116724412(0xffffffff81d55944, float:-7.837193E-38)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3z5 r0 = (X.C67193z5) r0
            com.instagram.base.activity.BaseFragmentActivity r1 = r0.A01
            com.instagram.service.session.UserSession r0 = r0.A04
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r1, r0)
            X.C18190wL.A10()
            X.1wj r0 = new X.1wj
            r0.<init>()
            r1.A03 = r0
            r1.A05()
            r0 = 1421351591(0x54b81aa7, float:6.3257691E12)
            goto L_0x45aa
        L_0x3ed9:
            r0 = 2147078936(0x7ff9d318, float:NaN)
            int r5 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3z5 r0 = (X.C67193z5) r0
            com.instagram.base.activity.BaseFragmentActivity r1 = r0.A01
            com.instagram.service.session.UserSession r0 = r0.A04
            X.Drz r4 = X.AnonymousClass0wJ.A0Q(r1, r0)
            X.3Ek r0 = X.AnonymousClass2S8.A00()
            X.3Do r3 = r0.A00()
            com.instagram.api.schemas.IGRevShareProductType r2 = com.instagram.api.schemas.IGRevShareProductType.PROFILE_ADS
            java.lang.String r1 = "SETTINGS"
            r0 = 0
            androidx.fragment.app.Fragment r0 = r3.A00(r2, r1, r0)
            X.C67193z5.A00(r0, r4)
            r0 = 672055174(0x280ebf86, float:7.9241135E-15)
            goto L_0x3fc1
        L_0x3f05:
            r0 = 1612318541(0x601a074d, float:4.43957E19)
            int r5 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3z5 r0 = (X.C67193z5) r0
            com.instagram.base.activity.BaseFragmentActivity r1 = r0.A01
            com.instagram.service.session.UserSession r0 = r0.A04
            X.Drz r4 = X.AnonymousClass0wJ.A0Q(r1, r0)
            X.3Ek r0 = X.AnonymousClass2S8.A00()
            X.3Do r3 = r0.A00()
            com.instagram.api.schemas.IGRevShareProductType r2 = com.instagram.api.schemas.IGRevShareProductType.REELS_OVERLAY_ADS
            java.lang.String r1 = "SETTINGS"
            r0 = 0
            androidx.fragment.app.Fragment r0 = r3.A00(r2, r1, r0)
            X.C67193z5.A00(r0, r4)
            r0 = -1932840624(0xffffffff8ccb3150, float:-3.1306781E-31)
            goto L_0x3fc1
        L_0x3f31:
            r0 = -691425071(0xffffffffd6c9b0d1, float:-1.10880629E14)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r3.A00
            X.3z5 r1 = (X.C67193z5) r1
            com.instagram.base.activity.BaseFragmentActivity r0 = r1.A01
            com.instagram.service.session.UserSession r4 = r1.A04
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r0, r4)
            X.6uP r0 = X.AnonymousClass2FT.A00()
            X.6nr r3 = r0.A01()
            r8 = 0
            java.lang.String r5 = "SETTINGS"
            r6 = 0
            r7 = r6
            androidx.fragment.app.Fragment r0 = r3.A00(r4, r5, r6, r7, r8)
            X.C67193z5.A00(r0, r1)
            r0 = 1830264377(0x6d179e39, float:2.9327197E27)
            goto L_0x45aa
        L_0x3f5d:
            r0 = 900065789(0x35a5e9fd, float:1.2361558E-6)
            int r6 = X.C14030oh.A05(r0)
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "com.bloks.www.payments.igp2m.chat_payments"
            X.3iE r5 = X.C63743iE.A02(r0, r1)
            java.lang.Object r0 = r3.A00
            X.3z5 r0 = (X.C67193z5) r0
            com.instagram.service.session.UserSession r4 = r0.A04
            com.instagram.bloks.hosting.IgBloksScreenConfig r3 = X.C18190wL.A0N(r4)
            com.instagram.base.activity.BaseFragmentActivity r2 = r0.A01
            if (r2 == 0) goto L_0x3f9b
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131823242(0x7f110a8a, float:1.9279278E38)
            java.lang.String r0 = r1.getString(r0)
            r3.A0S = r0
            X.1c8 r1 = X.C62853b1.A02(r3, r5)
            X.Drz r0 = X.AnonymousClass0wJ.A0Q(r2, r4)
            X.C67193z5.A00(r1, r0)
            r0 = -58302064(0xfffffffffc866190, float:-5.5819727E36)
            X.C14030oh.A0C(r0, r6)
            return
        L_0x3f9b:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0b()
            r0 = 2124422587(0x7ea01dbb, float:1.0641542E38)
            X.C14030oh.A0C(r0, r6)
            throw r1
        L_0x3fa6:
            r0 = 940159037(0x3809b03d, float:3.282748E-5)
            int r5 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3z5 r0 = (X.C67193z5) r0
            com.instagram.base.activity.BaseFragmentActivity r4 = r0.A01
            if (r4 == 0) goto L_0x3fc5
            com.instagram.service.session.UserSession r3 = r0.A04
            java.lang.String r2 = r0.A08
            r1 = 0
            r0 = 1
            X.C59453Kw.A01(r4, r3, r2, r1, r0)
            r0 = 1605869662(0x5fb7a05e, float:2.6463358E19)
        L_0x3fc1:
            X.C14030oh.A0C(r0, r5)
            return
        L_0x3fc5:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0b()
            r0 = 40803906(0x26e9e42, float:1.7530896E-37)
            X.C14030oh.A0C(r0, r5)
            throw r1
        L_0x3fd0:
            java.lang.Object r0 = r3.A00
            X.3Bj r0 = (X.C57523Bj) r0
            androidx.fragment.app.FragmentActivity r3 = r0.A01
            com.instagram.service.session.UserSession r2 = r0.A02
            java.lang.String r1 = "https://help.instagram.com/1079023176238541"
            X.JhV r0 = new X.JhV
            r0.<init>((java.lang.String) r1)
            com.instagram.simplewebview.SimpleWebViewConfig r0 = r0.A00()
            com.instagram.simplewebview.SimpleWebViewActivity.A00(r3, r2, r0)
            return
        L_0x3fe7:
            java.lang.Object r0 = r3.A00
            X.3Bj r0 = (X.C57523Bj) r0
            com.instagram.service.session.UserSession r1 = r0.A02
            X.C62423Zt.A02(r1)
            androidx.fragment.app.FragmentActivity r0 = r0.A01
            X.C19302Au5.A01(r0, r1)
            return
        L_0x3ff6:
            java.lang.Object r3 = r3.A00
            X.3Bj r3 = (X.C57523Bj) r3
            com.instagram.service.session.UserSession r2 = r3.A02
            java.lang.String r1 = "ads"
            java.lang.String r0 = "ads_data_preferences_entered"
            X.C62423Zt.A03(r2, r1, r0)
            X.C62423Zt.A02(r2)
            androidx.fragment.app.FragmentActivity r5 = r3.A01
            X.Drz r4 = X.C18180wK.A0Q(r5, r2)
            java.lang.String r1 = "com.instagram.ads.ads_data_preferences"
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()
            X.3iE r3 = X.C63743iE.A02(r1, r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.C18190wL.A0N(r2)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131821012(0x7f1101d4, float:1.9274755E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0S = r0
            r0 = 1
            r2.A0h = r0
            X.1c8 r0 = X.C62853b1.A02(r2, r3)
            r4.A03 = r0
            r4.A05()
            return
        L_0x4034:
            java.lang.Object r0 = r3.A00
            X.3Bj r0 = (X.C57523Bj) r0
            com.instagram.service.session.UserSession r1 = r0.A02
            X.C62423Zt.A02(r1)
            androidx.fragment.app.FragmentActivity r0 = r0.A01
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r0, r1)
            com.instagram.adshistory.fragment.RecentAdActivityFragment r0 = new com.instagram.adshistory.fragment.RecentAdActivityFragment
            r0.<init>()
            goto L_0x438e
        L_0x404a:
            java.lang.Object r5 = r3.A00
            X.3YG r5 = (X.AnonymousClass3YG) r5
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            com.instagram.service.session.UserSession r4 = r5.A05
            java.lang.String r1 = r4.getUserId()
            java.lang.String r0 = "target_user_id"
            r2.put(r0, r1)
            java.lang.String r1 = "referer_type"
            java.lang.String r0 = "AccountSettings"
            r2.put(r1, r0)
            java.lang.String r0 = "com.instagram.interactions.about_this_account"
            X.3iE r3 = X.C63743iE.A02(r0, r2)
            androidx.fragment.app.FragmentActivity r2 = r5.A01
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r4)
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r1.A0O = r0
            r0 = 2131820839(0x7f110127, float:1.9274404E38)
            X.C18210wN.A0s(r2, r1, r0)
            java.lang.String r0 = "account_transparency_bloks"
            r1.A0P = r0
            r3.A0C(r2, r1)
            return
        L_0x4082:
            java.lang.Object r3 = r3.A00
            X.3YG r3 = (X.AnonymousClass3YG) r3
            com.instagram.service.session.UserSession r1 = r3.A05
            X.C62423Zt.A02(r1)
            androidx.fragment.app.FragmentActivity r0 = r3.A01
            X.Drz r2 = X.AnonymousClass0wJ.A0Q(r0, r1)
            X.C18190wL.A10()
            android.os.Bundle r1 = r3.A00
            X.1wZ r0 = new X.1wZ
            r0.<init>()
            X.C18180wK.A0x(r1, r0, r2)
            return
        L_0x409f:
            java.lang.Object r0 = r3.A00
            X.3YG r0 = (X.AnonymousClass3YG) r0
            com.instagram.service.session.UserSession r3 = r0.A05
            X.CTd r1 = r0.A03
            X.23m r2 = X.C309223m.SELF
            java.lang.String r5 = r3.getUserId()
            java.lang.String r4 = "tap_save"
            r6 = 0
            java.lang.String r8 = "settings"
            r7 = r6
            X.C63513hd.A04(r1, r2, r3, r4, r5, r6, r7, r8)
            X.C62423Zt.A02(r3)
            X.Asy r1 = X.C19236Asy.A01
            androidx.fragment.app.FragmentActivity r0 = r0.A01
            r1.A04(r0, r3)
            return
        L_0x40c1:
            java.lang.Object r4 = r3.A00
            X.3YG r4 = (X.AnonymousClass3YG) r4
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "com.bloks.www.bk.commerce.ratings_and_reviews.ig.revie_activities"
            X.3iE r3 = X.C63743iE.A02(r0, r1)
            androidx.fragment.app.FragmentActivity r2 = r4.A01
            com.instagram.service.session.UserSession r0 = r4.A05
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r0)
            r0 = 2131834956(0x7f11384c, float:1.9303037E38)
            X.C63743iE.A08(r2, r1, r3, r0)
            return
        L_0x40de:
            java.lang.Object r0 = r3.A00
            X.3YG r0 = (X.AnonymousClass3YG) r0
            com.instagram.service.session.UserSession r2 = r0.A05
            X.C62423Zt.A02(r2)
            androidx.fragment.app.FragmentActivity r0 = r0.A01
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r0, r2)
            X.6om r0 = X.C111986om.A01
            X.6vI r0 = r0.A00()
            androidx.fragment.app.Fragment r0 = r0.A02(r2)
            goto L_0x438e
        L_0x40f9:
            java.lang.Object r0 = r3.A00
            X.3YG r0 = (X.AnonymousClass3YG) r0
            com.instagram.service.session.UserSession r1 = r0.A05
            X.C62423Zt.A02(r1)
            androidx.fragment.app.FragmentActivity r0 = r0.A01
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r0, r1)
            com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            X.1wb r0 = new X.1wb
            r0.<init>()
            goto L_0x438e
        L_0x4112:
            java.lang.Object r0 = r3.A00
            X.3YG r0 = (X.AnonymousClass3YG) r0
            com.instagram.service.session.UserSession r1 = r0.A05
            X.C62423Zt.A02(r1)
            androidx.fragment.app.FragmentActivity r0 = r0.A01
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r0, r1)
            X.C18190wL.A10()
            X.1wN r0 = new X.1wN
            r0.<init>()
            goto L_0x438e
        L_0x412b:
            java.lang.Object r0 = r3.A00
            X.3YG r0 = (X.AnonymousClass3YG) r0
            com.instagram.service.session.UserSession r5 = r0.A05
            X.C62423Zt.A02(r5)
            androidx.fragment.app.FragmentActivity r1 = r0.A01
            X.Drz r4 = X.AnonymousClass0wJ.A0Q(r1, r5)
            X.AnonymousClass3WJ.A02()
            r0 = 2131836339(0x7f113db3, float:1.9305842E38)
            java.lang.String r3 = r1.getString(r0)
            X.AnonymousClass0wJ.A1N(r5, r3)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36326884929185573(0x810f1c00002725, double:3.036606533617032E-306)
            boolean r0 = X.C63803iN.A0E(r2, r5, r0)
            if (r0 == 0) goto L_0x416e
            java.lang.String r1 = "com.bloks.www.ig_subscriptions.fan_experience.subscriptions_list"
        L_0x4156:
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()
            X.3iE r1 = X.C63743iE.A02(r1, r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = X.C18190wL.A0N(r5)
            r0.A0S = r3
            X.1c8 r0 = X.C62853b1.A02(r0, r1)
            r4.A03 = r0
            r4.A05()
            return
        L_0x416e:
            java.lang.String r1 = "com.instagram.user_pay.fan_club.screens.fan_onboarding_subscriptions_list"
            goto L_0x4156
        L_0x4171:
            java.lang.Object r4 = r3.A00
            X.3YG r4 = (X.AnonymousClass3YG) r4
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            X.0kW r0 = r4.A04
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "prior_module"
            r2.put(r0, r1)
            java.lang.String r0 = "com.instagram.shopping.creator_settings.creator_eligibility_screen"
            X.3iE r3 = X.C63743iE.A02(r0, r2)
            androidx.fragment.app.FragmentActivity r2 = r4.A01
            com.instagram.service.session.UserSession r0 = r4.A05
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r0)
            r0 = 2131835885(0x7f113bed, float:1.9304921E38)
            X.C63743iE.A09(r2, r1, r3, r0)
            return
        L_0x4199:
            java.lang.Object r5 = r3.A00
            X.3YG r5 = (X.AnonymousClass3YG) r5
            com.instagram.service.session.UserSession r4 = r5.A05
            X.C62423Zt.A02(r4)
            java.util.HashMap r3 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "needs_to_fetch_info"
            java.lang.String r0 = "True"
            r3.put(r1, r0)
            r0 = 31
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            java.lang.String r1 = "None"
            r3.put(r0, r1)
            java.lang.String r0 = "is_visible"
            r3.put(r0, r1)
            java.lang.String r0 = "grace_period_end_time"
            r3.put(r0, r1)
            java.lang.String r0 = "is_country_visible_key"
            r3.put(r0, r1)
            r2 = 0
            r1 = 43
            r0 = 29
            java.lang.String r0 = X.C61953Wm.A01(r2, r1, r0)
            X.3iE r3 = X.C63743iE.A02(r0, r3)
            androidx.fragment.app.FragmentActivity r2 = r5.A01
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r4)
            r0 = 2131835571(0x7f113ab3, float:1.9304284E38)
            X.C63743iE.A09(r2, r1, r3, r0)
            return
        L_0x41e1:
            java.lang.Object r5 = r3.A00
            X.3YG r5 = (X.AnonymousClass3YG) r5
            com.instagram.service.session.UserSession r4 = r5.A05
            X.0nS r1 = X.C13330nS.A02(r4)
            java.lang.String r0 = "settings_tap_component"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2693(0xa85, float:3.774E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x4223
            java.lang.String r0 = "settings_account"
            X.C18210wN.A1B(r2, r0)
            java.lang.String r1 = "personal_ads_account_unlink"
            X.C18190wL.A1I(r2, r1)
            java.lang.String r0 = "component"
            r2.A0T(r0, r1)
            com.instagram.user.model.User r0 = X.C18250wR.A0R(r4)
            X.MeW r0 = r0.A05
            java.lang.String r1 = r0.B1H()
            java.lang.String r0 = "facebook_page_id"
            r2.A0T(r0, r1)
            java.lang.String r0 = "settings"
            X.C18210wN.A19(r2, r0)
            r2.Bb4()
        L_0x4223:
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "com.instagram.page_delinking.screens.manage_from"
            X.3iE r3 = X.C63743iE.A02(r0, r1)
            androidx.fragment.app.FragmentActivity r2 = r5.A01
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r4)
            r0 = 2131824315(0x7f110ebb, float:1.9281454E38)
            X.C63743iE.A08(r2, r1, r3, r0)
            return
        L_0x423a:
            java.lang.Object r3 = r3.A00
            X.3YG r3 = (X.AnonymousClass3YG) r3
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r1 = "IS_SIGN_UP_FLOW"
            r0 = 0
            r2.putBoolean(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r3.A01
            com.instagram.service.session.UserSession r0 = r3.A05
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r1, r0)
            X.C63463hW.A03()
            X.9Ne r0 = new X.9Ne
            r0.<init>()
            X.C18180wK.A0x(r2, r0, r1)
            return
        L_0x425c:
            java.lang.Object r0 = r3.A00
            X.3YG r0 = (X.AnonymousClass3YG) r0
            com.instagram.service.session.UserSession r1 = r0.A05
            X.C62423Zt.A02(r1)
            androidx.fragment.app.FragmentActivity r0 = r0.A01
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r0, r1)
            com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            X.1x1 r0 = new X.1x1
            r0.<init>()
            goto L_0x438e
        L_0x4275:
            java.lang.Object r0 = r3.A00
            X.3YG r0 = (X.AnonymousClass3YG) r0
            com.instagram.service.session.UserSession r1 = r0.A05
            X.C62423Zt.A02(r1)
            androidx.fragment.app.FragmentActivity r0 = r0.A01
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r0, r1)
            X.C18190wL.A10()
            X.1wO r0 = new X.1wO
            r0.<init>()
            goto L_0x438e
        L_0x428e:
            java.lang.Object r3 = r3.A00
            X.3YG r3 = (X.AnonymousClass3YG) r3
            com.instagram.service.session.UserSession r4 = r3.A05
            X.CTd r0 = r3.A03
            java.lang.String r2 = "USER_ACCOUNT_SETTINGS"
            X.0nS r1 = X.C13330nS.A01(r0, r4)
            java.lang.String r0 = "ig_cg_click_to_enter_fundraiser_settings"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1123(0x463, float:1.574E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            java.lang.String r0 = "source_name"
            r1.A0T(r0, r2)
            r1.Bb4()
            androidx.fragment.app.FragmentActivity r3 = r3.A01
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            r1.put(r0, r2)
            java.lang.String r0 = "com.instagram.social_impact.fundraiser.component.settings"
            X.3iE r2 = X.C63743iE.A02(r0, r1)
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r4)
            r0 = 2131827749(0x7f111c25, float:1.928842E38)
            X.C63743iE.A09(r3, r1, r2, r0)
            return
        L_0x42ca:
            java.lang.Object r0 = r3.A00
            X.3YG r0 = (X.AnonymousClass3YG) r0
            com.instagram.service.session.UserSession r1 = r0.A05
            X.C62423Zt.A02(r1)
            androidx.fragment.app.FragmentActivity r0 = r0.A01
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r0, r1)
            X.C18190wL.A10()
            X.1x8 r0 = new X.1x8
            r0.<init>()
            goto L_0x438e
        L_0x42e3:
            java.lang.Object r0 = r3.A00
            X.3YG r0 = (X.AnonymousClass3YG) r0
            com.instagram.service.session.UserSession r2 = r0.A05
            X.C62423Zt.A02(r2)
            androidx.fragment.app.FragmentActivity r0 = r0.A01
            X.Drz r1 = X.C18180wK.A0Q(r0, r2)
            r0 = 1
            androidx.fragment.app.Fragment r0 = X.C101836Su.A00(r2, r0)
            goto L_0x438e
        L_0x42f9:
            java.lang.Object r0 = r3.A00
            X.3YG r0 = (X.AnonymousClass3YG) r0
            X.3DW r1 = X.AnonymousClass30L.A00
            com.instagram.service.session.UserSession r4 = r0.A05
            androidx.fragment.app.FragmentActivity r2 = r0.A01
            X.Evg r3 = r0.A02
            java.lang.String r5 = "ig_settings"
            java.lang.String r6 = "ig_settings_item"
            r9 = 0
            X.C04220Ms.A0B(r4, r9)
            r7 = 0
            r8 = r7
            r1.A00(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x4313:
            java.lang.Object r2 = r3.A00
            X.1cm r2 = (X.C23211cm) r2
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r2.A0B
            r0.A01()
            com.instagram.registration.ui.NotificationBar r0 = r2.A05
            r0.A02()
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = r2.A09
            r0.A04()
            X.3Bi r0 = r2.A07
            android.view.View r0 = r0.A00
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.A01
            r0.setVisibility(r1)
            return
        L_0x4335:
            java.lang.Object r5 = r3.A00
            X.4AX r5 = (X.AnonymousClass4AX) r5
            com.instagram.service.session.UserSession r2 = r5.A0E
            X.C62423Zt.A02(r2)
            java.lang.String r1 = "com.instagram.settings.privacy.comments"
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()
            X.3iE r4 = X.C63743iE.A02(r1, r0)
            android.content.Context r3 = r5.A0B
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.C18190wL.A0N(r2)
            X.1dm r0 = r5.A0G
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            r0 = 2131832934(0x7f113066, float:1.9298936E38)
            X.C18210wN.A0s(r1, r2, r0)
            r0 = 1
            r2.A0e = r0
            r4.A0C(r3, r2)
            return
        L_0x4361:
            java.lang.Object r0 = r3.A00
            X.4AX r0 = (X.AnonymousClass4AX) r0
            com.instagram.service.session.UserSession r2 = r0.A0E
            X.C62423Zt.A02(r2)
            androidx.fragment.app.FragmentActivity r0 = r0.A0D
            X.433 r1 = new X.433
            r1.<init>(r0, r2)
            X.24t r0 = X.C312224t.STORY_SETTINGS
            r1.BaO(r0)
            return
        L_0x4377:
            java.lang.Object r0 = r3.A00
            X.4AX r0 = (X.AnonymousClass4AX) r0
            com.instagram.service.session.UserSession r1 = r0.A0E
            X.C62423Zt.A02(r1)
            androidx.fragment.app.FragmentActivity r0 = r0.A0D
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r0, r1)
            X.C19554AyF.A02()
            X.1cN r0 = new X.1cN
            r0.<init>()
        L_0x438e:
            r1.A03 = r0
            r1.A05()
            return
        L_0x4394:
            java.lang.Object r0 = r3.A00
            X.1gg r0 = (X.C23971gg) r0
            com.instagram.reels.dashboard.fragment.ReelDashboardFragment r4 = r0.A00
            X.C19554AyF.A02()
            X.1Y1 r3 = new X.1Y1
            r3.<init>()
            android.os.Bundle r1 = X.C18180wK.A06()
            com.instagram.service.session.UserSession r0 = r4.A0A
            java.lang.String r0 = r0.token
            X.C18190wL.A13(r1, r0)
            r3.setArguments(r1)
            com.instagram.service.session.UserSession r0 = r4.A0A
            X.Jj9 r2 = X.C18210wN.A0L(r0)
            java.lang.Boolean r0 = X.C18180wK.A0X()
            r2.A0M = r0
            android.content.Context r1 = r4.requireContext()
            r0 = 2131827751(0x7f111c27, float:1.9288423E38)
            X.C18230wP.A10(r1, r2, r0)
            X.Jqm r1 = r2.A00()
            android.content.Context r0 = r4.getContext()
            X.C37383Jqm.A00(r0, r3, r1)
            return
        L_0x43d2:
            A01(r3)
            return
        L_0x43d6:
            A00(r2, r3)
            return
        L_0x43da:
            java.lang.Object r1 = r3.A00
            X.1bv r1 = (X.C23101bv) r1
            android.os.Bundle r3 = r1.requireArguments()
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            com.instagram.service.session.UserSession r0 = X.C18180wK.A0V(r3)
            X.3Hj r1 = r1.A07
            X.AnonymousClass3ZJ.A02(r3, r0, r2)
            r0 = 0
            r1.A01(r3, r0)
            return
        L_0x43f2:
            r0 = 1360183426(0x5112c082, float:3.9393436E10)
            int r1 = X.C14030oh.A05(r0)
            r0 = 669663030(0x27ea3f36, float:6.501658E-15)
            goto L_0x4407
        L_0x43fd:
            r0 = -89480264(0xfffffffffaaaa3b8, float:-4.4300554E35)
            int r1 = X.C14030oh.A05(r0)
            r0 = 842077925(0x323116e5, float:1.0307962E-8)
        L_0x4407:
            X.C14030oh.A0C(r0, r1)
            return
        L_0x440b:
            java.lang.Object r3 = r3.A00
            X.1ay r3 = (X.C22891ay) r3
            com.instagram.service.session.UserSession r2 = r3.A04
            java.lang.String r1 = "nux_one_tap_upsell"
            X.AnonymousClass0wJ.A1N(r2, r1)
            r0 = 0
            X.AnonymousClass3XC.A00(r2, r0, r1)
            r2 = 0
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            boolean r0 = r1 instanceof X.C82844qM
            if (r0 == 0) goto L_0x442b
            X.4qM r1 = (X.C82844qM) r1
            if (r1 == 0) goto L_0x442b
            r1.Ben(r2)
            return
        L_0x442b:
            X.4td r0 = r3.A02
            if (r0 == 0) goto L_0x4433
            X.C18220wO.A1N(r0)
            return
        L_0x4433:
            X.3yq r0 = r3.A03
            r0.A00()
            return
        L_0x4439:
            java.lang.Object r4 = r3.A00
            X.1ca r4 = (X.C23151ca) r4
            X.0bf r1 = r4.A0B
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.H1T r2 = X.AnonymousClass0wJ.A0P(r1)
            java.lang.String r0 = "trusted_friend/get_recovery_request_challenge/"
            r2.A0J(r0)
            java.lang.Class<X.1Tk> r1 = X.C22111Tk.class
            java.lang.Class<X.3Pz> r0 = X.C60663Pz.class
            X.H8c r3 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            X.0m7 r2 = r4.getParentFragmentManager()
            X.0bf r1 = r4.A0B
            X.1uU r0 = new X.1uU
            r0.<init>(r2, r4, r1)
            r3.A00 = r0
            r4.schedule(r3)
            return
        L_0x4465:
            r0 = -1889681466(0xffffffff8f5dbfc6, float:-1.09330755E-29)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.4AC r4 = (X.AnonymousClass4AC) r4
            java.lang.String r0 = r4.A05
            if (r0 == 0) goto L_0x45a7
            java.lang.String r0 = r4.A06
            if (r0 == 0) goto L_0x45a7
            X.1dM r10 = r4.A0C
            com.instagram.common.ui.base.IgEditText r6 = r4.A01
            java.lang.String r13 = X.C18180wK.A0f(r6)
            X.C04220Ms.A06(r13)
            X.3Vc r3 = r4.A04
            int r9 = r4.A00
            java.lang.String r8 = r4.A05
            X.C04220Ms.A0A(r8)
            java.lang.String r7 = r4.A06
            X.C04220Ms.A0A(r7)
            X.AnonymousClass0wJ.A1R(r8, r7)
            long r0 = X.C18200wM.A0A()
            int r14 = (int) r0
            java.lang.String r15 = X.C18180wK.A0e()
            X.C04220Ms.A06(r15)
            X.8wA r11 = r10.A03
            r5 = 0
            if (r11 != 0) goto L_0x44ab
            java.lang.String r0 = "recyclerViewAdapter"
            X.C04220Ms.A0E(r0)
            throw r5
        L_0x44ab:
            X.3Vc r0 = new X.3Vc
            r16 = r0
            r17 = r5
            r18 = r3
            r19 = r13
            r20 = r7
            r21 = r8
            r16.<init>(r17, r18, r19, r20, r21)
            r8 = 0
            X.48N r7 = new X.48N
            r7.<init>(r0, r8, r8)
            int r1 = r9 + 1
            X.Byf r0 = r11.A03
            java.util.List r0 = r0.AbQ()
            r0.add(r1, r7)
            X.8lg r0 = r11.A00
            r7 = 1
            r0.C2k(r1, r7)
            com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout r0 = r10.A04
            if (r0 != 0) goto L_0x44dd
            java.lang.String r0 = "refreshableRecyclerViewLayout"
            X.C04220Ms.A0E(r0)
            throw r5
        L_0x44dd:
            androidx.recyclerview.widget.RecyclerView r0 = r0.A0P
            r0.A0m(r9)
            if (r3 == 0) goto L_0x44e8
            X.3Vc r11 = r3.A06
            if (r11 != 0) goto L_0x44e9
        L_0x44e8:
            r11 = r3
        L_0x44e9:
            X.3G3 r0 = r10.A0E
            java.lang.String r3 = r0.A02
            if (r3 == 0) goto L_0x4594
            X.36T r1 = r10.A06
            if (r1 != 0) goto L_0x44f9
            java.lang.String r0 = "feedbackApi"
            X.C04220Ms.A0E(r0)
            throw r5
        L_0x44f9:
            if (r11 == 0) goto L_0x450b
            com.instagram.unifiedfeedback.api.graphql.FBCommentImpl r0 = r11.A05
            if (r0 == 0) goto L_0x450b
            com.instagram.unifiedfeedback.api.graphql.FBCommentImpl$Feedback r0 = r0.A00()
            if (r0 == 0) goto L_0x450b
            java.lang.String r9 = X.C18220wO.A0m(r0)
            if (r9 != 0) goto L_0x450c
        L_0x450b:
            r9 = r3
        L_0x450c:
            r0 = 8
            com.facebook.redex.IDxFCallbackShape113S0200000_1_I2 r3 = new com.facebook.redex.IDxFCallbackShape113S0200000_1_I2
            r3.<init>(r0, r10, r11)
            X.Grx r1 = r1.A00
            X.3zb r10 = X.C67463zb.A00()
            X.3zb r16 = X.C67463zb.A00()
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r11 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            java.lang.String r12 = "FB"
            java.lang.String r0 = "destination_app"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r11, r12, r0)
            java.lang.String r12 = "FEED"
            java.lang.String r0 = "destination_surface"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r11, r12, r0)
            java.lang.String r12 = ""
            java.lang.String r0 = "destination_id"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r11, r12, r0)
            X.0ZV r12 = X.AnonymousClass0ZV.A00
            java.lang.String r0 = "validation_check_bypass_list"
            r11.A0A(r0, r12)
            java.lang.String r0 = "destination"
            r10.A02(r11, r0)
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r11 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            java.lang.String r0 = "idempotence_token"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r11, r15, r0)
            java.lang.String r0 = "id"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r11, r9, r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            java.lang.String r0 = "action_timestamp"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r11, r9, r0)
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r9 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            java.lang.String r0 = "text"
            com.facebook.graphql.calls.GraphQlCallInput.A05(r9, r13, r0)
            java.lang.String r0 = "ranges"
            r9.A0A(r0, r12)
            java.lang.String r0 = "message"
            r11.A0B(r9, r0)
            java.lang.String r0 = "params"
            r10.A02(r11, r0)
            X.AnonymousClass7Ko.A0B(r7)
            X.8l9 r11 = X.C63233h2.A04(r7)
            java.util.Map r13 = com.facebook.graphql.calls.GraphQlCallInput.A03(r10)
            java.util.Map r14 = com.facebook.graphql.calls.GraphQlCallInput.A03(r16)
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.CXPCommentCreateMutationResponseImpl> r15 = com.instagram.unifiedfeedback.api.graphql.CXPCommentCreateMutationResponseImpl.class
            java.lang.String r12 = "CXPCommentCreateMutation"
            java.lang.String r20 = "xcxp_dispatch_comment_create"
            com.facebook.pando.PandoGraphQLRequest r10 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r7
            r18 = r8
            r19 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1.AMA(r10, r3)
        L_0x4594:
            com.instagram.common.ui.base.IgLinearLayout r1 = r4.A02
            r0 = 8
            r1.setVisibility(r0)
            r4.A04 = r5
            android.text.Editable r0 = r6.getText()
            r0.clear()
            r0 = 2
            r4.A00 = r0
        L_0x45a7:
            r0 = -55399658(0xfffffffffcb2ab16, float:-7.421591E36)
        L_0x45aa:
            X.C14030oh.A0C(r0, r2)
            return
        L_0x45ae:
            r0 = -1692082067(0xffffffff9b24e06d, float:-1.3638278E-22)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r9 = r3.A00
            X.1ca r9 = (X.C23151ca) r9
            X.1jz r0 = r9.A09
            r0.A08()
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 18300980202310173(0x4104a500000a1d, double:1.8933312221285107E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)
            if (r0 == 0) goto L_0x460d
            android.content.Context r0 = r9.getContext()
            if (r0 == 0) goto L_0x460d
            android.content.Context r8 = r9.getContext()
            r7 = 0
            java.util.HashMap r6 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r5 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r3 = X.AnonymousClass0wJ.A0y()
            r1 = 0
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>(r1)
            X.0bf r0 = r9.A0B
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.C18190wL.A0N(r0)
            java.lang.String r1 = "com.bloks.www.caa.ar.native_integration_point"
            r2.A0P = r1
            java.util.HashMap r0 = X.C37067Jjv.A02(r6)
            X.3iE r0 = X.C63743iE.A05(r1, r0, r5)
            r0.A03 = r7
            r0.A02 = r7
            r0.A04 = r7
            r0.A0G(r3)
            r0.A0C(r8, r2)
        L_0x4606:
            r0 = 498520171(0x1db6d06b, float:4.83905E-21)
        L_0x4609:
            X.C14030oh.A0C(r0, r4)
            return
        L_0x460d:
            X.01V r0 = X.AnonymousClass01V.A0p
            r3 = 725105460(0x2b383b34, float:6.545209E-13)
            r0.markerStart(r3)
            X.01V r2 = X.AnonymousClass01V.A0p
            java.lang.String r1 = "flow"
            java.lang.String r0 = "prod"
            r2.markerAnnotate((int) r3, (java.lang.String) r1, (java.lang.String) r0)
            X.3F0 r2 = r9.A0A
            android.widget.TextView r0 = r9.A05
            java.lang.String r1 = X.C18180wK.A0f(r0)
            r0 = 0
            r2.A00(r0, r1)
            goto L_0x4606
        L_0x462b:
            r0 = 2147207883(0x7ffbcacb, float:NaN)
            X.C14030oh.A05(r0)
            java.lang.String r1 = "this$0"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x4639:
            r0 = -1963584799(0xffffffff8af612e1, float:-2.369604E-32)
            X.C14030oh.A05(r0)
            java.lang.String r1 = "this$0"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x4647:
            r0 = -1431904862(0xffffffffaaa6dda2, float:-2.9641312E-13)
            X.C14030oh.A05(r0)
            java.lang.Object r4 = r3.A00
            X.1jp r4 = (X.C24681jp) r4
            com.instagram.service.session.UserSession r3 = r4.A07
            X.0kW r2 = r4.A03
            X.0nS r1 = X.C13330nS.A01(r2, r3)
            java.lang.String r0 = "discover_people_non_personalized_upsell_tapped"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 562(0x232, float:7.88E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            X.C18180wK.A1C(r0, r2)
            r0.Bb4()
            androidx.fragment.app.Fragment r0 = r4.A01
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.Drz r0 = new X.Drz
            r0.<init>(r1, r3)
            java.lang.String r0 = "Error! Trying to access DiscoverPeoplePlugin without an instance!"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x467d:
            r0 = 414040319(0x18adc0ff, float:4.491433E-24)
            X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3aX r0 = (X.C62693aX) r0
            com.instagram.service.session.UserSession r0 = r0.A05
            X.C62423Zt.A02(r0)
            X.C60113Ns.A00()
            r0 = 0
            throw r0
        L_0x4691:
            r0 = 760373531(0x2d52611b, float:1.195868E-11)
            X.C14030oh.A05(r0)
            java.lang.NullPointerException r0 = X.C18200wM.A0d()
            throw r0
        L_0x469c:
            r0 = -1754860972(0xffffffff9766f254, float:-7.462287E-25)
            X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3z5 r0 = (X.C67193z5) r0
            com.instagram.service.session.UserSession r0 = r0.A04
            X.C62423Zt.A02(r0)
            X.KK0 r0 = X.KK0.A00(r0)
            r0.A02()
            java.lang.NullPointerException r0 = X.C18200wM.A0d()
            throw r0
        L_0x46b7:
            r0 = 1217026256(0x488a58d0, float:283334.5)
            X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            X.3z5 r0 = (X.C67193z5) r0
            com.instagram.base.activity.BaseFragmentActivity r1 = r0.A01
            com.instagram.service.session.UserSession r0 = r0.A04
            X.C60113Ns.A01(r1, r0)
            r0 = 0
            throw r0
        L_0x46ca:
            r0 = 865548700(0x3397399c, float:7.0419645E-8)
            X.C14030oh.A05(r0)
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r1 = "entry_point"
            java.lang.String r0 = "professional_options"
            r2.putString(r1, r0)
            java.lang.Object r0 = r3.A00
            X.3z5 r0 = (X.C67193z5) r0
            com.instagram.base.activity.BaseFragmentActivity r2 = r0.A01
            com.instagram.service.session.UserSession r1 = r0.A04
            X.Drz r0 = new X.Drz
            r0.<init>(r2, r1)
            java.lang.NullPointerException r0 = X.C18200wM.A0d()
            throw r0
        L_0x46ed:
            r0 = -409041070(0xffffffffe79e8752, float:-1.4972602E24)
            X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            com.instagram.profile.edit.controller.EditProfileFieldsController r0 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r0
            androidx.fragment.app.FragmentActivity r1 = r0.A03()
            com.instagram.service.session.UserSession r0 = r0.A06
            X.C60113Ns.A01(r1, r0)
            r0 = 0
            throw r0
        L_0x4702:
            r0 = 539248566(0x202447b6, float:1.3915067E-19)
            X.C14030oh.A05(r0)
            java.lang.Object r0 = r3.A00
            com.instagram.profile.edit.controller.EditProfileFieldsController r0 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r0
            androidx.fragment.app.FragmentActivity r1 = r0.A03()
            com.instagram.service.session.UserSession r0 = r0.A06
            X.C60113Ns.A01(r1, r0)
            r0 = 0
            throw r0
        L_0x4717:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            r1 = -620745492(0xffffffffdb002cec, float:-3.6078189E16)
            X.C14030oh.A0C(r1, r0)
            throw r2
        L_0x4724:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x4729:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x472e:
            X.C18250wR.A0l()
            r0 = 0
            throw r0
        L_0x4733:
            X.C18250wR.A0l()
            r0 = 0
            throw r0
        L_0x4738:
            X.C18250wR.A0l()
            throw r1
        L_0x473c:
            X.C18250wR.A0l()
            r0 = 0
            throw r0
        L_0x4741:
            X.C18250wR.A0l()
            throw r1
        L_0x4745:
            X.C18250wR.A0l()
            r0 = 0
            throw r0
        L_0x474a:
            X.C18250wR.A0l()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1.onClick(android.view.View):void");
    }

    public IDxCListenerShape202S0100000_1_I2_1(C23151ca r1, int i) {
        this.A01 = i;
        if (7 - i != 0) {
            this.A00 = r1;
        } else {
            this.A00 = r1;
        }
    }

    public IDxCListenerShape202S0100000_1_I2_1(AnonymousClass3HD r1, int i) {
        this.A01 = i;
        if (239 - i != 0) {
            this.A00 = r1;
        } else {
            this.A00 = r1;
        }
    }

    public IDxCListenerShape202S0100000_1_I2_1(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public IDxCListenerShape202S0100000_1_I2_1(AnonymousClass1wD r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public IDxCListenerShape202S0100000_1_I2_1(AnonymousClass3T7 r1, int i) {
        this.A01 = i;
        switch (i) {
            case 210:
            case 211:
                this.A00 = r1;
                return;
            default:
                this.A00 = r1;
                return;
        }
    }

    public IDxCListenerShape202S0100000_1_I2_1(AnonymousClass3YG r1, int i) {
        this.A01 = i;
        switch (i) {
            case 98:
            case 99:
            case 100:
            case HttpStatus.SC_SWITCHING_PROTOCOLS /*101*/:
            case HttpStatus.SC_PROCESSING /*102*/:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
                this.A00 = r1;
                return;
            default:
                this.A00 = r1;
                return;
        }
    }

    public IDxCListenerShape202S0100000_1_I2_1(C62693aX r1, int i) {
        this.A01 = i;
        switch (i) {
            case 182:
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            case 191:
            case 192:
                this.A00 = r1;
                return;
            default:
                this.A00 = r1;
                return;
        }
    }
}
